/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avis.exceptions;

/**
 *
 * @author fpw
 */
public class InvalidParamException extends Exception{
    
    /**
     *
     * @param string
     */
    public InvalidParamException(String errorMessage){
        super(errorMessage);
    }
}
