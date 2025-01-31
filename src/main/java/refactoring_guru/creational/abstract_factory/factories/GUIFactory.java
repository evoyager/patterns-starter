package refactoring_guru.creational.abstract_factory.factories;

import refactoring_guru.creational.abstract_factory.buttons.Button;
import refactoring_guru.creational.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
