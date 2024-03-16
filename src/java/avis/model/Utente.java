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
public class Utente {
    private String username;
    private String password;
    private String nome;
    private String cognome;
    private String datadinascita;
    private String codicefiscale;
    private String sesso;
    private String email;
    private String telefono;
    private String grupposanguigno;
    private String patologie;
    private String numerodonazioni;
    private boolean admin;

    

    public boolean isAdmin() {
        return admin;
    }
    
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }
    
    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }
    
    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     *
     * @return
     */
    public String getCognome() {
        return cognome;
    }

    /**
     *
     * @param cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     *
     * @return
     */
    public String getDatadinascita() {
        return datadinascita;
    }
    
    /**
     *
     * @param datadinascita
     */
    public void setDatadinascita(String datadinascita) {
        this.datadinascita = datadinascita;
    }

    /**
     *
     * @return
     */
    public String getCodicefiscale() {
        return codicefiscale;
    }
    
    /**
     *
     * @param codicefiscale
     */
    public void setCodicefiscale(String codicefiscale) {
        this.codicefiscale = codicefiscale;
    }
    
    /**
     *
     * @return
     */
    public String getSesso() {
        return sesso;
    }

    /**
     *
     * @param sesso
     */
    public void setSesso(String sesso) {
        this.sesso = sesso;
    }
    
    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     *
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
     *
     * @return
     */
    public String getGrupposanguigno() {
        return grupposanguigno;
    }

    /**
     *
     * @param gruppo
     */
    public void setGrupposanguigno(String grupposanguigno) {
        this.grupposanguigno = grupposanguigno;
    }
    
    /**
     *
     * @return
     */
    public String getPatologie() {
        return patologie;
    }

    /**
     *
     * @param patologie
     */
    public void setPatologie(String patologie) {
        this.patologie = patologie;
    }
    
    /**
     *
     * @return
     */
    public String getNumerodonazioni() {
        return numerodonazioni;
    }

    /**
     *
     * @param numerodonazioni
     */
    public void setNumerodonazioni(String numerodonazioni) {
        this.numerodonazioni = numerodonazioni;
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.username);
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
        final Utente other = (Utente) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }
    
    
    
}
