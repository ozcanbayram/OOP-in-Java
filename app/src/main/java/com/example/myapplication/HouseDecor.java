package com.example.myapplication;

public interface HouseDecor { //Bu bir Interface'dir  --> 100% Abstract tiplerdir

    //Özellikleri:
    //Static property & final --> Statik özellik (roomName) yani her yerden ulaşılabilir.
    //finally: değiştirilemez. Yani bir değer verilmek zorundandur (Initialize)
    String roomName = "Kitchen";

}
