public class ClassName extends Thread {
    ClassName cn = new ClassName();
    cn.start(); //start concurrent prog
    public void run() {
        // override run() of thread
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        ClassName cn = new ClassName();
        cn.start(); // start concurrent program
    }
}
