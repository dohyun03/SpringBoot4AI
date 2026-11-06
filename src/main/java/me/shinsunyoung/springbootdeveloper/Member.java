package me.shinsunyoung.springbootdeveloper;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity // ① 엔티티로 지정
@NoArgsConstructor(access = AccessLevel.PROTECTED) // ② 기본 생성자
public class Member {

    @Id // ③ id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ④ 기본키를 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false) // ⑤ name이라는 not null 컬럼과 매핑
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public void changeName(String name) {
        this.name = name;
    }
}