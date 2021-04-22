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
public class clsArbol {

    private clsNodo root;

    public clsArbol() {
        this.root = null;
    }

    public void insertar(clsNodo dato, clsNodo rootTmp) {
        if (this.getRoot() == null) { // Si e árbol está vacio
            this.setRoot(dato);
        } else { // El "arbol" no está vacio
            if (dato.getNum() > rootTmp.getNum()) {
                // Lo insertaré por derecha
                if (rootTmp.getDer() == null) {
                    rootTmp.setDer(dato);
                } else {
                    // Llamado recursivo
                    insertar(dato, rootTmp.getDer());
                }
            } else {
                // Lo insertaré por izquierda
                if (dato.getNum() <= rootTmp.getNum()) {
                    // Lo insertaré por derecha
                    if (rootTmp.getIzq() == null) {
                        rootTmp.setIzq(dato);
                    } else {
                        // Llamado recursivo
                        insertar(dato, rootTmp.getIzq());
                    }
                }
            }
        }
    }
    
    public void listar(clsNodo rootTmp){
        if (rootTmp != null){
            System.out.println("Num: " + rootTmp.getNum());
            if (rootTmp.getDer() != null){ // Tiene hijo por derecha?
                listar(rootTmp.getDer());
            }
            if (rootTmp.getIzq() != null){
                listar(rootTmp.getIzq());
            }
        }
    }

    /**
     * @return the root
     */
    public clsNodo getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(clsNodo root) {
        this.root = root;
    }
}
