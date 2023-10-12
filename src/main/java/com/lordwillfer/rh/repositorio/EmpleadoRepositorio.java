package com.lordwillfer.rh.repositorio;

import com.lordwillfer.rh.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {

}
