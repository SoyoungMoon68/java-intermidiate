package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있음

        ImmutableAddress a = new ImmutableAddress("seoul");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법이 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = new ImmutableAddress("busan");//b의 값을 부산으로 변경해야함
        System.out.println("busan -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
