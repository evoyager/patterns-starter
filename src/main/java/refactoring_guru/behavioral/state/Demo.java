package refactoring_guru.behavioral.state;

import refactoring_guru.behavioral.state.ui.Player;
import refactoring_guru.behavioral.state.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
