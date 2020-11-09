package com.test.jpashop.repository;

import com.test.jpashop.domain.Order;
import com.test.jpashop.domain.OrderSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {


    List<Order> findAllByString (OrderSearch orderSearch);


}
