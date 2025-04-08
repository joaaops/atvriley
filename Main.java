import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        int alegria = 10;    
        int tristeza = 30;   

        // 1. Amizades
        System.out.println("Quantas amizades Riley fez?");
        int qtdAmizades = Integer.parseInt(scanner.nextLine()); 
        alegria += qtdAmizades * 10; 

        // 2. Notas das provas
        System.out.println("Nota da A1:");
        double a1 = Double.parseDouble(scanner.nextLine()); 

        System.out.println("Nota da A2:");
        double a2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Nota da A3:");
        double a3 = Double.parseDouble(scanner.nextLine());  

        double media = (a1 + a2 + a3) / 3; 

        if (media >= 7) {
            alegria += 50; 
        } else {
            tristeza += 50; 
        }

        // 3. Exercícios de programação
        System.out.print("Quantos exercícios de programação (de 10) a Riley fez? ");
        int feitos = Integer.parseInt(scanner.nextLine()); 

        alegria += feitos * 10;  
        tristeza += (10 - feitos) * 10; 

        // 4. Resultado final
        System.out.println("\nPontos de Alegria: " + alegria);
        System.out.println("Pontos de Tristeza: " + tristeza);

        
        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        scanner.close(); 
    }
}
