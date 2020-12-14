import java.util.List;
import java.util.Scanner;

public class Main {

    static String name;
    static String surname;
    static String title;
    static int amount;
    static int id;
    static BookManager bookManager = new BookManager();
    static AuthorManager authorManager = new AuthorManager();
    static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {
        int choice;
        do {
            menu();
            choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    setName();
                    setSurname();
                    Author author=new Author(name,surname);
                    authorManager.add(author);
                    break;
                case 2:
                    setTitle();
                    setAmount();
                    setId();
                    Author author1=authorManager.getById(id);
                    Book book=new Book(title,amount,author1);
                    bookManager.add(book);
                    break;
                case 3:
                    List <Book> books = bookManager.getAll();
                    System.out.println(books);
                    break;
                case 4:
                    List <Author> authors=authorManager.getAll();
                    System.out.println(authors);
                    break;
                case 5:
                    setTitle();
                    Book book1=bookManager.getByString(title);
                    System.out.println(book1);
                    break;
                case 6:
                    setSurname();
                    Author author2=authorManager.getByString(surname);
                    System.out.println(author2);
                    break;
                case 7:
                    setTitle();
                    setAmount();
                    id=bookManager.getByString(title).getId();
                    System.out.println("podaj id autora");
                    int authorId= scanner.nextInt();
                    Book book2=new Book(id,title,amount,authorManager.getById(authorId));
                    bookManager.update(book2);
                    break;
            }

        }
        while (choice != 0);
    }

    private static void setTitle() {
        System.out.println("podaj tytuł: ");
        scanner.nextLine();
        title = scanner.nextLine();

    }
    private static void setAmount()
    {
        System.out.println("podaj ilość: ");
        amount = scanner.nextInt();

    }
    private static void setName()
    {
        System.out.println("podaj imię: ");
        name= scanner.nextLine();

    }
    private static void setSurname()
    {
        System.out.println("podaj nazwisko: ");
        surname= scanner.nextLine();

    }

    private static void setId() {
        System.out.println("podaj id: ");
        id = scanner.nextInt();

    }

    public static void menu() {
        System.out.println("Wybierz co zrobić:");
        System.out.println("1 - dodaj autora:");
        System.out.println("2 - dodaj książkę:");
        System.out.println("3 - wyświetl książki:");
        System.out.println("4 - wyświetl autorów:");
        System.out.println("5 - znajdź książkę po tytule:");
        System.out.println("6 - znajdź autora po nazwisku:");
        System.out.println("7 - aktualizuj książkę");
        System.out.println("8 - aktualizuj autora");
    }
}
