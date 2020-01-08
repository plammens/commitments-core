package com.mathdump.commitments;

/**
 * A commitment is anything that requires some form of time dedication.
 */
public abstract class Commitment {
    private String title;

    public Commitment(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
