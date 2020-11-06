package com.test.jpashop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;


@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    //테이블은 타입이 없으므로 관례상 테이블명 + id를 많이 사용한다
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @NotEmpty
    //빈 값을 입력하지 못하게 한다.
    private String name;

    @Embedded
    private Address address;

    //@JsonIgnore  : Entity에 화면을 뿌리기 위한 로직 -> 안좋음
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
