public class Singleton {
    public static void main(String[] args) {

    }
    private Singleton(){};
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
