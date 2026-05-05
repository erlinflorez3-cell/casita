package com.dynatrace.android.agent;

import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CalloutTable {
    private static final String TAG = Global.LOG_PREFIX + "CalloutTable";
    private long mSendTimeout;
    private List<CTElement> mTable = new ArrayList();
    private long mCurrentTimeout = 0;

    private class CTElement {
        private String actionId;
        private long timeout;

        public CTElement(CustomSegment customSegment, long j2) {
            this.actionId = customSegment.getName() + customSegment.hashCode();
            this.timeout = j2;
        }

        static /* synthetic */ long access$006(CTElement cTElement) {
            long j2 = cTElement.timeout - 1;
            cTElement.timeout = j2;
            return j2;
        }

        static /* synthetic */ long access$014(CTElement cTElement, long j2) {
            long j3 = cTElement.timeout + j2;
            cTElement.timeout = j3;
            return j3;
        }

        static /* synthetic */ long access$022(CTElement cTElement, long j2) {
            long j3 = cTElement.timeout - j2;
            cTElement.timeout = j3;
            return j3;
        }
    }

    public CalloutTable(int i2) {
        this.mSendTimeout = i2;
    }

    public void addActionEvent(CustomSegment customSegment) {
        if (customSegment == null) {
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(TAG, String.format("Add segment %s (id=%d pid=%d) currTimeout=%s", customSegment.getName() + customSegment.hashCode(), Long.valueOf(customSegment.getTagId()), Long.valueOf(customSegment.getParentTagId()), Long.valueOf(this.mCurrentTimeout)));
        }
        synchronized (this.mTable) {
            long j2 = this.mSendTimeout - this.mCurrentTimeout;
            for (int i2 = 0; i2 < this.mTable.size(); i2++) {
                if (this.mTable.get(i2).timeout >= j2) {
                    CTElement.access$022(this.mTable.get(i2), j2);
                    this.mTable.add(i2, new CTElement(customSegment, j2));
                    return;
                }
                j2 -= this.mTable.get(i2).timeout;
            }
            this.mTable.add(new CTElement(customSegment, j2));
        }
    }

    public void addOtherEvent() {
        synchronized (this.mTable) {
            if (this.mTable.size() > 0) {
                return;
            }
            if (this.mCurrentTimeout == 0) {
                this.mCurrentTimeout = this.mSendTimeout;
            }
        }
    }

    public void changeSendEventTimeout(long j2) {
        synchronized (this.mTable) {
            if (j2 == this.mSendTimeout) {
                return;
            }
            this.mSendTimeout = j2;
            if (this.mCurrentTimeout > j2) {
                if (this.mTable.size() > 0) {
                    CTElement.access$014(this.mTable.get(0), this.mCurrentTimeout - j2);
                }
                this.mCurrentTimeout = j2;
            }
        }
    }

    public boolean isItTimeToSend() {
        synchronized (this.mTable) {
            long j2 = this.mCurrentTimeout;
            boolean z2 = true;
            if (j2 > 0) {
                long j3 = j2 - 1;
                this.mCurrentTimeout = j3;
                if (j3 != 0) {
                    z2 = false;
                }
                return z2;
            }
            if (this.mTable.size() <= 0 || CTElement.access$006(this.mTable.get(0)) != 0) {
                return false;
            }
            do {
                this.mTable.remove(0);
                if (this.mTable.size() <= 0) {
                    break;
                }
            } while (this.mTable.get(0).timeout == 0);
            return true;
        }
    }

    public void purge() {
        synchronized (this.mTable) {
            this.mTable.clear();
            this.mCurrentTimeout = 0L;
        }
    }

    public boolean removeActionSendEvent(CustomSegment customSegment) {
        if (customSegment == null) {
            return false;
        }
        String str = customSegment.getName() + customSegment.hashCode();
        synchronized (this.mTable) {
            for (int i2 = 0; i2 < this.mTable.size(); i2++) {
                if (this.mTable.get(i2).actionId.equals(str)) {
                    int i3 = i2 + 1;
                    if (i3 < this.mTable.size()) {
                        CTElement.access$014(this.mTable.get(i3), this.mTable.get(i2).timeout);
                    } else if (this.mCurrentTimeout == 0) {
                        this.mCurrentTimeout = this.mTable.get(i2).timeout;
                    }
                    return this.mTable.remove(i2) != null;
                }
            }
            return false;
        }
    }

    public String toString() {
        String str = this.mCurrentTimeout + Global.SEMICOLON;
        for (int i2 = 0; i2 < this.mTable.size(); i2++) {
            str = str + this.mTable.get(i2).timeout + Global.SEMICOLON;
        }
        return str;
    }
}
