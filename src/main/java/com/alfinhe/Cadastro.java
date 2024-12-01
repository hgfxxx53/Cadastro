package com.alfinhe;


import java.util.ArrayList;
import java.util.List;

public class Cadastro {
        private List <Usuario> usuarios;

        public Cadastro() {
            this.usuarios = new ArrayList <> ();
        }

        public void adicionarUsuario(Usuario usuario) {
            usuarios.add(usuario);
            System.out.println("Usuário cadastrado com sucesso!");
        }

        public void listarUsuarios() {
            for (Usuario usuario : usuarios) {
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("Email: " + usuario.getEmail());
            }
        }

        public Usuario buscarUsuarioPorEmail(String email) {
            for (Usuario usuario : usuarios) {
                if (usuario.getEmail().equals(email)) {
                    return usuario;
                }
            }
            return null;
        }
    }
