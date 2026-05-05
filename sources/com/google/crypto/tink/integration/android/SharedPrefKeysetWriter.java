package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.KeysetWriter;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.subtle.Hex;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public final class SharedPrefKeysetWriter implements KeysetWriter {
    private final SharedPreferences.Editor editor;
    private final String keysetName;

    public SharedPrefKeysetWriter(Context context, String keysetName, String prefFileName) throws Throwable {
        if (keysetName == null) {
            throw new IllegalArgumentException(C1561oA.Kd("1,A</?\u001a.;4o43ABDJv:>yIQIJ", (short) (C1499aX.Xd() ^ (-3742))));
        }
        this.keysetName = keysetName;
        short sXd = (short) (C1607wl.Xd() ^ 31104);
        int[] iArr = new int["\u0012Np$\u007fM:1\u001c\n\tn\u0011\u001eNg(X\rx/gS".length()];
        QB qb = new QB("\u0012Np$\u007fM:1\u001c\n\tn\u0011\u001eNg(X\rx/gS");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("`)\n:1^j?\u0005\u0012#:\u0010\te/\u0004o(\u0007>", (short) (C1633zX.Xd() ^ (-7802))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            if (prefFileName == null) {
                this.editor = PreferenceManager.getDefaultSharedPreferences(context2).edit();
                return;
            }
            short sXd2 = (short) (C1633zX.Xd() ^ (-7317));
            int[] iArr2 = new int["(4)62+%m\"-+0 (-ey%#(\u0018*%".length()];
            QB qb2 = new QB("(4)62+%m\"-+0 (-ey%#(\u0018*%");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Object[] objArr2 = {prefFileName, 0};
            Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.od("TQ_=QIYKI4UGGEQCK?@M", (short) (C1607wl.Xd() ^ 17475)), Class.forName(C1593ug.zd("@8N:\bG=KE\r3UTLRL", (short) (C1499aX.Xd() ^ (-11936)), (short) (C1499aX.Xd() ^ (-25661)))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                this.editor = ((SharedPreferences) method2.invoke(context2, objArr2)).edit();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(EncryptedKeyset keyset) throws IOException {
        if (!this.editor.putString(this.keysetName, Hex.encode(keyset.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(Keyset keyset) throws IOException {
        if (!this.editor.putString(this.keysetName, Hex.encode(keyset.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
