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
public class Romboide {
    
        private double Base;
    private double Altura;


    public Romboide(double base, double altura) {
        this.Base = base;
        this.Altura = altura;
    }
    
  
    public Romboide() {
        this(0, 0);
    }
    public double getBase() {
        return Base;
    }


    public void setBase(double base) {
        this.Base = base;
    }

    /**
     * Método que retorna el valor de la Altura 
     * @return Retorna el valor de la Altura en tipo double
     */
    public double getAltura() {
        return Altura;
    }

   
    public void setAltura(double altura) {
        this.Altura = altura;
    }
    

    public double getArea() {
        return this.Base * this.Altura;
    }
  
    public double getPerimetro() {
        return (2 * (this.Base + this.Altura));
    }
}
