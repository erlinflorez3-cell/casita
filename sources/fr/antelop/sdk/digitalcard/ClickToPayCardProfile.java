package fr.antelop.sdk.digitalcard;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.g;
import o.a.n;
import o.d.d;
import o.er.o;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public class ClickToPayCardProfile {
    private final o innerCardProfile;

    public static class BillingAddress {
        private final o.e innerBillingAddress;

        public static class Builder {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f19010a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static char f19011b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static char f19012c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static char f19013d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static char f19014e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static int f19015f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f19016g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f19017h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f19018i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f19019j = 0;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static int f19020k = 0;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static int f19021l = 0;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static int f19022m = 0;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static int f19023n = 0;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static int f19024o = 0;
            private String city;
            private String country;
            private String line1;
            private String line2;
            private String postalCode;
            private String state;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0014). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(short r8, byte r9, int r10) {
                /*
                    byte[] r7 = fr.antelop.sdk.digitalcard.ClickToPayCardProfile.BillingAddress.Builder.$$c
                    int r1 = r8 * 4
                    int r0 = 1 - r1
                    int r6 = r9 + 69
                    int r5 = r10 + 4
                    byte[] r4 = new byte[r0]
                    r3 = 0
                    int r2 = 0 - r1
                    if (r7 != 0) goto L27
                    r0 = r6
                    r1 = r3
                    r6 = r2
                L14:
                    int r6 = r6 + r0
                L15:
                    int r5 = r5 + 1
                    byte r0 = (byte) r6
                    r4[r1] = r0
                    if (r1 != r2) goto L22
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L22:
                    int r1 = r1 + 1
                    r0 = r7[r5]
                    goto L14
                L27:
                    r1 = r3
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayCardProfile.BillingAddress.Builder.$$e(short, byte, int):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f19024o = -833280450;
                f19023n = 1768025236;
                f19022m = -1595489413;
                f19021l = -1342375123;
                f19020k = -711100686;
                f19015f = 1740211876;
                init$0();
                f19016g = 0;
                f19019j = 1;
                f19018i = 0;
                f19017h = 1;
                d();
                f19010a = -1270219389;
                int i2 = f19019j + 89;
                f19016g = i2 % 128;
                int i3 = i2 % 2;
            }

            static void d() {
                f19014e = (char) 54419;
                f19011b = (char) 47493;
                f19012c = (char) 4648;
                f19013d = (char) 22292;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(10:(2:87|28)|(4:30|92|31|(7:33|91|42|(2:44|45)(4:48|88|49|50)|(6:90|54|(2:56|63)(5:57|83|58|59|64)|65|(1:67)(1:74)|(2:72|73))|69|70)(2:34|39))(1:38)|40|41|91|42|(0)(0)|(0)|69|70) */
            /* JADX WARN: Removed duplicated region for block: B:44:0x042f  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x043d A[Catch: Exception -> 0x0439, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0439, blocks: (B:42:0x040f, B:48:0x043d, B:50:0x047d, B:52:0x0485, B:53:0x048b, B:49:0x0447), top: B:91:0x040f, inners: #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x048c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] d(int r20, int r21) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1562
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayCardProfile.BillingAddress.Builder.d(int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{53, 97, -95, 41};
                $$b = 243;
            }

            static void init$1() {
                $$c = new byte[]{114, MessagePack.Code.FIXEXT8, -31, MessagePack.Code.FIXEXT4};
                $$d = 160;
            }

            private static void p(String str, int i2, Object[] objArr) throws Throwable {
                String str2 = str;
                int i3 = 2;
                int i4 = 2 % 2;
                Object charArray = str2;
                if (str2 != null) {
                    int i5 = $11 + 21;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                g gVar = new g();
                char[] cArr2 = new char[cArr.length];
                int i7 = 0;
                gVar.f19924d = 0;
                char[] cArr3 = new char[2];
                while (gVar.f19924d < cArr.length) {
                    int i8 = $10 + 85;
                    $11 = i8 % 128;
                    int i9 = i8 % i3;
                    cArr3[i7] = cArr[gVar.f19924d];
                    cArr3[1] = cArr[gVar.f19924d + 1];
                    int i10 = 58224;
                    int i11 = i7;
                    while (i11 < 16) {
                        int i12 = $11 + 27;
                        $10 = i12 % 128;
                        int i13 = i12 % i3;
                        char c2 = cArr3[1];
                        char c3 = cArr3[i7];
                        int i14 = (c3 + i10) ^ ((c3 << 4) + ((char) (((long) f19012c) ^ (-7511683281764982996L))));
                        int i15 = c3 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(f19013d);
                            objArr2[i3] = Integer.valueOf(i15);
                            objArr2[1] = Integer.valueOf(i14);
                            objArr2[i7] = Integer.valueOf(c2);
                            Object objA = d.a(1603517628);
                            if (objA == null) {
                                int iAlpha = Color.alpha(i7) + 270;
                                char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i7) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i7) == 0.0d ? 0 : -1));
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i7) + 12;
                                byte b2 = (byte) i7;
                                byte b3 = b2;
                                String str$$e = $$e(b2, b3, (byte) (b3 - 1));
                                Class[] clsArr = new Class[4];
                                clsArr[i7] = Integer.TYPE;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objA = d.a(iAlpha, c4, iIndexOf, -1995022631, false, str$$e, clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i7]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) f19014e) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f19011b)};
                            Object objA2 = d.a(1603517628);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objA2 = d.a(269 - Process.getGidForName(""), (char) ((-1) - MotionEvent.axisFromString("")), View.MeasureSpec.getMode(0) + 11, -1995022631, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                            i10 -= 40503;
                            i11++;
                            i3 = 2;
                            i7 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[gVar.f19924d] = cArr3[0];
                    cArr2[gVar.f19924d + 1] = cArr3[1];
                    Object[] objArr4 = {gVar, gVar};
                    Object objA3 = d.a(1390051551);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 3);
                        objA3 = d.a(270 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -2074123590, false, $$e(b6, b7, (byte) (b7 - 4)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    int i16 = $10 + 37;
                    $11 = i16 % 128;
                    i3 = 2;
                    int i17 = i16 % 2;
                    i7 = 0;
                }
                objArr[0] = new String(cArr2, 0, i2);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0017). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void q(byte r8, short r9, int r10, java.lang.Object[] r11) {
                /*
                    byte[] r7 = fr.antelop.sdk.digitalcard.ClickToPayCardProfile.BillingAddress.Builder.$$a
                    int r0 = r8 * 3
                    int r6 = 100 - r0
                    int r2 = r9 * 4
                    int r1 = 1 - r2
                    int r0 = r10 * 3
                    int r5 = 3 - r0
                    byte[] r4 = new byte[r1]
                    r3 = 0
                    int r2 = 0 - r2
                    if (r7 != 0) goto L2d
                    r0 = r2
                    r1 = r3
                L17:
                    int r0 = -r0
                    int r6 = r6 + r0
                L19:
                    byte r0 = (byte) r6
                    r4[r1] = r0
                    int r5 = r5 + 1
                    if (r1 != r2) goto L28
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    r11[r3] = r0
                    return
                L28:
                    r0 = r7[r5]
                    int r1 = r1 + 1
                    goto L17
                L2d:
                    r1 = r3
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayCardProfile.BillingAddress.Builder.q(byte, short, int, java.lang.Object[]):void");
            }

            private static void r(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
                String str2 = str;
                int i5 = 2 % 2;
                char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
                n nVar = new n();
                char[] cArr2 = new char[i2];
                nVar.f19944a = 0;
                int i6 = $11 + 67;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                while (nVar.f19944a < i2) {
                    nVar.f19946e = cArr[nVar.f19944a];
                    cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                    int i8 = nVar.f19944a;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f19010a)};
                        Object objA = d.a(1376241034);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            objA = d.a(270 - View.combineMeasuredStates(0, 0), (char) ExpandableListView.getPackedPositionType(0L), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -2071844881, false, $$e(b2, (byte) (46 | b2), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {nVar, nVar};
                        Object objA2 = d.a(-202660535);
                        if (objA2 == null) {
                            byte b3 = (byte) 0;
                            objA2 = d.a(522 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - View.resolveSizeAndState(0, 0, 0), 627984172, false, $$e(b3, (byte) (44 | b3), (byte) (-1)), new Class[]{Object.class, Object.class});
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
                    nVar.f19945b = i4;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
                    System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
                    int i9 = $11 + 91;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                }
                if (z2) {
                    int i11 = $10 + 53;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    char[] cArr4 = new char[i2];
                    nVar.f19944a = 0;
                    while (nVar.f19944a < i2) {
                        int i13 = $10 + 7;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                        Object[] objArr4 = {nVar, nVar};
                        Object objA3 = d.a(-202660535);
                        if (objA3 == null) {
                            byte b4 = (byte) 0;
                            objA3 = d.a(522 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) KeyEvent.getDeadChar(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12, 627984172, false, $$e(b4, (byte) ((b4 + 44) - (44 & b4)), (byte) (-1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public fr.antelop.sdk.digitalcard.ClickToPayCardProfile.BillingAddress build() throws fr.antelop.sdk.exception.WalletValidationException {
                /*
                    Method dump skipped, instruction units count: 378
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayCardProfile.BillingAddress.Builder.build():fr.antelop.sdk.digitalcard.ClickToPayCardProfile$BillingAddress");
            }

            public Builder setCity(String str) {
                int i2 = 2 % 2;
                int i3 = f19017h;
                int i4 = i3 + 85;
                f19018i = i4 % 128;
                if (i4 % 2 != 0) {
                    this.city = str;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                this.city = str;
                int i5 = i3 + 111;
                f19018i = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 56 / 0;
                }
                return this;
            }

            public Builder setCountry(String str) {
                int i2 = 2 % 2;
                int i3 = f19017h + 75;
                f19018i = i3 % 128;
                if (i3 % 2 == 0) {
                    this.country = str;
                    return this;
                }
                this.country = str;
                throw null;
            }

            public Builder setLine1(String str) {
                int i2 = 2 % 2;
                int i3 = f19018i + 69;
                int i4 = i3 % 128;
                f19017h = i4;
                if (i3 % 2 == 0) {
                    this.line1 = str;
                    int i5 = 88 / 0;
                } else {
                    this.line1 = str;
                }
                int i6 = i4 + 107;
                f19018i = i6 % 128;
                if (i6 % 2 == 0) {
                    return this;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public Builder setLine2(String str) {
                int i2 = 2 % 2;
                int i3 = f19018i;
                int i4 = i3 + 75;
                f19017h = i4 % 128;
                if (i4 % 2 == 0) {
                    this.line2 = str;
                    throw null;
                }
                this.line2 = str;
                int i5 = i3 + 101;
                f19017h = i5 % 128;
                int i6 = i5 % 2;
                return this;
            }

            public Builder setPostalCode(String str) {
                int i2 = 2 % 2;
                int i3 = f19017h + 33;
                f19018i = i3 % 128;
                if (i3 % 2 == 0) {
                    this.postalCode = str;
                    return this;
                }
                this.postalCode = str;
                throw null;
            }

            public Builder setState(String str) {
                int i2 = 2 % 2;
                int i3 = f19017h;
                int i4 = i3 + 71;
                f19018i = i4 % 128;
                int i5 = i4 % 2;
                this.state = str;
                int i6 = i3 + 75;
                f19018i = i6 % 128;
                int i7 = i6 % 2;
                return this;
            }
        }

        public BillingAddress(o.e eVar) {
            this.innerBillingAddress = eVar;
        }

        public String getCity() {
            Object[] objArr = {this.innerBillingAddress};
            int i2 = o.e.f25108b * (-315355158);
            o.e.f25108b = i2;
            int i3 = o.e.f25109c * 1761739739;
            o.e.f25109c = i3;
            int i4 = o.e.f25110d * 1489632990;
            o.e.f25110d = i4;
            return (String) o.e.d(1099404672, (int) Process.getElapsedCpuTime(), i4, i2, objArr, i3, -1099404672);
        }

        public String getCountry() {
            return this.innerBillingAddress.i();
        }

        protected o.e getInnerBillingAddress() {
            return this.innerBillingAddress;
        }

        public String getLine1() {
            return this.innerBillingAddress.c();
        }

        public String getLine2() {
            return this.innerBillingAddress.d();
        }

        public String getPostalCode() {
            Object[] objArr = {this.innerBillingAddress};
            int i2 = o.e.f25107a * (-2020098597);
            o.e.f25107a = i2;
            int i3 = o.e.f25111e * 461577263;
            o.e.f25111e = i3;
            return (String) o.e.d(581231350, new Random().nextInt(), (int) SystemClock.elapsedRealtime(), i2, objArr, i3, -581231349);
        }

        public String getState() {
            Object[] objArr = {this.innerBillingAddress};
            int i2 = o.e.f25112h * 918936327;
            o.e.f25112h = i2;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i3 = o.e.f25113i * 1875991940;
            o.e.f25113i = i3;
            return (String) o.e.d(-764060794, i3, iFreeMemory, i2, objArr, iElapsedRealtime, 764060796);
        }
    }

    public ClickToPayCardProfile(o oVar) {
        this.innerCardProfile = oVar;
    }

    public BillingAddress getBillingAddress() {
        if (this.innerCardProfile.a() == null) {
            return null;
        }
        return new BillingAddress(this.innerCardProfile.a());
    }

    public String getCardHolderName() {
        return this.innerCardProfile.d();
    }

    public String getCardId() {
        return this.innerCardProfile.c();
    }

    protected o getInnerCardProfile() {
        return this.innerCardProfile;
    }
}
