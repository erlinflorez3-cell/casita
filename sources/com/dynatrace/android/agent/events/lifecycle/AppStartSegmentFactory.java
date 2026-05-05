package com.dynatrace.android.agent.events.lifecycle;

import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.events.lifecycle.AppStartSegment;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.SegmentFactory;
import com.dynatrace.android.lifecycle.SimpleClassNameGenerator;
import com.dynatrace.android.lifecycle.appstart.AppStartAction;

/* JADX INFO: loaded from: classes3.dex */
public class AppStartSegmentFactory implements SegmentFactory<AppStartAction, AppStartSegment> {
    private static final String LOG_TAG = Global.LOG_PREFIX + "AppStartSegmentFactory";

    private MeasurementPoint toRelativeMeasurementPoint(long j2, MeasurementPoint measurementPoint) {
        if (measurementPoint == null) {
            return null;
        }
        return new MeasurementPoint(measurementPoint.getTimestamp() - j2, measurementPoint.getSequenceNumber());
    }

    @Override // com.dynatrace.android.lifecycle.SegmentFactory
    public AppStartSegment createSegment(AppStartAction appStartAction, Session session, int i2) {
        if (Global.DEBUG) {
            Utility.zlogD(LOG_TAG, "captured AppStart action: " + appStartAction);
        }
        return new AppStartSegment.Builder().withActivityName(appStartAction.getName() != null ? new SimpleClassNameGenerator().customize(appStartAction.getName()) : null).withSession(session).withServerId(i2).withParentActionId(appStartAction.getParentAction() != null ? appStartAction.getParentAction().getTagId() : 0L).withEventType(EventType.APP_START).withStartPoint(toRelativeMeasurementPoint(session.getSessionStartTime(), appStartAction.getStartPoint())).withEndPoint(toRelativeMeasurementPoint(appStartAction.getStartPoint().getTimestamp(), appStartAction.getEndPoint())).withForwardToGrail(true).build();
    }
}
