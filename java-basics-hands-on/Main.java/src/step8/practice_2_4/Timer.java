package step8.practice_2_4;

public class Timer {
    private long startTime;

    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("타이머 시작");
    }

    public void stop() {
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("타이머 종료: " + elapsed + "ms");
    }

    public int processData(int[] data) {
        Timer timer = new Timer();
        timer.start();

        int sum = 0;
        try {
            for (int value : data) {
                if (value < 0) {
                    throw new IllegalArgumentException("음수 데이터: " + value);
                }
                sum += value;
            }
            return sum;

        } finally {
            timer.stop();
        }
    }

    public static void main(String[] args) {
        Timer timer = new Timer();

        System.out.println("=== 정상 데이터 ===");
        timer.processData(new int[] { 1, 2, 3 });
        System.out.println();

        System.out.println("=== 음수 데이터 ===");
        try {
            timer.processData(new int[] { 1, -2, 3 });
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}