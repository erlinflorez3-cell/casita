package com.adobe.internal.xmp.options;

import com.adobe.internal.xmp.XMPException;

/* JADX INFO: loaded from: classes4.dex */
public final class PropertyOptions extends Options {
    public static final int ARRAY = 512;
    public static final int ARRAY_ALTERNATE = 2048;
    public static final int ARRAY_ALT_TEXT = 4096;
    public static final int ARRAY_ORDERED = 1024;
    public static final int DELETE_EXISTING = 536870912;
    public static final int HAS_LANGUAGE = 64;
    public static final int HAS_QUALIFIERS = 16;
    public static final int HAS_TYPE = 128;
    public static final int NO_OPTIONS = 0;
    public static final int QUALIFIER = 32;
    public static final int SCHEMA_NODE = Integer.MIN_VALUE;
    public static final int STRUCT = 256;
    public static final int URI = 2;
    private int arrayElementsLimit;

    public PropertyOptions() {
        this.arrayElementsLimit = -1;
    }

    public PropertyOptions(int i2) throws XMPException {
        super(i2);
        this.arrayElementsLimit = -1;
    }

    @Override // com.adobe.internal.xmp.options.Options
    public void assertConsistency(int i2) throws XMPException {
        if ((i2 + 256) - (256 | i2) > 0 && (-1) - (((-1) - i2) | ((-1) - 512)) > 0) {
            throw new XMPException("IsStruct and IsArray options are mutually exclusive", 103);
        }
        if ((i2 + 2) - (2 | i2) > 0 && (i2 + 768) - (i2 | 768) > 0) {
            throw new XMPException("Structs and arrays can't have \"value\" options", 103);
        }
    }

    @Override // com.adobe.internal.xmp.options.Options
    protected String defineOptionName(int i2) {
        switch (i2) {
            case Integer.MIN_VALUE:
                return "SCHEMA_NODE";
            case 2:
                return "URI";
            case 16:
                return "HAS_QUALIFIER";
            case 32:
                return "QUALIFIER";
            case 64:
                return "HAS_LANGUAGE";
            case 128:
                return "HAS_TYPE";
            case 256:
                return "STRUCT";
            case 512:
                return "ARRAY";
            case 1024:
                return "ARRAY_ORDERED";
            case 2048:
                return "ARRAY_ALTERNATE";
            case 4096:
                return "ARRAY_ALT_TEXT";
            default:
                return null;
        }
    }

    public boolean equalArrayTypes(PropertyOptions propertyOptions) {
        return isArray() == propertyOptions.isArray() && isArrayOrdered() == propertyOptions.isArrayOrdered() && isArrayAlternate() == propertyOptions.isArrayAlternate() && isArrayAltText() == propertyOptions.isArrayAltText();
    }

    public int getArrayElementsLimit() {
        return this.arrayElementsLimit;
    }

    public boolean getHasLanguage() {
        return getOption(64);
    }

    public boolean getHasQualifiers() {
        return getOption(16);
    }

    public boolean getHasType() {
        return getOption(128);
    }

    @Override // com.adobe.internal.xmp.options.Options
    protected int getValidOptions() {
        return -1610604558;
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

    public boolean isArrayLimited() {
        return this.arrayElementsLimit != -1;
    }

    public boolean isArrayOrdered() {
        return getOption(1024);
    }

    public boolean isCompositeProperty() {
        return (getOptions() & 768) > 0;
    }

    public boolean isOnlyArrayOptions() {
        int options = getOptions();
        return (options + (-7681)) - (options | (-7681)) == 0;
    }

    public boolean isQualifier() {
        return getOption(32);
    }

    public boolean isSchemaNode() {
        return getOption(Integer.MIN_VALUE);
    }

    public boolean isSimple() {
        int options = getOptions();
        return (options + 768) - (options | 768) == 0;
    }

    public boolean isStruct() {
        return getOption(256);
    }

    public boolean isURI() {
        return getOption(2);
    }

    public void mergeWith(PropertyOptions propertyOptions) throws XMPException {
        if (propertyOptions != null) {
            setOptions((-1) - (((-1) - propertyOptions.getOptions()) & ((-1) - getOptions())));
        }
    }

    public PropertyOptions setArray(boolean z2) {
        setOption(512, z2);
        return this;
    }

    public PropertyOptions setArrayAltText(boolean z2) {
        setOption(4096, z2);
        return this;
    }

    public PropertyOptions setArrayAlternate(boolean z2) {
        setOption(2048, z2);
        return this;
    }

    public PropertyOptions setArrayElementLimit(int i2) {
        this.arrayElementsLimit = i2;
        return this;
    }

    public PropertyOptions setArrayOrdered(boolean z2) {
        setOption(1024, z2);
        return this;
    }

    public PropertyOptions setHasLanguage(boolean z2) {
        setOption(64, z2);
        return this;
    }

    public PropertyOptions setHasQualifiers(boolean z2) {
        setOption(16, z2);
        return this;
    }

    public PropertyOptions setHasType(boolean z2) {
        setOption(128, z2);
        return this;
    }

    public PropertyOptions setQualifier(boolean z2) {
        setOption(32, z2);
        return this;
    }

    public PropertyOptions setSchemaNode(boolean z2) {
        setOption(Integer.MIN_VALUE, z2);
        return this;
    }

    public PropertyOptions setStruct(boolean z2) {
        setOption(256, z2);
        return this;
    }

    public PropertyOptions setURI(boolean z2) {
        setOption(2, z2);
        return this;
    }
}
