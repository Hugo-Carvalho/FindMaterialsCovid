package com.lh.controller;

import com.lh.entity.Materiais;
import com.lh.service.MaterialService;
import com.lh.utils.ControladoraSelenium;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/covidlevel/materiais")
public class MaterialController {
    
    @Autowired
    MaterialService materialService;

    @GetMapping
    public List<Materiais> getAllMateriais() {
        return materialService.getAllMateriais();
    }
    
    @PatchMapping
    public void updateMateriais() {
        WebDriver browser = ControladoraSelenium.getInstancia().getWebSection();
        materialService.updateMateriais(browser);
    }
}
