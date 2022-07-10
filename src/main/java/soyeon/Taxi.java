package soyeon;

public class Taxi implements HiPass{

    public void taxi(){
        run();
        Fee.feement();
        HiPass.himnet();
        Calculate();
    }

    @Override
    public void run() {
        System.out.println("택시");
    }

    @Override
    public void Calculate(){
        System.out.println("차량종류 : 중형.  요금 2000원이 청구됩니다.");

    }
}
