class A {
    public void methodInA() {
        System.out.println("I am meth in A");
    }
}
public class Polymorphism extends A{
    public static void main(String[] args) {
        //Polymorphism obj = new A();
        A obj1 = new Polymorphism();
    }
}
