package CreationalPatterns.CP1_FactoryMethod.Example1;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
