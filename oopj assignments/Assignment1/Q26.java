/*26.Write a program to find minimum and maximum number as well as 
to add two float numbers using methods of Float.*/
class Q26{

    public static void main(String []args) {
    
            float a = 3.14f;
            float b = 3.10f;

            Float fm =Float.max(a,b);
            System.out.println("Maxval : "+fm);

            Float fn =Float.min(a,b);
            System.out.println("Minval : "+fn);

            Float fs =Float.sum(a,b);
            System.out.println("Sum  : "+fs);
}
}