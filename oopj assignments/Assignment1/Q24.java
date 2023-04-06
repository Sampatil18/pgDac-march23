/* 
24.Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.
*/

class Q24{
 public static void main(String []args) {
    
        float value = 3.14f;

        String s1=Float.toString(value);
        System.out.println("int value into String:"+s1);

        Float s2=Float.valueOf(value);
        System.out.println("int value into Float instance:"+s2);

        String str="231";
        Float s3=Float.valueOf(str);
        System.out.println("String instance into Float instance:"+s3);     

        String s4 = Float.toHexString(value);
        System.out.println("Hs: "+s4);

       /* String s5 = Float.toBinaryString(value);
        System.out.println("Bs: "+s5);

        String s6 = Float.toOctalString(value);
        System.out.println("Os: "+s6);      
       */
           
        }
    

    }