/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avis.model;

import java.util.Objects;
import avis.db.DatabaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDate;
import java.lang.Boolean;

/**
 *
 * @author fpw
 */
public class Prenotazione {
    private long id;
    private boolean archiviata;
    private String utente_id;
    private long sessione_id;

    public long getId() {
        return id;
    }
    
     public void setId(long id) {
        this.id = id;
    }

    public boolean isArchiviata() {
        return archiviata;
    }
    
    public void setArchiviata(boolean archiviata) {
        this.archiviata = archiviata;
    }


    public String getUtente_id() {
        return utente_id;
    }
    
     public void setUtente_id(String utente_id) {
        this.utente_id = utente_id;
    }

    public long getSessione_id() {
        return sessione_id;
    }
    
    public void setSessione_id(long sessione_id) {
        this.sessione_id = sessione_id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prenotazione other = (Prenotazione) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
