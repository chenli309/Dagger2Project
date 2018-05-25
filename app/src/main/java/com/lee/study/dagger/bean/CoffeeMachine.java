package com.lee.study.dagger.bean;

public class CoffeeMachine {

    private CoffeeMaker maker;

    public CoffeeMachine(CoffeeMaker maker) {
        this.maker = maker;
    }

    public String makeCoffee() {
        return maker.makeCoffee();
    }
}
