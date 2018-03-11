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
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Edivaldo Merlo Stens
 */
@Record(fields = {
    @Field(name = "reg", id=true, constantValue = "D365"),
    @Field(name = "codTotPart"),
    @Field(name = "vlrAcumTot"),
    @Field(name = "nrTot"),
    @Field(name = "descrNrTot"),
    //--- detalhes ---
    @Field(name = "regD370List"),
    @Field(name = "regD390List")
})
@Getter
@Setter
public class RegD365 {

    private String codTotPart;
    private Double vlrAcumTot;
    private Double nrTot;
    private String descrNrTot;
    //--- detalhes ---
    private List<RegD370> regD370List;
    private List<RegD390> regD390List;

}