package com.adobe.internal.xmp.impl.xpath;

/* JADX INFO: loaded from: classes4.dex */
public class XMPPathSegment {
    private boolean alias;
    private int aliasForm;
    private int kind;
    private String name;

    public XMPPathSegment(String str) {
        this.name = str;
    }

    public XMPPathSegment(String str, int i2) {
        this.name = str;
        this.kind = i2;
    }

    public int getAliasForm() {
        return this.aliasForm;
    }

    public int getKind() {
        return this.kind;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAlias() {
        return this.alias;
    }

    public void setAlias(boolean z2) {
        this.alias = z2;
    }

    public void setAliasForm(int i2) {
        this.aliasForm = i2;
    }

    public void setKind(int i2) {
        this.kind = i2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        switch (this.kind) {
        }
        return this.name;
    }
}
