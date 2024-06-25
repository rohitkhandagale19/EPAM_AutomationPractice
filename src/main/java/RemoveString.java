public class RemoveString {
    public static void main(String[] args) {
        System.out.println(withoutString("Heello there", "ee"));
    }

    public static String withoutString(String base, String remove) {
        String lowerBase = base.toLowerCase();
        String lowerRemove = remove.toLowerCase();
        StringBuilder result = new StringBuilder();

        int index = lowerBase.indexOf(lowerRemove);
        int removeLength = remove.length();

        while (index != -1) {
            result.append(base, 0, index);
            base = base.substring(index + removeLength);
            lowerBase = lowerBase.substring(index + removeLength);
            index = lowerBase.indexOf(lowerRemove);
        }

        result.append(base);

        return result.toString();
    }
}
