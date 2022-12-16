import java.util.Scanner;
class Book
{
  String name,author;
  double price;
  int num_pages;
  Book()
  {
     name=" ";
     author=" ";
     price=0.0; num_pages=0;
  }
  void input()
  {
     Scanner ss=new Scanner(System.in);
     System.out.println("Enter the name of the book:");
     name=ss.nextLine();
     System.out.println("Enter the author of the book:");
     author=ss.nextLine();
     System.out.println("Enter the price of the book:");
     price=ss.nextDouble();
     System.out.println("Enter the number of pages of the book:");
     num_pages=ss.nextInt();
  }
  public String toString()
  {
     return("NAME: "+name+"\nAUTHOR: "+author+"\nPRICE: "+price+ "/-"+"\nNUMBER OF PAGES: "+num_pages+"\n");
  }
}
class book_main
{
  public static void main(String xx[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of books: ");
    int n=s.nextInt();
    Book books[]=new Book[n];
    for(int i=0;i<n;i++)
    {
       books[i]=new Book();
       books[i].input();
       System.out.println("\n BOOK DETAILS:");
       System.out.println(books[i]);
    }
  }
}
