package guru.springframework.spring5webapp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class Book {

    //this is a book model

    //This is a second comment

    @Id
    private Long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
