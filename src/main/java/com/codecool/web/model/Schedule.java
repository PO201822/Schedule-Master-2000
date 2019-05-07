package com.codecool.web.model;

import java.util.Objects;

public final class Schedule extends AbstractModel {

    private final String title;
    private final int duration;
    private final boolean visibility;
    private final int userId;

    public Schedule(int id, int userId, String title, int duration, boolean visibility) {
        super(id);
        this.userId = userId;
        this.title = title;
        this.duration = duration;
        this.visibility = visibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Schedule)) return false;
        if (!super.equals(o)) return false;
        Schedule schedule = (Schedule) o;
        return visibility == schedule.visibility &&
            userId == schedule.userId &&
            Objects.equals(title, schedule.title) &&
            Objects.equals(duration, schedule.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, duration, visibility, userId);
    }
}
