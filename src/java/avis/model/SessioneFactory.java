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

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author fpw
 */
public class SessioneFactory {
    private static SessioneFactory instance;
    
    private SessioneFactory(){}
            
    public static SessioneFactory getInstance(){
        if(instance == null)
            instance = new SessioneFactory();
        return instance;
    }
    
    
    public List<Sessione> getAllSessioni(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet set = null;
        List<Sessione> sessioni = new ArrayList<>();
        
        try{
            conn = DatabaseManager.getInstance().getDbConnection();
            
            String query = "SELECT * FROM sessione";
            stmt = conn.prepareStatement(query);      
            set = stmt.executeQuery();
            
            while(set.next()){
                Sessione sessione = new Sessione();
                sessione.setId(set.getLong("id"));
                sessione.setData(set.getString("data"));
                sessione.setOrarioInizio(set.getString("orarioInizio"));
                sessione.setOrarioFine(set.getString("orarioFine"));
                sessione.setLuogo(set.getString("luogo"));
                
                sessioni.add(sessione);
            }
            
        return sessioni;
            
        } catch(SQLException e){
            Logger.getLogger(SessioneFactory.class.getName()).
                    log(Level.SEVERE, null, e);
        } finally{
            try{ set.close(); } catch (Exception e) {} 
            try{ stmt.close(); } catch (Exception e) {} 
            try{ conn.close(); } catch (Exception e) {} 
          }
            
        return null;
    }
    
    
}
