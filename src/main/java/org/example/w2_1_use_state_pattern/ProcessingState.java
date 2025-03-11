package org.example.w2_1_use_state_pattern;

public class ProcessingState implements OrderState{

    @Override
    public void doAction() {
        System.out.println("Đóng gói và vận chuyển.");
    }
}
