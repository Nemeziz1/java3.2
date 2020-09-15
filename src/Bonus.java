public class Bonus {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1800;
        int newbalance;
        int bonus = refill / 100 ;
        if (refill > 1000) {
            newbalance = balance + refill + bonus;
        }
        else {
            bonus = 0;
            newbalance = balance + refill;
        }
        System.out.println(bonus);
        System.out.println(newbalance);
    }
}
