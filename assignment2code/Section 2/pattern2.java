class pattern2 
{
	public static void main(String args[]){
		
		for(int i=1;i<=5;i++){
			for(int j=1; j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}


/*

with double space in both 7,10 line
         *
       * *
     * * *
   * * * *
 * * * * *
 
 with single space in both 7,10 line
    *
   **
  ***
 ****
***** 

*/
