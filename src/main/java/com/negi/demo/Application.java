package com.negi.demo;

import com.negi.demo.entities.Employee;
import com.negi.demo.services.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * Created by knegi on 10/7/17.
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
        EmployeeService employeeService = ctx.getBean(EmployeeService.class);
        List<Map<String, Object>> employees = employeeService.getAll();
        for (Map<String, Object> map: employees) {
            map.forEach((k,v)->System.out.println("Key: " + k + " Value: " + v));
        }
    }
}
