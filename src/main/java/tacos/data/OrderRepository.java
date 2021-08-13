package tacos.data;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import tacos.Order;
import tacos.User;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    // 这里其实少了个 d  参照下边带page参数的来
    //  List<Order> findByUserOrderByPlaceAtDesc(User user);
    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}