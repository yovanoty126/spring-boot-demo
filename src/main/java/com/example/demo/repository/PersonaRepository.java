package com.example.demo.repository;

        import com.example.demo.model.Persona;
        import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona,Long> {

}
