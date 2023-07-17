/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.entidades;

/**
 *
 * @author bmjwe
 */
public class fabricate {
    
    private int codigoF;
    private String nombreF;

    public fabricate() {
    }

    public fabricate(int codigoF, String nombreF) {
        this.codigoF = codigoF;
        this.nombreF = nombreF;
    }

    public int getCodigoF() {
        return codigoF;
    }

    public void setCodigoF(int codigoF) {
        this.codigoF = codigoF;
    }

    public String getNombreF() {
        return nombreF;
    }

    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }

    @Override
    public String toString() {
        return "fabricate{" + "codigoF=" + codigoF + ", nombreF=" + nombreF + '}';
    }
    
    
}
