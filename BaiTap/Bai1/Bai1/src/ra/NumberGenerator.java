package ra;

public class NumberGenerator implements Runnable {
    private Thread myThread;

    public NumberGenerator(){
        myThread= new Thread(this,"Đếm số tự nhiên");
       myThread.start();
    }
public Thread getMyThread(){
        return myThread;
}
    @Override
    public void run() {
        try {
            for (int i = 0; i <10 ; i++) {
                System.out.println(i);
                Thread.sleep(1000);

            }

        }catch (InterruptedException e){
            System.out.println("luồng bị dán đoạn");
        }
        System.out.println("luồng ết thúc");
    }
}
