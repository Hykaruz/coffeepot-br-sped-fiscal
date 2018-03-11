/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoD;


/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.Frete;
import coffeepot.br.sped.fiscal.tipos.Operacao;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "D100"),
    @Field(name = "indOper"),
    @Field(name = "indEmit"),
    @Field(name = "codPart"),
    @Field(name = "codMod"),
    @Field(name = "codSit"),
    @Field(name = "ser"),
    @Field(name = "sub"),
    @Field(name = "numDoc"),
    @Field(name = "chvCte", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "dtDoc"),
    @Field(name = "dtAP"),
    @Field(name = "tpCte"),
    @Field(name = "chvCteRef"),
    @Field(name = "vlDoc"),
    @Field(name = "vlDesc"),
    @Field(name = "indFrt"),
    @Field(name = "vlServ"),
    @Field(name = "vlBcIcms"),
    @Field(name = "vlIcms"),
    @Field(name = "vlNT"),
    @Field(name = "codInf"),
    @Field(name = "codCta"),
    @Field(name = "codMunOrig"),
    @Field(name = "codMunDest"),
    //--- detalhes ---
    @Field(name = "regD101"),
    @Field(name = "regD110List"),
    @Field(name = "regD120List"),
    @Field(name = "regD130"),
    @Field(name = "regD140"),
    @Field(name = "regD150"),
    @Field(name = "regD160List"),
    @Field(name = "regD170"),
    @Field(name = "regD180List"),
    @Field(name = "regD190List"),
    @Field(name = "regD195List")
})
@Getter
@Setter
public class RegD100 {

    private Operacao indOper;
    private EmissaoDocumento indEmit;
    private String codPart;
    private DocumentoFiscal codMod;
    private SituacaoDocumento codSit;
    private String ser;
    private String sub;
    private Long numDoc;
    private String chvCte;
    private LocalDate dtDoc;
    private LocalDate dtAP;
    private String tpCte;
    private String chvCteRef;
    private Double vlDoc;
    private Double vlDesc;
    private Frete indFrt;
    private Double vlServ;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlNT;
    private String codInf;
    private String codCta;
    private Long codMunOrig;
    private Long codMunDest;
    //--- detalhes ---
    private RegD101 regD101;
    private List<RegD110> regD110List;
    private List<RegD120> regD120List;
    private RegD130 regD130;
    private RegD140 regD140;
    private RegD150 regD150;
    private List<RegD160> regD160List;
    private RegD170 regD170;
    private List<RegD180> regD180List;
    private List<RegD190> regD190List;
    private List<RegD195> regD195List;

}
