public class ThreadingDemo extends Thread{
    public void run(){
        for(int i = 0; i < 6; i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            System.out.println(i + " from " + Thread.currentThread().getName());
        }
    }
}
