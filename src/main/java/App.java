import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWorldOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloWorldTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        boolean compare = beanHelloWorldOne==beanHelloWorldTwo;
        System.out.println(compare);
        Cat beanCatOne =
                (Cat) applicationContext.getBean("cat");
        Cat beanCatTwo =
                (Cat) applicationContext.getBean("cat");
        boolean compare2 = beanCatOne==beanCatTwo;
        System.out.println(compare2);
    }
}