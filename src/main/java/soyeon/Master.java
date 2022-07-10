package soyeon;

public class Master extends Beginner {

    public Master() {
       name = "숙련자";
       speed = 60;
    }
    @Override
    public void info(){
        System.out.println(name +"의 속도는 : "+ speed +"km 입니다.");

    }
}
