package com.test.jpashop.service;

import com.test.jpashop.domain.Order;
import com.test.jpashop.domain.SimpleOrderQueryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final EntityManager em;

    public List<Order> findAllWithMemberDelivery() {
        return em.createQuery(
                "select o from Order o" +
                        "join fetch o.member m" +
                        "join fetch o.delivery d", Order.class)
                .getResultList();
    }

    public List<SimpleOrderQueryDto> findOrderDtos() {
        return em.createQuery(
                "select o from Order o" +
                        "join fetch o.member m" +
                        "join fetch o.delivery d", SimpleOrderQueryDto.class)
                .getResultList();
    }
}
