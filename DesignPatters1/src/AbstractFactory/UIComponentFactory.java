package AbstractFactory;

public interface UIComponentFactory {
    Button createButton();
    TextField createTextField();
    Checkbox createCheckbox();
}
