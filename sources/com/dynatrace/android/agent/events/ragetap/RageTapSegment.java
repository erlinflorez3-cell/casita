package com.dynatrace.android.agent.events.ragetap;

import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
public class RageTapSegment extends CustomSegment {
    private final String activityName;
    private final long firstTapDown;
    private final boolean forwardToGrail;
    private final long lastTapUp;
    private final int numOfTaps;

    public static class Builder {
        private String activityName;
        private long firstTapDown;
        private boolean forwardToGrail;
        private long lastTapUp;
        private int numOfTaps;
        private int sequenceNumber;
        private int serverId;
        private Session session;

        public RageTapSegment build() {
            return new RageTapSegment(this);
        }

        public Builder withActivityName(String str) {
            this.activityName = str;
            return this;
        }

        public Builder withFirstTapDown(long j2) {
            this.firstTapDown = j2;
            return this;
        }

        public Builder withForwardToGrail(boolean z2) {
            this.forwardToGrail = z2;
            return this;
        }

        public Builder withLastTapUp(long j2) {
            this.lastTapUp = j2;
            return this;
        }

        public Builder withNumOfTaps(int i2) {
            this.numOfTaps = i2;
            return this;
        }

        public Builder withSequenceNumber(int i2) {
            this.sequenceNumber = i2;
            return this;
        }

        public Builder withServerId(int i2) {
            this.serverId = i2;
            return this;
        }

        public Builder withSession(Session session) {
            this.session = session;
            return this;
        }
    }

    private RageTapSegment(Builder builder) {
        super(builder.activityName, 16, builder.session, builder.serverId, builder.forwardToGrail);
        this.mEventStartTime = builder.firstTapDown;
        this.eventType = EventType.RAGE_TAP;
        this.lcSeqNum = builder.sequenceNumber;
        this.activityName = Utility.truncateString(builder.activityName, 250);
        this.firstTapDown = builder.firstTapDown;
        this.lastTapUp = builder.lastTapUp;
        this.numOfTaps = builder.numOfTaps;
        this.mFinalized = true;
        this.forwardToGrail = builder.forwardToGrail;
    }

    @Override // com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        return new RageTapEventWriter().toBeaconString(this);
    }

    public String getActivityName() {
        return this.activityName;
    }

    public long getFirstTapDown() {
        return this.firstTapDown;
    }

    public boolean getForwardToGrail() {
        return this.forwardToGrail;
    }

    public long getLastTapUp() {
        return this.lastTapUp;
    }

    public int getNumOfTaps() {
        return this.numOfTaps;
    }
}
