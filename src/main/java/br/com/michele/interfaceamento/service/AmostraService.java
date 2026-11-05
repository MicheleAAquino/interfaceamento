package br.com.michele.interfaceamento.service;

import br.com.michele.interfaceamento.entity.Amostra;
import br.com.michele.interfaceamento.entity.StatusAmostra;
import br.com.michele.interfaceamento.repository.AmostraRepository;
import org.springframework.stereotype.Service;
import br.com.michele.interfaceamento.entity.ResultadoEquipamento;

@Service
public class AmostraService {

    private final AmostraRepository amostraRepository;

    public AmostraService(AmostraRepository amostraRepository) {
        this.amostraRepository = amostraRepository;
    }

    public Amostra salvar(Amostra amostra) {
        return amostraRepository.save(amostra);
    }

    public Amostra buscarPorId(Long id) {
        return amostraRepository.findById(id).orElseThrow();

    }
    public Amostra receberResultado(Long id, ResultadoEquipamento resultadoEquipamento){
        Amostra amostra = buscarPorId(id);
        amostra.setResultado(resultadoEquipamento.getResultado());
        amostra.setUnidade(resultadoEquipamento.getUnidade());
        amostra.setStatus(StatusAmostra.EXECUTADO);
        return amostraRepository.save(amostra);

    }
    public Amostra liberarResultado(Long id) {
        Amostra amostra = buscarPorId(id);
        amostra.setStatus(StatusAmostra.LIBERADO);
        return amostraRepository.save(amostra);

    }


}