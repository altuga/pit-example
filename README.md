PIT Örnekler
===========

[PIT](http://pitest.org/) mutation testing araci   
[JUnit](http://www.junit.org/) ile birlikte kullanılmıştır

Çalıştırma
-------

Bu proje  [Maven](http://maven.apache.org/), kullanmaktadır

Konsoldan çalıştırmak için

    mvn clean install                              #clean and compile
    mvn test                                       #run jUnit
    mvn org.pitest:pitest-maven:mutationCoverage   #run PIT mutation tests


Ürütilen raporlar target\pit-reports dizini içinde yer alacaktır


Çıktı - tek yordam üzerinden
--------------------

Şöyle bir yordam var

    public boolean yourMethod(int a) {
    
            int  min = 1; // iyi degil biliyorum
            int  max = 5; // ayni sekilde
    
            if ((a >= min) &&  (a <= max)) {
                return true;
            }
    
            return false;
        }


Test yordamı şu şekilde:

 
     public void testYou() {
   
       MyClass sut = new MyClass();
   
       assertFalse(sut.yourMethod(0));
       assertTrue(sut.yourMethod(3));

   
     }

Bu durumda PIT test içinde eksikler olduğunu söyleyecektir. Eksikleri düzeltmek için iki satırın daha test 
yordamına eklenmesi gerekmektedir:



    assertTrue(sut.yourMethod(1)); // alt sinir
    assertTrue(sut.yourMethod(5)); // ust sinir


