package robinpractice.springboot_helloworld.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

    private Person person;
    
    public HelloService(Person person) {
        this.person = person;
        System.out.println("HelloService构造器：" + person.toString());
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
