package CreationalPatterns.FactoryMethod.Example1;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("WindowsButton has been rendered!");
    }

    @Override
    public void onClick(String buttonAction) {
        System.out.println("WindowsButton. The action it executes is ==" + buttonAction + "==");
    }
}
