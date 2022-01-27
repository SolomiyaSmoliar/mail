package mailsender;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter @Setter
public class Client {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String name;
    private int age;
    private Sex sex;
    private String mail;

    public Client(String name, int age, Sex sex, String mail){
        this.id = count.incrementAndGet();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mail = mail;
    }

}