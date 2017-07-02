package pitexample;

public class MyClass {



    public boolean yourMethod(int a) {

        int  min = 1; // i know hard code is not good
        int  max = 5; // same is here :(

        if ((a >= min) &&  (a <= max)) {
            return true;
        }

        return false;
    }

}