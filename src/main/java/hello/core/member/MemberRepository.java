package hello.core;

import hello.core.member.Member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberID);
}
