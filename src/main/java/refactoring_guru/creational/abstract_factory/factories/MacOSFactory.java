package refactoring_guru.creational.abstract_factory.factories;

import refactoring_guru.creational.abstract_factory.buttons.Button;
import refactoring_guru.creational.abstract_factory.buttons.MacOSButton;
import refactoring_guru.creational.abstract_factory.checkboxes.Checkbox;
import refactoring_guru.creational.abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
