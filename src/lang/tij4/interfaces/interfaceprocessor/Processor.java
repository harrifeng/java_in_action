package lang.tij4.interfaces.interfaceprocessor;

public interface Processor {
    String name();

    Object process(Object input);
}
