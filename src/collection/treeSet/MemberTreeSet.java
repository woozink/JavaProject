package collection.treeSet;

import collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet; // treeSet 선언

    public MemberTreeSet(){
        treeSet = new TreeSet<Member>(); //TreeSet 생성

    }
    public void addMember(Member member){ // TreeSet에 회원 추가
        treeSet = new TreeSet<Member>();
    }

    public boolean removeMember(int memberId){
        Iterator<Member> ir = treeSet.iterator();

        while(ir.hasNext()) { //iterator를 이용하여 순회함
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){
                treeSet.remove(member); //tree Set 회원을 삭제하는 메서드
                return true;
            }
        }
        System.out.println(memberId + "가 존재 하지 않습니다.");
        return false;
    }
    public void showAllMember(){ // 전체회원을 출력하는 메서드
        for(Member member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
