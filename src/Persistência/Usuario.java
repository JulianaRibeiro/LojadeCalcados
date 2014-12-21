/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistência;

import java.util.ArrayList;

/**
 *
 * @author Juliana
 /** Classe que contém os métodos e atributos dos usuarios do sistema.*/
public class Usuario {

    private static ArrayList<Usuario> lista = new ArrayList<Usuario>();

    private static Usuario usuarioLogado = null;

    public static ArrayList<Usuario> getLista() {
        return lista;
    }

    public static void setLista(ArrayList<Usuario> lista) {
        Usuario.lista = lista;
    }

    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public static void setUsuarioLogado(Usuario usuarioLogado) {
        Usuario.usuarioLogado = usuarioLogado;
    }

    private String usuario;
    private String tipo;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
    private String senha;

}
