/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expertsystem;

/**
 *
 * @author selahattincincin
 */
public class Solition {
    public String Solition(SolitionModel solitionModel){
        int cp = cozumPuani(solitionModel.getProblem(), solitionModel.getTedaviGecmisi(),solitionModel.getKullandigiIlac(), solitionModel.getfircalamaAliskanligi(),solitionModel.getYas());
        int cozumFonk = fun(cp);
        String cozum = cozumOner(cozumFonk);
        return cozum;
    }
    
    
    int cozumPuani(int problem, int tedaviGecmisi, int fircalamaAliskanligi,int yas, int kullandigiIlac){
        int puan = 0;
        if(problem == 0){
            puan = puan + 30;
        }
        else if (problem == 1){
            puan = puan + 25;
        }
        else if (problem == 2){
            puan = puan + 20;
        }
        else if (problem == 3){
            puan = puan + 15;
        }
        else {
            puan = puan + 10;
        }
        
        if(tedaviGecmisi == 0){
            puan = puan + 10;
        }
        else {
            puan = puan + 15;
        }
        if(kullandigiIlac == 0){
            puan = puan + 10;
        }
        else {
            puan = puan + 5;
        }
        
        if(fircalamaAliskanligi == 0){
            puan = puan + 25;
        }
        else if (fircalamaAliskanligi == 1){
            puan = puan + 15;
        }
        else if (fircalamaAliskanligi == 2){
            puan = puan + 10;
        }
        else {
            puan = puan + 5;
        }
        if(yas == 0){
            puan = puan + 5;
        }
        else if (yas == 1){
            puan = puan + 10;
        }
        else if (yas == 2){
            puan = puan + 15;
        }
        else {
            puan = puan + 20;
        }
        
        return puan;
    }
 
    
    int fun (int cp){
        return cp;
    }

    String cozumOner(float puanFonk) {
        String cozum = "" ;
        if(puanFonk>=90 && puanFonk <101){
            cozum ="Acilen Doktora Görünmelisin" ;
        }
        else if(puanFonk>60 && puanFonk <91){
            cozum = " Ağrı kesici kullanmalısın";
        }
        else if(puanFonk>40 && puanFonk <61){
            cozum = "Tuzlu Suya gargara yapmayı dene ";
        }
        else{
            cozum = " Uyuyup dinlenmelisin";
        }
        return cozum;
    }
}
