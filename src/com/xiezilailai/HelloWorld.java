package com.xiezilailai;

/**
 * Created by 蝎子莱莱123 on 2016/2/15.
 */
public class HelloWorld {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println("Your message :"+message);
    }
}
