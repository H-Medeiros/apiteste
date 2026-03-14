package com.hmedeiros.apitest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmedeiros.apitest.domain.entity.Texto;
import com.hmedeiros.apitest.domain.repository.TextoRepository;

@Service
public class TextoService {

    @Autowired
    private TextoRepository textoRepository;

    public Texto save(Texto conteudo) {
        Texto savedTexto = textoRepository.save(conteudo);

        Texto texto = new Texto();
        textoRepository.save(texto);
        return textoRepository.save(savedTexto);
    }

}
