package com.example.myapplication;
public class Musician {
    //Bu sınıfta Encapsulation yapacağız (Saklama, koruma)

    //Encapsulation yapmak yani biraz gizleyebilmek ve değişikliği önleyebilmek için Propertyleri Private olarak belirleriz.
    private String name;
    private String instrument;
    private int age;

    //Constructor oluşturalım:
    public Musician(String nameInput, String instrumentInput, int ageInput){
        this.name = nameInput;
        this.instrument = instrumentInput;
        this.age = ageInput;
    }


    //Şimdi MainActivityde belirttiğimiz şekilde nesnemizin okunsun-değiştirilmesin ya da değiştirilsin-okunmasın gibi belirleyici encapsulation özelliklerini nasıl belirtiriz onu öğreneceğiz:

    //get ile okuma işlemi yapabiliriz. --> james.getName(); --> MainActivity'de bu şekilde yazma işlemi yapabiliriz.
    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    //Şimdi bir özellik daha öğrenmek için aşağıdaki set age yani MainActvity'de veya başka bir kullanıcının age değerini değiştirebilmesi için buna bir koşul da koyabiliriz.
    //Nasıl yapıldığını aşağıdaki örnek ile anlayabilirsiniz.
    public void setAge(int age, String password) {  //password diye bir string tanımladık.
        if (password.matches("Atil")) // Diğer tarafta herhangi biri ya da bir işlem tarafından bu metot çağrılır ve yage değitirilmek istenirse bir parola doğrulaması gerekir.
            this.age = age;
    }
}
