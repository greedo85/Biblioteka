import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Entity
@NoArgsConstructor
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column
    public String title;

    @Column
    private int amount;

   /* @Column(name="author_id")
    private int authorId;*/

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    Author author;

    public Book( String title, int amount, Author author ) {
        this.title = title;
        this.amount = amount;
        this.author = author;
    }

    public Book( int id, String title, int amount, Author author ) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", amount=" + amount +
                ", authorList=" + author +
                '}';
    }

}
