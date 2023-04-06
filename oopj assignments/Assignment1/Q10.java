/*
10.Write a program to perform below operations on char type to 
get:
a. The number of bits used to represent a char value
b. The number of bytes used to represent a char value
c. The minimum value a char
d. The maximum value a char */

public class Q10 {
    public static void main(String[] args) {

        System.out.println("No of bits : "+Character.SIZE);
        System.out.println("No of bytes : "+Character.BYTES);
        System.out.println("Max value : "+(int)Character.MAX_VALUE);
        System.out.println("Min value : "+(int)Character.MIN_VALUE);

    }
}
