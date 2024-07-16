package com.alura.forohubSpring.domain.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity(name="Usuario") //entidad JPA con el nombre 'Usuario'
@Table(name="usuarios")
@Getter //anotación de Lombok que genera automáticamente métodos "getter"
@NoArgsConstructor //anotación de Lombok para generar un constructor vacío: 'public Usuario() { }'
@AllArgsConstructor //anotación de Lombok para generar automáticamente un constructor que acepta un argumento para cada campo en la clase
@EqualsAndHashCode(of="id") //anotación de Lombok que genera automáticamente los métodos 'equals' y 'hashCode' para el campo 'id'
                            //Esto significa que dos instancias de Usuario se considerarán iguales si sus 'id' son iguales

public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String clave;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return clave;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }



    //Getters
    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getClave() {
        return clave;
    }
}
