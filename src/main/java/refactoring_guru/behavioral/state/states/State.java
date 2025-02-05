package refactoring_guru.behavioral.state.states;

import refactoring_guru.behavioral.state.ui.Player;

public abstract class State {
    Player player;

    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
