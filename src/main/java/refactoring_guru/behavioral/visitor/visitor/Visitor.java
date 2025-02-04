package refactoring_guru.behavioral.visitor.visitor;

import refactoring_guru.behavioral.visitor.shapes.Circle;
import refactoring_guru.behavioral.visitor.shapes.CompoundShape;
import refactoring_guru.behavioral.visitor.shapes.Dot;
import refactoring_guru.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
