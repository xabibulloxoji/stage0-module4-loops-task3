package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = Math.max(first, second);
        int max1 = 0;
        for (int i = 2; i <= max; i++) {
            if (first % i == 0 && second % i == 0) {
                if (i > max1) {
                    max1 = i;
                }
            }
        }
        System.out.println(max1);
    }
}
