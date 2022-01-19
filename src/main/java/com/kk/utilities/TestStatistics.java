package com.kk.utilities;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;

/**
 * Test statistics such as pass percentage, counts such as passed, failed,
 * skipped, and total for a test suite are provided by this class.
 */
public class TestStatistics {

    private final Logger LOG = LoggerFactory.getLogger(TestStatistics.class);

    private int passedTestCount;
    private int failedTestCount;
    private int skippedTestCount;
    private int totalTestCount;

    /**
     * Set Passed, Failed, Skipped, Total count for a test suite.
     * @param suite Pass the test suite for which the test statistics has to be set
     */
    public void setTestStats(ISuite suite) {

        // Set test statistics for a test suite
        Map<String, ISuiteResult> suiteResults = suite.getResults();
        for (ISuiteResult sr : suiteResults.values()) {
            ITestContext tc = sr.getTestContext();
            setPassedTestCount(tc.getPassedTests().getAllResults().size());
            setFailedTestCount(tc.getFailedTests().getAllResults().size());
            setSkippedTestCount(tc.getSkippedTests().getAllResults().size());
            setTotalTestCount(getPassedTestCount() + getFailedTestCount() + getSkippedTestCount());
            LOG.info("Test Stats for suite: " + suite.getName()
                    + " Passed : " + getPassedTestCount()
                    + " Failed" + getFailedTestCount()
                    + " Skipped" + getSkippedTestCount()
                    + " Total" + getTotalTestCount());
        }

    }

    /**
     * Get passed test count of a suite
     * @return passedTestCount
     */
    public int getPassedTestCount() {
        return passedTestCount;
    }

    /**
     * Set passed test count of a suite
     * @param passedTestCount Count for the cases that passed
     */
    public void setPassedTestCount(int passedTestCount) {
        this.passedTestCount = passedTestCount;
    }

    /**
     * Get failed test count of a suite
     * @return failedTestCount
     */
    public int getFailedTestCount() {
        return failedTestCount;
    }

    /**
     * Set failed test count of a suite
     * @param failedTestCount Count for the cases that failed
     */
    public void setFailedTestCount(int failedTestCount) {
        this.failedTestCount = failedTestCount;
    }

    /**
     * Get skipped test count of a suite
     * @return skippedTestCount
     */
    public int getSkippedTestCount() {
        return skippedTestCount;
    }

    /**
     * Set skipped test count of a suite
     * @param skippedTestCount Count for the cases that were skipped
     */
    public void setSkippedTestCount(int skippedTestCount) {
        this.skippedTestCount = skippedTestCount;
    }

    /**
     * Get skipped test count of a suite
     * @return totalTestCount
     */
    public int getTotalTestCount() {
        return totalTestCount;
    }

    /**
     * Set total test count of a suite
     * @param totalTestCount Total count of the cases executed
     */
    public void setTotalTestCount(int totalTestCount) {
        this.totalTestCount = totalTestCount;
    }

}
