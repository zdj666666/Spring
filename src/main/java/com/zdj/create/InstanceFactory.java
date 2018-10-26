package com.zdj.create;

/*通过实例工厂方法创建bean*/
public class InstanceFactory {
 public InstanceFactory getInstance(){
		 

         return new InstanceFactory();

      }
}
