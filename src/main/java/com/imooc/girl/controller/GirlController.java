package com.imooc.girl.controller;


import com.imooc.girl.domain.Girl;
import com.imooc.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    public GirlRepository girlRepository;

    @GetMapping(value = "girls")
    public List<Girl> girlList(){
        return girlRepository.findALl();
    }
}
