package kaznu.srs.Srs2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    @Autowired
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public  BookRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    public void createTable(){
        String query="CREATE TABLE books (name text,author text,genre text); ";
        jdbcTemplate.update(query);
    }

    public void insertBook(Book book){
        String query = "INSERT into books(name,author,genre) Values(?,?,?)";
        jdbcTemplate.update(query,book.getName(),book.getAuthor(),book.getGenre());

    }
    public List<Book> showAll(){
        String query ="SELECT * FROM books";
        return jdbcTemplate.queryForObject(query,new Object[]{}, new BookRowMapper());
    }

}
