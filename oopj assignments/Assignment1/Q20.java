public class Q20 {
    public static void main(String []args) {
    
        long value = 10000L;
        String s1=Long.toString(value);
        System.out.println("int value into String:"+s1);

        Long s2=Long.valueOf(value);
        System.out.println("int value into Long instance:"+s2);

        String str="231";
        Long s3=Long.valueOf(str);
        System.out.println("String instance into Long instance:"+s3);     

        String s4 = Long.toHexString(value);
        System.out.println("Hs: "+s4);

        String s5 = Long.toBinaryString(value);
        System.out.println("Bs: "+s5);

        String s6 = Long.toOctalString(value);
        System.out.println("Os: "+s6);    
    }
}

/* 
 * 20.Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.
 */