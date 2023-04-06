public class Q17 {
    public static void main(String[] args) {
            int value = 300;
            Integer it = new Integer(value);
    
            byte b = it.byteValue();
            System.out.println("byte : "+b);
    
            short s = it.shortValue();
            System.out.println("short : "+s);
    
            int i = it.intValue();
            System.out.println("int : "+i);
    
            long l = it.longValue();
            System.out.println("long : "+l);
    
            float f = it.floatValue();
            System.out.println("float : "+f);
    
            double d = it.doubleValue();
            System.out.println("double : "+d);
        
    }
    }


/* 
 17. Write a program to convert state of Integer instance into 
byte, short, int, long, float and double.
 */