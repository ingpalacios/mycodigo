
package com.implementacion.service;

import com.implementacion.entity.Transacciones;
import com.implementacion.repo.TransaccionesRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentasService{
    
    @Autowired
    private TransaccionesRepo transaccionesrepo;
    
    public Transacciones insertar(Transacciones cuenta){
        return transaccionesrepo.save(cuenta);
    }
    
    public Transacciones actualizar(Transacciones cuenta){
        return transaccionesrepo.save(cuenta);
    }
    
    public List<Transacciones> listar(){
        return transaccionesrepo.findAll();
    }
    
    public void eliminar(Transacciones cuenta){
        transaccionesrepo.delete(cuenta);
    }
    
}
