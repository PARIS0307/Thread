public class Thread {
    static class MyThread extends java.lang.Thread{
        public void run(){
            for (int i = 0; i < 5; i++){
                System.out.println("Thread running:" + i);
                try {
                    java.lang.Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Thread interrupted");
                }
            }

        }
    }

    public static void main(String[] args){
        MyThread thread = new MyThread();
        thread.start();
    }
}
