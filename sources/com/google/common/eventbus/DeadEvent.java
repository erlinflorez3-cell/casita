package com.google.common.eventbus;

import androidx.core.app.NotificationCompat;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public class DeadEvent {
    private final Object event;
    private final Object source;

    public DeadEvent(Object source, Object event) {
        this.source = Preconditions.checkNotNull(source);
        this.event = Preconditions.checkNotNull(event);
    }

    public Object getEvent() {
        return this.event;
    }

    public Object getSource() {
        return this.source;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("source", this.source).add(NotificationCompat.CATEGORY_EVENT, this.event).toString();
    }
}
