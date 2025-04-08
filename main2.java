import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int medo = 40;
        int esperanca = 0;
        int confianca = 0;
        int desanimo = 0;
        int determinacao = 0;
        int incerteza = 0;

        // Novos aliados
        System.out.println("Quantos novos aliados fizeram eles?");
        int qtdAliados = Integer.parseInt(scanner.nextLine());

        if (qtdAliados > 0) {
            esperanca += qtdAliados * 15;
        } else {
            medo += 40;
        }

        // Desafios de poder
        System.out.println("Pontuação obtida no Desafio 1 (0 a 10):");
        double d1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Pontuação obtida no Desafio 2 (0 a 10):");
        double d2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Pontuação obtida no Desafio 3 (0 a 10):");
        double d3 = Double.parseDouble(scanner.nextLine());

        double media = (d1 + d2 + d3) / 3;

        if (media >= 7) {
            confianca += 60;
        } else {
            desanimo += 60;
        }

        // Estratégias analisadas
        System.out.println("Quantas das 12 estratégias a equipe conseguiu analisar?");
        int estrategiasAnalisadas = Integer.parseInt(scanner.nextLine());

        if (estrategiasAnalisadas >= 0 && estrategiasAnalisadas <= 12) {
            determinacao += estrategiasAnalisadas * 10;
            incerteza += (12 - estrategiasAnalisadas) * 10;
        } else {
            System.out.println("Número inválido de estratégias. Deve ser entre 0 e 12.");
            return; // Encerra o programa se for inválido
        }

        // Resultados finais
        int totalPositivas = esperanca + confianca + determinacao;
        int totalNegativas = medo + desanimo + incerteza;

        System.out.println("\n--- Resultado das Emoções ---");
        System.out.println("Esperança: " + esperanca);
        System.out.println("Medo: " + medo);
        System.out.println("Confiança: " + confianca);
        System.out.println("Desânimo: " + desanimo);
        System.out.println("Determinação: " + determinacao);
        System.out.println("Incerteza: " + incerteza);

        System.out.println("\nTotal de Emoções Positivas: " + totalPositivas);
        System.out.println("Total de Emoções Negativas: " + totalNegativas);

        if (totalPositivas > totalNegativas) {
            System.out.println("\nO Shadow foi derrotado!");
        } else {
            System.out.println("\nO Shadow venceu o time do Sonic.");
        }
    }
}
