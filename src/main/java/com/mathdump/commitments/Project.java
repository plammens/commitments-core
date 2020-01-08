package com.mathdump.commitments;

import java.util.Collection;

/**
 * A commitment consisting of sub-commitments to a common aim or theme. Example: "learn philosophy"
 */
public class Project extends Commitment {
    private Collection<Commitment> subCommitments;

    public Project(String title) {
        super(title);
    }

    public Collection<Commitment> getSubCommitments() {
        return subCommitments;
    }
}
