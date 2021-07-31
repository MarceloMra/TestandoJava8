package com.example.demo.controller;

import com.example.demo.dto.InfoDTO;
import com.example.demo.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/info")
public class InfoController {

    @Autowired
    InfoService infoService;

    @PostMapping(value = "/create")
    public ResponseEntity<?> createInfo(@RequestBody InfoDTO infoDTO){
        return ResponseEntity.status(HttpStatus.OK).body(infoService.createInfo(infoDTO));
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(infoService.getInfos());
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> findById(@PathVariable String name){
        return ResponseEntity.status(HttpStatus.OK).body(infoService.getInfo(name));
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<?> delete(@PathVariable String name){
        return ResponseEntity.status(HttpStatus.OK).body(infoService.deleteInfo(name));
    }
}
