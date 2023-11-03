
package com.implementacion.service;

import com.implementacion.entity.Transacciones;
import com.implementacion.repo.TransaccionesRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService{
    
    @Autowired
    private TransaccionesRepo transaccionesrepo;
    
    public Transacciones insertar(Transacciones cli){
        return transaccionesrepo.save(cli);
    }
    
    public Transacciones actualizar(Transacciones cli){
        return transaccionesrepo.save(cli);
    }
    
    public List<Transacciones> listar(){
        return transaccionesrepo.findAll();
    }
    
    public void eliminar(Transacciones cli){
        transaccionesrepo.delete(cli);
    }
    
}
