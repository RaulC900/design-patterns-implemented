package CreationalPatterns.CP1_FactoryMethod.Example1;

public class Main {

    public static void main(String[] args) {
        Dialog d = new WebDialog();
        d.render();
    }
}
