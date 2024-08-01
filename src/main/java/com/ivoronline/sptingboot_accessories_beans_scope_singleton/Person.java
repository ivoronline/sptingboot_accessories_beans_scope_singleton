package com.ivoronline.sptingboot_accessories_beans_scope_singleton;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Person {

  //PROPERTIES
  public String name;
  
  //CONSTRUCTOR
  Person() {
    System.out.println("Person Created");
  }
  
  //DESTROY
  @PreDestroy
  public void destroy() {
    System.out.println("Person Destroyed");
  }

}
