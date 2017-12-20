package com.chapter18.prac;

import java.lang.reflect.Field;

/**
 * @authore wuyanfeng
 * @description
 * @date 2017/12/14
 */
public class FieldReflect {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person();
        Class<Person> personClass = Person.class;
        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p,"Xavier5");
        Field ageFiled = personClass.getDeclaredField("age");
        ageFiled.setAccessible(true);
        ageFiled.set(p,21);

        System.out.println(p);
    }
}
