public class RunnableExample implements Runnable{
    public int count = 0 ;

    public void run (){
        try {


            while (count < 100) {
                Thread.sleep(100);
                count++;
                System.out.println(count);
            }
        }catch (InterruptedException exc){
            System.out.println("Interrupted");
        }
        System.out.println("End");
    }

    public static void main(String[] args){
        RunnableExample instance = new RunnableExample();
        Thread thread = new Thread(instance);
        thread.start();



    }
}
