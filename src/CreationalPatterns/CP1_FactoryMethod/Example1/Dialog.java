package CreationalPatterns.CP1_FactoryMethod.Example1;

public abstract class Dialog {

    public abstract Button createButton();

    public void render() {
        Button closeButton = createButton();
        // Now use the product.
        closeButton.onClick("Close dialog");
        closeButton.render();
    }
}
