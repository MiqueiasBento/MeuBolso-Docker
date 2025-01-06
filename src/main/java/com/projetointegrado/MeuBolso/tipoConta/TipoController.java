package com.projetointegrado.MeuBolso.tipoConta;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipoConta")
public class TipoController {
    @Autowired
    TipoContaService tipoContaService;

    public TipoController(TipoContaRepository tipoContaRepository) {
    }

    @Operation(summary = "Retorna todos os tipos de conta que o sistema suporta")
    @GetMapping
    public List<TipoContaDTO> findAll(){
        return tipoContaService.findAll();
    }

    @Operation(summary = "Retorna um tipo de conta especifico a partir de um id indicado")
    @GetMapping("/{id}")
    public TipoContaDTO findById(@PathVariable Long id) {
        return tipoContaService.findTipoContaById(id);
    }
}
