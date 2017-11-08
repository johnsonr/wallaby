/*
 * Copyright BigCorp. All rights reserved.
 * See the BigCorp license agreement in the root directory of this project.
 */

package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This is a Spring MVC controller
@RestController
class DemoController {

    /**
     * Access via http://localhost:8081/person/name
     */
    @RequestMapping("person/{name}")
    public Person person(@PathVariable String name) {
        return new Person(name);
    }

    // Junior developers: Add your endpoints here

}


/**
 * JSON bound object
 */
class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }
}
