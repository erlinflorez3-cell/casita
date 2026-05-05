package com.dynatrace.android.lifecycle;

import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.data.Session;

/* JADX INFO: loaded from: classes3.dex */
public interface SegmentFactory<T, R extends CustomSegment> {
    R createSegment(T t2, Session session, int i2);
}
