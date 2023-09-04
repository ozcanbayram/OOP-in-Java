package com.example.myapplication;

//Interfacelere ulaşabilir ve sınıfa ekleyebiliriz. bunun içiç iplements yazmalıyız. Bu işlem extends etmeye benzer fakat Interfacelerdem olduğu gibi birden fazla class'ı ya da abstracts'Class'ı extends edemeyiz. Fakat birden fazla Interface'i iplement edebiliriz
public class Piano implements com.example.myapplication.Instrument, com.example.myapplication.HouseDecor {   //Bu sınıfı ınterface örneği için oluşturduk.
    String brand;
    boolean digital;


    @Override //oluşturulan metot buraya otomatik olarak override edilir. etmek için yukarıdaki iplements işleminden sonra uyarı butonuna tıklanarak override edilir.
    public void info() {
        System.out.println("Override method");
    }
}
