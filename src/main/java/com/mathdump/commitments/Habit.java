package com.mathdump.commitments;

import com.mathdump.commitments.utils.FrequencyRule;

/**
 * com.mathdump.commitments.Commitment applicable throughout a whole lifetime, to which time dedication is determined by a
 * frequency rule.
 * Example: "brush teeth after every meal"
 */
public class Habit extends Commitment {

    private FrequencyRule freq;

    public Habit(String title, FrequencyRule freq) {
        super(title);
        this.freq = freq;
    }

    public FrequencyRule getFreq() {
        return freq;
    }

    public void setFreq(FrequencyRule freq) {
        this.freq = freq;
    }
}
