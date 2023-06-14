class Display {
    public synchronized void wish(String name) {
        System.out.print("Hello ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);
    }
}
public class Main1 {
    public static void main(String[] args) {
        Display display = new Display();
        
        Thread thread1 = new Thread(new MyRunnable(display, "ujjwal"));
        Thread thread2 = new Thread(new MyRunnable(display, "Ayush"));
        Thread thread3 = new Thread(new MyRunnable(display, "Rahul"));
        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyRunnable implements Runnable {
    private Display display;
    private String name;
    
    public MyRunnable(Display display, String name) {
        this.display = display;
        this.name = name;
    }
    
    public void run() {
        display.wish(name);
    }
}

