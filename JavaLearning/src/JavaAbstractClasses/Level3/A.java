package JavaAbstractClasses.Level3;

public class A extends Marks{
    private int a,b,c;
    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPercentage() {
        double pre = a+b+c;
        pre = pre/3;
        return pre/6*100;
    }


    public static void main(String[] args) {
        A a = new A(2,3,4);
        B b = new B(1,2,3,4);

        System.out.println(a.getPercentage());
        System.out.println(b.getPercentage());
    }
}
