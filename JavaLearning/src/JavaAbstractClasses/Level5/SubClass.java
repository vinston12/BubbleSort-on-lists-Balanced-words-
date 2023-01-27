package JavaAbstractClasses.Level5;



public class SubClass extends AbstractClass{
    @Override
    void a_method() {
        System.out.println("This is abstract method");
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.non_a_method();
        subClass.a_method();
    }
}
