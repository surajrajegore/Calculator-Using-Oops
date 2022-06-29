package com.blz.calculator.service.serviceimpl;
import com.blz.calculator.inputs.UserInput;
import com.blz.calculator.service.OpenService;
import com.blz.calculator.utils.Input;

public class OperationServiceProvider implements OpenService {

    @Override
    public int add() {
    UserInput in = getUserinput();
    return in.getOne() + in.getTwo();
    }

    @Override
    public int sub() {
        UserInput in = getUserinput();
        return in.getOne() - in.getTwo();
    }

    @Override
    public int mul() {
        UserInput in = getUserinput();
        return in.getOne() * in.getTwo();
    }

    @Override
    public int div() {
        UserInput in = getUserinput();
        return in.getOne() / in.getTwo();
    }

    private static UserInput getUserinput(){
        UserInput in = new UserInput();
        System.out.println("Enter first number");
        in.setOne(Input.getIntValue());
        System.out.println("Enter first number");
        in.setTwo(Input.getIntValue());
        return in;
    }
}
