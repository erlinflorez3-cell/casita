package com.ts.coresdk.c.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKeys;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {
    private final String cU;
    private final SharedPreferences cV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str) throws Throwable {
        super(context, str);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        String orCreate = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC);
        Intrinsics.checkNotNullExpressionValue(orCreate, "");
        this.cU = orCreate;
        SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create(str, orCreate, E(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "");
        this.cV = sharedPreferencesCreate;
    }

    @Override // com.ts.coresdk.c.a.a.c
    public SharedPreferences C() {
        return this.cV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ts.coresdk.c.a.a.c
    public <R> R a(Object obj, KClass<R> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        if (obj != 0) {
            return obj;
        }
        return null;
    }

    @Override // com.ts.coresdk.c.a.a.c
    public KClass<? extends Object> a(KClass<? extends Object> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        return kClass;
    }

    @Override // com.ts.coresdk.c.a.a.c
    public Object b(Object obj) {
        return obj;
    }

    @Override // com.ts.coresdk.c.a.a.c
    public Object c(Object obj) {
        return obj;
    }
}
