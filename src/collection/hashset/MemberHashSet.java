package collection.hashset;

import collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet; // 해쉬셋 선언

    public MemberHashSet() {
        hashSet = new HashSet<Member>(); // 해시 셋 생성
    }

    public void addMember(Member member){ // 해시셋 회원 추가
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> ir = hashSet.iterator(); // 이터레이터로 순회 함

        while(ir.hasNext()){
            Member member = ir.next(); //회원을 하나씩 가져와서
            int tempId = member.getMemberId(); // 아이디 비교
            if(tempId == memberId){ // 같은 아이디인 경우
                hashSet.remove(member); // 아이디 삭제
                return true;
            }
        }
        System.out.println(memberId + " 가 존재 하지 않습니다.");
        return false;
    }
    public void showAllmember(){ // 모든 회원 출력
        for(Member member : hashSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
