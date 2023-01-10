package CreationalPatterns.FactoryMethod.Example1;

public class WebDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
