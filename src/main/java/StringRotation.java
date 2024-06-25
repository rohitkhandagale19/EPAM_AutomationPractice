public class StringRotation {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "defabc";

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not rotations of each other.");
            return;
        }

        String concatenated = str1 + str1;   //abcdefabcdef      str2 defabc
        boolean isRotation = false;
        for (int i = 0; i < concatenated.length() - str2.length(); i++) {
            isRotation = true;
            for (int j = 0; j < str2.length(); j++) {
                if (concatenated.charAt(i + j) != str2.charAt(j)) {
                    isRotation = false;
                    break;
                }
            }
            if (isRotation) {
                break;
            }
        }

        if (isRotation) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
    }
}
