package com.zdj.create;

/*通过实例工厂方法创建bean*/
public class InstanceFactory {
 public InstanceFactory getInstance(){
		 
		 System.out.println("这里使用的是实例工厂方法");	
         return new InstanceFactory();

      }
}
