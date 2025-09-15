public class DataTypes {
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static long sum(int[] numbers) {
        long s = 0; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        for (long x : numbers) {
            s += x;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] number = new int[5];
        for (int x = 1; x < 5; x++) {
            number[x-1] = x*5;
        }

        System.out.println(sum(number));
    }
}
