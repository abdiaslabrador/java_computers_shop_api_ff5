package dev.project.computersshop.exceptions.computer;


public class ComputerException extends RuntimeException{

    public ComputerException(String message) {
        super(message);
    }

    public ComputerException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
