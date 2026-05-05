package org.spongycastle.asn1.eac;

import com.dynatrace.android.agent.Global;
import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes2.dex */
public class Flags {
    int value;

    private class StringJoiner {
        boolean First = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        StringBuffer f27809b = new StringBuffer();
        String mSeparator;

        public StringJoiner(String str) {
            this.mSeparator = str;
        }

        public void add(String str) {
            if (this.First) {
                this.First = false;
            } else {
                this.f27809b.append(this.mSeparator);
            }
            this.f27809b.append(str);
        }

        public String toString() {
            return this.f27809b.toString();
        }
    }

    public Flags() {
        this.value = 0;
    }

    public Flags(int i2) {
        this.value = i2;
    }

    String decode(Hashtable hashtable) {
        StringJoiner stringJoiner = new StringJoiner(Global.BLANK);
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Integer num = (Integer) enumerationKeys.nextElement();
            if (isSet(num.intValue())) {
                stringJoiner.add((String) hashtable.get(num));
            }
        }
        return stringJoiner.toString();
    }

    public int getFlags() {
        return this.value;
    }

    public boolean isSet(int i2) {
        return (i2 & this.value) != 0;
    }

    public void set(int i2) {
        int i3 = this.value;
        this.value = (i2 + i3) - (i2 & i3);
    }
}
