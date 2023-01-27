package JavaAbstractClasses.Level1;


public class Sub1 extends Parent{
    @Override
    void message() {
        System.out.println("This is first subclass");
    }

    public static void main(String[] args) {
        Sub1 sub1 = new Sub1();
        sub1.message();
    }
}
