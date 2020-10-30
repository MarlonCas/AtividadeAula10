package meiosdetransporteatva10;

import javax.swing.JOptionPane;

/**
 *
 * @author dacas
 */
public class Bicicleta extends Veiculo {
    public int numMarchas;
    public boolean bagageiro;
    
    public Bicicleta(){
        
    }

    public void setNumMarchas(int numMarchas){
       this.numMarchas = numMarchas;
     }
    
    public void setBagageiro(boolean bagageiro){
       this.bagageiro = bagageiro;
     }
    
    @Override
    public void imprimirInformacoes() {
        String texto = "Número de marchas: " + this.numMarchas + 
                "\nPossui bagageiro: " + this.bagageiro;        
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
}

