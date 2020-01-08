package com.mathdump.commitments.utils;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a value of a certain metric.
 */
public class MetricValue<T extends Comparable<T>> implements Comparable<MetricValue<T>> {
    private final Metric metric;
    private T value;

    public MetricValue(Metric metric, T value) {
        this.metric = metric;
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Metric getMetric() {
        return metric;
    }

    @Override
    public int compareTo(@NotNull MetricValue<T> other) {
        return this.value.compareTo(other.value);
    }
}
