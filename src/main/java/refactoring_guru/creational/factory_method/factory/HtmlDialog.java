package refactoring_guru.creational.factory_method.factory;

import refactoring_guru.creational.factory_method.buttons.Button;
import refactoring_guru.creational.factory_method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }

}
