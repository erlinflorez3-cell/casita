package com.incode.welcome_sdk.commons.extensions;

import kotlin.UByte;
import kotlin.UInt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.UStringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: b */
    private static int f5107b = 1;

    /* JADX INFO: renamed from: c */
    private static int f5108c = 0;

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.extensions.a$a */
    static final class C0215a extends Lambda implements Function1<Byte, CharSequence> {

        /* JADX INFO: renamed from: a */
        private static int f5109a = 0;

        /* JADX INFO: renamed from: b */
        private static int f5110b = 1;

        /* JADX INFO: renamed from: c */
        public static final C0215a f5111c = new C0215a();

        /* JADX INFO: renamed from: d */
        private static int f5112d = 1;

        /* JADX INFO: renamed from: e */
        private static int f5113e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CharSequence invoke(Byte b2) {
            int i2 = 2 % 2;
            int i3 = f5112d + 3;
            f5109a = i3 % 128;
            int i4 = i3 % 2;
            CharSequence charSequenceE = e(b2.byteValue());
            int i5 = f5112d + 125;
            f5109a = i5 % 128;
            int i6 = i5 % 2;
            return charSequenceE;
        }

        private static CharSequence e(byte b2) {
            String strM10294toStringV7xB4Y4;
            char c2;
            int i2 = 2;
            int i3 = 2 % 2;
            int i4 = f5109a + 125;
            f5112d = i4 % 128;
            if (i4 % 2 == 0) {
                strM10294toStringV7xB4Y4 = UStringsKt.m10294toStringV7xB4Y4(UInt.m9075constructorimpl(UByte.m8998constructorimpl(b2) & 32074), 43);
                i2 = 4;
                c2 = '8';
            } else {
                strM10294toStringV7xB4Y4 = UStringsKt.m10294toStringV7xB4Y4(UInt.m9075constructorimpl(UByte.m8998constructorimpl(b2) & 255), 16);
                c2 = '0';
            }
            return StringsKt.padStart(strM10294toStringV7xB4Y4, i2, c2);
        }

        static {
            int i2 = f5110b + 13;
            f5113e = i2 % 128;
            int i3 = i2 % 2;
        }

        C0215a() {
            super(1);
        }
    }

    public static final String c(byte[] bArr) {
        String strJoinToString$default;
        int i2 = 2 % 2;
        int i3 = f5108c + 111;
        f5107b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            strJoinToString$default = ArraysKt.joinToString$default(bArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 1, (CharSequence) null, (Function1) C0215a.f5111c, 68, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(bArr, "");
            strJoinToString$default = ArraysKt.joinToString$default(bArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) C0215a.f5111c, 30, (Object) null);
        }
        int i4 = f5107b + 107;
        f5108c = i4 % 128;
        if (i4 % 2 == 0) {
            return strJoinToString$default;
        }
        throw null;
    }
}
