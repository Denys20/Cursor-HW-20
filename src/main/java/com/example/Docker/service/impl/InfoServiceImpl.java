package com.example.Docker.service.impl;

import com.example.Docker.entiry.Info;
import com.example.Docker.repository.InfoRepository;
import com.example.Docker.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoRepository infoRepository;

    @Override
    public List<Info> getAllInfo() {
        List<Info> infos = new ArrayList<>();
        infoRepository.findAll().forEach(infos::add);
        return infos;
    }
}
