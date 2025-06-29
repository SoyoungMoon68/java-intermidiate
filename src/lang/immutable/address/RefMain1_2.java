package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있음

        Address a = new Address("seoul");   //x001
        Address b = new Address("seoul"); //x002
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("busan");//b의 값을 부산으로 변경해야함
        System.out.println("busan -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
