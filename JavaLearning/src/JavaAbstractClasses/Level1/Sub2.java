package JavaAbstractClasses.Level1;

public class Sub2 extends Parent{

    @Override
    void message() {
        System.out.println("This is second subclass");
    }

    public static void main(String[] args) {
        Sub2 sub2 = new Sub2();
        sub2.message();
    }
}
