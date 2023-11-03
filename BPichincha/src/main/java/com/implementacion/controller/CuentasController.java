
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
@RequestMapping("/cuentas")
public class CuentasController {
    
    @Autowired
    private TransaccionesService transaccionesservice;
    
    @GetMapping
    public List<Transacciones> listar(){
        return transaccionesservice.listar();
    }
    
    @PostMapping
    public Transacciones insertar(@RequestBody Transacciones cuenta){
        return transaccionesservice.insertar(cuenta);
    }
    
    @PutMapping
    public Transacciones actualizar(@RequestBody Transacciones cuenta){
        return transaccionesservice.actualizar(cuenta);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Transacciones cuenta){
        transaccionesservice.eliminar(cuenta);
    }
    
}
