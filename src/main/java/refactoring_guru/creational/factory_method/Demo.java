package refactoring_guru.creational.factory_method;

import refactoring_guru.creational.factory_method.factory.Dialog;
import refactoring_guru.creational.factory_method.factory.HtmlDialog;
import refactoring_guru.creational.factory_method.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
