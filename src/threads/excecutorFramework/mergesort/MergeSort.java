package src.threads.excecutorFramework.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {

    private List<Integer> sortedList;
    ExecutorService executorService;

    MergeSort(List<Integer> sortedList,ExecutorService executorService) {
        this.sortedList = sortedList;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if (this.sortedList.size() <= 1) return sortedList;
        int mid = this.sortedList.size() / 2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            left.add(sortedList.get(i));
        }
        for (int i = mid; i < sortedList.size(); i++) {
            right.add(sortedList.get(i));
        }

       // System.out.println("Child  Thread"+" "+ Thread.currentThread().getName());
        MergeSort leftMergeSort = new MergeSort(left,executorService);
        MergeSort rightMergeSort = new MergeSort(right,executorService);
        Future<List<Integer>> futureSortedLeft = executorService.submit(leftMergeSort);
        Future<List<Integer>> futureSortedRight = executorService.submit(rightMergeSort);
        List<Integer>sortedLeft = futureSortedLeft.get();
        List<Integer>sortedRight = futureSortedRight.get();
        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < sortedLeft.size() && j < sortedRight.size()) {
            if (sortedLeft.get(i) < sortedRight.get(j)) {
                ans.add(sortedLeft.get(i));
                i++;
            } else {
                ans.add(sortedRight.get(j));
                j++;
            }
        }

        while(i<sortedLeft.size()){
            ans.add(sortedLeft.get(i));
            i++;
        }
        while(j<sortedRight.size()){
            ans.add(sortedRight.get(j));
            j++;
        }

        return ans;
    }
}
