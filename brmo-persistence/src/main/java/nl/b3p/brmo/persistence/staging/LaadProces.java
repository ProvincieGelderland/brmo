/*
 * Copyright (C) 2015 B3Partners B.V.
 */
package nl.b3p.brmo.persistence.staging;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

/**
 * Beschrijft een laad proces van een bericht of bestand.
 *
 * @author Mark Prins <mark@b3partners.nl>
 */
@Entity
@Table(name = "laadproces")
public class LaadProces implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String bestand_naam;

    @Temporal(TemporalType.TIMESTAMP)
    private Date bestand_datum;

    private String soort;

    private String gebied;

    @Column
    @Lob
    @Type(type = "org.hibernate.type.StringClobType")
    private String opmerking;

    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date status_datum;

    private String contact_email;

    // <editor-fold defaultstate="collapsed" desc="getters and setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBestand_naam() {
        return bestand_naam;
    }

    public void setBestand_naam(String bestand_naam) {
        this.bestand_naam = bestand_naam;
    }

    public Date getBestand_datum() {
        return bestand_datum;
    }

    public void setBestand_datum(Date bestand_datum) {
        this.bestand_datum = bestand_datum;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public String getGebied() {
        return gebied;
    }

    public void setGebied(String gebied) {
        this.gebied = gebied;
    }

    public String getOpmerking() {
        return opmerking;
    }

    public void setOpmerking(String opmerking) {
        this.opmerking = opmerking;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStatus_datum() {
        return status_datum;
    }

    public void setStatus_datum(Date status_datum) {
        this.status_datum = status_datum;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }
//</editor-fold>
}