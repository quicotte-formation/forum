/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpatest.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author tom
 */
@Embeddable
public class Adresse {

    @Column(length = 32)
    private String rue;
    private Integer numero;
    private Integer codePostal;
    private String ville;
    private String pays;
}
