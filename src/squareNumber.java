public class squareNumber extends Thread {




    @Override
    public void run() {
        while (true){
            System.out.println("squareNumber: "+Math.pow(i,2));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
