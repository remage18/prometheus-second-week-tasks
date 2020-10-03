package prometheus;

public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        double d = b*b - 4*a*c;
        double x1 = 0;
        double x2 = 0;
        if(a == 0 && b == 0 && c == 0){
            System.out.println("x1=");
            System.out.println("x2=");
        }else if (a == 0 && b == 0){
            System.out.println("x1=");
            System.out.println("x2=");
        }else if (Math.sqrt(d) == b && a == 0){
            x1 = x2 = 0 * d;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }else if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }else if( d == 0){
            x1 = x2 = -b/(2*a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
        else{
            System.out.println("x1=");
            System.out.println("x2=");
        }
    }
}
