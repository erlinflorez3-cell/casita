package com.ts.coresdk.logger.db;

import android.content.Context;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.crypto.api.CryptographyManager;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(String str, Context context, ITSModuleInfo iTSModuleInfo) {
        String strEncrypt = CryptographyManager.INSTANCE.encrypt(context, str, iTSModuleInfo);
        return strEncrypt == null ? "" : strEncrypt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str, Context context, ITSModuleInfo iTSModuleInfo) {
        String strDecrypt = CryptographyManager.INSTANCE.decrypt(context, str, iTSModuleInfo);
        return strDecrypt == null ? "" : strDecrypt;
    }
}
