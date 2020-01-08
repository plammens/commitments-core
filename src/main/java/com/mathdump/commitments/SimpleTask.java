package com.mathdump.commitments;

/**
 * com.mathdump.commitments.Task whose completion status is to be set directly.
 * Example: "take out trash"
 */
public class SimpleTask extends Task {

    private boolean completed;

    public SimpleTask(String title) {
        super(title);
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
