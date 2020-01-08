package com.mathdump.commitments.timespans;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Represents a time session, defined by a starting datetime plus an abstract end condition, which
 * could be a fixed duration or another .
 */
public abstract class TimeSpan {

    protected LocalDateTime start;

    /**
     * @return starting datetime of the timespan
     */
    public LocalDateTime getStart() {
        return start;
    }

    /**
     * Get the scheduled duration of the timespan. Note that the actual duration of the represented
     * timespan may not be explicitly determinable, e.g. if it is defined in terms of the time
     * needed to complete a task; in that case this value represents the "expected" or "default"
     * duration, as scheduled on the calendar.
     * @return scheduled duration of the timespan
     */
    public abstract Duration getScheduledDuration();

    /**
     * Equivalent to {@code this.getStart().plus(this.getScheduledDuration())}
     * @return scheduled end datetime of the timespan
     * @see #getScheduledDuration()
     */
    public final LocalDateTime getScheduledEnd() {
        return getStart().plus(getScheduledDuration());
    }

}
