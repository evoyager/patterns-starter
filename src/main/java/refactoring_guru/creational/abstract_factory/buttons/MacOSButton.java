package refactoring_guru.creational.abstract_factory.buttons;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
