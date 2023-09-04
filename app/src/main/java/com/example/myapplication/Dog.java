package com.example.myapplication;

public class Dog extends Animal{  //Bu Class'da Animal sınıfından kalıtım aldık (Inheritance) ve dynamic Polymorphism örneğine animal ve dog sınıfları üzerinden örneklendireceğiz.
    public void test(){
        super.sing();  //super --> extend edilen sınıfa referans verir.
    }

    //yukarıda Animal sınıfının sing metodunu kullandık fakat aynı isimde bir metot da burada tanımlayabilriz.
    public void sing(){
        System.out.println("Dog Class"); //Aynı isimde 2 metodun değeri farklı belirlenebilri, farklı amaç için kullanılabilir.
    }
}
