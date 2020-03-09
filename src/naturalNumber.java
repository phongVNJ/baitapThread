import java.util.Random;


public class naturalNumber extends Thread {
    static public int i;
    @Override
    public void run() {
        while (true){
            Random n = new Random();
            synchronized (this){
                i = n.nextInt(21);
                System.out.println("naturalNumber: "+i);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void start() {
    }
}
