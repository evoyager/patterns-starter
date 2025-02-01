package refactoring_guru.structural.composite;

import refactoring_guru.structural.composite.editor.ImageEditor;
import refactoring_guru.structural.composite.shapes.Circle;
import refactoring_guru.structural.composite.shapes.CompoundShape;
import refactoring_guru.structural.composite.shapes.Dot;
import refactoring_guru.structural.composite.shapes.Rectangle;
import java.awt.Color;

public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
