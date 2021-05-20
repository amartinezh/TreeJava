/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgClass;

/**
 *
 * @author amartinez
 */
public class clsNodo <T>{
    private T num;
    private clsNodo <T> padre;
    private clsNodo <T> izq;
    private clsNodo <T> der;
    

    public clsNodo() {
    }
    
    public clsNodo(T num, clsNodo izq, clsNodo der) {
        this.num = num;
        this.izq = izq;
        this.der = der;
    }

    /**
     * @return the num
     */
    public T getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(T num) {
        this.num = num;
    }
    
    public clsNodo getPadre() {
        return padre;
    }
    
    public void setPadre(clsNodo padre){
        this.padre = padre;
    }

    /**
     * @return the izq
     */
    public clsNodo getIzq() {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(clsNodo izq) {
        this.izq = izq;
    }

    /**
     * @return the der
     */
    public clsNodo getDer() {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(clsNodo der) {
        this.der = der;
    }

    
}
