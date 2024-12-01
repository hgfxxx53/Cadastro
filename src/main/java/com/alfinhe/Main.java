package com.alfinhe;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Buscar usuário por email");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    Usuario usuario = new Usuario(nome, email, senha);
                    cadastro.adicionarUsuario(usuario);
                    break;
                case 2:
                    cadastro.listarUsuarios();
                    break;
                case 3:
                    System.out.print("Digite o email do usuário: ");
                    String emailBusca = scanner.nextLine();
                    Usuario usuarioEncontrado = cadastro.buscarUsuarioPorEmail(emailBusca);
                    if (usuarioEncontrado != null) {
                        System.out.println("Usuário encontrado:");
                        System.out.println("Nome: " + usuarioEncontrado.getNome());
                        System.out.println("Email: " + usuarioEncontrado.getEmail());
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

