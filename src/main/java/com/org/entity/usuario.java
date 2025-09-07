
package com.org.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class usuario {

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuarios_sq")
   // @SequenceGenerator(schema = "sindidata", name = "usuarios_sq", sequenceName = "usuarios_sq", allocationSize = 1)
    private Long id;
    private String name;
    private Integer matriz;
    private String cpf;
    
    
    public usuario(Long id, String name, Integer matriz, String cpf){
        this.id = id;
        this.name = name;
        this.matriz = matriz;
        this.cpf = cpf;
    }

    // Construtor padrão (sem argumentos)
    public usuario() {}

    // Getters e setters manuais:
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getMatriz() {
        return matriz;
    }
    public void setMatriz(Integer matriz) {
        this.matriz = matriz;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
