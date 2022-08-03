package ru.learnUp;

public class Calculator {

    private final SumProcessor sumProcessor;
    private final SubtractProcessor subtractProcessor;
    private final MultiplyProcessor multiplyProcessor;
    private final DivideProcessor divideProcessor;

    public Calculator(SumProcessor sumProcessor, SubtractProcessor subtractProcessor,
                      MultiplyProcessor multiplyProcessor, DivideProcessor divideProcessor) {
        this.sumProcessor = sumProcessor;
        this.subtractProcessor = subtractProcessor;
        this.multiplyProcessor = multiplyProcessor;
        this.divideProcessor = divideProcessor;
    }

    public long sum(long arg1, long arg2) {
        return sumProcessor.process(arg1, arg2);
    }

    public long subtract(long arg1, long arg2) {
        return  subtractProcessor.process(arg1, arg2);
    }

    public long divide(long arg1, long arg2) {
        return divideProcessor.process(arg1, arg2);
    }

    public long multiply(long arg1, long arg2) {
        return multiplyProcessor.process(arg1, arg2);
    }
}
