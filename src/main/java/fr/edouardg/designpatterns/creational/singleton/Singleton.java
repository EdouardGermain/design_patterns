package fr.edouardg.designpatterns.creational.singleton;

public class Singleton {

    // private constructor
    private Singleton() {
    }

    // instanciate singleton once
    private static final Singleton INSTANCE = new Singleton();

    // the only way to get the instance
    public static Singleton getInstance() {
        return INSTANCE;
    }

    // override clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
