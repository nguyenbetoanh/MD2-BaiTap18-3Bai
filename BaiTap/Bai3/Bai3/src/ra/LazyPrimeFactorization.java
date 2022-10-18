package ra;

public class LazyPrimeFactorization implements Runnable {
    private String name;
    private int number;


    public LazyPrimeFactorization(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        boolean is_prime = true;
        if (this.number == 0 || this.number == 1) {
            is_prime = false;
        }
        // loop to check if n is prime
        for (int i = 2; i <= this.number-1; i++) {
            if (this.number % i == 0) {
                is_prime = false;
                break;
            }
        }
        if (is_prime) {
            System.out.print(this.number + " là 1 số nguyên tố");
        } else {
            System.out.print(this.number + " không là 1 số nguyên tố");
        }
    }
}