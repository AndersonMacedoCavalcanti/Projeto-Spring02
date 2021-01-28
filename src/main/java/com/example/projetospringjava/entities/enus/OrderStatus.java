package com.example.projetospringjava.entities.enus;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    OrderStatus(int code) {
        this.code=code;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOF(int code){
        for(OrderStatus orderStatus: OrderStatus.values()){
            if(orderStatus.getCode() == code){
                return  orderStatus;
            }
        }
    throw new IllegalArgumentException("Codig OrderStatus code");
    }
}
