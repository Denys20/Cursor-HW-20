package com.example.Docker.web;


import com.example.Docker.entiry.Info;
import com.example.Docker.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    private InfoService infoService;

    @GetMapping
    public ResponseEntity<List<Info>> getAllInfo() {
        return new ResponseEntity<>(infoService.getAllInfo(), HttpStatus.OK);
    }
}
