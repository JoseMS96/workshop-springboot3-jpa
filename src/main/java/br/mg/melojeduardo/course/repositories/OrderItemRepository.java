package br.mg.melojeduardo.course.repositories;

import br.mg.melojeduardo.course.entities.OrderItem;
import br.mg.melojeduardo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
