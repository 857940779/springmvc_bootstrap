package com.luohw.springmvc.util;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.Field;

public class HashUtil {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            HashUtil util=new HashUtil();
            //util.test();
            Person person=util.new Person(i);
            //util.getHashCode(person);
            util.getJson(person);
            System.out.println("===============");
        }

    }

    public void test(){
        //获取参数的hashcode
        Object[] objects=new Object[3];
        objects[0]=100L;
        objects[1]="zhangsan";
        objects[2]=new Person(1);


        int hashcode=0;
        int hashcode2=0;
        for(Object o:objects){
            System.out.println(o.hashCode());
            hashcode+=o.hashCode()*31;
        }
        System.out.println(hashcode);

        for(Object o:objects){
            hashcode2+=o.hashCode();
        }
        System.out.println(hashcode2);
    }

    class Person{
        private String name;
        private int age;

        public Person(int i){
            if(i%2==0){
                name="李四";
                age=10;
            }else{
                name="张三";
                age=5;
            }

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public int getHashCode(Object o){
        Class classz=o.getClass();
        Field[] fields=classz.getDeclaredFields();
        for(Field field:fields){
            String name=field.getName();
            try {
                field.setAccessible(true);
                Object obj=field.get(o);
                System.out.println(obj+"-"+obj.hashCode());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return 0;
    }

    //如果参数为空，那么hash一样
    public void getJson(Object object){
        String str= JSON.toJSONString(object);
        System.out.println(str);
        System.out.println(str.hashCode());
    }

}
