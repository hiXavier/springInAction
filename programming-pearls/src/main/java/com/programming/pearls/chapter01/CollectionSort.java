package com.programming.pearls.chapter01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @authore Xavier
 * @description
 * @date 2018/1/21
 */
public class CollectionSort {

    public void sort(Collection collection){
        Collections.sort((List<Comparable>) collection);
    }

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<Integer>();
        numList.add(32);
        numList.add(2);
        numList.add(13);
        new CollectionSort().sort(numList);
        for (Integer num:numList
             ) {
            System.out.println(num);
        }
    }
}
