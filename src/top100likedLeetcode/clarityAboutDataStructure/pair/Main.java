package src.top100likedLeetcode.clarityAboutDataStructure.pair;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create an arraylist of pair<subject,marks>
        List<Pair<String,Double>> al = List.of(new Pair<>("English",78.50),new Pair<>("Math",98.00));
        for (Pair<String,Double> pair : al){
            System.out.println("Subject"+" "+pair.getFirst()+ " "+"Marks"+" "+pair.getSecond());
        }
    }
}
