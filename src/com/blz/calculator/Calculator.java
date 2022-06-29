package com.blz.calculator;
import com.blz.calculator.service.OpenService;
import com.blz.calculator.service.serviceimpl.OperationServiceProvider;
import com.blz.calculator.utils.Input;

public class Calculator {
    public static void main(String[] args){
        performOperation();

    }
    private static void performOperation(){
        int choice=0;
        OpenService openService = new OperationServiceProvider();
        do{
            choice = menu();
            switch (choice){
                case 1:
                    System.out.println("Addition="+openService.add());
                    break;
                case 2:
                    System.out.println("Addition="+openService.sub());
                    break;
                case 3:
                    System.out.println("Addition="+openService.mul());
                    break;
                case 4:
                    System.out.println("Addition="+openService.div());
                    break;
                case 5:
                    System.out.println("Addition="+openService.div());
                    break;
                default:
                    System.out.println("Enter valid input");
            }
        }
        while (choice !=5);
    }
    public static int menu(){
        System.out.println("Enter Operation you want to perform");
        System.out.println("1.Addition \t 2.Substraction \t 3.Multiplication \t 4.Addition \t 5.Exit");
        return Input.getIntValue();
    }
}
