package com.incode.welcome_sdk.commons.utils;

import android.content.Intent;
import android.net.Uri;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import java.util.Random;
import o.o.c$$ExternalSyntheticBackport0;

/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f6642a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6643b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f6644c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6645e = 1;

    public static DocumentType d(Intent intent) {
        int i2 = 2 % 2;
        int i3 = f6645e + 65;
        f6643b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
            return (DocumentType) c$$ExternalSyntheticBackport0.m(intent.getSerializableExtra("extraDocumentType"), (Object) DocumentType.NONE);
        }
        return (DocumentType) c$$ExternalSyntheticBackport0.m(intent.getSerializableExtra("extraDocumentType"), (Object) DocumentType.NONE);
    }

    public static Uri e(Intent intent) {
        int i2 = 2 % 2;
        int i3 = f6643b + 79;
        f6645e = i3 % 128;
        int i4 = i3 % 2;
        Uri uri = (Uri) intent.getParcelableExtra("extraDocumentUri");
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f6643b + 93;
        f6645e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return uri;
    }

    public static int d() {
        int i2 = f6642a;
        int i3 = i2 % 8143976;
        f6642a = i2 + 1;
        if (i3 != 0) {
            return f6644c;
        }
        int iNextInt = new Random().nextInt();
        f6644c = iNextInt;
        return iNextInt;
    }
}
