package cn.cncoders.springbootconfig;

import cn.cncoders.springbootconfig.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConfigApplicationTests {
    @Autowired
    Person person;

    @Test
    public void contextLoads() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>"+person);
    }

}
