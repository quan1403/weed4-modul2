public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread1 - HR-Database");
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread2 - Send- Email");
        runnableDemo1.start();
        runnableDemo2.start();
        System.out.println("Main thread stopped!!!");
    }
}
