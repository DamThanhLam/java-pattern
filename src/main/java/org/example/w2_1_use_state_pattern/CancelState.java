package org.example.w2_1_use_state_pattern;

public class CancelState implements OrderState{

    @Override
    public void doAction() {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}
