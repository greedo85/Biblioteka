
import javax.persistence.Query;
import java.util.List;
import java.util.Queue;

public class BookManager extends ConnectionManager implements RepositoryInterface<Book> {
    @Override
    public void add( Book book ) {
        getEntityManager().getTransaction().begin();
        getEntityManager().persist(book);
        getEntityManager().getTransaction().commit();
        getEntityManager().close();
    }

    @Override
    public Book getById( int id ) {
        return getEntityManager().find(Book.class, id);
    }

    @Override
    public Book getByString( String text ) {
        Query query = getEntityManager().createQuery("FROM Book where title=:title", Book.class).setParameter("title", text);
        Book resultBook = (Book) query.getSingleResult();
        return resultBook;
    }

    @Override
    public void remove( int id ) {
        getEntityManager().getTransaction().begin();
        getEntityManager().remove(getById(id));
        getEntityManager().getTransaction().commit();
        getEntityManager().close();
    }

    @Override
    public List getAll() {
        Query query= getEntityManager().createQuery("FROM Book",Book.class);
        List<Book>resultBooks= query.getResultList();
        return resultBooks;
    }

    @Override
    public void update( Book book ) {
        getEntityManager().getTransaction().begin();
        getEntityManager().merge(book);
        getEntityManager().getTransaction().commit();
        getEntityManager().close();
    }
}
