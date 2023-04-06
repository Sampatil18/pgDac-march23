/*
28.Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal 
string(Note: Here you can use doubleToLongBits() method 
along with methods of Long class).*/


class Q28{
 public static void main(String []args) {
    
        double value = 3.14;

        String s1=Double.toString(value);
        System.out.println("int value into String:"+s1);

        Double s2=Double.valueOf(value);
        System.out.println("int value into Double instance:"+s2);

        String str="231";
        Double s3=Double.valueOf(str);
        System.out.println("String instance into Double instance:"+s3);     

        String s4 = Double.toHexString(value);
        System.out.println("Hs: "+s4);

       /* String s5 = Double.toBinaryString(value);
        System.out.println("Bs: "+s5);

        String s6 = Double.toOctalString(value);
        System.out.println("Os: "+s6);    */  
       
               
        }
    

    }