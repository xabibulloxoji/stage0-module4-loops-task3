package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int sum = 0, one = 0, second = 0;
        if (lastFibonacci == 0){
            System.out.println(0);
            return;
        }
        for (int i = 1; i <= lastFibonacci; i++) {
            sum = one + second;
            System.out.println(sum);
            if (i == 1) second++;
            one = second;
            second = sum;
        }
    }
}
