public class SingletonExample {

    private static SingletonExample instance;
    private  SingletonExample(){}

    public static SingletonExample getInstance(){

        if( instance == null) {
            synchronized (SingletonExample.class) {
                instance = new SingletonExample();
            }
        }

        return instance;

    }
}
