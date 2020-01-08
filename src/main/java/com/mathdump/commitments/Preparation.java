package com.mathdump.commitments;

import com.mathdump.commitments.utils.Deadline;
import com.mathdump.commitments.utils.MetricValue;

/**
 * com.mathdump.commitments.Commitment with a deadline whose degree of completion is not bounded
 * from above. Example: "prepare for interview"
 */
public class Preparation extends Commitment implements HasDeadline {

    private Deadline deadline;
    private MetricValue progress;

    public Preparation(String title) {
        super(title);
    }

    public Deadline getDeadline() {
        return deadline;
    }

    public void setDeadline(Deadline deadline) {
        this.deadline = deadline;
    }

    /**
     * @return amount of preparation achieved
     */
    public MetricValue getProgress() {
        return progress;
    }

    public void setProgress(MetricValue progress) {
        this.progress = progress;
    }

}
