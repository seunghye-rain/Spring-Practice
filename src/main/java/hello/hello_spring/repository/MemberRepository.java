package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // null 대신에
    Optional<Member> findByName(String name);
    List<Member> findAll(); // 모든 회원 리스트 다 반환

}
