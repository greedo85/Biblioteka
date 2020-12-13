import java.util.Scanner;

public class Main {

    static BookManager bookManager=new BookManager();
    static LibraryManager libraryManager=new LibraryManager();
    static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args ) {
        System.out.println("podaj id: ");
        int id=scanner.nextInt();
        Library library = libraryManager.getById(id);
        System.out.println(library);
        System.out.println("podaj tytuł: ");
        scanner.nextLine();
        String title= scanner.nextLine();
        Book book2=bookManager.getByString(title);
        System.out.println(book2);

    }
}
