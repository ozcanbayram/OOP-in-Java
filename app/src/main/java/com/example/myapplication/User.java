package com.example.myapplication;
public class User extends com.example.myapplication.People {
    //Bu sayfada Constructor kullanacağız:
    //Not: bir sınıftan birden fazla obje oluşturamıyorsak bu sınıfa Singleton sınıf denir.

    //Property:
    String name;
    String job;

    //Bu şekilde çok kullanışlı olmadığından dolayı Constructor kullanırız.

    // Constructor:  --> sağ click / generate / constructor.
    // Cosntructor bir sınıftan bir obje oluştruulduğunda ilk  çağrılacak olan metottur.


    public User(String nameInput, String jobInput) { // --> bir kullanıcı oluşturuyor (User), içinde 2 tane input alıyor, en baştaki propertyi bu inputa eşitliyor.
        this.name = nameInput; //this= imindeki sınıfa(yukarıdaki string name) referans vererek Property i çağırıyor ve nameInput ile eşitliyor.
        this.job = jobInput;

        System.out.println("User Created."); // her obje oluşturulunca cağrılan metot olduğundan dolayı bir kullanıcı oluşturuldu mesajı yazdırıyoruz.
    }








}
