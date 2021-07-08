/*

 Utilizando os conceitos de optional da videoaula, use os métodos abordados para
fazer este exercício. 
    • crie uma lista (streams) contendo as informações da tabela abaixo: 

                                Nomes 
                                Paulo 
                                Camila 
                                Ana Maria 
                                Patrick 
                                Ana Clara 
                                Pedro 
                                Alfredo 

    • Pesquise nomes que começam com “W”
    • Caso não existam, mostre a mensagem “Nomes com esta letra não consta na 
    lista” – use .findAny() e .isPresent()

 */
package lista4ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class teste {

    
    public static void main(String[] args) {


//      List<Optional<String>> listOptionals = Arrays.asList(
//              Optional.of("Camila"),
//              Optional.empty(),
//              Optional.of("Paulo"),
//              Optional.empty(),
//              Optional.of("Patrick"),
//              Optional.empty(),
//              Optional.of("Ana Clara"),
//              Optional.empty(),
//              Optional.of("Pedro"),
//              Optional.empty(),
//              Optional.of("Alfredo")        
//              
//      );          
//      
       
      List<String> myList = Arrays.asList(
              "Camila",
              "Paulo",
              "Patrick",
              "Ana Clara",
              "Pedro",
              "Alfredo");
      
      
       Optional<String> result = myList
               .stream()
               .filter(name -> name.startsWith("W"))
               .findAny();
               
      if(result.isPresent()){
          System.out.println("Existem nomes com W inicial ");
          System.out.println(result);
      }
      else {
          System.out.println("\n Nomes com esta letra nao consta na lista \n");
      }
       
      
      
      
      
      
//             
//List<String> myList = listOptionals
//  .stream()
//  .map(Optional::get)
//  .findAny();


//System.out.println(myList);

    }  
}
