
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Map.Entry;

public class Application{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string for the program to count");
        String input = scan.nextLine();
        wordCounter(input);
        scan.close();

    }

    private static void wordCounter(String input) {
        //initialize hashmap to keep track of counts
        Map<String,Integer> words = new HashMap<>();
        populateWords(input, words);

        //order the items by frequency in a priority queue
        PriorityQueue<Entry<String,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        words.entrySet().stream().forEach(e-> pq.add(e));

        //print out each value and key
        while(!pq.isEmpty()){
            Entry<String,Integer> current = pq.poll();
            System.out.println(current.getValue()+ " " + current.getKey());
        }
    }

    private static void populateWords(String input, Map<String, Integer> words) {
        //use scanner to parse through input string and populate HashMap
        Scanner scan = new Scanner(input);
        while(scan.hasNext()){
            String next = scan.next();
            next = next.toLowerCase();
            //add next string to map if it is a string that only contains characters
            if(containsOnlyLetters(next)) words.put(next, words.getOrDefault(next, 0)+1);
        }
        scan.close();
    }

    // returns true if input string only contains letters
    private static boolean containsOnlyLetters(String input){
        //uses an IntStream from input to check to see if each character is a letter
        return input.chars().allMatch(Character::isLetter);
    }
}