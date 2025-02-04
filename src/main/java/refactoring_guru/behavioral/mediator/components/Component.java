package refactoring_guru.behavioral.mediator.components;

import refactoring_guru.behavioral.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
