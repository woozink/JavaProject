package collection;

import java.util.Comparator;

public class Member {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId =memberId;
        this.memberName = memberName;
    }
    @Override
    public int hashCode(){
        return memberId; //hashCode() 메서드가 회원 아이디를 반환하도록 재정의
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member =(Member)obj;
            if(this.memberId == member.memberId){ // 매개변수로 받은 회원 아이디가 자신의 회원 아이디와 같다면
                return true;                    // true 를 반환
            }
            else return false;
        }
        return  false;
    }

    public int getMemberId(){
        return memberId;
    }

    public void setMemberId(int memberId){
        this.memberId = memberId;
    }
    public String getMemberName(){
        return memberName;
    }
    public void setMemberName(String memberName){
        this.memberName = memberName;
    }

    @Override
    public String toString(){
        return memberName + "회원님의 아이디는 " + memberId + " 입니다.";
    }
}