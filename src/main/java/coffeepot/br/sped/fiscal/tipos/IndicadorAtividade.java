/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.tipos;

import org.apache.commons.lang3.StringUtils;

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
/**
 * Indicador de tipo de atividade.
 *
 * @author Jeandeson O. Merelis
 */
public enum IndicadorAtividade implements EnumCodificado {

    /**
     * Industrial ou equiparado a industrial.
     */
    INDUSTRIAL("0"),
    /**
     * Outros.
     */
    OUTROS("1");

    private final String codigo;

    private IndicadorAtividade(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public static IndicadorAtividade valueOfStripToNull(final String v) {
        if (StringUtils.stripToNull(v) == null) {
            return null;
        }
        return IndicadorAtividade.valueOf(v);
    }

    public static IndicadorAtividade valueOfCodigoStripToNull(final String codigo) {
        if (StringUtils.stripToNull(codigo) == null) {
            return null;
        }

        return valueOfCodigo(codigo);
    }

    public static IndicadorAtividade valueOfCodigo(final String codigo) {
        for (IndicadorAtividade n : values()) {
            if (n.getCodigo().equalsIgnoreCase(codigo)) {
                return n;
            }
        }
        return null;
    }
}
