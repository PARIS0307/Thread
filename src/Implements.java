import java.lang.Thread;

public class Implements {
    static class MyRunnable implements Runnable{
        public void run(){
            for (int i = 0; i < 5; i++){
                System.out.println("Runnable running:" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        }
    }

    public static void main(String[] args){
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
