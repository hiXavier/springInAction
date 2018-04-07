package com.programming.pearls.chapter01;

/**
 * @authore Xavier
 * @description 位逻辑运算实现位向量
 * @date 2018/1/22
 */

public class BitVector {
    private int bitPerWord = 32;
    private int shift = 5;
    private int mask = 0X1F;
    private int count = 10000000;
    private Integer[] array = new Integer[1 + count/bitPerWord];

    BitVector(){
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    void set(int i){
         i = i >> shift;
         int j = 1 << (i & mask);
         array[i] |= j;

//        getArray()[i >> shift] |= (1 << (i & mask));
    }

    public static void main(String[] args) {
        BitVector bitVector = new BitVector();
        for (int i = 0; i < 50; i++) {
            bitVector.set(i);
            System.out.println("i=" + i + ",array=" + (bitVector.getArray())[i]);
        }
    }

    public int getBitPerWord() {
        return bitPerWord;
    }

    public void setBitPerWord(int bitPerWord) {
        this.bitPerWord = bitPerWord;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getMask() {
        return mask;
    }

    public void setMask(int mask) {
        this.mask = mask;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Integer[] getArray() {
        return array;
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }
}
