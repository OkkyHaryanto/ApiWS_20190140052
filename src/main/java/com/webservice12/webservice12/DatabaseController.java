/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webservice12.webservice12;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
@RestController
@RequestMapping(value = "/mahasiswaku",produces={MediaType.APPLICATION_JSON_VALUE})
public class DatabaseController {
    @Autowired
    Repositorymahasiswa repositorymahasiswa;
            
    @PostMapping("/addmahasiswa")
    public Mahasiswa adddatamahasiswa(@RequestBody Mahasiswa Param)
    {
        repositorymahasiswa.save(Param);
        return Param;
    }
    
    @GetMapping("/allmahasiswa")
    public List<Mahasiswa> alldatamahasiswa()
    {
        return repositorymahasiswa.findAll();
    }
    @GetMapping("/alltomahasiswa")
    public Mahasiswa getdatamahasiswa(@RequestParam int id)
    {
        return repositorymahasiswa.findById(id).get();
    }
    
    @PutMapping("/updatemahasiswa")
    public Mahasiswa updatedatamahasiswa(@RequestBody Mahasiswa Param)
    {
       return repositorymahasiswa.save(Param);
    }
    
    @DeleteMapping("/hapusmahasiswa")
    public List<Mahasiswa> hapusdatamahasiswa(@RequestParam int id)
    {
        repositorymahasiswa.deleteById(id);
        List<Mahasiswa> datamahasiswalist = repositorymahasiswa.findAll();
        return datamahasiswalist;
    }
}

