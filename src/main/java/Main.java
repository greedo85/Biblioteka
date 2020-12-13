import java.util.Scanner;

public class Main {

    static BookManager bookManager=new BookManager();
    static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args ) {
        System.out.println("podaj id: ");
        int id=scanner.nextInt();
        Book book = bookManager.getById(id);
        System.out.println(book);
        System.out.println("podaj tytuł: ");
        scanner.nextLine();
        String title= scanner.nextLine();
        Book book2=bookManager.getByString(title);
        System.out.println(book2);
    }
}
