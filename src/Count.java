public class Count extends Thread {

    public void run() {

        while(true) {
            Testing.token++;
            System.out.println(Testing.token);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
            }
        }

    }
}
