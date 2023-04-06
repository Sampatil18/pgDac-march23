/*
30.Write a program to find minimum and maximum number as well as 
to add two double numbers using methods of Double. */


class Q30{

    public static void main(String []args) {
    
            double a = 3.14;
            double b = 3.10;

            Double dm =Double.max(a,b);
            System.out.println("Maxval : "+dm);

            Double dn =Double.min(a,b);
            System.out.println("Minval : "+dn);

            Double ds =Double.sum(a,b);
            System.out.println("Sum  : "+ds);
}
}