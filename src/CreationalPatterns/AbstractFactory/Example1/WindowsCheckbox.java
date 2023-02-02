package CreationalPatterns.AbstractFactory.Example1;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Windows checkbox painted");
    }
}
