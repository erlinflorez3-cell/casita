package com.incode.welcome_sdk.commons.utils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6636d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6637e = 1;

    public static String e() {
        String hostAddress;
        int i2 = 2 % 2;
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                int i3 = f6636d + 85;
                f6637e = i3 % 128;
                int i4 = i3 % 2;
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                    boolean z2 = true;
                    if (!inetAddress.isLoopbackAddress()) {
                        int i5 = f6636d + 53;
                        f6637e = i5 % 128;
                        if (i5 % 2 == 0) {
                            hostAddress = inetAddress.getHostAddress();
                            if (hostAddress.indexOf(53) < 0) {
                                int i6 = f6636d + 115;
                                f6637e = i6 % 128;
                                int i7 = i6 % 2;
                            }
                            z2 = false;
                        } else {
                            hostAddress = inetAddress.getHostAddress();
                            if (hostAddress.indexOf(58) < 0) {
                                int i62 = f6636d + 115;
                                f6637e = i62 % 128;
                                int i72 = i62 % 2;
                            } else {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            return hostAddress;
                        }
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }
}
