import lombok.Getter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.text.html.parser.Entity;
@Getter
public class ConnectionManager {
    private EntityManagerFactory entityManagerFactory=
            javax.persistence.Persistence.createEntityManagerFactory("library-db");
    private EntityManager entityManager=entityManagerFactory.createEntityManager();
}
