/**
 *
 * DUPLA : CLARISSE E DOUGLAS
 */

package agquinto;

import pessoa.Pessoa;

public class AgQuinto {

    String avaliação(Pessoa pessoa) {
        AgAvaliador aval = new AgAvaliador(0.65);
        aval.setRiscoObesidade(pessoa.getImc());
        aval.setRiscoPressaoDiastolica(pessoa.getPreDiastolica());
        aval.setRiscoPressaoSistolica(pessoa.getPreSistolica());
        aval.setRiscoSedentarismo(pessoa.getSedentarismo());
        aval.setRiscoTabagismo(pessoa.getNicotina());
        return aval.avaliacao();
    }
    
    public AgQuinto(){
        
    }
    
}
