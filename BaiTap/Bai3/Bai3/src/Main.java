import ra.LazyPrimeFactorization;
import ra.OptimizedPrimeFactorization;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy=new LazyPrimeFactorization("tim so nguyen to",51);
        OptimizedPrimeFactorization op=new OptimizedPrimeFactorization(100, "tìm tất cả số nguyên tố");
        Thread thread1= new Thread(lazy);
        Thread thread2=new Thread(op);
        thread1.start();
        System.out.println("");
        thread2.start();
    }
}