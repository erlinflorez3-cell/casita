package com.valid.vssh_android_core.utils;

import com.valid.communication.managers.communicationmanager.CommunicationManager;

/* JADX INFO: loaded from: classes5.dex */
public class CommunicationHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static CommunicationHelper f18354b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CommunicationManager f18355a;

    public class IOException extends RuntimeException {
    }

    public static CommunicationHelper getInstance() {
        if (f18354b == null) {
            f18354b = new CommunicationHelper();
        }
        return f18354b;
    }

    public CommunicationManager getCommunicationManager() {
        return this.f18355a;
    }

    public void setCommunicationManager(CommunicationManager communicationManager) {
        try {
            this.f18355a = communicationManager;
        } catch (IOException unused) {
        }
    }
}
