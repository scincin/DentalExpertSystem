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
public class SolitionModel {
    private int problem;
    private int tedaviGecmisi;
    private int kullandigiIlac;
    private int fircalamaAliskanligi;
    private int yas;
    public SolitionModel(int problem, int tedaviGecmisi, int fircalamaAliskanligi, int yas, int kullandigiIlac) {
        this.problem = problem;
        this.tedaviGecmisi = tedaviGecmisi;
        this.kullandigiIlac = kullandigiIlac;
        this.fircalamaAliskanligi = fircalamaAliskanligi;
        this.yas = yas;
        
    }
    public int getProblem() {
        return problem;
    }

    public void setProblem(int takipciSayisi) {
        this.problem = problem;
    }
    public int getTedaviGecmisi() {
        return tedaviGecmisi;
    }

    public void setTedaviGecmisi(int tedaviGecmisi) {
        this.tedaviGecmisi = tedaviGecmisi;
    }
    public int getKullandigiIlac() {
        return kullandigiIlac;
    }

    public void setKullandigiIlac(int kullandigiIlac) {
        this.kullandigiIlac = kullandigiIlac;
    }
    public int getfircalamaAliskanligi() {
        return fircalamaAliskanligi;
    }
    public void setfircalamaAliskanligi(int fircalamaAliskanligi) {
        this.fircalamaAliskanligi = fircalamaAliskanligi;
    }
    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
