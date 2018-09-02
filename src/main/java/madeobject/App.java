package madeobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zdj.create.HelloWorld;
import com.zdj.create.InstanceFactory;
import com.zdj.create.StaticFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  //第一种通过构造器构建
		   ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		   //根据id把spring容器中的bean提取出来了
		   HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		   /*这里我不写下面这第二种，我仅仅写第一种也会输出我的第二种通过静态工厂创建的对象，因为是静态的，所以，在实例配置文件时候，会将其加载出来*/
		   //第二种通过静态工厂方式创建bean对象
		   ApplicationContext staticFactorycontext = new ClassPathXmlApplicationContext("Application.xml");
		   //根据id把spring容器中的bean提取出来了
		   StaticFactory staticFactory = (StaticFactory)context.getBean("StaticFactoryMethod");
		   staticFactory.getStaticInstance();
		   
		   //第三种:通过实例工厂方法
		   ApplicationContext InstanceFactory=new ClassPathXmlApplicationContext("Application.xml"); 
		   InstanceFactory  getInstance=(InstanceFactory)InstanceFactory.getBean("getInstanceFactory");
		   getInstance.getInstance();
    }
    
    
    
    
    
}
