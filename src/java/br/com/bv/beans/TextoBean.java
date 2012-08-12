/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bv.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author valentims
 */
@ManagedBean
public class TextoBean {
    
    private String texto;
    private String siglaCurso;
    private String[] cursos = {"um", "dois", "tres"};
    private boolean aceito;

    /**
     * Creates a new instance of TextoBean
     */
    public TextoBean() {
        
    }
    
    public void transformaEmCaixaAlta() {
        this.texto = this.texto.toUpperCase();
        FacesMessage facesMessage = new FacesMessage("Deu erro!");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
//        return "paginas/texto/transformacao";
    }

    public String getTexto() {
        return texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public String getSiglaCurso() {
        return siglaCurso;
    }
    
    public void setSiglaCurso(String siglaCurso) {
        this.siglaCurso = siglaCurso;
    }
    
    public String[] getCursos() {
        return cursos;
    }
    
    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }
    
    public boolean isAceito() {
        return aceito;
    }
    
    public void setAceito(boolean aceito) {
        this.aceito = aceito;
    }
}
