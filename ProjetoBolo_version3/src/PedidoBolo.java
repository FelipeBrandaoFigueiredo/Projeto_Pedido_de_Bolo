import java.util.Scanner;

public class PedidoBolo {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        PedidoBoloAlg pedidoBolo = new PedidoBoloAlg();
        boolean confirm = true;

        // Introducão
        System.out.println("\n\u001B[33m" + "Olá!" + "\u001B[0m");

        System.out.println("\u001B[33m" + "Sou Edna, criadora da rede de bolos Edna Bolos, vamos fazer um pedido?"
                + "\u001B[0m\n");
        // Introducão

        // Tabela de preços
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- TABELA DE PREÇOS _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

        System.out.println("-Valor do Kg do bolo = R$60 ");

        System.out.println("-Valor do Topper (Adicional) = R$10");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- TABELA DE PREÇOS _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n\n");


        do {
            // Recheio do bolo
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- RECHEIO DO BOLO _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            System.out.println("\n-Qual será o recheio do bolo?\n");

            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- OPÇÕES DE RECHEIO _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

            //Recheios disponiveis
            pedidoBolo.imprimirRecheios();
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- OPÇÕES DE RECHEIO _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");



            System.out.print("Digite o código do recheio pretendido (Ex: 1 = Chocolate): ");
            pedidoBolo.imprimirRecheioEscolhido(pedidoBolo.recheioOpcao());
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- RECHEIO DO BOLO _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");


            //Sabor Massa
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- SABOR DA MASSA _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            System.out.println("Opções: ");
            System.out.println("(1) Branca\n(2) Chocolate\n(3) Pão de ló");
            System.out.print("Digite a opção conforme o código da massa: ");
            pedidoBolo.saborDaMassa();
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- SABOR DA MASSA _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

            // Quantidade de Kg
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- QUILOS _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            System.out.print("Qual a quantidade de Quilos o bolo terá? (Digite no formato 0,00).\nSua resposta: ");
            pedidoBolo.escolhaQuilos();
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- QUILOS _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            // Topper
            System.out.print("\nO bolo terá topper?\n(1) Sim\n(2) Não\nSua resposta: ");
            pedidoBolo.escolhaTopper();
            // Pedido
            System.out.println("Pedido criado! Segue o pedido montado por você.");
            pedidoBolo.pedidoInfo(pedidoBolo.recheioOpcao(), 60, 10);

            System.out.println("Deseja Confirmar/Cancelar/Refazer pedido?\n(1) Confirmar\n(2) Cancelar\n(3) Refazer\n");
            System.out.print("Sua resposta: ");
            int confirmPedido = input.nextInt();
            switch (confirmPedido) {
                case 1:
                    System.out.println("\nPedido confirmado, obrigado pela preferência!!\n");
                    break;
                case 2:
                    System.out.println("\nSinto muito por qualquer transtorno, ou dificuldade em montar o pedido... Mas agradecemos, volte sempre!");
                    break;
                case 3:
                    System.out.println("\nOkay, refaça seu pedido!\n");
            }
            if (confirmPedido == 3) {
                confirm = true;
            } else {
                confirm = false;
            }
        } while (confirm);
    }
}