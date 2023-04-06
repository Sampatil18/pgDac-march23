public class Q14 {

    
    public static void main(String[] args){
        short value = 110;
        Short sh = new Short(value);

        byte b = sh.byteValue();
        System.out.println("byte : "+b);

        short s = sh.shortValue();
        System.out.println("short : "+s);

        int i = sh.intValue();
        System.out.println("int : "+i);

        long l = sh.longValue();
        System.out.println("long : "+l);

        float f = sh.floatValue();
        System.out.println("float : "+f);

        double d = sh.doubleValue();
        System.out.println("double : "+d);
    
}
}


/*.
14.Write a program to convert state of Short instance into byte, 
short, int, long, float and double.
 */