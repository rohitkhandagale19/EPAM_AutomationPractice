package Java8;

public class StringRotationLambda {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "lohel";

        boolean areRotations = checkRotation(str1, str2, (s1, s2) ->
                s1.length() == s2.length() && (s1 + s1).contains(s2));

        if (areRotations) {
            System.out.println("Strings are rotations of each other.");
        } else {
            System.out.println("Strings are not rotations of each other.");
        }
    }

    public static boolean checkRotation(String str1, String str2, RotationCheckerInterface checker) {
        return checker.check(str1, str2);
    }

    interface RotationCheckerInterface {
        boolean check(String s1, String s2);
    }
}

