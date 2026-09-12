import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean parar = true;
        Hotel hotel = new Hotel();
        int numero;

        while (parar){
            System.out.println("==========================");
            System.out.println("     Sistema de Hotel     ");
            System.out.println("==========================");

            System.out.println("{1} - Cadastrar quarto");
            System.out.println("{2} - Listar quartos");
            System.out.println("{3} - Reservar quarto");
            System.out.println("{4} - Cancelar quarto");
            System.out.println("{0} - Sair");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("digite o número do quarto: ");
                    numero = scanner.nextInt();

                    System.out.println("Escolha o tipo do quarto: ");
                    System.out.println("[1] - Simples");
                    System.out.println("[2] - Duplo");
                    System.out.println("[3] - Luxo");

                    int tipoOpcao = scanner.nextInt();
                    String tipo = "";

                    if (tipoOpcao == 1){
                        tipo = "Simples";
                    } else if (tipoOpcao == 2) {
                       tipo = "Duplo";
                    } else if (tipoOpcao == 3) {
                        tipo = "Luxo";
                    } else {
                        System.out.println("Opção inválida");
                        System.out.println("Tente cadastrar novamente");
                        continue;
                    }

                    Quarto q = new Quarto(numero, tipo);
                    hotel.adicionarQuarto(q);
                    break;
                case 2:
                    hotel.listarQuarto();
                    break;
                case 3:
                    System.out.println("Digite o número do quarto: ");
                    numero = scanner.nextInt();
                    hotel.reservarQuarto(numero);
                    break;
                case 4:
                    System.out.println("Digite o número do quarto: ");
                    numero = scanner.nextInt();
                    hotel.cancelarReserva(numero);
                    break;
                case 0:
                    System.out.println("Programa finalizando...");
                    parar = false;
                    break;
            }
        }

    }
}