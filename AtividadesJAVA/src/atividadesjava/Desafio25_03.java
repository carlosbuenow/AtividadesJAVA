
package atividadesjava;

import java.util.Scanner;

public class Desafio25_03 {
    public static void Desafio(){
        Scanner input = new Scanner(System.in);
        int temperatura, umidade, chuva;
        
        
//        O programa deverá solicitar as seguintes informações:
//•	Temperatura atual (em °C) 
//•	Umidade do ar (em %) 
//•	Se houve registro de chuva nos últimos dias (Digite 1 para SIM e 0 para NÃO) 
//Após receber os dados, o algoritmo deverá analisar as condições e informar o nível de risco de queimadas, conforme as regras estabelecidas.
//________________________________________
//⚙️ Regras de Negócio
//Utilize estruturas condicionais (if e else) para classificar o risco:
//•	🔴 Risco Alto 
//o	Temperatura maior que 35°C 
//o	Umidade menor que 30% 
//o	Não houve chuva 
//•	🟡 Risco Médio 
//o	Temperatura entre 30°C e 35°C 
//o	Umidade entre 30% e 50% 
//o	Ou ausência de chuva 
//•	🟢 Risco Baixo 
//o	Temperatura menor que 30°C 
//o	Umidade maior que 50% 
//o	Houve chuva 

        System.out.println("Informe a temperatura atual: ");
        temperatura = input.nextInt();
        System.out.println("Informe a umidade atual: ");
        umidade = input.nextInt();
        System.out.println("Houve chuva recentemente? (1 Para Sim e 0 Para Não)");
        chuva = input.nextInt();
        if(temperatura < 30 || umidade > 50 || chuva == 0){
            System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Umidade: " + umidade + "%");
            System.out.println("Chuva recente: " + chuva);
            System.out.println("Classificação atual: RISCO BAIXO DE QUEIMADAS");
        }else if(temperatura >= 30 && temperatura <= 35 && umidade >= 30 && umidade <=50 && chuva == 1){
             System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Umidade: " + umidade + "%");
            System.out.println("Chuva recente: " + chuva);
            System.out.println("Classificação atual: RISCO MÉDIO DE QUEIMADAS");
        }else if(temperatura > 35 && umidade < 30 && chuva == 1){
             System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Umidade: " + umidade + "%");
            System.out.println("Chuva recente: " + chuva);
            System.out.println("Classificação atual: RISCO ALTO DE QUEIMADAS");
        }
    }
}
