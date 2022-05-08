package ru.netology.domain.Product.Repo;

public class AlreadyExistsException extends RuntimeException{
    public AlreadyExistsException (String message) {
        super(message);
    }
}
