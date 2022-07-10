package soyeon;

public class Pro extends Master {

    public Pro() {
        name = "전문가";
        speed =100;
    }
    @Override
    public void info(){
        System.out.println( name +"의 속도는 : "+ speed +"km 입니다.");


    }

    public void AAA(){
        System.out.println("sss");
    }
}
