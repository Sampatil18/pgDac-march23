class Forloop9 
{
	public static void main(String args[]){
		char alpha=64;
		for(int i=1;i<=5;i++){
			for(int j=1; j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print(" "+(char)(alpha+j));
				
			}
			System.out.println();
		}
	}
}


/*
     A
    A B
   A B C
  A B C D
 A B C D E
 
 
 */
 
 
	

