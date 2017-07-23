package com.example.leidong.databindingtest;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by leidong on 2017/7/23
 */

public class StudentBean extends BaseObservable{
    @Bindable
    private String name;

    @Bindable
    private String age;

    @Bindable
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
        notifyPropertyChanged(BR.score);
    }
}
