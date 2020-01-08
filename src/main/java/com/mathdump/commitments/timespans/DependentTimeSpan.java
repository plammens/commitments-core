package com.mathdump.commitments.timespans;

import java.time.Duration;

public class DependentTimeSpan extends TimeSpan {
    private Duration expectedDuration;

    @Override
    public Duration getScheduledDuration() {
        return expectedDuration;
    }
}
