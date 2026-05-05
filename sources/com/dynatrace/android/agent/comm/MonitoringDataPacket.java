package com.dynatrace.android.agent.comm;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MonitoringDataPacket {
    public String basicData;
    public List<String> events;

    public MonitoringDataPacket(String str, List<String> list) {
        this.basicData = str;
        this.events = list;
    }

    public String generatePayload() {
        StringBuilder sb = new StringBuilder(this.basicData);
        Iterator<String> it = this.events.iterator();
        while (it.hasNext()) {
            sb.append("&").append(it.next());
        }
        return sb.toString();
    }
}
