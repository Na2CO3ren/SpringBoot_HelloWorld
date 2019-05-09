package robinpractice.springboot_helloworld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import robinpractice.springboot_helloworld.bean.HelloService;
import robinpractice.springboot_helloworld.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHelloworldApplicationTests {

    Logger logger = LoggerFactory.getLogger(SpringbootHelloworldApplicationTests.class);

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext ioc;

    @Autowired
    private HelloService helloService;

    @Test
    public void contextLoads() {
        System.out.println(person.toString());
    }

    @Test
    public void testBean() {
        System.out.println(ioc.containsBean("helloService"));
    }

    @Test
    public void testHelloServie() {
        System.out.println("testHelloServie 拿到了：" + helloService.getPerson().toString());
        //System.out.println("testHelloServie 拿到了：" + helloService);
    }

    @Test
    public void testLogging() {
        logger.trace("trace...");
        logger.debug("debug...");
        logger.info("info...");
        logger.warn("warn...");
        logger.error("error...");
    }

}
