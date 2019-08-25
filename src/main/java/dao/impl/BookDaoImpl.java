package dao.impl;

import dao.BookDao;
import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository("bookdao")
public class BookDaoImpl extends JdbcDaoSupport implements BookDao {
    @Autowired
    public void setDataSource0(DataSource dataSource){
        super.setDataSource(dataSource);
    }
    public List<Book> queryAll() {
        return getJdbcTemplate()
                .query("select * from book",new BeanPropertyRowMapper(Book.class));
    }


}
