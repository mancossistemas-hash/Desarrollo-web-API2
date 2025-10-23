package com.prototipo.prototipo1.Auth;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByNombreRolIgnoreCase(String nombre);
}
