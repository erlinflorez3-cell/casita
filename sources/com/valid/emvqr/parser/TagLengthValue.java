package com.valid.emvqr.parser;

/* JADX INFO: loaded from: classes5.dex */
public class TagLengthValue {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f18320l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18321p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f18322v;

    public TagLengthValue(String str, int i2, String str2) {
        this.f18320l = str;
        this.f18321p = i2;
        this.f18322v = str2;
    }

    public int getLength() {
        return this.f18321p;
    }

    public String getTag() {
        return this.f18320l;
    }

    public String getValue() {
        return this.f18322v;
    }
}
