package pitexample;

public class MyClass {



    public boolean yourMethod(int a) {

        int  min = 1; // iyi degil biliyorum
        int  max = 5; // ayni sekilde

        if ((a >= min) &&  (a <= max)) {
            return true;
        }

        return false;
    }

    public int topla(int a, int b) {
        return a + b ;
    }


}