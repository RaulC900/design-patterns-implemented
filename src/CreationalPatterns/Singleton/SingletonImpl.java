package CreationalPatterns.Singleton;

public class SingletonImpl {

    private static volatile SingletonImpl instance = null;
    private static int number = 0;

    private SingletonImpl() {}

    public static int getNumber() {
        return number;
    }

    // Lazy initializon
    // Alternative: create singleton at application start
    public static SingletonImpl getInstance(int nr) {
        if(instance == null) { // it 2 threads enter at the same time when instance is null
            synchronized (SingletonImpl.class) {
                if(instance == null) {
                    instance = new SingletonImpl();
                    number = nr;
                }
            }
        }
        //System.out.println(number);

        return instance;
    }
}
