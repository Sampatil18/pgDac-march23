public class Q13 {
    public static void main(String[] args) {
   
     short s = 100;
     String s1 = Short.toString(s);
     System.out.println("short value into String :"+s1);

     short s2 =Short.valueOf(s);
     System.out.println("short value into Short instance :"+s2);

     String str="111";
     short sh =Short.valueOf(str);
     System.out.println("String instance into Short instance:"+sh);


}

}
/*
13.Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance. */
