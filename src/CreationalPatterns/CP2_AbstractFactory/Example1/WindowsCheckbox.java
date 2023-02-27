package CreationalPatterns.CP2_AbstractFactory.Example1;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Windows checkbox painted");
    }
}
