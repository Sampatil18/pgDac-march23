class Q6 {
  
  public static void main(String[] args){

    boolean b = true;
    
    String str = new String();
    str = Boolean.toString(b);//String str=Boolean.toString(b); 2nd type
    System.out.println("boolean value into String :"+str);

    Boolean b2 = new Boolean(b);
    System.out.println("boolean value into Boolean instance :"+b2);

    String str2 = new String("true");
    boolean b3 = Boolean.parseBoolean(str2);
    System.out.println("String value into boolean value :"+b3);

    b2 = Boolean.valueOf(str2);
    System.out.println("String value into Boolean instance :"+b2);
  
  }  
}

/**6.Write a program to perform below operations on Boolean type to 
convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance. */


    /*public static void main(String[] args) {
    
       boolean b = true;
       String str = String.valueOf(b);
       Boolean b1= Boolean.valueOf(b);
       Boolean b2= Boolean.parseBoolean(str);
       Boolean b3= Boolean.valueOf(str);

       System.out.println(str);
       System.out.println(b1);
       System.out.println(b2);
       System.out.println(b3);

     }*/
  
