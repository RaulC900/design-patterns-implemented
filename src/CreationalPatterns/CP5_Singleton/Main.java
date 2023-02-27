package CreationalPatterns.CP5_Singleton;

public class Main implements Runnable {

    private int nr = 0;

    private final String className = SingletonImpl.class.getName();

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        Object s;
        if(className.equals(SingletonImpl.class.getName())) {
            s = SingletonImpl.getInstance(nr);
            System.out.println(SingletonImpl.getNumber());
            System.out.println(s);

        } else if(className.equals(SingletonAlt.class.getName())) {
            s = SingletonAlt.getInstance();
            System.out.println(s);
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.setNr(150);
        Main m2 = new Main();
        m2.setNr(20);
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }
}
