package com.kk.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSlackIntegration {

    private final Logger LOG = LoggerFactory.getLogger(TestSlackIntegration.class);

    @Test
    public void caseThatPasses() {
        LOG.info("Test case passed");
        Assert.assertTrue(true);
    }

    @Test
    public void caseThatPasses2() {
        LOG.info("Test case passed2");
        Assert.assertTrue(true);
    }

    @Test
    public void caseThatFails() {
        LOG.info("Test case failed");
        Assert.assertTrue(false);
    }

    @Test
    public void caseThatGetsSkipped() {
        LOG.info("Test case skipped");
        throw new SkipException("Skipping this case");
    }
}
