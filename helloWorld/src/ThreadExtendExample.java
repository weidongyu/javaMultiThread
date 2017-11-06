public class ThreadExtendExample extends  Thread {
    public int count = 0;
    private int sleepTime = 0;

    public ThreadExtendExample(int sleepTime){
        this.sleepTime = sleepTime;

    }

    public void run(){
        try {

            while (count < 100) {
                Thread.sleep(100);
                count += 2;
                System.out.println(count);
                System.out.println(sleepTime);


            }
        }catch(InterruptedException exc){
            System.out.println("Being Interrupted");
        }
    }

    public static void main(String[] args){
        ThreadExtendExample t1 = new ThreadExtendExample(20);
        ThreadExtendExample t2 = new ThreadExtendExample(100);
        t1.start();
        t2.start();


    }
}
