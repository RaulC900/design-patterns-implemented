package CreationalPatterns.AbstractFactory.Example1;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button painted");
    }
}
