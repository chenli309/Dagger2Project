package com.lee.study.dagger.bean;

public class SimpleCoffeeMaker implements CoffeeMaker {

    Cooker cooker;  //现在需要咖啡师来制作咖啡了

    public SimpleCoffeeMaker(Cooker cooker) {
        this.cooker = cooker;
    }

    @Override
    public String makeCoffee() {
        return cooker.make();
    }
}
