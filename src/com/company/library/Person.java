package com.company.library;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    protected String city;

    //Конструктор:
    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    //МЕТОДЫ:
    public boolean hasAge() {
        if (age == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasCity() {
        if (this.getCity() == null) {
            return false;
        } else {
            return true;
        }
    }

    //Геттеры:
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getCity() {
        return city;
    }

    //Сеттеры:
    public void setCity(String city) {
        this.city = city;
    }

    //Меняет возраст на +1 при ДР:
    public void happyBirthDay() {
        if (hasAge()) {
            this.age++;
        } else {
            System.out.println("Поздравляю с ДР!");
            this.age++;
        }
    }

    @Override
    public String toString() {
        return " " + name + " " + surname;
    }


    //Метод для создания дитяти:
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAge(5).setAdress(city);
    }

}
