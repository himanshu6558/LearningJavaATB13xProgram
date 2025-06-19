package LiveTest;

public class Challenge3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean c = a==b;
        boolean d = a>b;
        boolean e = a<b;


        System.out.println("a == b: "+c+" a > b: "+d+"  a < b: "+e+" (a > b) && (a > 0): "+d+" (a < b) || (a > 0): "+d+" !(a > b): "+e);
    }
}
