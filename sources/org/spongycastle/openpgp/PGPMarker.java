package org.spongycastle.openpgp;

import java.io.IOException;
import org.spongycastle.bcpg.BCPGInputStream;
import org.spongycastle.bcpg.MarkerPacket;

/* JADX INFO: loaded from: classes2.dex */
public class PGPMarker {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MarkerPacket f28087p;

    public PGPMarker(BCPGInputStream bCPGInputStream) throws IOException {
        this.f28087p = (MarkerPacket) bCPGInputStream.readPacket();
    }
}
