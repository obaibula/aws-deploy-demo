package org.oleh.awsdeploydemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FailingTest {

    @Test
    public void fail() {
        assertThat(true).isFalse();
    }

}
