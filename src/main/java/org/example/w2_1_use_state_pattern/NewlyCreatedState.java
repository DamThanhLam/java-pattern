package org.example.w2_1_use_state_pattern;

public class NewlyCreatedState implements OrderState{

    @Override
    public void doAction() {
        System.out.println("Kiểm tra thông tin đơn hàng.");
    }
}
