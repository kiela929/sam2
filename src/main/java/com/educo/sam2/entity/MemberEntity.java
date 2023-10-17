package com.educo.sam2.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter // getter 메소드 생성
@Builder // 빌더를 사용할 수 있게 함
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="test_sam") // 테이블 명을 작성


public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 10)
    private String name;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 20)
    private String password;


    public MemberEntity(String name, String email, String password) {

        this.name = name;
        this.email = email;
        this.password = password;
    }
}
