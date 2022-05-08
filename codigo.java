//fase 6


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String resp1 = "";
    String resp2 = "";
    String resp3 = "";
    String resp4 = "";
    String resp5 = "";
    String resp6 = "";
    int numTentativas = 0;

  //desafio 1
System.out.println("Parabéns, você conseguiu superar todos os desafios! Harry e seu amigo Cedrico chegam em Little Hangleton. Mas... espere.. Aquele não é o... RABICHO? E ele está estranho... Ele foi enfeitiçado pelo Valdemort e está usando um feitiço contra seu amigo! Você pode:");


//repetição das perguntas até aparecer a certa (resp A)
    do {
    System.out.println("A - Se esconder e esperar Rabicho utilizar o feitiço da Maldição da morte");

    System.out.println("B - Utilizar um feitiço contra Rabicho");

    System.out.println("C - Se esconder de Rabicho ");

    System.out.println("D - Correr em direção ao Rabicho e tirar a varinha mágica dele");
    resp1 = sc.next();

//respostas possíveis
      switch (resp1){
          case "A":
          System.out.println("Resposta certa");
          break;
          case "a":
          System.out.println("Resposta certa");
          break;
          case "B":
          System.out.println("Resposta errada");
          break;
          case "b":
          System.out.println("Resposta errada");
          break;
          case "C":
          System.out.println("Resposta errada");
          break;
          case "c":
          System.out.println("Resposta errada");
          break;
          case "D":
          System.out.println("Resposta errada");
          break;
          case "d":
          System.out.println("Resposta errada");
          default:
          System.out.println("Resposta inválida");
        }
// caso as respostas estejam erradas, irá aumentar o numero de tentativas
          if (resp1.equalsIgnoreCase("B") || 
              resp1.equalsIgnoreCase("C") || 
              resp1.equalsIgnoreCase("D")){
              numTentativas ++;
            }
      
// condição para que o jogador perca 
           if (numTentativas == 3){
           System.out.println("Você perdeu");
            } else {
           System.out.println(numTentativas);
        }

//condição para repetir o codigo caso a resposta colocada não seja a certa
        } while (!resp1.equalsIgnoreCase("A") || !resp1.equalsIgnoreCase("a") && numTentativas < 3);

//desafio 2	  
System.out.println("Infelizmente essa opção acabou matando Cedrico... E você foi preso pelo Rabicho no túmulo de Tom Riddle Sr. E agora para que você consiga escapar do tumulo? O que deverá ser feito?");
  
// repetição das perguntas até colocar a certa
        do {
  
      System.out.println("A - Cavar por dentro do tumulo onde está, saindo assim dentro de uma passagem secreta.");
  
      System.out.println("B - Aceitar que o Rabicho colete o seu sangue, um osso desenterrado do túmulo do Riddle e uma de suas próprias mãos");
  
      System.out.println("C - Utilizar um feitiço para que se teletransporte para outro lugar");
  
      System.out.println("D - Esperar Rabicho aparecer, jogá-lo dentro do túmulo e trancar ele lá dentro");
      resp2 = sc.next();
  
//respostas possiveis (certa B)
    switch (resp2) {
         case "A":
            System.out.println("Resposta errada");
            break;
         case "a":
            System.out.println("Resposta errada");
            break;
         case "B":
            System.out.println("Resposta certa");
            break;
         case "b":
            System.out.println("Resposta certa");
            break;
         case "C":
            System.out.println("Resposta Errada");
            break;
         case "c":
            System.out.println("Resposta errada");
            break;
         case "D":
            System.out.println("Resposta errada");
            break;
         case "d":
            System.out.println("Resposta errada");
            break;
            default:
            System.out.println("Resposta inválida");  
            }
  
// caso nao coloque a resp B, então numero de tentativas aumenta
        if (resp2.equalsIgnoreCase("A") || 
            resp2.equalsIgnoreCase("C") || 
            resp2.equalsIgnoreCase("D")){
            numTentativas ++ ; 
            }
  
// condição para que o jogador perca 
        if (numTentativas == 3){
            System.out.println("Você perdeu");
            } else {
            System.out.println(numTentativas);
            }

//condição para repetir o codigo caso a resposta colocada não seja a certa
        } while (resp2.equalsIgnoreCase("B") || resp2.equalsIgnoreCase("b") && numTentativas <3);
  
