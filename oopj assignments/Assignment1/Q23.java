/*
23.Write a program to perform below operations on float type to 
get: 
a. The number of bits used to represent a float value
b. The number of bytes used to represent a float value
c. The minimum value a float
d. The maximum value a float */

class Q23{
    public static void main (String[] args){

       
    System.out.println("No of bits : "+Float.SIZE);
    System.out.println("No of bytes : "+Float.BYTES);
    System.out.println("Max value : "+Float.MAX_VALUE);
    System.out.println("Min value : "+Float.MIN_VALUE);

}
    
}