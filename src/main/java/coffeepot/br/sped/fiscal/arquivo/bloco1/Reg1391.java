/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;

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
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "1391"),
    @Field(name = "dtRegistro"),
    @Field(name = "qtdMoid"),
    @Field(name = "estqIni"),
    @Field(name = "qtdProduz"),
    @Field(name = "entAnidHid"),
    @Field(name = "outrEntr"),
    @Field(name = "perda"),
    @Field(name = "cons"),
    @Field(name = "saiAniHid"),
    @Field(name = "saidas"),
    @Field(name = "estqFin"),
    @Field(name = "estqIniMel"),
    @Field(name = "estqDiaMel"),
    @Field(name = "utilMel"),
    @Field(name = "prodAlcMel"),
    @Field(name = "obs")
    //--- detalhes ---
})
@Getter
@Setter
public class Reg1391 {

    private LocalDate dtRegistro;
    private Double qtdMoid;
    private Double estqIni;
    private Double qtdProduz;
    private Double entAnidHid;
    private Double outrEntr;
    private Double perda;
    private Double cons;
    private Double saiAniHid;
    private Double saidas;
    private Double estqFin;
    private Double estqIniMel;
    private Double estqDiaMel;
    private Double utilMel;
    private Double prodAlcMel;
    private String obs;
    //--- detalhes ---

}
