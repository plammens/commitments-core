package com.mathdump.commitments;

import com.mathdump.commitments.utils.FrequencyRule;
import com.mathdump.commitments.utils.MetricValue;

/**
 * com.mathdump.commitments.Habit whose sessions' completion is determined by surpassing a value in
 * a certain metric. Example: "read 10 pages a day"
 */
public class MetricHabit extends Habit {

    private MetricValue target;

    public MetricHabit(String title, FrequencyRule freq, MetricValue target) {
        super(title, freq);
        this.target = target;
    }

    public MetricValue getTarget() {
        return target;
    }

    public void setTarget(MetricValue target) {
        this.target = target;
    }
}
