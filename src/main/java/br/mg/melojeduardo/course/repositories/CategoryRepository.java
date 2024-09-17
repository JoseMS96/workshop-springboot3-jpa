package br.mg.melojeduardo.course.repositories;

import br.mg.melojeduardo.course.entities.Category;
import br.mg.melojeduardo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
