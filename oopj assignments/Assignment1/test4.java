/*4. Write a Java program to display the speed, in meters per second, kilometers per hour and 
miles per hour. User Input : Distance (in meters) and the time was taken (as three numbers: 
hours, minutes, seconds). Note : 1 mile = 1609 meters  

>Input distance in meters: 2500
 Input hour: 5
 Input minutes: 56
 Input seconds: 23
 */
import java.util.Scanner;
class test4{

    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      
     
        System.out.println("enter meter : ");
        int meter = sc.nextInt();
        System.out.println("enter Seconds : ");
         int Seconds = sc.nextInt();

        double speed1 = (meter/Seconds);
        System.out.println("speed in meter per second : "+speed1);
      

        System.out.println("enter hours : ");
        int hour = sc.nextInt();
        double speed2 = (meter/(hour*1000)) ;
        System.out.println("speed kilometers per hour : "+6speed2);

        System.out.println("enter miles : ");
        int miles = sc.nextInt();
        double speed3 = (meter/(hour*1609))  ;
        System.out.println("speed mile per hour : "+speed3);
      
    }
}
