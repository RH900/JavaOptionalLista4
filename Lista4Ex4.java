/*
    Reescreva o código do exercício anterior lançando direto uma exceção caso o 
    nome com “W” não exista (sem usar isPresent(), usando orElseThrow.
*/






package lista4ex4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class teste4 {

    
    public static void main(String[] args) {
      
        
        
          
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
//               .orElseThrow( () -> new IllegalArgumentException ("nada encontrado") );
               
      System.out.println(""+result.orElseThrow( () -> new NullPointerException("Valor vazio")));  
      //System.out.println(""+result.orElseThrow( () -> new  ("Valor vazio")));  
        //System.out.println(""+result.get());
      
       
//      if(result.isPresent()){
//          System.out.println("Existem nomes com W inicial ");
//          System.out.println(result);
//      }
//      else {
//          System.out.println("\n Nomes com esta letra nao consta na lista \n");
//      }
        
        
        
        
    }
    
}
