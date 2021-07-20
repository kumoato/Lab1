package B;
//เขียนโปรแกรมแสดงค่าชนิดตัวแปร (properties)
public class B {
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private char c;
    private String str;
    private boolean b;

    // method main
    public static void main(String[] args) {
        B df = new B();
        //df.str = "kiti";
        //df.s = 5;
        //df.b = true;
        System.out.println("\n short s =" + df.s);
        System.out.println("\n int i =" + df.i);
        System.out.println("\n long l =" + df.l);
        System.out.println("\n float f =" + df.f);
        System.out.println("\n double d =" + df.d);
        System.out.println("\n char c =" + df.c);
        System.out.println("\n String str =" + df.str);
        System.out.println("\n boolean b =" + df.b);
    }

}
