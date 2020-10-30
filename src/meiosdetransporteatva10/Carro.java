package meiosdetransporteatva10;

import javax.swing.JOptionPane;

/**
 *
 * @author dacas
 */
public abstract class Carro extends Automovel{
    public int qtdPortas;
    
    public Carro(){
        
    }
    
    public void setQtdPortas(int qtdPortas){
       this.qtdPortas = qtdPortas;
     }
    
    @Override
    public void imprimirInformacoes() {
         String texto = "Quantidade de Portas: "  + this.qtdPortas;
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
    
}
