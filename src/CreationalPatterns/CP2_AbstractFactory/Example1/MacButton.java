package CreationalPatterns.CP2_AbstractFactory.Example1;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button painted");
    }
}
