import java.util.List;

public class LibraryManager extends ConnectionManager implements RepositoryInterface<Library> {
    @Override
    public void add( Library library ) {

    }

    @Override
    public Library getById( int id ) {
        return getEntityManager().find(Library.class, id);
    }

    @Override
    public Library getByString( String text ) {
        return null;
    }

    @Override
    public void remove( int id ) {

    }
}
