package Java8;

public class PalindromeCheckerLambda {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = checkPalindrome(str, (s) -> {
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        });

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str, PalindromeCheckerInterface checker) {
        return checker.check(str);
    }

    interface PalindromeCheckerInterface {
        boolean check(String s);
    }
}
