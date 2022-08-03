package ru.learnUp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        Calculator calculator = context.getBean(Calculator.class);
        long result1 = calculator.divide(4, 2);
        long result2 = calculator.sum(4, 2);
        long result3 = calculator.subtract(4, 2);
        long result4 = calculator.multiply(4, 2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
