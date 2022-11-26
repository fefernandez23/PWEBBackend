package com.uci.Proyecto_Final.models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Usuario")
@Getter
@Setter
@Builder
@AllArgsConstructor

@NoArgsConstructor



public class Usuario implements Serializable {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")

    private String nombre;
    private String apellidos;
    private int ci;
    private int no_apartamento;
    private int telefono;
    private String contrasenna;

    
}
