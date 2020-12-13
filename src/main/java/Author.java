import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

@NoArgsConstructor
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column
    private String name;

    @Column
    private String surname;
    @ManyToMany
    @JoinTable(name = "libraryJoin", joinColumns = {@JoinColumn(name = "author_id")}, inverseJoinColumns = {@JoinColumn(name = "book_id")})

    List<Book> bookList = new ArrayList<>();

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
