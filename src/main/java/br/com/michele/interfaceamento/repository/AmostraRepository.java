package br.com.michele.interfaceamento.repository;

import br.com.michele.interfaceamento.entity.Amostra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmostraRepository extends JpaRepository<Amostra, Long> {
}
