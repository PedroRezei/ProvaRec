package com.fiec.ProvaRec.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Roupa {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
   private String Tamanho;

    private String cor;

    private double preco;

    private String modelo;

    private String id;
}
