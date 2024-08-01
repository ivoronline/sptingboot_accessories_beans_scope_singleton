package com.ivoronline.sptingboot_accessories_beans_scope_singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  //PROPERTIES
  @Autowired Person person1; //Tha same Singleton Instance/Bean
  @Autowired Person person2; //Tha same Singleton Instance/Bean
  
  //=========================================================================================================
  // SET PERSON NAME
  //=========================================================================================================
  @RequestMapping("setPersonName")
  void setPerson() {
    person1.name = "John";   //Setting the same Bean
    person2.name = "Bill";   //Setting the same Bean
  }
  
  //=========================================================================================================
  // GET PERSON NAME
  //=========================================================================================================
  @RequestMapping("getPersonName")
  String getPerson() {
    return person1.name + " - " + person2.name;
  }

}
