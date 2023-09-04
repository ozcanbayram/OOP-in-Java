package com.example.myapplication;

public class Mathematics { //Bu Class'da Polymorphism uygulaması yapacağız.

    //Static Polymorphism
    //ismi aynı olan fakat döndürdükleri değer ve özellikleri (Yapacakları işlemler) farklı olan 3 metot tanımlayalım:
    public int sum(){
        return  0;
    }

    public int sum(int x, int y){
        return  x+y;
    }

    public int sum(int x, int y, int z){
        return x+y+z;
    }

}
