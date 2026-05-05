package com.incode.welcome_sdk.commons.utils;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6464a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6465b = 1;

    public static final RequestBody b(ContentResolver contentResolver, Uri uri) throws IOException {
        int i2 = 2 % 2;
        int i3 = f6465b + 121;
        f6464a = i3 % 128;
        RequestBody requestBody = null;
        try {
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(contentResolver, "");
                Intrinsics.checkNotNullParameter(uri, "");
                contentResolver.openInputStream(uri);
                throw null;
            }
            Intrinsics.checkNotNullParameter(contentResolver, "");
            Intrinsics.checkNotNullParameter(uri, "");
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                InputStream inputStream = inputStreamOpenInputStream;
                try {
                    RequestBody requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.Companion, ByteStreamsKt.readBytes(inputStream), MediaType.Companion.parse("application/pdf"), 0, 0, 6, (Object) null);
                    CloseableKt.closeFinally(inputStream, null);
                    requestBody = requestBodyCreate$default;
                } finally {
                }
            }
        } catch (FileNotFoundException e2) {
            Timber.Forest.e(e2);
        }
        int i4 = f6465b + 111;
        f6464a = i4 % 128;
        int i5 = i4 % 2;
        return requestBody;
    }

    public static /* synthetic */ String d(ContentResolver contentResolver, Uri uri) throws IOException {
        int i2 = 2 % 2;
        int i3 = f6465b + 41;
        f6464a = i3 % 128;
        int i4 = i3 % 2;
        String strA = a(contentResolver, uri, "document.pdf");
        int i5 = f6465b + 45;
        f6464a = i5 % 128;
        int i6 = i5 % 2;
        return strA;
    }

    private static String a(ContentResolver contentResolver, Uri uri, String str) throws IOException {
        String string;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(contentResolver, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return str;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            Integer numValueOf = Integer.valueOf(cursor2.getColumnIndex("_display_name"));
            if (numValueOf.intValue() == -1 || !cursor2.moveToFirst()) {
                numValueOf = null;
            } else {
                int i3 = f6465b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f6464a = i3 % 128;
                int i4 = i3 % 2;
            }
            if (numValueOf != null) {
                string = cursor2.getString(numValueOf.intValue());
                int i5 = f6464a + 43;
                f6465b = i5 % 128;
                int i6 = i5 % 2;
            } else {
                string = null;
            }
            if (string == null) {
                int i7 = f6465b + 33;
                f6464a = i7 % 128;
                int i8 = i7 % 2;
            } else {
                str = string;
            }
            CloseableKt.closeFinally(cursor, null);
            return str;
        } finally {
        }
    }
}
