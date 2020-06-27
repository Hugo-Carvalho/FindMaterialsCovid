package com.lh.service;

import com.lh.object.Materiais;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Service;

@Service
public class PesquisarMascara {

    public  List<Materiais> mascaraN(WebDriver driver) {
        String url = "https://www.zoom.com.br/search?page=1&invalidPath=false&refinementList%5Bmerchants.name%5D%5B0%5D=Americanas&refinementList%5Bmerchants.name%5D%5B1%5D=Extra&refinementList%5Bmerchants.name%5D%5B2%5D=Casas%20Bahia&refinementList%5Bmerchants.name%5D%5B3%5D=Carrefour&configure%5BhitsPerPage%5D=36&configure%5BclickAnalytics%5D=true&configure%5BanalyticsTags%5D%5B0%5D=device_type%3Adesktop&configure%5BanalyticsTags%5D%5B1%5D=traffic_type%3Ausers&configure%5BanalyticsTags%5D%5B2%5D=page_type%3Asearch_page&configure%5BanalyticsTags%5D%5B3%5D=brand%3Azoom&configure%5BuserToken%5D=85a2d714-2988-44e8-a692-f8804c0ab255&no-shortcut=1&range%5Bprice%5D%5Bmax%5D=585&q=mascara%20n%2095";
        driver.get(url);

        List<Materiais> lt = new ArrayList<>();

        //Máscara N-95
        List<WebElement> itens = driver.findElements(By.xpath("//div[@class='card card--offer card--cpc']"));
        for (int i = 1; i <= itens.size(); i++) {
            Materiais mt = new Materiais();
            mt.setImage(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//img[@class='image']")).getAttribute("src"));
            mt.setTitle(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//a[@class='name']")).getAttribute("title"));
            mt.setStore(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//a[@class='merchantName']")).getText());
            mt.setPrice(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//span[@class='customValue']")).getText().replace("\n", "").replace("R$", ""));
            mt.setUrl(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//a[@class='name']")).getAttribute("href"));
            lt.add(mt);
        }

        //Máscara Descartável 
        url = "https://www.zoom.com.br/search?no-shortcut=1&page=1&invalidPath=false&refinementList%5Bmerchants.name%5D%5B0%5D=Americanas&refinementList%5Bmerchants.name%5D%5B1%5D=Extra&refinementList%5Bmerchants.name%5D%5B2%5D=Pontofrio&refinementList%5Bmerchants.name%5D%5B3%5D=Carrefour&refinementList%5Bmerchants.name%5D%5B4%5D=Casas%20Bahia&refinementList%5Bmerchants.name%5D%5B5%5D=DrogaRaia.com&configure%5BhitsPerPage%5D=36&configure%5BclickAnalytics%5D=true&configure%5BanalyticsTags%5D%5B0%5D=device_type%3Adesktop&configure%5BanalyticsTags%5D%5B1%5D=traffic_type%3Ausers&configure%5BanalyticsTags%5D%5B2%5D=page_type%3Asearch_page&configure%5BanalyticsTags%5D%5B3%5D=brand%3Azoom&configure%5BuserToken%5D=7aa53588-d599-4133-892b-fa28351b2080&q=mascara%20cirurgica%20descart%C3%A1vel";
        driver.get(url);

        itens = driver.findElements(By.xpath("//div[@class='card card--offer card--cpc']"));
        for (int i = 1; i <= itens.size(); i++) {
            Materiais mt = new Materiais();
            mt.setImage(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//img[@class='image']")).getAttribute("src"));
            mt.setTitle(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//a[@class='name']")).getAttribute("title"));
            mt.setStore(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//a[@class='merchantName']")).getText());
            mt.setPrice(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//span[@class='customValue']")).getText().replace("\n", "").replace("R$", ""));
            mt.setUrl(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//a[@class='name']")).getAttribute("href"));
            lt.add(mt);
        }

        //Luva Descartavél
        url = "https://www.zoom.com.br/search?no-shortcut=1&page=1&invalidPath=false&refinementList%5Bmerchants.name%5D%5B0%5D=Americanas&refinementList%5Bmerchants.name%5D%5B1%5D=Casas%20Bahia&refinementList%5Bmerchants.name%5D%5B2%5D=Amazon&refinementList%5Bmerchants.name%5D%5B3%5D=Extra&refinementList%5Bmerchants.name%5D%5B4%5D=Pontofrio&configure%5BhitsPerPage%5D=36&configure%5BclickAnalytics%5D=true&configure%5BanalyticsTags%5D%5B0%5D=device_type%3Adesktop&configure%5BanalyticsTags%5D%5B1%5D=traffic_type%3Ausers&configure%5BanalyticsTags%5D%5B2%5D=page_type%3Asearch_page&configure%5BanalyticsTags%5D%5B3%5D=brand%3Azoom&configure%5BuserToken%5D=7aa53588-d599-4133-892b-fa28351b2080&q=luva%20latex%20descartavel";
        driver.get(url);

        itens = driver.findElements(By.xpath("//div[@class='card card--offer card--cpc']"));
        for (int i = 1; i <= itens.size(); i++) {
            Materiais mt = new Materiais();
            mt.setImage(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//img[@class='image']")).getAttribute("src"));
            mt.setTitle(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//a[@class='name']")).getAttribute("title"));
            mt.setStore(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//a[@class='merchantName']")).getText());
            mt.setPrice(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//span[@class='customValue']")).getText().replace("\n", "").replace("R$", ""));
            mt.setUrl(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//a[@class='name']")).getAttribute("href"));
            lt.add(mt);
        }

        //Álcool em gel 70
        url = "https://www.zoom.com.br/search?q=alcool+gel+70";
        driver.get(url);

        itens = driver.findElements(By.xpath("//div[@class='card card--offer card--cpc']"));
        for (int i = 1; i <= itens.size(); i++) {
            Materiais mt = new Materiais();
            mt.setImage(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//img[@class='image']")).getAttribute("src"));
            mt.setTitle(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//a[@class='name']")).getAttribute("title"));
            mt.setStore(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//a[@class='merchantName']")).getText());
            mt.setPrice(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//span[@class='customValue']")).getText().replace("\n", "").replace("R$", ""));
            mt.setUrl(driver.findElement(By.xpath("//div[@class='card card--offer card--cpc'][" + i + "]//a[@class='name']")).getAttribute("href"));
            lt.add(mt);
        }

        return lt;
    }

}
