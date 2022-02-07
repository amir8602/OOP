package MultiThreading.Sync;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(1000);

        Thread deposit = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.currentThread().sleep(200);
                    account.deposit(500);
                    System.out.println(account.getBalance());
                    Thread.currentThread().sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });



        Thread withDraw = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.currentThread().sleep(300);
                    account.withDraw(400);
                    Thread.currentThread().sleep(100);
                    System.out.println(account.getBalance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(account.getBalance());
            }
        });

        deposit.start();
        withDraw.start();


    }
}
