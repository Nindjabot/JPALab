/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "second")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Second.findAll", query = "SELECT s FROM Second s"),
    @NamedQuery(name = "Second.findBySecId", query = "SELECT s FROM Second s WHERE s.secId = :secId"),
    @NamedQuery(name = "Second.findByPrice", query = "SELECT s FROM Second s WHERE s.price = :price")})
public class Second implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sec_id")
    private Integer secId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private int price;
    @JoinColumn(name = "idd_fk", referencedColumnName = "idd")
    @ManyToOne(optional = false)
    private First iddFk;

    public Second() {
    }

    public Second(Integer secId) {
        this.secId = secId;
    }

    public Second(Integer secId, int price) {
        this.secId = secId;
        this.price = price;
    }

    public Integer getSecId() {
        return secId;
    }

    public void setSecId(Integer secId) {
        this.secId = secId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public First getIddFk() {
        return iddFk;
    }

    public void setIddFk(First iddFk) {
        this.iddFk = iddFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secId != null ? secId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Second)) {
            return false;
        }
        Second other = (Second) object;
        if ((this.secId == null && other.secId != null) || (this.secId != null && !this.secId.equals(other.secId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Second[ secId=" + secId + " ]";
    }
    
}
