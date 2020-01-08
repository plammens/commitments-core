package com.mathdump.commitments.timespans;

import java.time.Duration;

/**
 * Timespan with explicit fixed duration.
 */
public class ExplicitTimeSpan extends TimeSpan {
    private Duration duration;

    @Override
    public Duration getScheduledDuration() {
        return duration;
    }
}
