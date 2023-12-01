package trabajo.grado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trabajo.grado.model.ModeloContacto;

@Repository
public interface RepoContacto extends JpaRepository<ModeloContacto, Long>{

}
