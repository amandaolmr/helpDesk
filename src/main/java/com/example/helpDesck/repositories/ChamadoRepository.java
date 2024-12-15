package com.example.helpDesck.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.helpDesck.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
