import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor

@Table(name="library")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="book_id")
    private int bookId;

    @Column(name="author_id")
    private int authorId;

    @ManyToMany
    @JoinTable(name = "libraryJoin", joinColumns = {@JoinColumn(name = "author_id")}, inverseJoinColumns = {@JoinColumn(name = "book_id")})

    List<Book> bookList = new ArrayList<>();


    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", authorId=" + authorId +
                '}';
    }
}
