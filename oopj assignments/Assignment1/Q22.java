class Q22 {
 public static void main(String []args) {
    
            long a = 100200L;
            long b = 100300L;

            Long lm =Long.max(a,b);
            System.out.println("Maxval : "+lm);

            Long ln =Long.min(a,b);
            System.out.println("Minval : "+ln);

            Long ls =Long.sum(a,b);
            System.out.println("Sum  : "+ls);
}
}
