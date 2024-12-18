/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_trilingua;

/**
 *
 * @author zxsyn
 */
class Data {
    private String indonesian;
    private String english;
    private String jawa;
    private String ket;

    public Data(String indonesian, String english, String jawa, String ket) {
        this.indonesian = indonesian;
        this.english = english;
        this.jawa = jawa;
        this.ket = ket;
    }

    public String getIndonesian() {
        return indonesian;
    }

    public String getEnglish() {
        return english;
    }

    public String getJawa() {
        return jawa;
    }
    
    public String getKet(){
        return ket;
    }
    
}
