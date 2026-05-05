package com.dynatrace.android.agent.events.lifecycle;

import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.events.lifecycle.DisplaySegment;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.SegmentFactory;
import com.dynatrace.android.lifecycle.SimpleClassNameGenerator;
import com.dynatrace.android.lifecycle.action.LifecycleAction;
import com.dynatrace.android.lifecycle.event.ActivityEventType;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class DisplaySegmentFactory implements SegmentFactory<LifecycleAction<ActivityEventType>, DisplaySegment> {
    private static final String LOG_TAG = Global.LOG_PREFIX + "DisplaySegmentFactory";

    private static MeasurementPoint toRelativeMeasurementPoint(long j2, MeasurementPoint measurementPoint) {
        if (measurementPoint == null) {
            return null;
        }
        return new MeasurementPoint(measurementPoint.getTimestamp() - j2, measurementPoint.getSequenceNumber());
    }

    @Override // com.dynatrace.android.lifecycle.SegmentFactory
    public DisplaySegment createSegment(LifecycleAction<ActivityEventType> lifecycleAction, Session session, int i2) {
        DisplaySegment displaySegmentBuild;
        synchronized (lifecycleAction) {
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "captured lifecycle action: " + lifecycleAction);
            }
            Map<T, MeasurementPoint> lifecycleEvents = lifecycleAction.getLifecycleEvents();
            long sessionStartTime = session.getSessionStartTime();
            long timestamp = lifecycleAction.getStartPoint().getTimestamp();
            displaySegmentBuild = new DisplaySegment.Builder().withLifecycleOwner(new SimpleClassNameGenerator().customize(lifecycleAction.getName())).withSession(session).withServerId(i2).withParentActionId(lifecycleAction.getParentAction() != null ? lifecycleAction.getParentAction().getTagId() : 0L).withEventType(lifecycleEvents.containsKey(ActivityEventType.ON_CREATE) ? EventType.DISPLAY : EventType.REDISPLAY).withActionCreationPoint(toRelativeMeasurementPoint(sessionStartTime, lifecycleAction.getStartPoint())).withCreateEvent(toRelativeMeasurementPoint(timestamp, lifecycleEvents.get(ActivityEventType.ON_CREATE))).withStartEvent(toRelativeMeasurementPoint(timestamp, lifecycleEvents.get(ActivityEventType.ON_START))).withResumeEvent(toRelativeMeasurementPoint(timestamp, lifecycleEvents.get(ActivityEventType.ON_RESUME))).withEndPoint(toRelativeMeasurementPoint(timestamp, lifecycleAction.getEndPoint())).withForwardToGrail(true).build();
        }
        return displaySegmentBuild;
    }
}
