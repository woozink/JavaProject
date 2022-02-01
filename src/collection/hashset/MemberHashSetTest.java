package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이지원");
        Member memberKim = new Member(1002, "김우진");
        Member memberPark = new Member(1003, "박상윤");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberPark);
        memberHashSet.showAllmember();

        Member memberHong = new Member(1003, "홍길당");
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllmember();
    }
}
