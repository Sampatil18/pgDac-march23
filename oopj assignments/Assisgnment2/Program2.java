
import java.util.*;

class BMI {
    private double height;
    private double weight;

    BMI(){
    this.height=height;
    this.weight=weight;
    }
    
    public double getHeihght(){
    return this.height;
    }

    public void setHeight( double height){
    this.height = height;
    }
    
    public double getWeight(){
    return this.weight;
    }

    public void setWeight(double weight){
    this.weight = weight;
    }

    public void calculateBMI(){
        
        double BMI = weight / (height * height);
    
        System.out.println();
        System.out.println("==============================");
        System.out.println("BMI is : "+BMI);

        }

    }
    
    
class Program2{
    public static void main(String[] args)
    {
       BMI b1 = new BMI();
       Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter height : ");
        b1.setHeight(sc.nextDouble());
        double height = b1.getHeihght();

        System.out.print("Enter weight : ");
        b1.setWeight(sc.nextDouble());
        double weight = b1.getWeight();

        b1.calculateBMI();
   

    }
}