package CreationalPatterns.CP5_Singleton;


// Initialization-on-demand holder idiom
public final class SingletonAlt {
    private static class SingletonAltLoader {
        private static final SingletonAlt INSTANCE = new SingletonAlt();
    }
    private SingletonAlt() {
        if (SingletonAltLoader.INSTANCE != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }
    public static SingletonAlt getInstance() {
        return SingletonAltLoader.INSTANCE;
    }
}
