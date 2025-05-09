package refactoring_guru.behavioral.visitor.shapes;

import refactoring_guru.behavioral.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
