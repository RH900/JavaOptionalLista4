/*

Crie uma variável sem valor usando Optional. para optional vazio implemente: 
• Teste: se o optional vazio obter a string usando orElse 
• Mostrar resultado 
• Teste: se o optional a vazio obter a string usando orElseGet 
• Mostrar resultado

*/





package lista4ex1;

import java.util.Optional;



public class Lista4Ex1 {

    
    public static void main(String[] args) {
        


        Optional<String> op = Optional.ofNullable(null);
                System.out.println(""+op.orElse(op.get()));
                 System.out.println(""+op.orElseGet( () -> op.get()));
        
                 
                         
    }
    
}
