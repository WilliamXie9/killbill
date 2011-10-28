/*
 * Copyright 2010-2011 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.invoice.tests.inAdvance;

import com.ning.billing.invoice.model.IBillingMode;
import com.ning.billing.invoice.model.InAdvanceBillingMode;
import com.ning.billing.invoice.tests.ProRationTestBase;
import org.testng.annotations.Test;

@Test(groups = {"invoicing", "proRation"})
public abstract class ProRationInAdvanceTestBase extends ProRationTestBase {
    @Override
    protected IBillingMode getBillingMode() {
        return new InAdvanceBillingMode();
    }
}
