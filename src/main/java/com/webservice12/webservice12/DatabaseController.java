/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webservice12.webservice12;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping(value = "/mahasiswa")
public class DatabaseController {
    @Autowired
    Repositorymahasiswa repositorymahasiswa;
            
    @PostMapping(value = "/addmahasiswa")
    public Datamahasiswa adddatamahasiswa(@RequestBody Datamahasiswa Param)
    {
        repositorymahasiswa.save(Param);
        return Param;
    }
    
    @GetMapping(value = "/allmahasiswa")
    public List<Datamahasiswa> alldatamahasiswa()
    {
        return repositorymahasiswa.findAll();
    }
    
    @PutMapping(value = "/updatemahasiswa")
    public Datamahasiswa updatedatamahasiswa(@RequestBody Datamahasiswa Param)
    {
       return repositorymahasiswa.save(Param);
    }
    
    @DeleteMapping(value = "/hapusmahasiswa")
    public List<Datamahasiswa> hapusdatamahasiswa(@RequestParam int id)
    {
        repositorymahasiswa.deleteById(id);
        List<Datamahasiswa> datamahasiswalist = repositorymahasiswa.findAll();
        return datamahasiswalist;
    }
}

