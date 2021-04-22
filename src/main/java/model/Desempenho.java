package model;

import java.math.BigDecimal;

public enum Desempenho {
    //conjunto de constantes
    A_DESEJAR {
        @Override
        public BigDecimal percentualReajuste(){
            return new BigDecimal("0.03");
        }
    },
    BOM {
        @Override
        public BigDecimal percentualReajuste(){
            return new BigDecimal("0.15");
        }
    },
    OTIMO {
        @Override
        public BigDecimal percentualReajuste(){
            return new BigDecimal("0.2");
        }
    };

    //metodo abstrato forçando cada constante a ter sua propria implementação
    public abstract BigDecimal percentualReajuste();
}
