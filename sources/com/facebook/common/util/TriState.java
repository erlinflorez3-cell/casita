package com.facebook.common.util;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public enum TriState {
    YES,
    NO,
    UNSET;

    /* JADX INFO: renamed from: com.facebook.common.util.TriState$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$common$util$TriState;

        static {
            int[] iArr = new int[TriState.values().length];
            $SwitchMap$com$facebook$common$util$TriState = iArr;
            try {
                iArr[TriState.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$common$util$TriState[TriState.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$common$util$TriState[TriState.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static TriState fromDbValue(int i2) {
        return i2 != 1 ? i2 != 2 ? UNSET : NO : YES;
    }

    public static TriState valueOf(@Nullable Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    public static TriState valueOf(boolean z2) {
        return z2 ? YES : NO;
    }

    public boolean asBoolean() {
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        if (i2 != 3) {
            throw new IllegalStateException("Unrecognized TriState value: " + this);
        }
        throw new IllegalStateException("No boolean equivalent for UNSET");
    }

    public boolean asBoolean(boolean z2) {
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        if (i2 == 3) {
            return z2;
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    @Nullable
    public Boolean asBooleanObject() {
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
        if (i2 == 1) {
            return Boolean.TRUE;
        }
        if (i2 == 2) {
            return Boolean.FALSE;
        }
        if (i2 == 3) {
            return null;
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    public int getDbValue() {
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 3;
            }
        }
        return i3;
    }

    public boolean isSet() {
        return this != UNSET;
    }
}