//Desafio 3
System.out.println("Oh não! Essa opção fez com que Valdemort tenha seu corpo regenerado! Ele agora está mais poderoso do que nunca! Valdemort pegou sua varinha e, através da Marca Negra no braço de Pettigrew, convocou os Comensais da Morte. Escolha suas ações:");

    
// repetição das perguntas até colocar a certa
   do{

   System.out.println("A - Ir para o norte do cemitério e tentar encontrar a saída");

   System.out.println("B - Continuar no mesmo local e enfrentar Valdemort");

   System.out.println("C - Ir para o sul do cemitério e seguir o caminho do rio para chegar a uma cabana e se esconder");

   System.out.println("D - Se juntar aos comensais da morte, afinal, você não conseguirá derrotá-los");
    resp3 = sc.next();

// possoveis respostas
    switch (resp3) {
         case "A":
           System.out.println("Resposta errada");
           break;
         case "a":
           System.out.println("Resposta errada");
           break;
         case "B":
           System.out.println("Resposta certa");
           break;
         case "b":
           System.out.println("Resposta certa");
           break;
         case "C":
           System.out.println("Resposta Errada");
           break;
         case "c":
           System.out.println("Resposta errada");
           break;
         case "D":
           System.out.println("Resposta errada");
           break;
         case "d":
           System.out.println("Resposta errada");
           break;
         default:
           System.out.println("Resposta inválida");
           
        }
     
// caso as respostas estejam erradas, irá aumentar o numero de tentativas
       if (resp3.equalsIgnoreCase("A") || 
           resp3.equalsIgnoreCase("C") || 
           resp3.equalsIgnoreCase("D")){
           numTentativas ++ ; }

// condição para que o jogador perca 
        if (numTentativas == 3){
           System.out.println("Você perdeu");
        } else {
           System.out.println(numTentativas);
        }

//condição para repetir o codigo caso a resposta colocada não seja a certa
       } while (resp3.equalsIgnoreCase("B") && numTentativas <3);

 //Desafio 4
 System.out.println("Sendo assim, Valdemort ordenou Rabicho a dar-lhe uma varinha, em seguida, deu início a um duelo. Ele ordenou que você se curve diante dele, o que você faz:");

    
 // repetição das perguntas até colocar a certa
    do{

    System.out.println(" A - Obedece o Valdemort afinal, está sendo controlado pelo feitiço");

    System.out.println("B - Não obedece os comandos do Valdemort pois você não o respeita como um mestre a ser seguido");

    System.out.println("C - Você lança um feitiço contra Valdemort, matando ele");

    System.out.println("D - Você sai correndo pelo cemitério para fugir dele e de todos os comensais da morte");
    resp4 = sc.next();

      switch (resp4) {
          case "A":
            System.out.println("Resposta Certa");
            break;
          case "a":
            System.out.println("Resposta Certa");
            break;
          case "B":
            System.out.println("Resposta Errada");
            break;
          case "b":
            System.out.println("Resposta Errada");
            break;
          case "C":
            System.out.println("Resposta Errada");
            break;
          case "c":
            System.out.println("Resposta errada");
            break;
          case "D":
            System.out.println("Resposta errada");
            break;
          case "d":
            System.out.println("Resposta errada");
            break;
          default:
            System.out.println("Resposta inválida");
            
        }

// caso as respostas estejam erradas, irá aumentar o numero de tentativas
        if (resp4.equalsIgnoreCase("B")|| 
           resp4.equalsIgnoreCase("C") || 
           resp4.equalsIgnoreCase("D")){
           numTentativas ++ ; }

// condição para que o jogador perca 
        if (numTentativas == 3){
        System.out.println("Você perdeu");
        } else {
        System.out.println(numTentativas);
        }
      
//condição para repetir o codigo caso a resposta colocada não seja a certa
        } while (resp4.equalsIgnoreCase("A") && numTentativas <3);
        
