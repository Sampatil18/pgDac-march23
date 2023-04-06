import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
class Program1{

public static void main(String[] args)throws Exception{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter date (dd/mm/yy):");
       String dateStr = sc.nextLine();
       System.out.println("Enter time(hr:min:sec): ");
       String dateTime = sc.nextLine();
       System.out.println("Enter meridiem(AM/PM): ");
       String meridiem = sc.nextLine(); 
       
       SimpleDateFormat sdf1 = new SimpleDateFormat(dateStr);
       SimpleDateFormat sdf2 = new SimpleDateFormat(dateTime);
       
       Date date = sdf1.parse(dateStr);
       Date time = sdf2.parse(dateTime); 
       
       System.out.println(date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900));
       System.out.println((date.getMonth()+1)+"/"+date.getDate()+"/"+(date.getYear()+1900));
       System.out.println((date.getYear()+1900)+"/"+(date.getMonth()+1)+"/"+date.getDate());
       System.out.println();
       
       System.out.println(time.getHours()+":"+time.getMinutes()+":"+time.getSeconds());
       System.out.println(time.getHours()+":"+time.getMinutes()+":"+time.getSeconds()+" "+meridiem);
       System.out.println(time.getHours()+":"+time.getMinutes());
       System.out.println();
       
       System.out.println(date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900)+" "+time.getHours()+":"+time.getMinutes()+":"+time.getSeconds());
       System.out.println((date.getMonth()+1)+"/"+date.getDate()+"/"+(date.getYear()+1900)+" "+time.getHours()+":"+time.getMinutes()+":"+time.getSeconds()+" "+meridiem);
       System.out.println((date.getYear()+1900)+"/"+(date.getMonth()+1)+"/"+date.getDate()+" "+time.getHours()+":"+time.getMinutes());
   }
       
 }