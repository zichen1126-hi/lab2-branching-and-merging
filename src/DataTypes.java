public class DataTypes {
    // TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static void main(){
        System.out.println(sum(new int[] {1, 2, 3}));
    }
    public static long sum(int[] numbers) {
        long s = 0L; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
