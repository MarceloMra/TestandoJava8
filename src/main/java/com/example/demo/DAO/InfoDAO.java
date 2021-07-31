package com.example.demo.DAO;

import com.example.demo.entities.Info;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter

@Repository
public class InfoDAO {
    private List<Info> infos = null;

    public InfoDAO(){
        infos = new ArrayList<>();
    }

    public Info add(Info info){
        infos.add(info);
        return info;
    }

    public Info delete(String name){
        Info info = infos.stream()
                .filter(i -> i.getName().equals(name))
                .collect(Collectors.toList())
                .get(0);

        infos.remove(info);
        return info;
    }

    public Info update(Info info){
        List<Info> tempInfo = infos
                .stream()
                .filter(i -> i.getDescription().equals(info.getDescription()) && i.getName().equals(info.getName()))
                .collect(Collectors.toList());

        tempInfo
                .stream()
                .forEach(i -> i.setDescription(info.getDescription()));

        tempInfo
                .stream()
                .forEach(i -> i.setName(info.getName()));

        return tempInfo.get(0);
    }

    public Info getInfo(String name){
        return infos.stream()
                .filter(i -> i.getName().equals(name))
                .collect(Collectors.toList())
                .get(0);
    }
}
