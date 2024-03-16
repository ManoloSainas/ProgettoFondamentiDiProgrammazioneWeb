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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author fpw
 */
public class UtenteFactory {
    private static UtenteFactory instance;
    
    private UtenteFactory(){}
            
    public static UtenteFactory getInstance(){
        if(instance == null)
            instance = new UtenteFactory();
        return instance;
    }
    
    /**
     *
     * @param username
     * @param password
     * @return
     */
    public Utente getUtenteByUsernamePassword(String username, String password){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet set = null;
        
        try{
            conn = DatabaseManager.getInstance().getDbConnection();
            
            String query = "SELECT * FROM utente WHERE username = ? AND password = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            set = stmt.executeQuery();
            
            if(set.next()){
                Utente utente = new Utente();
                utente.setUsername(set.getString("username"));
                utente.setPassword(set.getString("password"));
                utente.setNome(set.getString("nome"));
                utente.setCognome(set.getString("cognome"));
                utente.setDatadinascita(set.getString("datadinascita")); 
                utente.setCodicefiscale(set.getString("codicefiscale"));
                utente.setSesso(set.getString("sesso"));
                utente.setEmail(set.getString("email"));
                utente.setTelefono(set.getString("telefono"));
                utente.setGrupposanguigno(set.getString("grupposanguigno"));
                utente.setPatologie(set.getString("patologie"));
                utente.setNumerodonazioni(set.getString("numerodonazioni"));
                utente.setAdmin(Boolean.parseBoolean(set.getString("admin")));
                return utente;
            }
            else{
                return null;
            }
        } catch(SQLException e){
            Logger.getLogger(UtenteFactory.class.getName()).
                    log(Level.SEVERE, null, e);
        } finally{
            try{ set.close(); } catch (Exception e) {} 
            try{ stmt.close(); } catch (Exception e) {} 
            try{ conn.close(); } catch (Exception e) {} 
          }
            
        return null;
    }
    
    public int registrazioneUtente(String username, String password, String nome, String cognome, 
            String data, String codicefiscale, String sesso, String email, String telefono, String gruppo,
            String patologie)throws ParseException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet set = null;
        
        try{
            conn = DatabaseManager.getInstance().getDbConnection();
            
            String query = "INSERT INTO utente VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            stmt = conn.prepareStatement(query);
           
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, nome);
            stmt.setString(4, cognome);
            
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsed = format.parse(data);
            stmt.setDate(5, new java.sql.Date(parsed.getTime()));
            
            stmt.setString(6, codicefiscale);
            stmt.setString(7, sesso);
            stmt.setString(8, email);
            stmt.setString(9, telefono);
            stmt.setString(10, gruppo);
            stmt.setString(11, patologie);
            stmt.setString(12, "0");
            stmt.setBoolean(13, false);
            
            int i = stmt.executeUpdate();
            
            return i;
            
            } catch(SQLException e){
                Logger.getLogger(UtenteFactory.class.getName()).
                    log(Level.SEVERE, null, e);
            } finally{
                try{ stmt.close(); } catch (Exception e) {} 
                try{ conn.close(); } catch (Exception e) {} 
            }
            
        return 0;
    }
    
    
}
