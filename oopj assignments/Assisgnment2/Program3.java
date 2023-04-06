import java.util.*;

class Book{ 
        String title;
        String author;
        String publisher;
        String isbn;
        int year;
        double price;
        int quantity;

     Book(){
            //todo
     }
     
     Scanner sc = new Scanner(System.in);

     public String getTitle(){
     return title;
     }
     public void setTitle(String title){
     this.title=title;
     }
    
     public String getAuthor(){
     return author;
     }
     public void setAuthor(String author){
     this.author=author;
     }

     public String getPublisher(){
     return publisher;
     }
     public void setPublisher(String publisher){
     this.publisher=publisher;
     }

     public String getIsbn(){
     return isbn;
     }
     public void setIsbn(String isbn){
     this.isbn=isbn;
     }

     public int getYear(){
     return year;
     }
     public void setYear(int year){
     this.year=year;
     }

     public int getQuantity(){
     return quantity;
     }
     public void setQuantity(int quantity){
     this.quantity=quantity;
     }

     public double getPrice(){
     return price;
     }
     public void setPrice(double price){
     this.price=price;
     }

     public void increaseQuantity(int plusBook){
        int increaseQuantity = quantity + plusBook;
        System.out.println("Total quantity of books after inceasing books : "+increaseQuantity);
        System.out.println();
        }

     public void decreaseQuantity(int minusBook){
        int decreaseQuantity = quantity - minusBook;
        System.out.println("Total quantity of books after decreasing books : "+decreaseQuantity);
        System.out.println();
        }
    
     public void getInventoryValue(){
         double inventory = (price*quantity);
         System.out.println("Total inventory Value : "+inventory);
         ;
     }
}

class Program3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book();

     System.out.print("Enter title : ");
     b1.setTitle(sc.nextLine());
     String title = b1.getTitle();  
        
     System.out.print("Enter author : ");
     b1.setAuthor(sc.nextLine());
     String author = b1.getAuthor();  

     System.out.print("Enter publisher : ");
     b1.setPublisher(sc.nextLine());
     String publisher = b1.getPublisher(); 

     System.out.print("Enter isbn : ");
     b1.setPublisher(sc.nextLine());
     String isbn = b1.getIsbn(); 

     System.out.print("Enter year : ");
     b1.setYear(sc.nextInt());
     int year = b1.getYear(); 

     System.out.print("Enter price : ");
     b1.setPrice(sc.nextDouble());
     double price = b1.getPrice(); 

     System.out.print("Enter quantity : ");
     b1.setQuantity(sc.nextInt());
     int quantity = b1.getQuantity(); 

     b1.getInventoryValue();

      System.out.println("==========================================");
      System.out.println();

        System.out.println("Enter the Increase Quantity of The Book : ");
        int plusBook = sc.nextInt();
        b1.increaseQuantity(plusBook);
        
        System.out.println("Enter the Decrease Quantity of The Book : ");
        int minusBook = sc.nextInt();
        b1.decreaseQuantity(minusBook);
       
    }
}