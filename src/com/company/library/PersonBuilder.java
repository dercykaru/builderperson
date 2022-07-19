package com.company.library;

public class PersonBuilder {
    //поля для будущего объекта Person:
    private String name;
    private String surname;
    private int age;
    private String adress;

    //Пустой конструктор PersonBuilder:
    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {this.name = name; return this;};
    public PersonBuilder setSurname(String surname) {this.surname = surname; return this;}
    public PersonBuilder setAge(int age) {this.age = age; return this;}
    public PersonBuilder setAdress(String adress) {this.adress = adress; return this;}

    public Person build() {
        if ( (this.name == null) || (this.surname == null) ) {throw new IllegalStateException();}
        else if (this.age < 0) {throw new IllegalArgumentException("НЕВЕРНЫЕ ДАННЫЕ о возрасте!");}
        else {return new Person(this.name, this.surname, this.age, this.adress);}
    }



}
