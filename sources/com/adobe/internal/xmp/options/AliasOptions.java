package com.adobe.internal.xmp.options;

import com.adobe.internal.xmp.XMPException;

/* JADX INFO: loaded from: classes4.dex */
public final class AliasOptions extends Options {
    public static final int PROP_ARRAY = 512;
    public static final int PROP_ARRAY_ALTERNATE = 2048;
    public static final int PROP_ARRAY_ALT_TEXT = 4096;
    public static final int PROP_ARRAY_ORDERED = 1024;
    public static final int PROP_DIRECT = 0;

    public AliasOptions() {
    }

    public AliasOptions(int i2) throws XMPException {
        super(i2);
    }

    @Override // com.adobe.internal.xmp.options.Options
    protected String defineOptionName(int i2) {
        if (i2 == 0) {
            return "PROP_DIRECT";
        }
        if (i2 == 512) {
            return "ARRAY";
        }
        if (i2 == 1024) {
            return "ARRAY_ORDERED";
        }
        if (i2 == 2048) {
            return "ARRAY_ALTERNATE";
        }
        if (i2 != 4096) {
            return null;
        }
        return "ARRAY_ALT_TEXT";
    }

    @Override // com.adobe.internal.xmp.options.Options
    protected int getValidOptions() {
        return 7680;
    }

    public boolean isArray() {
        return getOption(512);
    }

    public boolean isArrayAltText() {
        return getOption(4096);
    }

    public boolean isArrayAlternate() {
        return getOption(2048);
    }

    public boolean isArrayOrdered() {
        return getOption(1024);
    }

    public boolean isSimple() {
        return getOptions() == 0;
    }

    public AliasOptions setArray(boolean z2) {
        setOption(512, z2);
        return this;
    }

    public AliasOptions setArrayAltText(boolean z2) {
        setOption(7680, z2);
        return this;
    }

    public AliasOptions setArrayAlternate(boolean z2) {
        setOption(3584, z2);
        return this;
    }

    public AliasOptions setArrayOrdered(boolean z2) {
        setOption(1536, z2);
        return this;
    }

    public PropertyOptions toPropertyOptions() throws XMPException {
        return new PropertyOptions(getOptions());
    }
}
