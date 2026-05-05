package com.facebook.react.bridge;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ReactMarker {
    private static Queue<ReactMarkerRecord> sNativeReactMarkerQueue = new ConcurrentLinkedQueue();
    private static final List<MarkerListener> sListeners = new CopyOnWriteArrayList();
    private static final List<FabricMarkerListener> sFabricMarkerListeners = new CopyOnWriteArrayList();

    public interface FabricMarkerListener {
        void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i2, long j2);

        default void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i2, long j2, int i3) {
            logFabricMarker(reactMarkerConstants, str, i2, j2);
        }
    }

    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i2);
    }

    private static class ReactMarkerRecord {
        private final String mMarkerName;
        private final long mMarkerTime;

        public ReactMarkerRecord(String str, long j2) {
            this.mMarkerName = str;
            this.mMarkerTime = j2;
        }

        public String getMarkerName() {
            return this.mMarkerName;
        }

        public long getMarkerTime() {
            return this.mMarkerTime;
        }
    }

    public static void addFabricListener(FabricMarkerListener fabricMarkerListener) {
        List<FabricMarkerListener> list = sFabricMarkerListeners;
        if (list.contains(fabricMarkerListener)) {
            return;
        }
        list.add(fabricMarkerListener);
    }

    public static void addListener(MarkerListener markerListener) {
        List<MarkerListener> list = sListeners;
        if (list.contains(markerListener)) {
            return;
        }
        list.add(markerListener);
    }

    public static void clearFabricMarkerListeners() {
        sFabricMarkerListeners.clear();
    }

    public static void clearMarkerListeners() {
        sListeners.clear();
    }

    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i2) {
        logFabricMarker(reactMarkerConstants, str, i2, SystemClock.uptimeMillis(), 0);
    }

    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i2, long j2) {
        Iterator<FabricMarkerListener> it = sFabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next().logFabricMarker(reactMarkerConstants, str, i2, j2, 0);
        }
    }

    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i2, long j2, int i3) {
        Iterator<FabricMarkerListener> it = sFabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next().logFabricMarker(reactMarkerConstants, str, i2, j2, i3);
        }
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        logMarker(reactMarkerConstants, (String) null, 0);
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i2) {
        logMarker(reactMarkerConstants, (String) null, i2);
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants, long j2) {
        logMarker(reactMarkerConstants, null, 0, Long.valueOf(j2));
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str) {
        logMarker(reactMarkerConstants, str, 0);
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i2) {
        logMarker(reactMarkerConstants, str, i2, null);
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i2, Long l2) {
        logFabricMarker(reactMarkerConstants, str, i2);
        Iterator<MarkerListener> it = sListeners.iterator();
        while (it.hasNext()) {
            it.next().logMarker(reactMarkerConstants, str, i2);
        }
        notifyNativeMarker(reactMarkerConstants, l2);
    }

    public static void logMarker(String str) {
        logMarker(str, (String) null);
    }

    public static void logMarker(String str, int i2) {
        logMarker(str, (String) null, i2);
    }

    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    public static void logMarker(String str, String str2, int i2) {
        logMarker(ReactMarkerConstants.valueOf(str), str2, i2);
    }

    private static native void nativeLogMarker(String str, long j2);

    private static void notifyNativeMarker(ReactMarkerConstants reactMarkerConstants, Long l2) {
        if (!reactMarkerConstants.hasMatchingNameMarker()) {
            return;
        }
        if (l2 == null) {
            l2 = Long.valueOf(SystemClock.uptimeMillis());
        }
        if (!ReactBridge.isInitialized()) {
            sNativeReactMarkerQueue.add(new ReactMarkerRecord(reactMarkerConstants.name(), l2.longValue()));
            return;
        }
        nativeLogMarker(reactMarkerConstants.name(), l2.longValue());
        while (true) {
            ReactMarkerRecord reactMarkerRecordPoll = sNativeReactMarkerQueue.poll();
            if (reactMarkerRecordPoll == null) {
                return;
            } else {
                nativeLogMarker(reactMarkerRecordPoll.getMarkerName(), reactMarkerRecordPoll.getMarkerTime());
            }
        }
    }

    public static void removeFabricListener(FabricMarkerListener fabricMarkerListener) {
        sFabricMarkerListeners.remove(fabricMarkerListener);
    }

    public static void removeListener(MarkerListener markerListener) {
        sListeners.remove(markerListener);
    }
}
