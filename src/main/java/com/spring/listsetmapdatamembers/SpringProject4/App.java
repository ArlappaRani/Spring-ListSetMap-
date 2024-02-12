package com.spring.listsetmapdatamembers.SpringProject4;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext  ctx =new ClassPathXmlApplicationContext("Config.xml");
    	Employeedm e1=(Employeedm)ctx.getBean("emp");
    	System.out.println(e1);
    }
}
