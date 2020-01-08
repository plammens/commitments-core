package com.mathdump.commitments;

import com.mathdump.commitments.utils.MetricValue;

/**
 * com.mathdump.commitments.Task whose completion is determined by surpassing a certain threshold in
 * a certain metric. Example: "read 24 books"
 */
public class ThresholdTask extends Task {
    private MetricValue target;
    private MetricValue progress;

    public ThresholdTask(String title) {
        super(title);
    }

    public MetricValue getTarget() {
        return target;
    }

    public void setTarget(MetricValue target) {
        this.target = target;
    }

    public MetricValue getProgress() {
        return progress;
    }

    public void setProgress(MetricValue progress) {
        this.progress = progress;
    }

    @Override
    public boolean isCompleted() {
        return progress.compareTo(target) > 0;
    }
}
