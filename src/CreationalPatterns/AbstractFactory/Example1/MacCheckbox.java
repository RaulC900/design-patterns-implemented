package CreationalPatterns.AbstractFactory.Example1;

public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Mac Checkbox painted");
    }
}
