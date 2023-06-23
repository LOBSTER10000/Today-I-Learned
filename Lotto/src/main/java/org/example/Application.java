package org.example;


public class Application {

    private int money;

    public Application(){
        super();
    }

    public Application(int money){
        super();
        this.money = money;

    }

    public String exceptions(int money2){
        if(money2%1000!=0){
            throw new RuntimeException("올바른 금액이 아닙니다");
        }
        return exceptions(money2);
    }

    public static void main(String[] args){




    }
}
