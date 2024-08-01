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
  void setPerson(@RequestParam String name) {
    person1.name = name;
  }
  
  //=========================================================================================================
  // GET PERSON NAME
  //=========================================================================================================
  @RequestMapping("getPersonName")
  String setPerson() {
    return person2.name;
  }

}
