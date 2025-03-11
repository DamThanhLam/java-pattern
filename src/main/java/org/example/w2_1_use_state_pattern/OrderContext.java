package org.example.w2_1_use_state_pattern;

public class OrderContext implements OrderState{
    private OrderState orderState;
    public void setOrderState(OrderState orderState){
        this.orderState = orderState;
    }
    public OrderState getOrderState(){
        return this.orderState;
    }
    @Override
    public void doAction() {
        this.orderState.doAction();
    }
}
