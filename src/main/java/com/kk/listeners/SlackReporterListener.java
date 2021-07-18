package com.kk.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SlackReporterListener implements ISuiteListener {

    private final Logger LOG = LoggerFactory.getLogger(SlackReporterListener.class);

    @Override
    public void onStart(ISuite suite) {
        // do nothing
    }

    @Override
    public void onFinish(ISuite suite) {
        LOG.info("Suite finished");
    }
}
