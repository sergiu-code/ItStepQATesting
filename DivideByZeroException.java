package com.ItStep.Lesson;

public class DivideByZeroException extends RuntimeException {
    public DivideByZeroException() {
        super("undefined result when divide by 0");
    }
}
