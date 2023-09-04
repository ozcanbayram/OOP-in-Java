package com.example.myapplication;
import static com.example.myapplication.HouseDecor.roomName;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Constructor kullanmadan uzun ve pek güvenli olmadan aşağıdaki gibi yapabilriz.
        //User myUser = new User();
        //myUser.name = "Özcan";
        //myUser.job = "Software Developer",






        //Constructor kulanarak tek satırda daha hızlı yapmamızı sağlar.
        User myUser = new User("Özcan","Software Developer");
        System.out.println(myUser.name);







        //Encapsulation Örneği:
        Musician james = new Musician("james","Guitar",50);

        //james.age=60;
        //System.out.println(james.age); //Encapsulation yapmadan önce yukarıda tanımlanan jamesin 50 yaşı bir alt satırda 60 olarak değiştirildi. Eğer değiştirilmesini istemiyorsak Musician Class'ında Encapsulation uygulayabilriz. Şimdi Musuician Class'ına giderek nasıl uygulandığını görebilirsiniz.

        //Encapsulation uyguladıktan sonra  üstteki saturlar hata vereceğinden dolayı yorum satırı haline getirdik.
        //Encapsulation uygulayarak Property'leri Private hale getirdikten sonra yukarıdaki gibi klasik yazdırma işlemi uygulayamayız.
        //Encapsulation uygulayarak Kendi yazdığımız bir sınıfın nesnesinin başka yerde değiştirilmesini ve okunmasını engelleyebiliriz.
        //Fakat Sınıfımızın nesnesinin değiştirilmesin, sadece okunabilsin ya da tam tersini de isteyebiliriz. Bu işlem için devreye get ve set girer. Hadi öğrenelim.

        //Musician klassında yaptığımız get işlemi ile bir neesneyi yazdırabiliriz.
        System.out.println(james.getName()); //--> şeklinde izin verilen nesneleri yazdırabiliriz.
        //Eğer yazdırma yani okuma işlemi gibi değiştirme işlemini de yapmak istiyorsak Musician cllassında buna set ile izin verilmelidir. Set; setring yani ayarlamadan gelir.
        james.setName("James ismi set ile Kenny olarak değiştirildi.");
        System.out.println(james.getName());

        //Aşağıda Musuician Class'ında koşul oluşturulan age değerini koşulu doğrulayarak değiştirelim:
        james.setAge(60,"Atil"); // Önce değitirmek istediğimiz değeri daha sonra ise oluşturduğumuz parolayı girdik ve başarıyla değiştirme işlemini yaptık.








        //Inheritance için SuperMusician Class'ını ve aşağıdaki bloğu kullanacağız:

        //SuperMusician lars = new SuperMusician(); // --> Hata vereceğinden dolayı yorum satırı. Eğer Parantez içine isim enstruman ve yaş belirtmezsek hata verir.
        //System.out.println(lars.sing());          //SuperMusucian Class'ında yazılan metot ile sing değeri return edilir ve Lars şarkı söyler.

        //Şimdi yapmak istediğimiz şey, Musician sınıfında olan bilgilerin hepsini SuperMusician sınıfı için de kullanabilmek ve artı olarak bir de şarkı ekleyebilmek. -->Örnek Şarkı: Nothing Else Matters.
        SuperMusician lars = new SuperMusician("Lars", "Drums",55);
        System.out.println(lars.getName()); //Burada SuperMusuican Class'ı ile işlem yapmamıza rağmen Musician Class'ını da kullanabilriz, çünkü SuperMusuician Class'ında yaptığımız işlem ile Musician Class'ından miras aldık yani Inheritanc işlemini uyguladık.
        System.out.println(lars.sing());

        //Özetle Inheritance kullanarak SuperMusuician sınıfına hem kendi metotlarını belirledik hem de Musician sınıfının özelliklerini belirledik.Böylece lars nesnesi SuperMusician sınıfından türetilmesine rağmen Musician sınıfının da özelliklerini kullanabilir.









        //Polymorphizsm
        //Bir metotun aynı isimle birden başka işlerde kullnılabilmesine olanak sağlar.


        //Static Polymorphism : Aynı sınıfın içinde farklı  metotları aynı isim ile kullanmaya denir.

        Mathematics mathematics = new Mathematics(); //--> mathematics nesnesini çağırınca bize kullanmamız için sum isminde 3 tane metot gösterir fakat hepsi bizden farklı parametreler ister.
        System.out.println(mathematics.sum()); // --> Aynı metot olmasına rağmen çıktı: 0
        System.out.println(mathematics.sum(5,2)); // --> Aynı metot olmasına rağmen çıktı: 7
        System.out.println(mathematics.sum(2,5,7)); // --> Aynı metot olmasına rağmen çıktı: 14
        //Parametreler ve return değerleri farklıdır.


        //Dynamic polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing(); // --> Animal sınıfından sing metodu.

        com.example.myapplication.Dog barley = new com.example.myapplication.Dog();
        barley.test(); //--> Dog sınıfından extends edilerek Animal sınıdına referans edildi.
        barley.sing(); //--> Dog sınıfından sing metodu.








        //Abstract --> soyutlama
        //Soyut sınıflar geneled obje oluşturmaktansa başka sınıflara extends edilmek için yapılan sınıflardır.
        System.out.println(myUser.information()); //Görüldüğü üzere Users Sınıfının nesnesi olan myUser ile Soyut (abstract) sınıf olan People sınıfına ulaşabiliyoruz.
        //Bunun amacı çok fazla sınıf varsa ve propertyleri birbirine eşit ise olusturulan bu abstract (soyut) sınıfa hepsini yazarak bu sınıftan bir obje oluşturmadan extends işlemi işe işimizi kolaylaştırabiliriz.












        // Abstract & Interface   ilgili sayfalar --> Piano.java, HouseDecor.java, Instrument.java  ( HouseDecor.java, Instrument.java  interfaceleri Piano.java Class'ına iplement edilerek propertyler kullanıldı ve methodlara override uygulanıldı.)
        Piano myPiano = new Piano();
        System.out.println(myPiano.brand="Yamaha");
        System.out.println(myPiano.digital=true);
        myPiano.info();
    }
}