package robinpractice.springboot_helloworld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import robinpractice.springboot_helloworld.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHelloworldApplicationTests {
    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext ioc;

    @Test
    public void contextLoads() {
        System.out.println(person.toString());
    }

    @Test
    public void testBean() {
        System.out.println(ioc.containsBean("helloService"));
    }

}
