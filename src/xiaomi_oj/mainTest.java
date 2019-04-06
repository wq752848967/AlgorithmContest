package xiaomi_oj;

public class mainTest {
    public static void main(String[] args) {
        System.out.println(f(0.5));
    }
    public static int foo(int a){
        return ((a>0)?a*foo(a-1):2);
    }
    public static double f(double e){
        double s=1;
        double t = 1/2;
        int n=1;
        while(t>=e){
            s+=t;
            n++;
            t=t+n/(2.0*n-1);
        }
        return (s*3);
    }

}
