
package com.implementacion.service;

import com.implementacion.entity.Transacciones;
import com.implementacion.repo.TransaccionesRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransaccionesService{
    
    @Autowired
    private TransaccionesRepo transaccionesrepo;
    
    public Transacciones insertar(Transacciones trx){
        return transaccionesrepo.save(trx);
    }
    
    public Transacciones actualizar(Transacciones trx){
        return transaccionesrepo.save(trx);
    }
    
    public List<Transacciones> listar(){
        return transaccionesrepo.findAll();
    }
    
    public void eliminar(Transacciones trx){
        transaccionesrepo.delete(trx);
    }
    
}
