package br.italo.carteirainvestimentos.persistence.entity;

import br.italo.carteirainvestimentos.persistence.entity.acoes.Acoes;
import br.italo.carteirainvestimentos.persistence.entity.fii.FII;
import br.italo.carteirainvestimentos.persistence.entity.rendafixa.RendaFixa;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@Entity(name = "carteira")
public class Carteira {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Acoes acoes;

    private FII fii;

    private RendaFixa rendaFixa;

}
