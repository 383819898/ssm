import com.guoguo.dao.IUserDao;
import com.guoguo.entity.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * PACKAGE_NAME
 * 作者      : 陈晓
 * 描述      :
 * 创建日期  : 2017/12/5
 * 修改日期  :
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath*:spring-mvc.xml","classpath*:spring-mybatis.xml"})
@WebAppConfiguration("src/main/resources")
public class TestMybatis {

  private static Logger logger = Logger.getLogger(TestMybatis.class);

  @Autowired
  private IUserDao dao;

  @Test
  public void testSelectUser() throws Exception {
    Integer id = 1;
    User user = dao.selectByPrimaryKey(id);

      System.out.println(user.getUsername());

      dao.deleteByPrimaryKey(2);
      User login = dao.login(user);

      System.out.println(login.toString());

  }
}
