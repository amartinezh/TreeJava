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

    private clsNodo <Integer> root;

    public clsArbol() {
        this.root = null;
    }

    public void insertar(clsNodo <Integer> dato, clsNodo <Integer> rootTmp) {
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
    public clsNodo getPdrGrup1(clsNodo nodo, clsNodo nodoSerch){
        clsNodo pdreTem = null;
        if (nodo.getIzq() != null){
            if(nodoSerch == nodo.getIzq())
            {
                pdreTem = nodo;
                return pdreTem;
            }
            else
            {
              getPdrGrup1(nodo.getIzq(),nodoSerch);  
            }
            
            
        }
        if (nodo.getDer() != null){ // Tiene hijo por derecha?
            if(nodoSerch == nodo.getDer())
            {
                pdreTem = nodo;
                return pdreTem;
            }
            else
            {
              getPdrGrup1(nodo.getDer(),nodoSerch);  
            }
        }
        return pdreTem;
    }
    public String delGrup1(clsNodo rootTmp, String num){
        if (rootTmp != null && num != "" ){
            if(this.root.getNum() == rootTmp.getNum()){
                return "No podemos borrar la raíz";
            }
            if(rootTmp.getNum() == num)
            {
                
                if(rootTmp.getIzq() == null && rootTmp.getDer()== null){
                    
                    rootTmp = null;
                }
                if(rootTmp.getIzq() != null && rootTmp.getDer() == null){
                    clsNodo pdreTem = getPdrGrup1(this.root,rootTmp);
                    pdreTem.setIzq(rootTmp);
                    
                    rootTmp.setIzq(null);   
                    rootTmp.setDer(null);
                }
                if(rootTmp.getIzq() == null && rootTmp.getIzq() != null){
                    
                    clsNodo pdreTem = getPdrGrup1(this.root,rootTmp);
                    pdreTem.setDer(rootTmp);
                    
                    rootTmp.setIzq(null);   
                    rootTmp.setDer(null);

                }
            }
            else
            {
                if (rootTmp.getIzq() != null){
                    delGrup1(rootTmp.getIzq(),num);
                }
                if (rootTmp.getDer() != null){ // Tiene hijo por derecha?
                    delGrup1(rootTmp.getDer(),num);
                }
                
            }   
        }
        return "No hay nada papi";
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
