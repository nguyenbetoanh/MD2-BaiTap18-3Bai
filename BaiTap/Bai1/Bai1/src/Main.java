import ra.NumberGenerator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator number = new NumberGenerator();
       try {
             while (number.getMyThread().isAlive()){
                 Thread.sleep(1000);
             }
       }catch (InterruptedException e){
           System.out.println("Chuỗi bị dán đoạn");
       }
        System.out.println("Chuỗi kết thúc");
    }
}