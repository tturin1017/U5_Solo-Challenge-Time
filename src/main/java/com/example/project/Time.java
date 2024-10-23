package com.example.project;

public class Time{
    private int h;
    private int m;
    private int s;

    public Time(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getHour(){
        return h;
    }
    public int getMin(){
        return m;
    }
    public int getSec(){
        return s;
    }

    public String info(){
        String h, m,s;
        if(this.h<10){
            h = "0"+Integer.toString(this.h);
        }else{
            h = Integer.toString(this.h);
        }
        if(this.m<10){
            m = "0"+Integer.toString(this.m);
        }else{
            m = Integer.toString(this.m);
        }
        if(this.s<10){
            s="0"+Integer.toString(this.s);
        }else{
            s = Integer.toString(this.s);
        }

        return h+":"+m+":"+s;
    }

    public void tick(){
        if(s==59){
            s=0;
            if(m==59){
                m=0;
                if(h==23){
                    h=0;
                }else{
                    h++;
                }
            }else{
                m++;
            }
        }else{
            s++;
        }
    }

    public void add(Time time2){
        this.s+=time2.s;
        this.m+=time2.m;
        this.h+=time2.h;
        if(s>59){
            s-=60;
            this.m++;
            if(m>59){
                m-=60;
                this.h++;
                if(h>23){
                    this.h-=24;
                }
            }
        }
    }


}