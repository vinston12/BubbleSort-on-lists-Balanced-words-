package JavaAbstractClasses.Level3;

public class B extends Marks{

    private int a,b,c,d;

    public B(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;


    }
    @Override
    double getPercentage() {
        double pre = a+b+c+d;
        pre = pre/4;

        return pre/6*100;
    }
}
