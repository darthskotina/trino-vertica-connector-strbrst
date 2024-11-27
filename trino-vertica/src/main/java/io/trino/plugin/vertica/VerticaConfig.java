/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.trino.plugin.vertica;

import io.airlift.configuration.Config;
import io.airlift.configuration.DefunctConfig;

@DefunctConfig("vertica.disable-automatic-fetch-size")
public class VerticaConfig
{
    private boolean enableConvertDecimalToVarchar = true;

    public enum ArrayMapping
    {
        DISABLED,
        AS_ARRAY,
        AS_JSON,
    }

    public boolean isEnableConvertDecimalToVarchar()
    {
        return enableConvertDecimalToVarchar;
    }

    @Config("vertica.enable_convert_decimal_to_varchar")
    public VerticaConfig setEnableConvertDecimalToVarchar(boolean enableConvertDecimalToVarchar)
    {
        this.enableConvertDecimalToVarchar = enableConvertDecimalToVarchar;
        return this;
    }
}
