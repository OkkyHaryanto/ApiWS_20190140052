/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webservice12.webservice12;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ASUS
 */
@Controller

public class mahasiswaController {

     @CrossOrigin    
    @GetMapping(value="/datamahasiswa/xml",produces={MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public List<Datamahasiswa> getDataMahasiswa(){
        
        List<Datamahasiswa> datamahasiswa = new ArrayList<>();
        
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try {
        
            datamahasiswa = controller.findDatamahasiswaEntities();
        } catch (Exception e){}
        
        return datamahasiswa;
    }
    
    @CrossOrigin
    @GetMapping(value="/datamahasiswa/json", produces={MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Datamahasiswa> getDataMahasiswas(){
        List<Datamahasiswa> datamahasiswa = new ArrayList<>();
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try {
            datamahasiswa = controller.findDatamahasiswaEntities();
        }catch (Exception e) {}
        
        return datamahasiswa;
        
    }
}