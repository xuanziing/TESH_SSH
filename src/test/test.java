package test;


import bean.Addresslist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.Address;
import service.AddressImpl;

public class test {
    public static void main(String[] args)
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
//        TestService ts = (TestService)ac.getBean("testService");
//        ts.hello();
        Address ail = (AddressImpl) ac.getBean("address");
        Addresslist al = new Addresslist();
        al.setName("kaka");
        al.setPhone("123456789");
        ail.add(al);
    }
}
