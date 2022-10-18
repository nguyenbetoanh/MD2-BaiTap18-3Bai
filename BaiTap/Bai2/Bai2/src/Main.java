import ra.EvenThread;
import ra.OddThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EvenThread evenThread = new EvenThread("số chẵn");
        OddThread oddThread = new OddThread("số lẻ");
        Thread thread= new Thread(evenThread);
        Thread thread1= new Thread(oddThread);
        System.out.println("số lẻ là :");
        thread.start();
        thread.join();
        System.out.println("số chẵn là: ");
        thread1.start();
    }
}
