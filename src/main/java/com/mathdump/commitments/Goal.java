package com.mathdump.commitments;

import com.mathdump.commitments.utils.Deadline;

import java.util.Collection;

/**
 * Long-term completable objective with an action plan consisting of sub-commitments.
 * Example: "read 24 books by the end of the year"
 */
public class Goal extends Commitment implements HasDeadline {
    private Task definingTask;
    private Collection<Commitment> actionPlan;
    private Deadline deadline;

    public Goal(String title) {
        super(title);
    }

    public Task getDefiningTask() {
        return definingTask;
    }

    @Override
    public Deadline getDeadline() {
        return deadline;
    }

    public Collection<Commitment> getActionPlan() {
        return actionPlan;
    }
}
