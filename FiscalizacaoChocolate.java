import java.util.Scanner;

public class lista2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- SISTEMA DE FISCALIZAÇÃO PASCOA 2026 ---");
        System.out.println("Digite o percentual de cacau da amostra[%]: ");
        double teor = sc.nextDouble();

        // Primeira etapa de validação
        if (teor < 25.00) {
            System.out.println("Status: ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate'");
        } else if (teor >= 25.00 && teor < 35.00) {
            System.out.println("Status: Chocolate comum (Padrão Nacional Atual");
        } else {
            System.out.println("Status: Chocolate de Alta Qualidade (Padrão Internacional/UE");
        }

        // Segunda etapa de validação
        System.out.println("\nDigite o tipo de chocolate [AO_LEITE ou AMARGO]: ");
        String tipo = sc.next();

        System.out.println("Gramas de açúcar: ");
        int acucar = sc.nextInt();

            if (tipo.equalsIgnoreCase("AO_LEITE") && acucar > 15) {
                System.out.println("Status: Classificação: Doce de leite com cacau (Excesso de açúcar).");
            } else {
                System.out.println("Status: Classificação: Chocolate balanceado.");
            }
        System.out.println("-------------------------------------------");
        System.out.println("Digite o preço do ovo de Páscoa [R$]: ");
        double precoOvo = sc.nextDouble();

        System.out.println("Digite a nota de pureza [0 a 10]: ");
        int notaPureza = sc.nextInt();

        if (precoOvo > 100.00 || notaPureza < 5){
            System.out.println("REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões.");
        }
        else {
            System.out.println("APROVADO: Produto competitivo para o mercado externo.");
        }

        sc.close();
        }
    }