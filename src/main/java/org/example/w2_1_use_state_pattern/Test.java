package org.example.w2_1_use_state_pattern;

public class Test {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();
        OrderState newlyCreated = new NewlyCreatedState();
        OrderState deliveredOrder = new DeliveredState();
        OrderState cancel = new CancelState();
        OrderState processing = new ProcessingState();

        orderContext.setOrderState(newlyCreated);
        orderContext.doAction();

        orderContext.setOrderState(processing);
        orderContext.doAction();

        orderContext.setOrderState(deliveredOrder);
        orderContext.doAction();

        orderContext.setOrderState(cancel);
        orderContext.doAction();

    }
}
