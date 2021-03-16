package test.com.communitystreet.dao;

import com.DemoApplication;
import com.communitystreet.dao.UserDao;
import com.communitystreet.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@AutoConfigureMybatis
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TestUser {
    @Autowired
    UserDao dao;


    @Test
    @Rollback(false)
    public void testUserDao() {
        User user = dao.getUserById(123456);
        System.out.println(user.toString());
    }

    @Test
    @Rollback(false)
    public void testAddOne() {
        User user = mock(User.class);
//        should use PowerMock

    }
}

@SpringBootApplication
@MapperScan(basePackageClasses = UserDao.class)
class MybatisTestApplication {
    public static void main(String[] args) {
        SpringApplication.run( MybatisTestApplication.class, args );
    }
}