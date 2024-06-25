package Java8;

public class StringRotation {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "lohel";

        if (areRotations(str1, str2)) {
            System.out.println("Strings are rotations of each other.");
        } else {
            System.out.println("Strings are not rotations of each other.");
        }
    }

    public static boolean areRotations(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;

        return concatenated.contains(str2);
    }
}

