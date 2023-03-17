class pattern15 //patt6
{
	public static void main(String args[]){
		
		for(int i=1;i<=5;i++){
			for(int j=1; j<=5-i;j++){
				System.out.print("");
			}
			for(int j=5; j>=i; j--)
			 //for(int j=1; j<=i; j++)
			 {
				System.out.print(" "+j);
				
			}
			System.out.println();
		}
	}
}

/*
 5 4 3 2 1
 5 4 3 2
 5 4 3
 5 4
 5
 */