package refactoring_guru.structural.decorator.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
