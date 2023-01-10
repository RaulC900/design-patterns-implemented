package CreationalPatterns.FactoryMethod.Example1;

public class HTMLButton implements Button {

    @Override
    public void render() {
        System.out.println("HTMLButton has been rendered!");
    }

    @Override
    public void onClick(String buttonAction) {
        System.out.println("HTMLButton. The action it executes is ==" + buttonAction + "==");
    }
}
