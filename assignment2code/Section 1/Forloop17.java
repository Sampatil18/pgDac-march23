class Forloop17{
   public static void main(String args[])
     {
      int a=0;
      int k=1;
      for(int i=1;i<=5;i++)
	  {
        for (int j=1;j<=i;j++)
         {
           a=a+k;
           System.out.print(a+" ");
                    }
          System.out.println();
       }
    }
 
}

/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/