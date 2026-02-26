import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("PALINDROME CHECKER APP - UC7");

        String word = "madam";
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < word.length(); i++) {
            deque.add(word.charAt(i));
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}