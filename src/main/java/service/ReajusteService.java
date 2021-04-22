package service;

import model.Desempenho;
import model.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho){
        // Strategy Pattern do tipo Behavioral Patterns
        BigDecimal percentual = desempenho.percentualReajuste();
        BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
        funcionario.reajustarSalario(reajuste);
    }
}


//if(desempenho == Desempenho.A_DESEJAR){
// BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
// funcionario.reajustarSalario(reajuste);
//}
//else if(desempenho == Desempenho.BOM){
// BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
// funcionario.reajustarSalario(reajuste);
//}
//else{
// BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.2"));
// funcionario.reajustarSalario(reajuste);
//}

