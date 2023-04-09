package lesson4.reference;

import lesson4.animals.Cat;
import lesson4.animals.Dog;

import java.util.ArrayList;
import java.util.List;

public class Boxing {
    public static void main(String[] args) {
        int i = 10;
        Integer i1 = new Integer(10); //ссылочный тип исп для

        List<Integer> integers = new ArrayList<>();
        // List<int> abc = new ArrayList<>();

        Integer i2 = 10; //boxing
        if(i2 < 100) //unboxing
            System.out.println("Hello");

        //примитивные типы сравниваются по значению
        int a = 10;
        int b = 10;
        System.out.println(a == b);

        Integer i3 = new Integer(10);
        Integer i4 = new Integer(10);
        System.out.println(i3 == i4);

        // == сравнивает ссылочные типы по адресу в памяти

        System.out.println(i3.equals(i4));
        //equals сравнивает по значению


        Cat c1 = new Cat("Trifon");
        Cat c2 = new Cat ("Trifon");

        Dog d1 = new Dog("Trifon");

        //поправить равенство, чтобы выдало true. Чтоб они сравнивались не по адресу, а по значению
//сделано в классе Animal

        //здесь равентво работает неправильно, потому что сравнивает адреса, а не значения
       // System.out.println(c1.getName()); дописать getName
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(d1));
        System.out.println(c1);
    }
}
