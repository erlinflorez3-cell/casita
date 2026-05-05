package io.sentry.android.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import io.sentry.android.core.internal.util.ContentProviderSecurityChecker;

/* JADX INFO: loaded from: classes6.dex */
abstract class EmptySecureContentProvider extends ContentProvider {
    private final ContentProviderSecurityChecker securityChecker = new ContentProviderSecurityChecker();

    EmptySecureContentProvider() {
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) throws Throwable {
        this.securityChecker.checkPrivilegeEscalation(this);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) throws Throwable {
        this.securityChecker.checkPrivilegeEscalation(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        this.securityChecker.checkPrivilegeEscalation(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) throws Throwable {
        this.securityChecker.checkPrivilegeEscalation(this);
        return 0;
    }
}
