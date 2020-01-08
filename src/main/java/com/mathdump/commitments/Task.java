package com.mathdump.commitments;

import java.util.Collection;
import java.util.HashSet;

import com.mathdump.commitments.utils.Deadline;
import org.jetbrains.annotations.Nullable;

/**
 * Completable commitment.
 */
public abstract class Task extends Commitment implements HasDeadline {
    enum Degree {
        TASK,
        GOAL
    }

    @Nullable
    private Deadline deadline;
    private Collection<Task> subTasks = new HashSet<>();

    public Task(String title) {
        super(title);
    }

    public abstract boolean isCompleted();

    public Collection<Task> getSubTasks() {
        return subTasks;
    }

    @Nullable
    public Deadline getDeadline() {
        return deadline;
    }

    public void setDeadline(@Nullable Deadline deadline) {
        this.deadline = deadline;
    }

}
