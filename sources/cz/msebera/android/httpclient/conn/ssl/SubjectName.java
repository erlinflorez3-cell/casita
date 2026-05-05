package cz.msebera.android.httpclient.conn.ssl;

import cz.msebera.android.httpclient.util.Args;

/* JADX INFO: loaded from: classes5.dex */
final class SubjectName {
    static final int DNS = 2;
    static final int IP = 7;
    private final int type;
    private final String value;

    SubjectName(String str, int i2) {
        this.value = (String) Args.notNull(str, "Value");
        this.type = Args.positive(i2, "Type");
    }

    static SubjectName DNS(String str) {
        return new SubjectName(str, 2);
    }

    static SubjectName IP(String str) {
        return new SubjectName(str, 7);
    }

    public int getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return this.value;
    }
}
