/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoH;

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
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Bloco H - Inventário Físico.
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "regH001"),
    @Field(name = "regH005List"),
    @Field(name = "regH990")
})
@Getter
@Setter
public class BlocoH {

    private RegH001 regH001;
    private List<RegH005> regH005List;
    private RegH990 regH990;

}
