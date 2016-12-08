package questao5;

public class Operacao {
    
    public double fatorial(int valor){
        
        int fat = 1, i;
        
        double resultado;
        
        for(i = 2; i <= valor; i++){
            
            fat = fat * i;
            
            
        }
        
        resultado = fat;
        
        return resultado;

    }
    
    
    
    
    
    
    
    
    
}
