package refactoring_guru.behavioral.observer;

import refactoring_guru.behavioral.observer.editor.Editor;
import refactoring_guru.behavioral.observer.listeners.EmailNotificationListener;
import refactoring_guru.behavioral.observer.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener(
                "/Users/.../IdeaProjects/patterns-starter/src/main/resources/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
