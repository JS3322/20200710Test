package soyeon;

public class BusA implements Fee{

        public void bus(){
            run();
            Fee.feement();
            Calculate();
        }

    @Override
    public void run() {
        System.out.println("버스");
    }

    @Override
        public void Calculate(){
            System.out.println("차량 종류 : 대형차량입니다. 요금 3000원 납부하세요");

        }


}