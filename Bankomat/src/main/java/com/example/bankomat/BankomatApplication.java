package com.example.bankomat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class BankomatApplication {

    public static void main(String[] args) {


        Controller controller = new Controller();
        Controller.start();


    }
}