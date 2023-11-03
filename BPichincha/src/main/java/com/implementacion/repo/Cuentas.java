
package com.implementacion.repo;

import com.implementacion.entity.Transacciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cuentas extends JpaRepository<Transacciones, Integer>{
    
}
