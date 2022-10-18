package ra;

public class OptimizedPrimeFactorization implements Runnable{
    private int number2;
    private String name2;

    public OptimizedPrimeFactorization(int number2, String name2) {
        this.number2 = number2;
        this.name2 = name2;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public void run() {
        System.out.println("");
        System.out.println("Các số nguyên tố nhỏ hơn "+this.number2+" là: ");
        for (int i = 0; i < this.number2; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
