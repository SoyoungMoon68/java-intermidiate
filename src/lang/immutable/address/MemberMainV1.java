package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("seoul");

        MemberV1 memberA = new MemberV1("memberA", address);
        MemberV1 memberB = new MemberV1("memberB", address);

        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);

        //회원B의 주소를 부산으로 변경해야함
        memberB.getAddress().setValue("busan");
        System.out.println("busan -> memberB.address");
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);
    }
}
