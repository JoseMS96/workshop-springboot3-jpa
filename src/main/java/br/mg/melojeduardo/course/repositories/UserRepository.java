package br.mg.melojeduardo.course.repositories;

import br.mg.melojeduardo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
