package src.threads.excecutorFramework.mergesort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Integer> arr = List.of(2,3,0,1,-1,2,1,9,8);
        MergeSort mergeSort = new MergeSort(arr,executorService);
        Future<List<Integer>> ans = executorService.submit(mergeSort);
        List<Integer> ans1 = ans.get();
        System.out.println(ans1);

    }
}
