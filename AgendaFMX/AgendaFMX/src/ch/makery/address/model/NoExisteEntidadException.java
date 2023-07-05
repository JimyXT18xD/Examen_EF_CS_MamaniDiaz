/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.makery.address.model;

import javax.persistence.EntityNotFoundException;

/**
 *
 * @author Jimy Moises
 */
class NoExisteEntidadException extends Exception {

    NoExisteEntidadException(String par, EntityNotFoundException enfe) {
    }
    
}
