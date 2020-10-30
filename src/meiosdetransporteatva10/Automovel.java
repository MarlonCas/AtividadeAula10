package meiosdetransporteatva10;

import javax.swing.JOptionPane;

/**
 *
 * @author dacas
 */
public class Automovel extends Veiculo{
    public double potenciaDoMotor;
    
    public Automovel(){
        
    }
    
    public void setPotenciaDoMotor(double potenciaDoMotor){
       this.potenciaDoMotor = potenciaDoMotor;
     }

    @Override
    public void imprimirInformacoes() {
       String texto = "Potência do Motor: " + this.potenciaDoMotor;
        JOptionPane.showMessageDialog(null, texto);
    }
   
}