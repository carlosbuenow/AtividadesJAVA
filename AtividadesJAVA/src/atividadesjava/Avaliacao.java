package atividadesjava;
import java.util.Scanner;
public class Avaliacao{

    public static void Avaliacao() {
        Scanner input = new Scanner(System.in);
                
        int idade, valor = 0, tosse, febre, garganta, ar, coriza;
        String nome, sintoma, alergia;
        boolean g, t, obs1, obs2, obs3, a, c;
                
        //Pede as informações ao usuário//
        System.out.println("Informe o seu nome: ");
        nome = input.next();
        System.out.println("Digite a sua idade: ");
        idade = input.nextInt();
        System.out.println("Você está com febre? (1 - Sim / 0 - Não)");
        febre = input.nextInt();
        System.out.println("Você está com tosse? (1 - Sim / 0 - Não)");
        tosse = input.nextInt();
        System.out.println("Você está com dor de garganta? (1 - Sim / 0 - Não)");
        garganta = input.nextInt();
        System.out.println("Você está com coriza? (1 - Sim / 0 - Não)");
        coriza = input.nextInt();
        System.out.println("Você está com falta de ar? (1 - Sim / 0 - Não)");
        ar = input.nextInt();
        g = false; t = false; obs1 = false; obs2 = false; obs3 = false ; a = false; c = false;
        do{
            //Realiza uma vez e continua até o usuário digitar 4//
            System.out.println("Olá, " + nome);
            System.out.println(" ");
            System.out.println("1. Ver diagnóstico: ");
            System.out.println("2. Ver recomendações: ");
            System.out.println("3. Informar novos sintomas");
            System.out.println("4. Sair");
            valor = input.nextInt();
        
        switch(valor){
            case 1:
                    //Informa a situação do usuário//
                    System.out.println(" ");
                    System.out.println("Olá, " + nome);
                    System.out.println(" ");
                if(ar == 0 && coriza == 0 && tosse == 0){
                    System.out.println("Você deve ficar em observação");
                    System.out.println(" ");
                    obs1 = true;
                }else if(coriza == 1 && tosse == 1  && febre == 1){
                    System.out.println("Você deve ficar em observação");
                    System.out.println(" ");
                    obs2 = true;
                }else if(coriza == 1 && febre == 1){
                    System.out.println("Você deve ficar em observação");
                    System.out.println(" ");
                    obs3 = true;
                }else if(febre == 0 && coriza == 1 && tosse == 0){
                    alergia = "Você está com alergia";
                    System.out.println(alergia);
                    System.out.println(" ");
                    c = true;
                }else if(ar == 1){
                    System.out.println("Você está com uma situação grave");
                    System.out.println(" ");
                    a = true;
                }else if(coriza == 1 && tosse == 1 && febre == 0){
                    System.out.println("Você está com resfriado");
                    System.out.println(" ");
                    t = true;
                }else if(febre == 1 && tosse == 1 && garganta == 1){
                    System.out.println("Você está com gripe");
                    System.out.println(" ");
                    g = true;
            }
                break;
        
            case 2: 
                    //Realiza o diagnóstico//
                    System.out.println("Olá, " + nome);
                    System.out.println(" ");
                if(obs1 == true){
                        sintoma = "Beber bastante líquido";
                        System.out.println("Você não possui falta de ar, coriza e tosse. Deve: ");
                        System.out.println(sintoma);
                        System.out.println(" ");
                }else if(obs2 == true){
                        sintoma = "Procurar um médico";
                        System.out.println("Você está com coriza, tosse e febre. Deve: ");
                        System.out.println(sintoma);
                        System.out.println(" ");
                }else if(obs3 == true){
                        sintoma = "Procurar um médico";
                        System.out.println("Você está com coriza e febre. Deve: ");
                        System.out.println(sintoma);
                        System.out.println(" ");
                }else if(c == true){
                        sintoma = "Manter higiene";
                        System.out.println("Você está com coriza. Deve: ");
                        System.out.println(sintoma);
                        System.out.println(" ");
                }else if(a == true){
                        sintoma = "Procurar um médico";
                        System.out.println("Você está com falta de ar, deve: ");
                        System.out.println(sintoma);
                        System.out.println(" ");
                }else if(t == true){
                        sintoma = "Evitar locais fechados e beber bastante líquido";
                        System.out.println("Você está com coriza e tosse. Deve: ");
                        System.out.println(sintoma);
                        System.out.println(" ");
                }else if(g == true){
                        sintoma = "Procurar um médico e beber bastante líquido";
                        System.out.println("Você tem febre, tosse e dor de garganta. Deve: ");
                        System.out.println(sintoma);
                        System.out.println(" ");
                }
                    break;
        
            case 3:
                    //Atualiza os sintomas//
                    g = false; t = false; obs1 = false; obs2 = false; obs3 = false ; a = false; c = false;
                    System.out.println("Olá, " + nome);
                    System.out.println(" ");
                    System.out.println("Você está com febre? (1 - Sim / 0 - Não)");
                    febre = input.nextInt();
                    System.out.println("Você está com tosse? (1 - Sim / 0 - Não)");
                    tosse = input.nextInt();
                    System.out.println("Você está com dor de garganta? (1 - Sim / 0 - Não)");
                    garganta = input.nextInt();
                    System.out.println("Você está com coriza? (1 - Sim / 0 - Não)");
                    coriza = input.nextInt();
                    System.out.println("Você está com falta de ar? (1 - Sim / 0 - Não)");
                    ar = input.nextInt();
                    System.out.println(" ");
                        break;
            case 4: 
                  //Realiza a saída do sistema//   
                  System.out.println("Saindo.....");
                  break;
            default:
                    System.out.println("Opção inválida!");
                    break;
        }
        
        }while(valor !=4);
        
        
    }
    
}
