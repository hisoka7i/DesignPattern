package Singleton;

public class Singleton {
    //static member
    private static Singleton object = new Singleton();
    //private constructor
    private Singleton(){};

    //A method to get the object
    public Singleton getSingletonObject(){
        return object;
    }

    //Here will be some function which will perform the required operation.
}
