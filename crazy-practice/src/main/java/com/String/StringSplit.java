package com.String;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/4/10
 */
public class StringSplit {
    public static void main(String[] args) {
        String str = "a,,c,,";
        String[] ary = str.split(","); // 预期大于3，结果是3
        System.out.println(ary.length);
    }
}
