/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author Usuario
 */
public class Rombo {
            private double Dl;
    private double Dc;
    private double Lado;
    
    public Rombo(double Dl, double Dc, double Lado) {
        this.Dl = Dl;
        this.Dc = Dc;
        this.Lado = Lado;
    }
    
    public Rombo() {
        this(0, 0, 0);
    }
    
        public double getDl() {
        return Dl;
    }

  
    public void setDl(double Dl) {
        this.Dl = Dl;
    }

  
    public double getDc() {
        return Dc;
    }

    public void setDc(double Dc) {
        this.Dc = Dc;
    }
    
 
    public double getArea() {
        return ((this.Dl * this.Dc)/2);
    }

    public double getPerimetro() {
        return (4 * (this.Lado));
    }
}
