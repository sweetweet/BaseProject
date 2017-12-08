package com.github.sweetweet;

public class Triangle {
    private int a=2;
    private int b=3;
    private int c=1;
    public Triangle(int a,int b,int c){
        this.a=a;
        this.c=c;
        this.b=b;
    }
    public String triangle(){
        if(a+b>c&&a+c>b&&b+c>a){
            return "1";
        } else {
            return "0";
          }
    }


}
