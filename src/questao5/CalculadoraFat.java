/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao5;

public class CalculadoraFat extends Thread{
    
    int valor;
    
    Operacao op = new Operacao();

    public CalculadoraFat(int valor) {
        
        this.valor = valor;
        
    }
    
    
    

    public void run(){
        
        double result;
        
        result = op.fatorial(this.valor);
        
        System.out.println("Fatorial de " + this.valor + " é " + result);
        

        
    }
    
    
    
    
    
}
