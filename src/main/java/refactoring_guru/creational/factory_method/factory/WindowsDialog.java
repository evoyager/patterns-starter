package refactoring_guru.creational.factory_method.factory;

import refactoring_guru.creational.factory_method.buttons.Button;
import refactoring_guru.creational.factory_method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
