/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidsproject;

/**
 *
 * @author Mahmoud Eidarous
 */
public class Pyramid {
    private String pharoh;
    private String ancentName;
    private String modernName;
    private String site;
    private String height;
    private String dynasty;
    private String base1;
    private String base2 ;
    private String slope;
    private String vol;
    private String lat;
    private String log;
    private String ty;
    private String lep;
    private String mat;
    private String comm;
    
    public Pyramid(){
    }
    
    public Pyramid(String pharoh, String ancentName, String modernName, String site, String height, String dynasty, String base1, String base2, String slope, String vol, String lat, String log, String ty, String lep, String mat, String comm) {
        this.pharoh = pharoh;
        this.ancentName = ancentName;
        this.modernName = modernName;
        this.site = site;
        this.height = height;
        this.dynasty = dynasty;
        this.base1 = base1;
        this.base2 = base2;
        this.slope = slope;
        this.vol = vol;
        this.lat = lat;
        this.log = log;
        this.ty = ty;
        this.lep = lep;
        this.mat = mat;
        this.comm = comm;
    }

    public String getPharoh() {
        return pharoh;
    }

    public void setPharoh(String pharoh) {
        this.pharoh = pharoh;
    }

    public String getAncentName() {
        return ancentName;
    }

    public void setAncentName(String ancentName) {
        this.ancentName = ancentName;
    }

    public String getModernName() {
        return modernName;
    }

    public void setModernName(String modernName) {
        this.modernName = modernName;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDynasty() {
        return dynasty;
    }

    public void setDynasty(String dynasty) {
        this.dynasty = dynasty;
    }

    public String getBase1() {
        return base1;
    }

    public void setBase1(String base1) {
        this.base1 = base1;
    }

    public String getBase2() {
        return base2;
    }

    public void setBase2(String base2) {
        this.base2 = base2;
    }

    public String getSlope() {
        return slope;
    }

    public void setSlope(String slope) {
        this.slope = slope;
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getTy() {
        return ty;
    }

    public void setTy(String ty) {
        this.ty = ty;
    }

    public String getLep() {
        return lep;
    }

    public void setLep(String lep) {
        this.lep = lep;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    @Override
    public String toString() {
        return "Pyramid{" + "pharoh=" + pharoh + ", ancentName=" + ancentName + ", modernName=" + modernName + ", site=" + site + ", height=" + height + ", dynasty=" + dynasty + ", base1=" + base1 + ", base2=" + base2 + ", slope=" + slope + ", vol=" + vol + ", lat=" + lat + ", log=" + log + ", ty=" + ty + ", lep=" + lep + ", mat=" + mat + ", comm=" + comm + '}';
    }

  
    
}
