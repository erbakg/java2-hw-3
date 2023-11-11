public class Main {
    public static void main(String[] args) {
       BankAccount account = new BankAccount();

       account.deposit(15000);

        System.out.println(account.getAmount());

        while (true){
            try {
                account.withDraw(6000);
                System.out.println(account.getAmount());
            } catch (LimitException le){
                try {
                    System.out.println(account.getAmount());
                    account.withDraw((int)(le.getRemainingAmount()));
                } catch (LimitException le2){
                    break;
                }
                break;
            }

        }
    }
}