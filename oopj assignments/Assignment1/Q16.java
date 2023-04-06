public class Q16 {
    
    public static void main(String[] args) {

        int value=60;
        String s1=Integer.toString(value);
        System.out.println("int value into String:"+s1);

        Integer s2=Integer.valueOf(value);
        System.out.println("int value into integer instance:"+s2);

        String str="231";
        Integer s3=Integer.valueOf(str);
        System.out.println("String instance into integer instance:"+s3);     

        String s4 = Integer.toHexString(value);
        System.out.println("Hs: "+s4);

        String s5 = Integer.toBinaryString(value);
        System.out.println("Bs: "+s5);

        String s6 = Integer.toOctalString(value);
        System.out.println("Os: "+s6);      
       
   }

}



/*
 * 16. Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.

 */