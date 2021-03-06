/*
 * Copyright 2016 Huawei Technologies Co., Ltd.
 *
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

package org.openo.sdno.model.servicemodel.tunnel;

import org.openo.sdno.model.servicemodel.AbstractSvcModel;
import org.openo.sdno.model.servicemodel.common.enumeration.PwVlanActionType;
import org.openo.sdno.wanvpn.util.paradesc.EnumDesc;
import org.openo.sdno.wanvpn.util.paradesc.StringDesc;

/**
 * PW Specification Class <br>
 *
 * @author
 * @version SDNO 0.5 August 4, 2016
 */
public class PWSpec extends AbstractSvcModel {

    @StringDesc(maxLen = 36)
    private String uuid;

    private boolean controlWord;

    @EnumDesc(PwVlanActionType.class)
    private String pwVlanAction;

    public String getPwVlanAction() {
        return pwVlanAction;
    }

    public void setPwVlanAction(String pwVlanAction) {
        this.pwVlanAction = pwVlanAction;
    }

    @Override
    public String getUuid() {
        return uuid;
    }

    @Override
    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return Returns the controlWord.
     */
    public boolean isControlWord() {
        return controlWord;
    }

    /**
     * @param controlWord The controlWord to set.
     */
    public void setControlWord(boolean controlWord) {
        this.controlWord = controlWord;
    }
}
