package StructuralPatterns.SP4_Decorator.decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
