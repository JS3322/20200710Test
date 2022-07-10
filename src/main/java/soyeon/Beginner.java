package soyeon;

public class Beginner extends Driver{
   public Beginner() {
       name = "초보자";
       speed = 30;
   }

    void info(){
        System.out.println(this.name +"의 속도는 : "+ this.speed +"km 입니다.");
    }



}
