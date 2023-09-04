package com.example.myapplication;
public class SuperMusician extends com.example.myapplication.Musician { //Musician Class'ındakileri bu Class'da da kullanabilmek için --> extends Musician yazarız. Eğer Miras almak istediğimiz sayfada Constructor var ise bu Class'da da mutlaka Constructor olmalıdır. Olmazsa hata verecektir.
    public SuperMusician(String nameInput, String instrumentInput, int ageInput) {
        super(nameInput, instrumentInput, ageInput);
    }



    //Bu Class'da Inheritance uygulaması yapacağız.
    //Inheritance: Bir sınıfın diğerinden kalıtım (miras) alması demektir. Bir sınıfın özelliklerini vs.. kullanabilmek için bize olanak sağlar.
    //Bu Class'ın Musician Class'ındaki özelliklere setterlara,getterlara... sahip olabilmesini Inheritance ile sağlayalım.
    //Artı bir tane de metodu olsun.

    //Metodumuzu oluşturalım: Metot bize sing return etsin yani bir şarkı değeri geri döndüsün.
    public String sing(){
        return "Nothing Else Matters"; // Bu bir şarkı ismi ve bunun return edilmesini istiyoruz.
    }

}
