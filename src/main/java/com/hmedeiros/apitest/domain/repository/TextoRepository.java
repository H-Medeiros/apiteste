package com.hmedeiros.apitest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmedeiros.apitest.domain.entity.Texto;

public interface TextoRepository extends JpaRepository<Texto, Integer> {

}
