package com.app.medallium.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "datos_combate")
public class DatosCombate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_datosCombate;

    private int puntosVida;

    private int fuerza;

    private int defensa;

    private  int velocidad;

    private  String habilidad;

    public Long getId_datosCombate() {
        return id_datosCombate;
    }

    public void setId_datosCombate(Long id_datosCombate) {
        this.id_datosCombate = id_datosCombate;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
}
