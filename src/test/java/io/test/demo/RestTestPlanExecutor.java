package io.test.demo;

import io.virtualan.idaithalam.core.api.VirtualanTestPlanExecutor;
import io.virtualan.idaithalam.core.api.VirtualanTestPlanExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class RestTestPlanExecutor {

        @Test
        public void workflowExecution_xl() {
            try {
                boolean isSuccess = VirtualanTestPlanExecutor
                        .invoke("rest-get.yml");
                Assert.assertTrue(isSuccess);
            } catch (InterruptedException e) {
                Assert.assertTrue(false);
            }
        }

    }


