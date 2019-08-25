import dao.BookDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext-jdbc.xml")
public class TestJDBC {
    @Autowired
    BookDao dao;

    @org.junit.Test
    public void testJDBC(){
        System.out.println(dao.queryAll());
    }

}
