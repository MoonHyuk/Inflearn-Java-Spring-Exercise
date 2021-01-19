package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    private Address address;

    // 주의) 기본값인 EnumType.ORDINAL을 쓰면 숫자 (1, 2, 3, .. )로 저장된다.
    // 그럼 중간에 이넘이 추가되면 데이터가 틀어지기 때문에 절대 사용하면 안된다.
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
