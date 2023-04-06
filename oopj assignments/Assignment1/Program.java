class Program{

static void sum(int i, int j){
    int sum = i + j;
    System.out.println("sum1 = "+sum);   
    }

static void sum(float i, float j){
    float sum = i + j;
    System.out.println("sum3 = "+sum);   
    }


    public static void main(String[] args){
    
    Program.sum(10,20);
    Program.sum(20,20);
    Program.sum(10.10f,20.20f);

    }
}