package nl.b3p.brmo.loader.xml;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import nl.b3p.brmo.loader.entity.Bericht;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * abstract reader of basisregistratie files
 *
 * @author Boy de Wit
 */
public abstract class BrmoXMLReader {

    private static final Log log = LogFactory.getLog(BrmoXMLReader.class);

    // laadproces
    private String bestandsNaam;
    private Date bestandsDatum;
    private String soort;
    private String gebied;
    private String opmerking;
    private String status;
    private Date statusDatum;
    private String contactEmail;

    public abstract void init() throws Exception;
    public abstract boolean hasNext() throws Exception;
    public abstract Bericht next() throws Exception;

    public void setDatumAsString(String brkDatumString) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            bestandsDatum = sdf.parse(brkDatumString);
        } catch (ParseException pe) {
            log.error("Error while parsing date: " + brkDatumString, pe);
        }
    }

    public String getBestandsNaam() {
        return bestandsNaam;
    }

    public void setBestandsNaam(String bestandsNaam) {
        this.bestandsNaam = bestandsNaam;
    }

    public Date getBestandsDatum() {
        return bestandsDatum;
    }

    public void setBestandsDatum(Date bestandsDatum) {
        this.bestandsDatum = bestandsDatum;
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

    public Date getStatusDatum() {
        return statusDatum;
    }

    public void setStatusDatum(Date statusDatum) {
        this.statusDatum = statusDatum;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}