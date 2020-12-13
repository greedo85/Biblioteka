import javax.persistence.Query;

public class AuthorManager extends ConnectionManager implements RepositoryInterface<Author> {
    @Override
    public void add( Author author ) {
        getEntityManager().getTransaction().begin();
        getEntityManager().persist(author);
        getEntityManager().getTransaction().commit();
        getEntityManager().close();
    }

    @Override
    public Author getById( int id ) {
        return getEntityManager().find(Author.class, id);
    }

    @Override
    public Author getByString( String text ) {
        Query query = getEntityManager().createQuery("FROM Author where surname=:surname", Author.class).setParameter("surname", text);
        Author resultAuthor = (Author) query.getSingleResult();
        return resultAuthor;
    }

    @Override
    public void remove( int id ) {
        getEntityManager().getTransaction().begin();
        getEntityManager().remove(getById(id));
        getEntityManager().getTransaction().commit();
        getEntityManager().close();
    }
}
