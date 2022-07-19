package com.company.library;

public class Main {

    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Фрося")
                .setSurname("Силач")
                .setAge(28)
                .setAdress("Деревня")
                .build();

        Person son = mom.newChildBuilder()
                .setName("Васютка")
                .build();

        System.out.println("Привет! Это " + mom + " и сынишка " + son);
        System.out.println("Известен возраст = " + mom.hasAge() + " Он составляет= " + mom.getAge().getAsInt());
        System.out.println("Известен адрес = " + mom.hasCity() + " Это место= " + mom.getCity());
        System.out.println("Возраст сынишки = " + son.getAge().getAsInt());
        System.out.println("А когда будет день рождениия...");
        son.happyBirthDay();
        System.out.println("Возраст сынишки = " + son.getAge().getAsInt());
        System.out.println("Где живет сынишка = " + son.getCity());
        System.out.println();

        System.out.println("Проверяем на возможный ввод некорректных данных:");
        try {
            //Отсутствуют обязательные поля
            new PersonBuilder().build();
        } catch (IllegalStateException ex) {
            ex.printStackTrace();
        }

        try {
            //недопустимые значения
            new PersonBuilder().setName("unknown person").setSurname("unknown family").setAge(-100).build();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }


    }//endofmain
}
