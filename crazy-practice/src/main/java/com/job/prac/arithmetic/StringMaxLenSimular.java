package com.job.prac.arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/3/13
 */
public class StringMaxLenSimular {

    static String getSimilarStr(String sourceStr, String targetStr){
        StringBuffer resStr = new StringBuffer();
        StringBuffer tmpStr = new StringBuffer();
        for(int i = 0; i < sourceStr.length();){
            for(int j = 0; j < targetStr.length(); ){
                if(sourceStr.charAt(i) == targetStr.charAt(j)){
                    tmpStr.append(sourceStr.charAt(i));
                    j++;
                    i++;
                }else {
                    resStr = resStr.length() > tmpStr.length() ? resStr : tmpStr;
                    j = 0;
                    i++;
                }
            }
            System.out.println("target循环一交");
        }
        return resStr.toString();
    }

    public static void main(String[] args) {
        String sourceStr = "avdggdgbbcde";
        String targetStr = "abcdefg";
//        InputStreamReader ir = new InputStreamReader(System.in);
//        BufferedReader in = new BufferedReader(ir);
//        String s;
//        try {
//            s = in.readLine();
//            System.out.println(getSimilarStr(sourceStr,s));
//            in.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(getSimilarStr(sourceStr,targetStr));
    }
}
