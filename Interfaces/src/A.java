interface One {
    default void hello() {
        System.out.println("hello in one");
    }
    static void meth() {
        System.out.println("I am the static utility");
    }
    public void modifyThis();
}
interface Two {
    default void hello() {
        System.out.println("hello in two");
    }
}

public class A implements Two{
    @Override
    public void hello() {
        //Two.super.hello();
        System.out.println("I have overridden both hellos and i am the new hello");
    }
//    @Override
//    public void modifyThis(){
//        System.out.println("I modified");
//    }
    public static void main(String[] args) {

        One obj1 = () -> System.out.println("lambda implementation of interface One");
//        A obj = new A();
//        obj.hello();
        obj1.modifyThis();
//        One.meth();
    }

}
