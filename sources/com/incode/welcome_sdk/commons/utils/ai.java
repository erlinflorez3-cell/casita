package com.incode.welcome_sdk.commons.utils;

import com.incode.welcome_sdk.results.FaceLoginResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.SelfieScanResult;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes5.dex */
public final class ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6392a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6393b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6394d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6395e = 0;

    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f6396c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f6397d = 0;

        private d() {
        }

        @JvmStatic
        public static SelfieScanResult e(String str) {
            int i2 = 2 % 2;
            SelfieScanResult selfieScanResult = new SelfieScanResult(ResultCode.SUCCESS, null, null, -1.0d, null, -1.0d, null, -1.0d, null, null, null, 9, null, null, null, null, new FaceLoginResult(true, null, null, null, null, str), null, null, null, 917508, null);
            int i3 = f6397d + 45;
            f6396c = i3 % 128;
            if (i3 % 2 != 0) {
                return selfieScanResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static {
        new d((byte) 0);
        int i2 = f6392a + 17;
        f6393b = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final SelfieScanResult e(String str) {
        int i2 = 2 % 2;
        int i3 = f6395e + 107;
        f6394d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            d.e(str);
            obj.hashCode();
            throw null;
        }
        SelfieScanResult selfieScanResultE = d.e(str);
        int i4 = f6394d + 45;
        f6395e = i4 % 128;
        if (i4 % 2 == 0) {
            return selfieScanResultE;
        }
        obj.hashCode();
        throw null;
    }
}
