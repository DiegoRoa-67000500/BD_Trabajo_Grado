package trabajo.grado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trabajo.grado.model.ModeloDestinos;

@Repository
public interface RepoDestinos extends JpaRepository<ModeloDestinos, Long>{

}
