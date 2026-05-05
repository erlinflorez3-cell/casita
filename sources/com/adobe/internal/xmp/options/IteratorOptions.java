package com.adobe.internal.xmp.options;

/* JADX INFO: loaded from: classes4.dex */
public final class IteratorOptions extends Options {
    public static final int JUST_CHILDREN = 256;
    public static final int JUST_LEAFNAME = 1024;
    public static final int JUST_LEAFNODES = 512;
    public static final int OMIT_QUALIFIERS = 4096;

    @Override // com.adobe.internal.xmp.options.Options
    protected String defineOptionName(int i2) {
        if (i2 == 256) {
            return "JUST_CHILDREN";
        }
        if (i2 == 512) {
            return "JUST_LEAFNODES";
        }
        if (i2 == 1024) {
            return "JUST_LEAFNAME";
        }
        if (i2 != 4096) {
            return null;
        }
        return "OMIT_QUALIFIERS";
    }

    @Override // com.adobe.internal.xmp.options.Options
    protected int getValidOptions() {
        return 5888;
    }

    public boolean isJustChildren() {
        return getOption(256);
    }

    public boolean isJustLeafname() {
        return getOption(1024);
    }

    public boolean isJustLeafnodes() {
        return getOption(512);
    }

    public boolean isOmitQualifiers() {
        return getOption(4096);
    }

    public IteratorOptions setJustChildren(boolean z2) {
        setOption(256, z2);
        return this;
    }

    public IteratorOptions setJustLeafname(boolean z2) {
        setOption(1024, z2);
        return this;
    }

    public IteratorOptions setJustLeafnodes(boolean z2) {
        setOption(512, z2);
        return this;
    }

    public IteratorOptions setOmitQualifiers(boolean z2) {
        setOption(4096, z2);
        return this;
    }
}
