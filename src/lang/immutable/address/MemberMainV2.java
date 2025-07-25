package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("seoul");

        MemberV2 memberA = new MemberV2("memberA", address);
        MemberV2 memberB = new MemberV2("memberB", address);

        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);

        //회원B의 주소를 부산으로 변경해야함
        //memberB.getAddress().setValue("busan"); //컴파일 오류
        memberB.setAddress(new ImmutableAddress("busan"));
        System.out.println("busan -> memberB.address");
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);
    }
}
