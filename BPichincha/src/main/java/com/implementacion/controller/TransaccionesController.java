
package com.implementacion.controller;

import com.implementacion.entity.Transacciones;
import com.implementacion.service.TransaccionesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/transacciones")
public class TransaccionesController {
    
    @Autowired
    private TransaccionesService transaccionesservice;
    
    @GetMapping
    public List<Transacciones> listar(){
        return transaccionesservice.listar();
    }
    
    @PostMapping
    public Transacciones insertar(@RequestBody Transacciones trx){
        return transaccionesservice.insertar(trx);
    }
    
    @PutMapping
    public Transacciones actualizar(@RequestBody Transacciones trx){
        return transaccionesservice.actualizar(trx);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Transacciones trx){
        transaccionesservice.eliminar(trx);
    }
    
}
