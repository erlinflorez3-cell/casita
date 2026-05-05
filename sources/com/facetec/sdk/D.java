package com.facetec.sdk;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class D implements ZoomEncryptStrings {
    String B;
    String Code;
    String D;
    String F;
    ArrayList<String> I;
    String L;
    cv V;
    String Z;

    public /* synthetic */ D() {
    }

    D(String str, cv cvVar, ArrayList<String> arrayList, String str2, String str3, String str4, String str5, String str6) {
        this.Code = str;
        this.V = cvVar;
        this.I = arrayList;
        this.Z = str2;
        this.B = str3;
        this.F = str4;
        this.L = str5;
        this.D = str6;
    }

    static D Z(byte[] bArr) throws Exception {
        return (D) new cp().Code().I().Z(new String(bArr, 0, bArr.length, StandardCharsets.UTF_8), D.class);
    }

    final byte[] Code() throws Exception {
        return new cp().Code().I().I(this).getBytes(StandardCharsets.UTF_8);
    }
}
