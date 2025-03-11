package org.example.w2_1_use_state_pattern;

public class DeliveredState implements OrderState{

    @Override
    public void doAction() {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
