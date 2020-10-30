package meiosdetransporteatva10;

import javax.swing.JOptionPane;

/**
 *
 * @author dacas
 */
public class Moto extends Automovel{
    public boolean partidaEletrica;
    
    public Moto(){
        
    }
    
    public void setPartidaEletrica(boolean partidaEletrica){
       this.partidaEletrica = partidaEletrica;
     }
    
    @Override
    public void imprimirInformacoes() {
        String texto = "Possui partida eletrica: "  + this.partidaEletrica;
        JOptionPane.showMessageDialog(null, texto);
    }


    
}

