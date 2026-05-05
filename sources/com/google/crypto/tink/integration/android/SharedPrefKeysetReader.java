package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.crypto.tink.KeysetReader;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.subtle.Hex;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1626yg;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes7.dex */
public final class SharedPrefKeysetReader implements KeysetReader {
    private final String keysetName;
    private final SharedPreferences sharedPreferences;

    public SharedPrefKeysetReader(Context context, String keysetName, String prefFilename) throws Throwable {
        if (keysetName == null) {
            throw new IllegalArgumentException(C1626yg.Ud("\u0018(JsO<Yy\u00059-BS\u001aZ2ky(9n$q\b,", (short) (ZN.Xd() ^ 4474), (short) (ZN.Xd() ^ PhotoshopDirectory.TAG_MEASUREMENT_SCALE)));
        }
        this.keysetName = keysetName;
        Class<?> cls = Class.forName(C1561oA.yd("KYP_]XT\u001fUbbi[el'\u001dJJQCWT", (short) (ZN.Xd() ^ 17664)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 8491);
        int[] iArr = new int["-,<\n:;8610D:AA\u0017DDK=QN".length()];
        QB qb = new QB("-,<\n:;8610D:AA\u0017DDK=QN");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            if (prefFilename == null) {
                this.sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
                return;
            }
            Class<?> cls2 = Class.forName(Xg.qd(")7.=;62|3@@G9CJ\u0005\u001bHHOAUR", (short) (OY.Xd() ^ 19648), (short) (OY.Xd() ^ 1209)));
            Class<?>[] clsArr2 = {Class.forName(Jg.Wd("w!pnwih8=?\u0017\u0005FW~4", (short) (OY.Xd() ^ 4784), (short) (OY.Xd() ^ 29643))), Integer.TYPE};
            Object[] objArr2 = {prefFilename, 0};
            short sXd2 = (short) (OY.Xd() ^ 5186);
            short sXd3 = (short) (OY.Xd() ^ 4461);
            int[] iArr2 = new int["KJcclO\u0010HL\u0013\bV\\\u0011g+/\u0006&y".length()];
            QB qb2 = new QB("KJcclO\u0010HL\u0013\bV\\\u0011g+/\u0006&y");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                i3++;
            }
            Method method2 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
            try {
                method2.setAccessible(true);
                this.sharedPreferences = (SharedPreferences) method2.invoke(context2, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private byte[] readPref() throws IOException {
        try {
            String string = this.sharedPreferences.getString(this.keysetName, null);
            if (string != null) {
                return Hex.decode(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.keysetName));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.keysetName));
        }
    }

    @Override // com.google.crypto.tink.KeysetReader
    public Keyset read() throws IOException {
        return Keyset.parseFrom(readPref(), ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeysetReader
    public EncryptedKeyset readEncrypted() throws IOException {
        return EncryptedKeyset.parseFrom(readPref(), ExtensionRegistryLite.getEmptyRegistry());
    }
}
