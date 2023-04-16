package com.example.demo.repository;

        import com.example.demo.model.Persona;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.CrudRepository;

        import java.util.List;

public interface PersonaRepository extends CrudRepository<Persona,Long> {

        @Query(value = "SELECT count(p) FROM Persona p WHERE p.numeroDocumento = ?1")
        Long consultarNumeroDocumento(String numeroDocumento);
}
