package creating_and_starting;

public class Main {
    public static void main(String[] args) {
        for (int i=0; i<3; i++){
            ThreadClass thread = new ThreadClass();
            thread.start();
        }

        for (int i=0; i<3; i++){
            MyRunnable myRunnable = new MyRunnable();
            Thread thread = new Thread(myRunnable);
            thread.start();
        }
        System.out.println(ThreadClass.currentThread().getName());

    }
}