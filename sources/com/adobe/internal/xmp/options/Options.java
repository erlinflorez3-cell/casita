package com.adobe.internal.xmp.options;

import com.adobe.internal.xmp.XMPException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Options {
    private int options = 0;
    private Map optionNames = null;

    public Options() {
    }

    public Options(int i2) throws XMPException {
        assertOptionsValid(i2);
        setOptions(i2);
    }

    private void assertOptionsValid(int i2) throws XMPException {
        int i3 = (~getValidOptions()) & i2;
        if (i3 != 0) {
            throw new XMPException("The option bit(s) 0x" + Integer.toHexString(i3) + " are invalid!", 103);
        }
        assertConsistency(i2);
    }

    private String getOptionName(int i2) {
        Map mapProcureOptionNames = procureOptionNames();
        Integer num = new Integer(i2);
        String str = (String) mapProcureOptionNames.get(num);
        if (str != null) {
            return str;
        }
        String strDefineOptionName = defineOptionName(i2);
        if (strDefineOptionName == null) {
            return "<option name not defined>";
        }
        mapProcureOptionNames.put(num, strDefineOptionName);
        return strDefineOptionName;
    }

    private Map procureOptionNames() {
        if (this.optionNames == null) {
            this.optionNames = new HashMap();
        }
        return this.optionNames;
    }

    protected void assertConsistency(int i2) throws XMPException {
    }

    public void clear() {
        this.options = 0;
    }

    public boolean containsAllOptions(int i2) {
        int options = getOptions();
        return (options + i2) - (options | i2) == i2;
    }

    public boolean containsOneOf(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - getOptions())) != 0;
    }

    protected abstract String defineOptionName(int i2);

    public boolean equals(Object obj) {
        return getOptions() == ((Options) obj).getOptions();
    }

    protected boolean getOption(int i2) {
        return (i2 & this.options) != 0;
    }

    public int getOptions() {
        return this.options;
    }

    public String getOptionsString() {
        if (this.options == 0) {
            return "<none>";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = this.options;
        while (i2 != 0) {
            int i3 = (-1) - (((-1) - (i2 - 1)) | ((-1) - i2));
            stringBuffer.append(getOptionName(i2 ^ i3));
            if (i3 != 0) {
                stringBuffer.append(" | ");
            }
            i2 = i3;
        }
        return stringBuffer.toString();
    }

    protected abstract int getValidOptions();

    public int hashCode() {
        return getOptions();
    }

    public boolean isExactly(int i2) {
        return getOptions() == i2;
    }

    public void setOption(int i2, boolean z2) {
        int i3;
        if (z2) {
            int i4 = this.options;
            i3 = (i2 + i4) - (i2 & i4);
        } else {
            i3 = (~i2) & this.options;
        }
        this.options = i3;
    }

    public void setOptions(int i2) throws XMPException {
        assertOptionsValid(i2);
        this.options = i2;
    }

    public String toString() {
        return "0x" + Integer.toHexString(this.options);
    }
}
