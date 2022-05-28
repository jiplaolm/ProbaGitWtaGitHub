/**
 *
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Aldaketa berri bat");
        metodoBerriBat();
        BankAccount myAccount = new BankAccountBuilder()
                .setOwner("me")
                .setPlace("myTown")
                .setInterest(0.23)
                .setBalance(2000)
                .createBankAccount();
    }

    private static void metodoBerriBat() {
        System.out.println("Beste metodo bat");
    }

    private static void besteMetodoBat() {
        System.out.println("Azkena");
        System.out.println("Beste zerbait");
    }
}
