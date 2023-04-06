class Q21 {

   public static void main(String []args) {
    long lg = 123456;
    Long ll = new Long(lg);

    byte b = ll.byteValue();
    System.out.println("byte : "+b);

    short s = ll.shortValue();
    System.out.println("short : "+s);

    int i = ll.intValue();
    System.out.println("int : "+i);

    long l = ll.longValue();
    System.out.println("long : "+l);

    float f = ll.floatValue();
    System.out.println("float : "+f);

    double d = ll.doubleValue();
    System.out.println("double : "+d);
    
}

}

/*21.Write a program to convert state of Long instance into byte, 
short, int, long, float and double.
 */
