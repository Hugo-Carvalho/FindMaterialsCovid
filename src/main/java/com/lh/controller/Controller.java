package com.lh.controller;

import com.lh.object.Materiais;
import com.lh.service.PesquisarMascara;
import com.lh.utils.ControladoraSelenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/covidlevel/materiais")
public class Controller {
    
    @Autowired
    PesquisarMascara PesquisarMascara;

    @PostMapping
    public List<Materiais> listMater() {
        List<Materiais> lt = new ArrayList<>();
        WebDriverManager.chromedriver().setup();
        WebDriver browser = ControladoraSelenium.getInstancia().getWebSection();
        //Retornar lista de materiais
        lt = PesquisarMascara.mascaraN(browser);
        browser.quit();
        return lt;
    }

    

}
