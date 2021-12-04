package pizzeria.pjatk7.database;

import org.springframework.data.jpa.repository.JpaRepository;
import pizzeria.pjatk7.model.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
}
