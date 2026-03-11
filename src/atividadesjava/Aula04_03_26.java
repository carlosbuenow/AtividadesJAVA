package atividadesjava;

import java.util.Scanner;
public class Aula04_03_26 {
    public static void Aula04() {
    
        Scanner input = new Scanner(System.in);
        
            System.out.println("-----------EXERCICIO 1-----------");
            float kwh;
            System.out.println("Informe o consumo mensal de energia em kWh: ");
            kwh = input.nextFloat();
            if(kwh <= 50){
                System.out.println("O valor total a pagar: " + kwh*0.20);
            }else if(kwh >= 51 && kwh <= 150){
                System.out.println("O valor total a pagar: " + kwh*0.25);
            }else if(kwh >=151 && kwh <=300){
                System.out.println("O valor total a pagar: " + kwh*0.30);
            }else if(kwh > 300){
                System.out.println("O valor total a pagar: " + kwh*0.40);
            };
            System.out.println("-----------EXERCICIO 2-----------");
            double n1, n2, n3;
            System.out.println("Digite o primeiro número: ");
            n1 = input.nextDouble();
            System.out.println("Digire o segundo número: ");
            n2 = input.nextDouble();
            System.out.println("Digite o terceiro número: ");
            n3 = input.nextDouble();
            if(n1 == 0 || n2 == 0 || n3 == 0){
                System.out.println("Não é um triângulo.");
            }else if(n1 == n2 && n2 == n3){
                System.out.println("É um triângulo Equilátero.");
            }else if(n1 == n2 && n2 != n3 || n1 == n3 && n3 != n2 || n2 == n1 && n1 !=n3 || n2 == n3 && n3 != n1 || n3 == n1 && n1 != n2 || n3 == n2 && n2 !=n1){
                System.out.println("É um triângulo Isósceles.");
            }else if(n1 != n2 && n2 != n3 && n1 != n3){
                System.out.println("É um triângulo Escaleno.");
            }
            System.out.println("-----------EXERCICIO 3-----------");
            double peso, altura, imc;
            System.out.println("Digite seu peso: ");
            peso = input.nextDouble();
            System.out.println("Digite sua altura: ");
            altura = input.nextDouble();
            imc = peso / (altura*altura);
            if(imc <= 18.5){
            System.out.println("O seu IMC é: " + imc + " - Abaixo do peso");
            }else if(imc >= 18.5 && imc <=24.9){
            System.out.println("O seu IMC é: " + imc + " - Peso normal");
            }else if(imc >=25.0 && imc <=29.9){
            System.out.println("O seu IMC é: " + imc + " - Sobrepeso");
            }else if(imc >=30.0 && imc <=34.9){
            System.out.println("O seu IMC é: " + imc + " - Obesidade Grau I");
            }else if(imc >=35.0 && imc <=39.9){
            System.out.println("O seu IMC é: " + imc + " - Obesidade Grau II");
            }else if(imc >=40.0){
            System.out.println("O seu IMC é: " + imc + " - Obesidade Grau III");
            }
            System.out.println("O seu IMC é: " + imc);
            System.out.println("-----------EXERCICIO 4-----------");
            String modelo;
            double eixo,c1,c2,c3,c4;
            System.out.println("Digite o tipo de veículo (Caminhonete, Carro de passeio, Ônibus, Caminhão):");
            modelo = input.next();
            System.out.println("Informe quantos eixos possue: ");
            eixo = input.nextDouble();
            if(modelo.equalsIgnoreCase("Carro de passeio")){
                System.out.println("O valor do pedágio é: R$ 10,00 " );
            }else if(modelo.equalsIgnoreCase("Caminhonete")){
                System.out.println("O valor do pedágio é: R$ 15,00 ");
            }else if(modelo.equalsIgnoreCase("Ônibus") || modelo.equalsIgnoreCase("Onibus")){
                System.out.println("O valor do pedágio é: R$ " + eixo*5.00);
            }else if(modelo.equalsIgnoreCase("Caminhão")){
                System.out.println("O valor do pedágio é: R$ " + eixo*8.00);
            }
            
}
}
