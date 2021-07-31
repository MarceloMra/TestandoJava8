package com.example.demo.service;

import com.example.demo.dto.InfoDTO;
import com.example.demo.entities.Info;

import java.util.List;

public interface InfoService {
    public Info createInfo(InfoDTO infoDTO);
    public Info updateInfo(InfoDTO infoDTO);
    public Info deleteInfo(String name);
    public Info getInfo(String name);
    public List<Info> getInfos();
}
