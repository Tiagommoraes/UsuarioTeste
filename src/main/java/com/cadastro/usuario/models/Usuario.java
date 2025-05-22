// package com.cadastro.usuario.models;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import java.util.Objects;
// @Entity
// public class Usuario {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     private String nome;
//     private String email;
//     // Construtor sem parâmetros
//     public Usuario() {
//     }
//     // Construtor com todos os campos
//     public Usuario(Long id, String nome, String email) {
//         this.id = id;
//         this.nome = nome;
//         this.email = email;
//     }
//     // Getters e Setters
//     public Long getId() {
//         return id;
//     }
//     public void setId(Long id) {
//         this.id = id;
//     }
//     public String getNome() {
//         return nome;
//     }
//     public void setNome(String nome) {
//         this.nome = nome;
//     }
//     public String getEmail() {
//         return email;
//     }
//     public void setEmail(String email) {
//         this.email = email;
//     }
//     // toString
//     @Override
//     public String toString() {
//         return "Usuario{" +
//                 "id=" + id +
//                 ", nome='" + nome + '\'' +
//                 ", email='" + email + '\'' +
//                 '}';
//     }
//     // equals e hashCode
//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         Usuario usuario = (Usuario) o;
//         return Objects.equals(id, usuario.id) &&
//                 Objects.equals(nome, usuario.nome) &&
//                 Objects.equals(email, usuario.email);
//     }
//     @Override
//     public int hashCode() {
//         return Objects.hash(id, nome, email);
//     }
// }
package com.cadastro.usuario.models;

import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id; 
import lombok.AllArgsConstructor; 
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 

public class Usuario {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 

    private String nome; 
    private String email; 
}