package ra;

public class EvenThread extends Thread{
   private String name;
    public EvenThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 11; i++) {
                if (i%2==1){
                    System.out.println(i);
                    Thread.sleep(15);
                }
            }
        }catch (InterruptedException e){
            System.out.println("Luồng bị dán đoạn");
        }
        System.out.println("Luông kết thúc");
    }

}
