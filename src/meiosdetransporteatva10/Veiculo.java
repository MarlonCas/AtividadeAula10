package meiosdetransporteatva10;

import javax.swing.JOptionPane;

/**
 *
 * @author dacas
 */
public class Veiculo {
    public String marca;
    public String modelo;
    public int qtdRodas;
    public int velocidade = 0;
    
    
    public Veiculo(){
        
    }
    
    public void setMarca(String marca){
       this.marca = marca;
     }
    
    public void setModelo(String modelo){
       this.modelo = modelo;
     }
    
    public void setQtdRodas(int qtdRodas){
       this.qtdRodas = qtdRodas;
     }
    
    public void setVelocidade(int velocidade){
       this.velocidade = velocidade;
     }
    
    
    public void imprimirInformacoes(){
        String texto = "Marca: " + this.marca + "\nModelo: " + this.modelo + 
    "\nQuantidade de Rodas: " + this.qtdRodas + "\nVelocidade: " + this.velocidade;
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public void acelerar(int valor){
        
    }
     
    public void frear(int valor){
        
    }
}

