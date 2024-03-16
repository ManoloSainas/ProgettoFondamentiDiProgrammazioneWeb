/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avis.utils;

import avis.exceptions.InvalidParamException;
import java.time.LocalDate;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author fpw
 */
public class Utils {
    
    /**
     *
     * @param param
     * @throws InvalidParamException
     */
    public static void checkEmptyString(String param) throws InvalidParamException{
        
        if(param == null)
            throw new InvalidParamException("Parametro nullo");
        
    }
    
    /**
     *
     * @param param
     * @param min
     * @param max
     * @throws InvalidParamException
     */
    public static void checkString(String param, int min, int max) throws InvalidParamException{
        
        if(param == null)
            throw new InvalidParamException("Parametro nullo");
        
        if(param.length() < min || param.length() > max)
            throw new InvalidParamException("Stringa non valida: "
                    + "deve avere una dimensione compresa tra "
                    + min + " e " + max + " caratteri.");
    }
    
    /**
     *
     * @param param
     * @param min
     * @param max
     * @throws InvalidParamException
     */
    public static void checkInteger(String param, int min, int max) throws InvalidParamException{
    
        try{
            int valore = Integer.valueOf(param);
            if(valore<min || valore>max)
                throw new InvalidParamException("Numero non valido: "
                        + "deve essere compreso tra " + min + " e " + max);
        } catch(NumberFormatException e){
            throw new InvalidParamException("La stringa non rappresenta un numero intero");
        }
    }
    
    /**
     *
     * @param param
     * @param param2
     * @throws InvalidParamException
     */
    public static void uguale(String param, String param2) throws InvalidParamException{
    
        if(param == null || param2 ==null)
            throw new InvalidParamException("Parametro nullo");
        
        if(!param.equals(param2))
            throw new InvalidParamException("Le due password devono essere identiche");
    }
    
    /**
     *
     * @param param
     * @throws InvalidParamException
     */
    public static void checkCodiceFiscale(String param) throws InvalidParamException{
        
        String regex = "^[a-zA-Z]{6}[0-9]{2}[a-zA-Z][0-9]{2}[a-zA-Z][0-9]{3}[a-zA-Z]$";
        
        if (!Pattern.matches(regex, param))
                throw new InvalidParamException("Inserisci un codice fiscale corretto");
        
    }
    
    /**
     *
     * @param param
     * @throws InvalidParamException
     */
    public static void checkEmail(String param) throws InvalidParamException{
        
        String regex = "^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}$";
        
        if (!Pattern.matches(regex, param))
                throw new InvalidParamException("Inserisci un'email corretta");
        
    }
    
    /**
     *
     * @param param
     * @throws InvalidParamException
     */
    public static void checkTelefono(String param) throws InvalidParamException{
        
     //   String regex = "^[0-9]{9,11}]$";
        
        if (!param.matches("^[0-9]{9,10}$"))
                throw new InvalidParamException("Inserisci un numero di telefono corretto");
        
    }
    
    /**
     *
     * @param time
     * @return
     */
    public static String convertTime(long time){
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("UTC"));
        cal.setTimeInMillis(time);
        return (cal.get(Calendar.YEAR) + "_" + (cal.get(Calendar.MONTH) + 1) + "_" 
                + cal.get(Calendar.DAY_OF_MONTH) + " " + cal.get(Calendar.HOUR_OF_DAY) + ":"
                + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
    }
    
    /**
     *
     * @param param
     * @throws InvalidParamException
     */
    public static void checkDate(String param) throws InvalidParamException{
        
        String regex = "^([1952-2004]{1}-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$";
        
        if (!Pattern.matches(regex, param))
                throw new InvalidParamException("Inserisci una data di nascita valida "
                        + "(l'età ");
        
    }
}