package collection.treeSet;

public class Member implements Comparable<Member> {


    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }


    @Override
    public int compareTo(Member member) {
        return (this.memberId - member.memberId);
    }
}
