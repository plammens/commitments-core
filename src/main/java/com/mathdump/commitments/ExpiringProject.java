package com.mathdump.commitments;

import com.mathdump.commitments.utils.Deadline;

/**
 * com.mathdump.commitments.Project with expiration date.
 * Example: "HCI course project"
 */
public class ExpiringProject extends Project implements HasDeadline {
    private Deadline deadline;

    public ExpiringProject(String title) {
        super(title);
    }

    public Deadline getDeadline() {
        return deadline;
    }

    public void setDeadline(Deadline deadline) {
        this.deadline = deadline;
    }
}
