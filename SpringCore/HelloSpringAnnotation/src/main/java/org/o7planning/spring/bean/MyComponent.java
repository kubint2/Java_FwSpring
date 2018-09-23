package org.o7planning.spring.bean;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component
public class MyComponent {
    
    @Autowired
    private MyRepository repository;
 
    public void showAppInfo() {
        System.out.println("showAppInfo from @Component: Now is: "+ repository.getSystemDateTime());
        System.out.println("showAppInfo from @Component: App Name: "+ repository.getAppName());
    }
 
}