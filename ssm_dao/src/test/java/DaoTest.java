import com.itheima.dao.ItemsDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    public static void main(String[] args){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = (ItemsDao) applicationContext.getBean("itemsDao");
        System.out.println("商品列表"+itemsDao.findAll());
    }
}
