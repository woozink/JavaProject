package collection.treeSet;

import collection.Member;

public class MemberSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberPark = new Member(1003, "박서원");
        Member memberKim = new Member(1004, "김우진");
        Member memberLee = new Member(1005, "이경원");

        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.showAllMember();


        Member memberHong = new Member(1003, "홍길동");
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();
    }
}
