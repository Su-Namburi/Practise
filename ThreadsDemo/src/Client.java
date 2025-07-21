public class Client {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        MyThread th = new MyThread();

        Thread thread = new Thread(th);
        thread.start();


    }
}
