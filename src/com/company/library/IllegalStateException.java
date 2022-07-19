package com.company.library;

public class IllegalStateException extends RuntimeException {

    public IllegalStateException() {
        super("НЕДОСТАТОЧНО ДАННЫХ о фамилии и имени!");
    }
}
