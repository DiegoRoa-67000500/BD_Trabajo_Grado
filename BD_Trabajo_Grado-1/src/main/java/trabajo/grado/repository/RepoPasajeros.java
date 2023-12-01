package trabajo.grado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trabajo.grado.model.ModeloPasajeros;

@Repository
public interface RepoPasajeros extends JpaRepository<ModeloPasajeros, Long>{

}
