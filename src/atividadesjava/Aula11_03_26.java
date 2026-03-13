package atividadesjava;

import java.util.Scanner;

public class Aula11_03_26 {
    public static void Aula11(){
        Scanner input = new Scanner(System.in);
//    System.out.println("-------------EXERCICIO 1--------------");
//    double velvia,velcar,vel10,vel11,vel39,vel40;
//    System.out.println("Qual é a velocidade permitida na via? ");
//    velvia = input.nextDouble();
//    System.out.println("Informe a velocidade que o carro está no momento: ");
//    velcar = input.nextDouble();
//    vel10 = velvia + 10;
//    vel11 = velvia + 11;
//    vel39 = velvia + 39;
//    vel40 = velvia + 40;
//    if(vel10 <= velcar && vel11 > velcar){
//        System.out.println("Multa de R$80,00");
//    }else if(velcar >= vel11 && velcar <= vel39){
//    System.out.println("Multa de R$120,00");
//    }else if(velcar >= vel40 ){
//    System.out.println("Multa de R$200,00");
//    }else if(velvia >= velcar){
//    System.out.println("Está dentro da velocidade permitida");
//    }
//    System.out.println("-------------EXERCICIO 2--------------");
//    
//    int valor;
//    System.out.println("1. Avança para primeira pergunta");
//    System.out.println("2. Avança para a segunda pergunta");
//    System.out.println("3. Avança para a terceira pergunta");
//    System.out.println("4. Avança para a quarta pergunta");
//    valor = input.nextInt();
//    switch(valor){
//        
//        case 1:
//            double resp1;
//            System.out.println("Quanto é 10 + 10?");
//            
//            resp1 = input.nextDouble();
//            if(resp1 == 10){
//            System.out.println("Resposta correta");
//            }else if(resp1 != 10){
//            System.out.println("Resposta errada");
//            }
//            break;
//        case 2:
//            double resp2;
//            System.out.println("Quanto é 25 + 25?");
//            resp2 = input.nextDouble();
//            if(resp2 == 50){
//            System.out.println("Resposta correta");
//            }else if(resp2 != 50){
//            System.out.println("Resposta errada");
//            }
//            break;
//        case 3:
//            double resp3;
//            System.out.println("Sucessor de 74");
//            resp3 = input.nextDouble();
//            if(resp3 == 75){
//            System.out.println("Resposta correta");
//            }else if(resp3 != 75){
//            System.out.println("Resposta errada");
//            }
//            break;
//        case 4:
//            double resp4;
//            System.out.println("Sucessor de 99");
//            resp4 = input.nextDouble();
//            if(resp4 == 100){
//            System.out.println("Resposta correta");
//            }else if(resp4 != 100){
//            System.out.println("Resposta errada");
//            }
//            break;
//        default: 
//            System.out.println("Número diferente de 1, 2, 3 e 4");
//            }
//    System.out.println("-------------EXERCICIO 3--------------");
//    double idade;
//    System.out.println("Informe a sua idade: ");
//    idade = input.nextDouble();
//    if(idade <= 10 && idade < 11 && idade > 0){
//    System.out.println("1 Até 10 Anos - INFANTIL");
//    }else if(idade >=11 && idade < 14){
//    System.out.println("11 Até 13 Anos - INFANTO-JUVENIL");
//    }else if(idade >=14 && idade < 18){
//    System.out.println("14 Até 17 Anos - PRE-ADOLESCENTE");
//    }else if(idade >= 18){
//    System.out.println("Acima de 18 - ADULTO");
//    }
//    System.out.println("-------------EXERCICIO 4--------------");
//    double salario;
//    System.out.println("Informe o seu salário: ");
//    salario = input.nextFloat();
//    if(salario < 1903.98){
//    System.out.println("Salário até R$ 1.903,98: Isento");
//    }else if(salario >= 1903.99 && salario  <= 2826.65){
//    System.out.println("Salário de R$ 1.903,99 até R$ 2.826,65: 7,5%");
//    }else if(salario >= 2826.66 && salario <= 3751.05){
//    System.out.println("Salário de R$ 2.826,66 a R$ 3.751,05: 15%");
//    }else if(salario  >= 3751.06 && salario <= 4664.68){
//    System.out.println("Salario de R$ 3.751,06 a R$ 4.664,68: 22,5%");
//    }else if(salario > 4664.68){
//    System.out.println("Salário acima de R$ 4.664,68: 27,5%");
//    }
//    System.out.println("-------------EXERCICIO 5--------------");
//    int idadeemprestimo;
//    float rendaminima, tempotrabalho;
//    String resp;
//    System.out.println("Informe a sua idade: ");
//    idadeemprestimo = input.nextInt();
//    System.out.println("Infomre a sua renda mínima: ");
//    rendaminima = input.nextFloat();
//    System.out.println("Informe quanto tempo está trabalhando: ");
//    tempotrabalho = input.nextFloat();
//    System.out.println("Seu nome está negativado? (Sim ou Não)");
//    resp = input.next();
//    if(idadeemprestimo < 21 || idadeemprestimo >65 || rendaminima <=2499 || resp.equalsIgnoreCase("Sim")){
//       System.out.println("Empréstimo negado por não cumprir com os requisitos");
//    }else if(idadeemprestimo >=21 && rendaminima >=5000 && resp.equalsIgnoreCase("Sim")|| idadeemprestimo <=65 && rendaminima >=5000 && resp.equalsIgnoreCase("Sim") || idadeemprestimo >=21 && rendaminima >=2500 && tempotrabalho >= 2 && resp.equalsIgnoreCase("Sim") || idadeemprestimo <=65 && rendaminima >=2500 && tempotrabalho >= 2 && resp.equalsIgnoreCase("Sim") || idadeemprestimo >=21 && rendaminima >=2500 && tempotrabalho < 2 && resp.equalsIgnoreCase("Nao") || idadeemprestimo <=65 && rendaminima >=2500 && tempotrabalho < 2 && resp.equalsIgnoreCase("Nao")){
//       System.out.println("Emprestimo negado por não cumprir com os requisititos");
//    }else if(idadeemprestimo >=21 && rendaminima >=5000 && resp.equalsIgnoreCase("Nao") || idadeemprestimo <=65 && rendaminima >=5000 && resp.equalsIgnoreCase("Nao") || idadeemprestimo >=21 && rendaminima >=2500 && tempotrabalho >= 2 && resp.equalsIgnoreCase("Nao") || idadeemprestimo <=65 && rendaminima >=2500 && tempotrabalho >= 2 && resp.equalsIgnoreCase("Nao") ){
//       System.out.println("O emprestimo foi aprovado com sucesso!");
//    }
//      System.out.println("-------------EXERCICIO 6--------------");
//      double nota1, nota2, nota3, presenca, media;
//      System.out.println("Informe a primeira nota: ");
//      nota1 = input.nextDouble();
//      System.out.println("Informe a segunda nota: ");
//      nota2 = input.nextDouble();
//      System.out.println("Informe a terceira nota: ");
//      nota3 = input.nextDouble();
//      System.out.println("Informe a presença sem %: ");
//      presenca = input.nextDouble();
//      media = (nota1 + nota2 + nota3) / 3;
//      if(media < 5 || presenca < 75){
//          System.out.println("Media: " + media + " e " + "Presença: " + presenca + "% | " + " O aluno está reprovado!");
//      }else if(media >= 5 && media < 7 && presenca >= 75){
//          System.out.println("Media: " + media + " e " + "Presença: " + presenca + "% | " + " O aluno está em recuperação!");
//      }else if(media > 7 && presenca >= 75){
//          System.out.println("Media: " + media + " e " + "Presença: " + presenca + "% | " + " O aluno está aprovado!");
//      }else if(media == 10 && presenca == 100){
//          System.out.println("Media: " + media + " e " + "Presença: " + presenca + "% | " + " O aluno está aprovado com distinção!");
//      }
//        System.out.println("-------------EXERCICIO 7--------------");
//        float valorcompra;
//        int parcela;
//        String vip;
//        System.out.println("Qual é o valor total da compra?");
//        valorcompra = input.nextFloat();
//        System.out.println("Você é um cliente Vip? (S/N)");
//        vip = input.next();
//        System.out.println("Qual a forma de pagamento? (1 - Á vista / 2 - Parcelado: ");
//        parcela = input.nextInt();
//        switch(parcela){
//            case 1:
//                
//                if(vip.equalsIgnoreCase("S")){
//                    System.out.println("20% de Desconto");
//                }else if(vip.equalsIgnoreCase("N") && valorcompra > 500){
//                    System.out.println("15% de Desconto");
//                }else if(vip.equalsIgnoreCase("N") && valorcompra <= 500){
//                    System.out.println("Sem desconto");
//                }
//                
//                break;
//                
//            case 2: 
//                
//                if(vip.equalsIgnoreCase("S")){
//                    System.out.println("10% de Desconto");
//                }else if(vip.equalsIgnoreCase("N") && valorcompra > 500){
//                    System.out.println("5% de Desconto");
//                }else if(vip.equalsIgnoreCase("N") && valorcompra <= 500){
//                    System.out.println("Sem desconto");
//                }
//            case 3:
//                
//            default:
//                
//                System.out.println("Utilize o número 1 - Á vista / Utilize o número 2 - Parcelado");
//                break;
//        }
       System.out.println("-------------EXERCICIO 8--------------");
       String cargo, dia;
       int horario;
       System.out.println("Qual é o seu cargo? ");
       cargo = input.next();
       System.out.println("Digite o horário atual (0-23)");
       horario = input.nextInt();
       System.out.println("Informe o dia da semana de forma extensa (Ex: Segunda)");
       dia = input.next();
       if(cargo.equalsIgnoreCase("Funcionário") && dia.equalsIgnoreCase("Sábado") || cargo.equalsIgnoreCase("Funcionário") && horario < 8 || cargo.equalsIgnoreCase("Funcionário") && horario > 18|| cargo.equalsIgnoreCase("Funcionario") && horario < 8 || cargo.equalsIgnoreCase("Funcionario") && horario > 18 || cargo.equalsIgnoreCase("Funcionário") && dia.equalsIgnoreCase("Sabado")||cargo.equalsIgnoreCase("Funcionário") && dia.equalsIgnoreCase("Domingo")|| cargo.equalsIgnoreCase("Funcionario") && dia.equalsIgnoreCase("Sábado")|| cargo.equalsIgnoreCase("Funcionario") && dia.equalsIgnoreCase("Sabado") || cargo.equalsIgnoreCase("Funcionario") && dia.equalsIgnoreCase("Domingo")){
          System.out.println("Olá Colaborador, acesso negado por estar fora do horário e/ou dia útil!");
       }else if(cargo.equalsIgnoreCase("Supervisor") && horario < 6 || cargo.equalsIgnoreCase("Supervisor") && horario > 22){
          System.out.println("Olá Supervisor, acesso negado por estar fora do horário!");
       }else if(cargo.equalsIgnoreCase("Gerente")){
          System.out.println("Olá Gerente, acesso total liberado!");
       }else if(cargo.equalsIgnoreCase("Funcionário") || cargo.equalsIgnoreCase("Funcionario")){
          System.out.println("Olá Colaborador, acesso das 8h às 18h");
       }else if(cargo.equalsIgnoreCase("Supervisor")){
          System.out.println("Olá Supervisor, acesso liberado das 6h às 19h");
       }
  }
}


