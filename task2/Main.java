package com.tasks.task2;



public class Main {
    public static void main(String[] args) {
        //Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
        //конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
        //класса.
        Test2 test2=new Test2(10,5);
        test2.setNumberOne(10);
        System.out.println(test2.getNumberOne());
        test2.setNumberTwo(15);
        System.out.println(test2.getNumberTwo());

    }

}
