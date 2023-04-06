public class Q8 {
    
    public static void main(String[] args) {

   byte b1 = 126;
   String str = String.valueOf(b1);
   Byte c1 = Byte.valueOf(b1);
   Byte c2 = Byte.valueOf(str);

   System.out.println(str);
   System.out.println(c1);
   System.out.println(c2);


    }
}

/* 
Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.
*/