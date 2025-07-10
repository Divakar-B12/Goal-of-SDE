package com.FAANG.Day9;

import java.lang.Exception;

public class AgeException extends Exception {
    public AgeException(){
        super("Invalid Age, So your are not eligible to vote");
    }
}
