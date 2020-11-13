package kaznu.srs.Srs2;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookRowMapper implements RowMapper<List<Book>> {
    @Override
    public List<Book> mapRow(ResultSet rs,int rowNumber) throws SQLException{
        List<Book> books=new ArrayList<>();
        books.add(extractInfo(rs));
        while(rs.next()){
            books.add(extractInfo(rs));
        }
        return books;
    }
    private Book extractInfo(ResultSet rs) throws SQLException{
        Book book=new Book();
        book.setName(rs.getString("name"));;
        book.setAuthor(rs.getString("author"));
        book.setGenre(rs.getString("genre"));
        return book;


    }

}
