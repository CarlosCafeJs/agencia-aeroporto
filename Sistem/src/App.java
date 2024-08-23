import entidade.Usuario;
import java.util.List;
import java.util.Scanner;
import AO.UsuarioAO;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        UsuarioAO usuarioAO = new UsuarioAO();
        boolean running = true;

        while (running) {
            System.out.println("MENU:");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Entrar (Login)");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir o restante da linha

            switch (escolha) {
                case 1:
                    // Cadastro de usuário
                    Usuario passageiro = new Usuario();
                    System.out.print("Nome: ");
                    passageiro.setNome(scanner.nextLine());
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    if (email.isEmpty()) {
                        System.out.println("O email não pode ser vazio.");
                        break;
                    }
                    passageiro.setEmail(email);
                    System.out.print("Senha: ");
                    passageiro.setSenha(scanner.nextLine());
                    System.out.print("Documento de Identificação: ");
                    passageiro.setDocumentoIdentificacao(scanner.nextLine());
                    System.out.print("RG: ");
                    passageiro.setRg(scanner.nextLine());
                    System.out.print("CPF: ");
                    passageiro.setCpf(scanner.nextLine());
                    System.out.print("Número do Passaporte: ");
                    passageiro.setNumeroPassaporte(scanner.nextLine());
                    System.out.print("Telefone de Contato: ");
                    passageiro.setTelefoneContato(scanner.nextLine());
                    System.out.print("Telefone de Emergência: ");
                    passageiro.setTelefoneEmergencia(scanner.nextLine());

                    usuarioAO.cadastrarUsuario(passageiro);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;

                case 2:
                    // Login do usuário
                    System.out.print("Email: ");
                    String loginEmail = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    // Simulação de verificação de login
                    List<Usuario> usuarios = usuarioAO.listarUsuarios();
                    boolean encontrou = false;

                    for (Usuario usuario : usuarios) {
                        if (usuario.getEmail().equals(loginEmail) && usuario.getSenha().equals(senha)) {
                            encontrou = true;
                            System.out.println("Login realizado com sucesso!");
                            System.out.println("Nome: " + usuario.getNome());
                            System.out.println("Documento de Identificação: " + usuario.getDocumentoIdentificacao());
                            System.out.println("RG: " + usuario.getRg());
                            System.out.println("CPF: " + usuario.getCpf());
                            System.out.println("Número do Passaporte: " + usuario.getNumeroPassaporte());
                            System.out.println("Telefone de Contato: " + usuario.getTelefoneContato());
                            System.out.println("Telefone de Emergência: " + usuario.getTelefoneEmergencia());
                            System.out.println("---------------");
                            break;
                        }
                    }

                    if (!encontrou) {
                        System.out.println("Usuário não encontrado ou senha incorreta.");
                    }
                    break;

                case 9:
                    running = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
