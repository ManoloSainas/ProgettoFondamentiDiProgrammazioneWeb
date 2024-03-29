/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avis.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fpw
 */
public class DatabaseManager {
    
    private static DatabaseManager instance;
    
    private DatabaseManager(){
        try{
            Class.forName("org.postgresql.Driver");
        }catch(ClassNotFoundException e){
            Logger.getLogger(DatabaseManager.class.getName())
                    .log(Level.SEVERE, null, e);
        }
    
    }

    /**
     *
     * @return
     */
    public static DatabaseManager getInstance(){
        if(instance == null)
           instance = new DatabaseManager();
        return instance;
    }

    /**
     *
     * @return
     */
    public Connection getDbConnection(){

        String db = "jdbc:postgresql://localhost:5432/Avis";
        String user = "fpw";
        String pass= "fondamenti";

        try{
            Connection conn = DriverManager.getConnection(db, user, pass);
            return conn;
        }catch(SQLException e){
            Logger.getLogger(DatabaseManager.class .getName())
                .log(Level.SEVERE, null, e);           
        }

        return null; 
    } 
}