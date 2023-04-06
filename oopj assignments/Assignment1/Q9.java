/* Write a program to convert state of Byte instance into byte, 
short, int. long, float and double.*/

public class Q9 {

    public static void main(String[] args){
        byte value = 20;
        Byte bs = new Byte(value);

        byte b = bs.byteValue();
        System.out.println("byte : "+b);

        short s = bs.shortValue();
        System.out.println("short : "+s);

        int i = bs.intValue();
        System.out.println("int : "+i);

        long l = bs.longValue();
        System.out.println("long : "+l);

        float f = bs.floatValue();
        System.out.println("float : "+f);

        double d = bs.doubleValue();
        System.out.println("double : "+d);

    }
    
}