//Desafio 5
System.out.println("Sim... infelizmente você teve que obedecer aos comandos dele. Mas veja! Agora você é capaz de resistir ao feitiço desta vez. Surpreso com sua resistência para a Maldição, Voldemort disparou outro feitiço, e você sem pensar duas vezes:");
    
 // repetição das perguntas até colocar a certa
   do{

   System.out.println("A - Se escondeu atrás de uma pedra para desviar do feitiço");

   System.out.println("B - Se escondeu trás de uma estátua para desviar do feitiço");

   System.out.println("C - Bloqueia o feitiço com outro feitiço");

   System.out.println("D -  Foi atingido pelo feitiço e saiu rastejando tentando se esconde atrás de uma pedra");
  resp5 = sc.next();

     switch (resp5) {
         case "A":
           System.out.println("Resposta Certa");
           break;
         case "a":
           System.out.println("Resposta Certa");
           break;
         case "B":
           System.out.println("Resposta Errada");
           break;
         case "b":
           System.out.println("Resposta Errada");
           break;
         case "C":
           System.out.println("Resposta Errada");
           break;
         case "c":
           System.out.println("Resposta errada");
           break;
         case "D":
           System.out.println("Resposta errada");
           break;
         case "d":
           System.out.println("Resposta errada");
           break;
         default:
           System.out.println("Resposta inválida");
           
         }

// caso as respostas estejam erradas, irá aumentar o numero de tentativas
       if (resp5.equalsIgnoreCase("B") || 
           resp5.equalsIgnoreCase("C") || 
           resp5.equalsIgnoreCase("D")){
           numTentativas ++ ; }

// condição para que o jogador perca 
          if (numTentativas == 3){
            System.out.println("Você perdeu");
        } else {
           System.out.println(numTentativas);
        }

//condição para repetir o codigo caso a resposta colocada não seja a certa
       } while (resp5.equalsIgnoreCase("A") && numTentativas <3);

//Desafio 6
System.out.println("No entanto, você, percebendo que não havia nenhuma maneira de escapar, decidiu que, se ia morrer, iria morrer lutando, e não se encolhendo para longe e se escondendo. Com isso, você saiu de trás da pedra para enfrentar Voldemort. Vocês dois usaram dois feitiços ao mesmo tempo, Valdemort usou o Expelliarmus. Escolha seu feitiço:");
    
// repetição das perguntas até colocar a certa
   do{

   System.out.println("A - Imperius");

   System.out.println("B - Expelliarmus");

   System.out.println("C - Avada Kedavra");

   System.out.println("D - Leviosa");

  resp6 = sc.next();

     switch (resp6) {
         case "A":
           System.out.println("Resposta errada");
           break;
         case "a":
           System.out.println("Resposta errada");
           break;
         case "B":
           System.out.println("Resposta certa");
           break;
         case "b":
           System.out.println("Resposta certa");
           break;
         case "C":
           System.out.println("Resposta Errada");
           break;
         case "c":
           System.out.println("Resposta errada");
           break;
         case "D":
           System.out.println("Resposta errada");
           break;
         case "d":
           System.out.println("Resposta errada");
           break;
         default:
           System.out.println("Resposta inválida");
           
        }
     
// caso as respostas estejam erradas, irá aumentar o numero de tentativas
       if (resp6.equalsIgnoreCase("A") || 
           resp6.equalsIgnoreCase("C") || 
           resp6.equalsIgnoreCase("D")){
           numTentativas ++ ; }

// condição para que o jogador perca 
        if (numTentativas == 3){
           System.out.println("Você perdeu");
        } else {
           System.out.println(numTentativas);
        }

//condição para repetir o codigo caso a resposta colocada não seja a certa
       } while (resp6.equalsIgnoreCase("B") && numTentativas <3);

System.out.println("Após as varinhas colidirem e Harry conseguir o dominio dos feitiços, ele usou um Feitiço de Convocação para pegar a Chave de Portal e aparecer de volta a Hogwarts, segurando o cadáver de Diggory...");

System.out.println("Parabéns! Chegar aqui não foi uma tarefa fácil, mas você, como um fã de Harry Potter, foi fácil chegar até aqui!Obrigada por jogar e espero que tenha se divertido! ");

    
 }
}
}
}
