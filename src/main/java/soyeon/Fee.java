package soyeon;

public interface Fee {
    void run();
    static void feement(){
        System.out.println("요금을 납부하세요");
    }

    default void Calculate(){
        System.out.println("차량 종류에 따라 가격이 다름");
    }

}
