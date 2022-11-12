/**
 *
 * DUPLA : CLARISSE E DOUGLAS
 */

package agdepnicot;

import java.net.*;
import java.io.*;
import java.io.Serializable;
import java.net.DatagramPacket;
import pessoa.Pessoa;

public class AgDepNicot implements Serializable {

    public String enviaMensagem(Pessoa msgPessoa){
        int porta = 6868;
        InetAddress ipGrupo = null;
        MulticastSocket s = null;
        
        try{
            ipGrupo = InetAddress.getByName("224.225.226.227");
            s = new MulticastSocket(porta);
            s.joinGroup(ipGrupo);
            
            ByteArrayOutputStream bStream = new ByteArrayOutputStream();
            ObjectOutput oo = new ObjectOutputStream(bStream);
            oo.writeObject(msgPessoa);
            
            byte[] ObjetoSerializado = bStream.toByteArray();
            DatagramPacket request = new DatagramPacket(ObjetoSerializado, ObjetoSerializado.length, ipGrupo, porta);
            s.send(request);
            
            return "Próximo passo ->";
            
        } catch (IOException ex) {
            return (ex.getMessage());
        } 
    }
    
    
    public AgDepNicot(){
    
    }
        
    

   
}
