package ra;

public class OddThread extends Thread {
    private String name;

    public OddThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 11; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Luồng bị dán đoạn");
        }
        System.out.println("Luồng kết thúc");
    }


}
