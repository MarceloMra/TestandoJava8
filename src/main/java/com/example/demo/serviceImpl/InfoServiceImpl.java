package com.example.demo.serviceImpl;

import com.example.demo.DAO.InfoDAO;
import com.example.demo.dto.InfoDTO;
import com.example.demo.entities.Info;
import com.example.demo.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.modelmapper.ModelMapper;

@Service
public class InfoServiceImpl implements InfoService {
    private ModelMapper modelMapper;
    @Autowired
    private InfoDAO infoDAO;

    public InfoServiceImpl() {
        modelMapper = new ModelMapper();
    }

    @Override
    public Info createInfo(InfoDTO infoDTO) {
        return infoDAO.add(this.toInfo(infoDTO));
    }

    @Override
    public Info updateInfo(InfoDTO infoDTO) {
        return null;
    }

    @Override
    public Info deleteInfo(String name) {
        return infoDAO.delete(name);
    }

    @Override
    public Info getInfo(String name) {
        return infoDAO.getInfo(name);
    }

    @Override
    public List<Info> getInfos() {
        return infoDAO.getInfos();
    }

    private Info toInfo(InfoDTO infoDTO){
        return modelMapper.map(infoDTO, Info.class);
    }
}
