/*
33. Pass integer, float and double value from command line. Parse 
it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case.
 */

 
class  Q33{

    public static void main (String[] args){

     System.out.println("Hello :"+args[0]);
     int num1 = Integer.parseInt(args[ 0 ]);
     float num2 = Float.parseFloat(args[ 1 ]) ;
     double num3 = Double.parseDouble(args[ 2 ]) ;
     double result = num1 + num2 + num3;
     System.out.println("Result : "+result);

}
}