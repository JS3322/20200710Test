package soyeon;



public class MainCar {
    public static void main(String[] args) {
         BusA bus = new BusA();
         Taxi taxi = new Taxi();


         bus.bus();
         taxi.taxi();

         Driver a = new Master();
        Driver a1 = new Beginner();
        Driver a2 = new Master();
        Driver a3 = new Pro();

         instanceOfMethod(a, a1, a2, a3);

        // System.out.println("고속도로 진입 전");
        // cc((Master) a);
        // instanceOfMethod(a);
        // System.out.println("고속도로 진입 후");
        // aa((Pro) a);
        // instanceOfMethod(a);
        // System.out.println("고속도로 나옴");
        // bb((Beginner) a);
        // instanceOfMethod(a);
        // System.out.println("cc");

        // instanceOfMethod(a);

//        Pro a =(Pro) master ;
//        a.info();



    }

    //instanceof 비교연산자 활용 예 : master로 인스턴스를 만들면 pro와 비교하여 부모클래스로 만들어져 있는지를 확인합니다
    //개체가 특정 클래스 또는 생성된 함수의 인스턴스인지 여부를 나타내는 불린 값을 반환
    //ex) master로 만들면, pro로 비교할 경우 false
    //master로 비교할 경우 true
    //beginner로 비교할 경우 true
    private static void instanceOfMethod(Driver M, Driver a1, Driver a2, Driver a3) {
        //[1]클래스의 이름 비교를 통해 클래스 비교
        System.out.println(M.getClass().getName().equals("soyen.Master"));
        System.out.println(a1.getClass().getName());
        System.out.println(a2.getClass().getName());
        System.out.println(a3.getClass().getName());
        //[2]인스턴스 자체와 비교를 통해 구분
        if(M.getClass().isInstance(a3)) {
            System.out.println("프로 비교");
        }else if(M.getClass().isInstance(a1)) {
            System.out.println("비기너 비교");
        }else if(M.getClass().isInstance(a2)) {
            System.out.println("마스터 비교해도 인스턴스가 다르기 때문에 실패");
        }
        //[3]인스턴스의 핏줄까지 전부 비교
        System.out.println(M.getClass().getName());
        if( M instanceof Pro ){
            System.out.println("1번");
        } else if (M instanceof Master) {
            System.out.println("2번");
        } else if (M instanceof  Beginner) {
            System.out.println("3번");
        }
    }

    public static void aa(Pro A){
            A.info();
        }
        public static void bb(Beginner A){
            A.info();
            System.out.println("cc");
        }
        public static void cc(Master A){
            System.out.println(A.getClass().getName());
            A.info();
        }






        //매개변수의 자동 타입 변환
//                animalSound(new Dog(), new Cat());
//                // animalSound(new Cat());
//                }
//
//
//public static void animalSound(Animal animal, Animal ani) {
//        animal.sound();
//        ani.sound();

}
