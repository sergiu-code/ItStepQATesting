package com.ItStep.Lesson.ExceptionsHandle;


public class CustomException extends Exception{
    public CustomException(String message){
        super("Number "+message+" is out of range between 0-9");
    }
}

