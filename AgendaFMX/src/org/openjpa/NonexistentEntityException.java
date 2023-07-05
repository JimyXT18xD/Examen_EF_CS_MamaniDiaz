/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.openjpa;

import javax.persistence.EntityNotFoundException;

/**
 *
 * @author Jimy Moises
 */
class NonexistentEntityException extends Exception {

    NonexistentEntityException(String par, EntityNotFoundException enfe) {
    }
    
}
