package com.uci.Proyecto_Final.models;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name = "Compra")
@Getter
@Setter
@Builder
@AllArgsConstructor

@NoArgsConstructor

public class Compra implements Serializable {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")

    private int cantidad;
    private Date fecha_compra;
    private int tarjeta_bancaria;
    private int total_pagar;

}
