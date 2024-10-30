package com.example.tfiadm.repository;

import com.example.tfiadm.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    Optional<Empleado> findByCUIL(Long CUIL);
}
