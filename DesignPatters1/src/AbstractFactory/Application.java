package AbstractFactory;

public class Application {
    private final UIComponentFactory factory;

    public Application(UIComponentFactory factory) {
        this.factory = factory;
    }

    public void renderUI() {
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        textField.render();
        checkbox.render();
    }
}
