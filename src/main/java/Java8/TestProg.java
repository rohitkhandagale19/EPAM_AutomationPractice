package Java8;

public class TestProg {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = { 10,20,30,40,50,60,70,70,80,90,90,90,100};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num < first && num > second) {
                third = second;
                second = num;
            } else if (num < second && num > third) {
                third = num;
            }
        }

        System.out.println("Third largest number is--" + third);
    }

}
