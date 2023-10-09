package creating_and_starting;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() +" -CLASS-: "+ i);
        }
    }
}
