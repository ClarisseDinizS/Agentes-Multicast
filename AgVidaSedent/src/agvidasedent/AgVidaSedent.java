/**
 *
 * DUPLA : CLARISSE E DOUGLAS
 */

package agvidasedent;

import java.net.*;
import java.io.*;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pessoa.Pessoa;

public class AgVidaSedent implements Serializable {

    private String nomeDns;
    private int ServerPort;
    private byte[] meuIP;

     public AgVidaSedent() {
    }

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

    
}
