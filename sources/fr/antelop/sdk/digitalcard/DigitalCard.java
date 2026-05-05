package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopCallback;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.card.AccountInfo;
import fr.antelop.sdk.card.CardDisplay;
import fr.antelop.sdk.card.CardInfo;
import fr.antelop.sdk.card.CardStatus;
import fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControlService;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.Date;
import o.a.n;
import o.ea.f;
import o.ep.c;
import o.ep.d;
import o.eq.e;
import o.er.g;
import o.er.l;
import o.er.p;
import o.er.q;
import o.er.r;
import o.er.s;
import o.er.t;
import o.er.u;
import o.er.v;
import o.er.x;
import o.er.y;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class DigitalCard {
    private CardDisplay cardDisplay;
    private final d innerCard;
    private CardInfo cardInfo = null;
    private AccountInfo accountInfo = null;

    /* JADX INFO: renamed from: fr.antelop.sdk.digitalcard.DigitalCard$1 */
    public class AnonymousClass1 implements OperationCallback<Void> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static char f19070a = 0;

        /* JADX INFO: renamed from: b */
        private static char[] f19071b = null;

        /* JADX INFO: renamed from: c */
        private static int f19072c = 0;

        /* JADX INFO: renamed from: d */
        private static int f19073d = 0;

        /* JADX INFO: renamed from: e */
        private static int f19074e = 0;

        /* JADX INFO: renamed from: f */
        public static int f19075f = 0;

        /* JADX INFO: renamed from: g */
        private static int f19076g = 0;

        /* JADX INFO: renamed from: h */
        private static int f19077h = 0;

        /* JADX INFO: renamed from: i */
        public static int f19078i = 0;

        /* JADX INFO: renamed from: j */
        public static int f19079j = 0;

        /* JADX INFO: renamed from: k */
        public static int f19080k = 0;
        final /* synthetic */ AntelopCallback val$callback;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(short r8, short r9, byte r10) {
            /*
                int r2 = r8 + 4
                byte[] r8 = fr.antelop.sdk.digitalcard.DigitalCard.AnonymousClass1.$$c
                int r1 = 115 - r10
                int r3 = r9 * 3
                int r0 = 1 - r3
                byte[] r7 = new byte[r0]
                r6 = 0
                int r5 = 0 - r3
                if (r8 != 0) goto L2b
                r0 = r2
                r3 = r5
                r4 = r6
            L14:
                int r1 = -r2
                int r1 = r1 + r3
                r3 = r4
                r2 = r0
            L18:
                int r0 = r2 + 1
                byte r2 = (byte) r1
                r7[r3] = r2
                int r4 = r3 + 1
                if (r3 != r5) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r7, r6)
                return r0
            L27:
                r2 = r8[r0]
                r3 = r1
                goto L14
            L2b:
                r3 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.DigitalCard.AnonymousClass1.$$e(short, short, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f19080k = -1563169681;
            f19079j = -685835998;
            f19078i = 1448608370;
            f19075f = 1920105350;
            init$0();
            f19077h = 0;
            f19076g = 1;
            f19074e = 0;
            f19073d = 1;
            b();
            f19072c = -1270219508;
            int i2 = f19076g + 27;
            f19077h = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 0;
            }
        }

        AnonymousClass1(AntelopCallback antelopCallback) {
            antelopCallback = antelopCallback;
        }

        static void b() {
            f19071b = new char[]{64582, 64587, 64598, 64522, 64599, 64585, 64620, 64588, 64612, 64523, 64576, 64605, 64580, 64614, 64520, 64584, 64586, 64597, 64590, 64593, 64577, 64578, 64579, 64592, 64583};
            f19070a = (char) 51642;
        }

        /* JADX WARN: Removed duplicated region for block: B:138:0x02d3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] d(android.content.Context r29, int r30, int r31, int r32) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1667
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.DigitalCard.AnonymousClass1.d(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{Ascii.SYN, -5, 39, 97};
            $$b = 135;
        }

        static void init$1() {
            $$c = new byte[]{124, 69, -84, MessagePack.Code.STR8};
            $$d = 97;
        }

        /* JADX WARN: Removed duplicated region for block: B:123:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0173  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void l(java.lang.String r29, int r30, byte r31, java.lang.Object[] r32) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 922
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.DigitalCard.AnonymousClass1.l(java.lang.String, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0012). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void m(short r9, byte r10, byte r11, java.lang.Object[] r12) {
            /*
                int r8 = 101 - r11
                int r0 = r9 * 3
                int r7 = 1 - r0
                int r6 = r10 + 4
                byte[] r5 = fr.antelop.sdk.digitalcard.DigitalCard.AnonymousClass1.$$a
                byte[] r4 = new byte[r7]
                r3 = 0
                if (r5 != 0) goto L28
                r0 = r8
                r2 = r3
                r8 = r7
            L12:
                int r8 = r8 + r0
                r1 = r2
            L14:
                int r6 = r6 + 1
                int r2 = r1 + 1
                byte r0 = (byte) r8
                r4[r1] = r0
                if (r2 != r7) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r12[r3] = r0
                return
            L25:
                r0 = r5[r6]
                goto L12
            L28:
                r1 = r3
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.DigitalCard.AnonymousClass1.m(short, byte, byte, java.lang.Object[]):void");
        }

        private static void n(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
            Object obj;
            char[] cArr;
            String str2 = str;
            int i5 = 2 % 2;
            int i6 = $10 + 97;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            if (str2 != null) {
                char[] charArray = str2.toCharArray();
                int i8 = $11 + 103;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                obj = charArray;
            } else {
                obj = str2;
            }
            char[] cArr2 = (char[]) obj;
            n nVar = new n();
            char[] cArr3 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                nVar.f19946e = cArr2[nVar.f19944a];
                cArr3[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                int i10 = nVar.f19944a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i10]), Integer.valueOf(f19072c)};
                    Object objA = o.d.d.a(1376241034);
                    if (objA == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(270 - Color.green(0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 11, -2071844881, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {nVar, nVar};
                    Object objA2 = o.d.d.a(-202660535);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 521, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, 627984172, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i4 > 0) {
                int i11 = $10 + 81;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                nVar.f19945b = i4;
                char[] cArr4 = new char[i2];
                System.arraycopy(cArr3, 0, cArr4, 0, i2);
                System.arraycopy(cArr4, 0, cArr3, i2 - nVar.f19945b, nVar.f19945b);
                System.arraycopy(cArr4, nVar.f19945b, cArr3, 0, i2 - nVar.f19945b);
            }
            if (z2) {
                int i13 = $11 + 13;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr = new char[i2];
                    nVar.f19944a = 1;
                } else {
                    cArr = new char[i2];
                    nVar.f19944a = 0;
                }
                while (nVar.f19944a < i2) {
                    cArr[nVar.f19944a] = cArr3[(i2 - nVar.f19944a) - 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objA3 = o.d.d.a(522 - View.MeasureSpec.getMode(0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 627984172, false, $$e(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    int i14 = $10 + 73;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                }
                cArr3 = cArr;
            }
            objArr[0] = new String(cArr3);
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public void onError(AntelopError antelopError) {
            int i2 = 2 % 2;
            int i3 = f19073d + 19;
            f19074e = i3 % 128;
            if (i3 % 2 == 0) {
                antelopCallback.onError(antelopError);
            } else {
                antelopCallback.onError(antelopError);
                int i4 = 54 / 0;
            }
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r4) {
            int i2 = 2 % 2;
            int i3 = f19074e + 61;
            f19073d = i3 % 128;
            int i4 = i3 % 2;
            onSuccess2(r4);
            int i5 = f19074e + 63;
            f19073d = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX INFO: renamed from: onSuccess */
        public void onSuccess2(Void r4) {
            int i2 = 2 % 2;
            int i3 = f19073d + 85;
            f19074e = i3 % 128;
            int i4 = i3 % 2;
            antelopCallback.onSuccess();
            int i5 = f19074e + 75;
            f19073d = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public DigitalCard(d dVar) {
        this.innerCard = dVar;
    }

    @Deprecated
    public final void delete(Context context, AntelopCallback antelopCallback) throws Throwable {
        this.innerCard.d(context, antelopCallback != null ? new OperationCallback<Void>() { // from class: fr.antelop.sdk.digitalcard.DigitalCard.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a */
            private static char f19070a = 0;

            /* JADX INFO: renamed from: b */
            private static char[] f19071b = null;

            /* JADX INFO: renamed from: c */
            private static int f19072c = 0;

            /* JADX INFO: renamed from: d */
            private static int f19073d = 0;

            /* JADX INFO: renamed from: e */
            private static int f19074e = 0;

            /* JADX INFO: renamed from: f */
            public static int f19075f = 0;

            /* JADX INFO: renamed from: g */
            private static int f19076g = 0;

            /* JADX INFO: renamed from: h */
            private static int f19077h = 0;

            /* JADX INFO: renamed from: i */
            public static int f19078i = 0;

            /* JADX INFO: renamed from: j */
            public static int f19079j = 0;

            /* JADX INFO: renamed from: k */
            public static int f19080k = 0;
            final /* synthetic */ AntelopCallback val$callback;

            private static String $$e(short v2, short v3, byte v4) {
                /*
                    int r2 = r8 + 4
                    byte[] r8 = fr.antelop.sdk.digitalcard.DigitalCard.AnonymousClass1.$$c
                    int r1 = 115 - r10
                    int r3 = r9 * 3
                    int r0 = 1 - r3
                    byte[] r7 = new byte[r0]
                    r6 = 0
                    int r5 = 0 - r3
                    if (r8 != 0) goto L2b
                    r0 = r2
                    r3 = r5
                    r4 = r6
                L14:
                    int r1 = -r2
                    int r1 = r1 + r3
                    r3 = r4
                    r2 = r0
                L18:
                    int r0 = r2 + 1
                    byte r2 = (byte) r1
                    r7[r3] = r2
                    int r4 = r3 + 1
                    if (r3 != r5) goto L27
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r7, r6)
                    return r0
                L27:
                    r2 = r8[r0]
                    r3 = r1
                    goto L14
                L2b:
                    r3 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.DigitalCard.AnonymousClass1.$$e(short, short, byte):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f19080k = -1563169681;
                f19079j = -685835998;
                f19078i = 1448608370;
                f19075f = 1920105350;
                init$0();
                f19077h = 0;
                f19076g = 1;
                f19074e = 0;
                f19073d = 1;
                b();
                f19072c = -1270219508;
                int i2 = f19076g + 27;
                f19077h = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 3 / 0;
                }
            }

            AnonymousClass1(AntelopCallback antelopCallback2) {
                antelopCallback = antelopCallback2;
            }

            static void b() {
                f19071b = new char[]{64582, 64587, 64598, 64522, 64599, 64585, 64620, 64588, 64612, 64523, 64576, 64605, 64580, 64614, 64520, 64584, 64586, 64597, 64590, 64593, 64577, 64578, 64579, 64592, 64583};
                f19070a = (char) 51642;
            }

            /* JADX WARN: Removed duplicated region for block: B:138:0x02d3  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] d(android.content.Context r29, int r30, int r31, int r32) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1667
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.DigitalCard.AnonymousClass1.d(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{Ascii.SYN, -5, 39, 97};
                $$b = 135;
            }

            static void init$1() {
                $$c = new byte[]{124, 69, -84, MessagePack.Code.STR8};
                $$d = 97;
            }

            /* JADX WARN: Removed duplicated region for block: B:123:0x0143  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x0173  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void l(java.lang.String r29, int r30, byte r31, java.lang.Object[] r32) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 922
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.DigitalCard.AnonymousClass1.l(java.lang.String, int, byte, java.lang.Object[]):void");
            }

            private static void m(short v2, byte v3, byte v4, Object[] v5) {
                /*
                    int r8 = 101 - r11
                    int r0 = r9 * 3
                    int r7 = 1 - r0
                    int r6 = r10 + 4
                    byte[] r5 = fr.antelop.sdk.digitalcard.DigitalCard.AnonymousClass1.$$a
                    byte[] r4 = new byte[r7]
                    r3 = 0
                    if (r5 != 0) goto L28
                    r0 = r8
                    r2 = r3
                    r8 = r7
                L12:
                    int r8 = r8 + r0
                    r1 = r2
                L14:
                    int r6 = r6 + 1
                    int r2 = r1 + 1
                    byte r0 = (byte) r8
                    r4[r1] = r0
                    if (r2 != r7) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    r12[r3] = r0
                    return
                L25:
                    r0 = r5[r6]
                    goto L12
                L28:
                    r1 = r3
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.DigitalCard.AnonymousClass1.m(short, byte, byte, java.lang.Object[]):void");
            }

            private static void n(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
                Object obj;
                char[] cArr;
                String str2 = str;
                int i5 = 2 % 2;
                int i6 = $10 + 97;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                if (str2 != null) {
                    char[] charArray = str2.toCharArray();
                    int i8 = $11 + 103;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    obj = charArray;
                } else {
                    obj = str2;
                }
                char[] cArr2 = (char[]) obj;
                n nVar = new n();
                char[] cArr3 = new char[i2];
                nVar.f19944a = 0;
                while (nVar.f19944a < i2) {
                    nVar.f19946e = cArr2[nVar.f19944a];
                    cArr3[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                    int i10 = nVar.f19944a;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i10]), Integer.valueOf(f19072c)};
                        Object objA = o.d.d.a(1376241034);
                        if (objA == null) {
                            byte b2 = (byte) (-1);
                            byte b3 = (byte) (b2 + 1);
                            objA = o.d.d.a(270 - Color.green(0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 11, -2071844881, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {nVar, nVar};
                        Object objA2 = o.d.d.a(-202660535);
                        if (objA2 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objA2 = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 521, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, 627984172, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                if (i4 > 0) {
                    int i11 = $10 + 81;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    nVar.f19945b = i4;
                    char[] cArr4 = new char[i2];
                    System.arraycopy(cArr3, 0, cArr4, 0, i2);
                    System.arraycopy(cArr4, 0, cArr3, i2 - nVar.f19945b, nVar.f19945b);
                    System.arraycopy(cArr4, nVar.f19945b, cArr3, 0, i2 - nVar.f19945b);
                }
                if (z2) {
                    int i13 = $11 + 13;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        cArr = new char[i2];
                        nVar.f19944a = 1;
                    } else {
                        cArr = new char[i2];
                        nVar.f19944a = 0;
                    }
                    while (nVar.f19944a < i2) {
                        cArr[nVar.f19944a] = cArr3[(i2 - nVar.f19944a) - 1];
                        Object[] objArr4 = {nVar, nVar};
                        Object objA3 = o.d.d.a(-202660535);
                        if (objA3 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (b6 + 1);
                            objA3 = o.d.d.a(522 - View.MeasureSpec.getMode(0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 627984172, false, $$e(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                        int i14 = $10 + 73;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    cArr3 = cArr;
                }
                objArr[0] = new String(cArr3);
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onError(AntelopError antelopError) {
                int i2 = 2 % 2;
                int i3 = f19073d + 19;
                f19074e = i3 % 128;
                if (i3 % 2 == 0) {
                    antelopCallback.onError(antelopError);
                } else {
                    antelopCallback.onError(antelopError);
                    int i4 = 54 / 0;
                }
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public /* bridge */ /* synthetic */ void onSuccess(Void r4) {
                int i2 = 2 % 2;
                int i3 = f19074e + 61;
                f19073d = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(r4);
                int i5 = f19074e + 63;
                f19073d = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX INFO: renamed from: onSuccess */
            public void onSuccess2(Void r4) {
                int i2 = 2 % 2;
                int i3 = f19073d + 85;
                f19074e = i3 % 128;
                int i4 = i3 % 2;
                antelopCallback.onSuccess();
                int i5 = f19074e + 75;
                f19073d = i5 % 128;
                int i6 = i5 % 2;
            }
        } : null);
    }

    public final void delete(Context context, OperationCallback<Void> operationCallback) throws Throwable {
        this.innerCard.d(context, operationCallback);
    }

    public final void deleteEcomStaticToken(Context context, OperationCallback<Void> operationCallback) throws WalletValidationException {
        new p(context, this.innerCard).d(operationCallback);
    }

    public final AccountInfo getAccountInfo() {
        if (this.innerCard.r() == null) {
            return null;
        }
        if (this.accountInfo == null) {
            this.accountInfo = new AccountInfo(this.innerCard.r());
        }
        return this.accountInfo;
    }

    @Deprecated
    public final String getBin() {
        if (this.innerCard.s() != null) {
            return this.innerCard.s().b();
        }
        return null;
    }

    public final CardDisplayService getCardDisplayService() throws WalletValidationException {
        d dVar = this.innerCard;
        return new CardDisplayService(new g(dVar, (e) dVar.G()));
    }

    public final CardInfo getCardInfo() {
        if (this.innerCard.s() == null) {
            return null;
        }
        if (this.cardInfo == null) {
            this.cardInfo = new CardInfo(this.innerCard.s());
        }
        return this.cardInfo;
    }

    public final ClickToPayService getClickToPayService() throws WalletValidationException {
        return new ClickToPayService(new l(this.innerCard, (e) this.innerCard.G()));
    }

    public final CmsActivationService getCmsActivationService() throws WalletValidationException {
        d dVar = this.innerCard;
        return new CmsActivationService(new r(dVar, (e) dVar.G()));
    }

    @Deprecated
    public final CardDisplay getDisplay() {
        if (this.cardDisplay == null) {
            if (this.innerCard.s() == null) {
                return null;
            }
            Object[] objArr = {this.innerCard.s()};
            int i2 = (-581252450) * c.f24440h;
            c.f24440h = i2;
            int i3 = (int) Runtime.getRuntime().totalMemory();
            int i4 = c.f24441i * 151058815;
            c.f24441i = i4;
            int i5 = (-518773767) * c.f24439f;
            c.f24439f = i5;
            this.cardDisplay = (CardDisplay) c.c(i2, i3, i5, -465660215, objArr, 465660217, i4);
        }
        return this.cardDisplay;
    }

    @Deprecated
    public final Date getExpiryDate() {
        if (this.innerCard.s() != null) {
            return this.innerCard.s().c();
        }
        return null;
    }

    public final GooglePayService getGooglePayService() throws WalletValidationException {
        return new GooglePayService(this.innerCard);
    }

    public final String getId() {
        return this.innerCard.b();
    }

    public final String getIssuerCardId() {
        return this.innerCard.n();
    }

    public final String getIssuerData() {
        return this.innerCard.o();
    }

    public final IssuerNfcWalletService getIssuerNfcWalletService() throws WalletValidationException {
        d dVar = this.innerCard;
        return new IssuerNfcWalletService(new q(dVar, (e) dVar.G()));
    }

    @Deprecated
    public final String getLastDigits() {
        if (this.innerCard.s() == null) {
            return null;
        }
        Object[] objArr = {this.innerCard.s()};
        int i2 = 574268897 * c.f24438e;
        c.f24438e = i2;
        int id = (int) Thread.currentThread().getId();
        int i3 = c.f24436c * 1169734117;
        c.f24436c = i3;
        int i4 = (-2104816085) * c.f24434a;
        c.f24434a = i4;
        return (String) c.c(i2, id, i4, 1241915024, objArr, -1241915024, i3);
    }

    public final PinDisplayService getPinDisplayService() throws WalletValidationException {
        d dVar = this.innerCard;
        return new PinDisplayService(new s(dVar, (e) dVar.G()));
    }

    public final PinUpdateService getPinUpdateService() throws WalletValidationException {
        d dVar = this.innerCard;
        return new PinUpdateService(new t(dVar, (e) dVar.G()));
    }

    public final PushToTokenRequestorService getPushToTokenRequestorService() throws WalletValidationException {
        d dVar = this.innerCard;
        return new PushToTokenRequestorService(new x(dVar, (e) dVar.G()));
    }

    public final SamsungPayService getSamsungPayService() throws WalletValidationException {
        return new SamsungPayService(this.innerCard);
    }

    public final CardStatus getStatus() {
        Object[] objArr = {this.innerCard};
        int i2 = d.f24461m * (-222457364);
        d.f24461m = i2;
        int i3 = d.f24462n * 325900588;
        d.f24462n = i3;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i4 = d.f24460l * 323941697;
        d.f24460l = i4;
        return (CardStatus) d.e(1555433584, -1555433578, objArr, i3, iElapsedRealtime, i4, i2);
    }

    public final TokenManagementService getTokenManagementService() throws WalletValidationException {
        d dVar = this.innerCard;
        return new TokenManagementService(new v(dVar, (e) dVar.G()));
    }

    public final TransactionControlService getTransactionControlService() throws WalletValidationException {
        d dVar = this.innerCard;
        return new TransactionControlService(new y(dVar, (e) dVar.G()));
    }

    public final VirtualCardNumberService getVirtualCardNumberService() throws WalletValidationException {
        d dVar = this.innerCard;
        return new VirtualCardNumberService(new u(dVar, (e) dVar.G()));
    }

    public final boolean isProvisioned() {
        return this.innerCard.C();
    }

    public final Boolean requiresCmsActivation() {
        return this.innerCard.d();
    }

    public final String toString() throws Throwable {
        String string = "";
        try {
            if (getCardInfo() != null) {
                string = new StringBuilder("DigitalCard{id='").append(getId()).append("', bin='").append(getCardInfo().getBin()).append("', expiryDate=").append(getCardInfo().getExpiryDate()).append(", lastDigits='").append(getCardInfo().getLastDigits()).append("', issuerData='").append(getIssuerData()).append("', issuerCardId='").append(getIssuerCardId()).append("'}").toString();
            } else if (getAccountInfo() != null) {
                string = new StringBuilder("DigitalCard{id='").append(getId()).append("', accountNumber='").append(getAccountInfo().getAccountNumber()).append("', accountLabel=").append(getAccountInfo().getAccountLabel()).append(", issuerAccountID='").append(getAccountInfo().getIssuerAccountId()).append("', issuerData='").append(getIssuerData()).append("', issuerCardId='").append(getIssuerCardId()).append("'}").toString();
            }
        } catch (Exception e2) {
            if (f.a()) {
                f.e("toString error : ".concat(String.valueOf(e2)));
            }
        }
        return string;
    }
}
