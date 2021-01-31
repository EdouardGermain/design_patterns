package fr.edouardg.designpatterns.creational.singleton;

public class Singleton {

    private String myField;

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

    public String getMyField() {
        return myField;
    }

    public void setMyField(String myField) {
        this.myField = myField;
    }

    public static void main(String[] args) {
        getInstance().setMyField("value1");
        System.out.println(getInstance().getMyField());
    }

}
