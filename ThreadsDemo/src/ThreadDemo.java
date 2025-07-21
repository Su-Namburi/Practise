public class ThreadDemo {
    public static void doWork() {
        System.out.println("working");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("done");
    }
    public static void main(String[] args) {
        System.out.println("start");

        doWork();

        System.out.println("end");
    }
}
//        Thread thread = Thread.currentThread();
//        System.out.println("the name of thread is : " + thread.getName());