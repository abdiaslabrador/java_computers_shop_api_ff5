package dev.project.computersshop.exceptions.computer;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Computer not found")
public class ComputerNotFoundException extends ComputerException {
    public ComputerNotFoundException(String message) {
        super(message);
    }

    public ComputerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
