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

/**
 *
 * @author fpw
 */
public class Sessione {
    private long id;
    private String data;
    private String orarioInizio;
    private String orarioFine;
    private String luogo;

    public long getId() {
        return id;
    }
    
     public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }
    
     public void setData(String data) {
        this.data = data;
    }

    public String getOrarioInizio() {
        return orarioInizio;
    }
    
     public void setOrarioInizio(String orarioInizio) {
        this.orarioInizio = orarioInizio;
    }

    public String getOrarioFine() {
        return orarioFine;
    }
    
    
    public void setOrarioFine(String orarioFine) {
        this.orarioFine = orarioFine;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Sessione other = (Sessione) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}
