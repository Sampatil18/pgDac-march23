/*25.Write a program to convert state oft ftloat instance into byte, 
short, int, long, ftloat and double.
*/

class Q25 {

   public static void main(String []args) {
    float pi = 3.14f;
    Float ft = new Float(pi);

    byte b =ft.byteValue();
    System.out.println("byte : "+b);

    short s =ft.shortValue();
    System.out.println("short : "+s);

    int i =ft.intValue();
    System.out.println("int : "+i);

    long l =ft.longValue();
    System.out.println("long : "+l);

    double d =ft.doubleValue();
    System.out.println("double : "+d);
    
}

}
