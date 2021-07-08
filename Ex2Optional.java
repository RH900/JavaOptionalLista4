/*
Utilizando os conceitos de optional da videoaula, use os métodos abordados para 
fazer este exercício. Crie um programa que: 
a) Crie uma variável sem valor usando Optional 
b) Crie uma variável com valor usando Optional 
    • Testar as duas variáveis. 
    • Usar orElseThrow para lançar a exceção no caso da variável vazia 
    • Usar orElseThrow para mostrar conteúdo da variável não vazia 
    • Mostre o resultado das duas situações


*/


package lista4ex2;

import java.util.Optional;


public class Lista4Ex2 {

    
    public static void main(String[] args) {
        
        
          Optional<String> op = Optional.empty();
          Optional<String> op2 = Optional.of("Hello World !");
          
          System.out.println(""+op2.orElseThrow( () -> new NullPointerException("Valor vazio")));      
           System.out.println(""+op.orElseThrow( () -> new NullPointerException("Valor vazio")));
              
        
        
        
    }
    
}
