
package pessoa;
import java.io.Serializable;

/**
 *
 * DUPLA : CLARISSE E DOUGLAS
 */
public class Pessoa implements Serializable{
    //Teste para saber o tipoPessoa
    String tipoPessoaString = "";
    
    //Informações pessoa
    double imc;
    double preSistolica;
    double preDiastolica;
    double sedentarismo;
    double nicotina;
    
    
    public Pessoa(String tipoPessoa){
        this.tipoPessoaString = tipoPessoa;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double getPreSistolica() {
        return preSistolica;
    }

    public void setPreSistolica(double preSistolica) {
        this.preSistolica = preSistolica;
    }

    public double getPreDiastolica() {
        return preDiastolica;
    }

    public void setPreDiastolica(double preDiastolica) {
        this.preDiastolica = preDiastolica;
    }

    public double getSedentarismo() {
        return sedentarismo;
    }

    public void setSedentarismo(double sedentarismo) {
        this.sedentarismo = sedentarismo;
    }

    public double getNicotina() {
        return nicotina;
    }

    public void setNicotina(double nicotina) {
        this.nicotina = nicotina;
    }

    public String getTipoPessoaString() {
        return tipoPessoaString;
    }

    public void setTipoPessoaString(String tipoPessoaString) {
        this.tipoPessoaString = tipoPessoaString;
    }

    
    

   
    
}
