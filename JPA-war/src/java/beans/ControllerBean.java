/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import DAOComponents.DAOComponentsLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import models.First;

/**
 *
 * @author User
 */
@Named(value = "controllerBean")
@SessionScoped
public class ControllerBean implements Serializable{

    @EJB
    private DAOComponentsLocal library;

    @PostConstruct
    private void initializeBean() {
        author = new First();
    }
    private First author;

    private int idd;

    public First getAuthor() {
        return author;
    }

    public void setAuthor(First author) {
        this.author = author;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public List<First> getAllAuthors() throws Exception {
        return library.getAllAuthors();
    }

    public String addAuthor() throws Exception {
        this.library.addAuthor(author);
        return "/Authors.xhtml";
    }

    public void deleteAuthor(int idd) throws Exception {
        library.deleteAuthor(idd);
    }
}
