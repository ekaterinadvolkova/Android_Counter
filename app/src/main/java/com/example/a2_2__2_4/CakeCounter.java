package com.example.a2_2__2_4;

public class CakeCounter {

    private int srartCount;

    public CakeCounter(){
        this.srartCount=0;
    }


    public void plus(){
        int max = 100;
        if(srartCount<= max){
            srartCount++;
        }
    }
    public void minus(){
        int min = -100;
        if(srartCount>= min){
            srartCount--;
        }
    }
    public void reset(){
        srartCount=0;
    }
    public int getStarter(){
        return srartCount;
    }

}
