
public class CompareDriver
{
    public static void main(String[] args) {
        String st1 = new String("hi");
        String st2 = new String("bye");
        Integer int1 = new Integer(1);
        Integer int2 = new Integer(2);
        System.out.println(Compare1.largest(st1,st2));
        System.out.println(Compare3.largest(st1, st2));
        System.out.println(Compare2.largest(int1, int2));
        System.out.println(Compare3.largest(st1, int2));
    }
}
