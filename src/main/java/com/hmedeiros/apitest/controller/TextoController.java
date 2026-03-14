package com.hmedeiros.apitest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hmedeiros.apitest.domain.entity.Texto;
import com.hmedeiros.apitest.service.TextoService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/textos")
public class TextoController {

    @Autowired
    private TextoService textoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Texto> save(@RequestBody Texto conteudo) {
        Texto savedTexto = textoService.save(conteudo);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTexto);
    }

}
