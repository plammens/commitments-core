package com.mathdump.commitments.utils;

import org.jetbrains.annotations.Nullable;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Represents a due date.
 */
public class Deadline {
    private LocalDate date;
    @Nullable private LocalTime time;

    public Deadline(LocalDate date, @Nullable LocalTime time) {
        this.date = date;
        this.time = time;
    }

    public Deadline(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Nullable
    public LocalTime getTime() {
        return time;
    }

    public void setTime(@Nullable LocalTime time) {
        this.time = time;
    }
}
