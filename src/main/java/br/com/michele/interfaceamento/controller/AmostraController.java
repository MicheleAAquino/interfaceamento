package br.com.michele.interfaceamento.controller;

import br.com.michele.interfaceamento.entity.Amostra;
import br.com.michele.interfaceamento.service.AmostraService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.michele.interfaceamento.entity.ResultadoEquipamento;
@RestController
@RequestMapping("/amostras")
public class AmostraController {

    private final AmostraService amostraService;

    public AmostraController(AmostraService amostraService) {
        this.amostraService = amostraService;
    }

    @PostMapping
    public Amostra salvar(@RequestBody Amostra amostra) {
        return amostraService.salvar(amostra);
    }

    @GetMapping("/{id}")
    public Amostra buscarPorId(@PathVariable Long id) {
        return amostraService.buscarPorId(id);
    }
    @PostMapping("/{id}/resultado")
    public Amostra receberResultado(
            @PathVariable Long id,
            @RequestBody ResultadoEquipamento resultadoEquipamento) {
        return amostraService.receberResultado(id, resultadoEquipamento);
    }
    @PostMapping("/{id}/liberar")
    public Amostra liberarResultado(@PathVariable Long id) {
        return amostraService.liberarResultado(id);
    }


}