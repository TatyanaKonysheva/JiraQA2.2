public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int depositAmount = 1000;

        int bonus = (initialAccount + depositAmount) / 100;

        int finalAccount;

        if (depositAmount >= 1000) {
            finalAccount = bonus + initialAccount + depositAmount;
        } else {
            finalAccount = initialAccount + depositAmount;
        }

        System.out.println("Итоговый счет: " + finalAccount);

    }
}