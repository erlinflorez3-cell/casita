package com.bumptech.glide.signature;

import android.content.Context;
import android.content.res.Resources;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Util;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidResourceSignature implements Key {
    private final Key applicationVersion;
    private final int nightMode;

    private AndroidResourceSignature(int i2, Key key) {
        this.nightMode = i2;
        this.applicationVersion = key;
    }

    public static Key obtain(Context context) throws Throwable {
        Key keyObtain = ApplicationVersionSignature.obtain(context);
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("sH\u0012\u0003\u001aPi]M87\u001d<QmG!1\u000b;fD`", (short) (C1633zX.Xd() ^ (-542)))).getMethod(C1561oA.Qd("VSa>P]X]YIJW", (short) (C1607wl.Xd() ^ 24271)), new Class[0]);
        try {
            method.setAccessible(true);
            int i2 = ((Resources) method.invoke(context, objArr)).getConfiguration().uiMode;
            return new AndroidResourceSignature((i2 + 48) - (i2 | 48), keyObtain);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof AndroidResourceSignature)) {
            return false;
        }
        AndroidResourceSignature androidResourceSignature = (AndroidResourceSignature) obj;
        return this.nightMode == androidResourceSignature.nightMode && this.applicationVersion.equals(androidResourceSignature.applicationVersion);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return Util.hashCode(this.applicationVersion, this.nightMode);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.applicationVersion.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.nightMode).array());
    }
}
