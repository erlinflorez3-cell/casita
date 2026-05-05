package com.incode.welcome_sdk.data.remote.beans;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.remote.beans.g;
import com.incode.welcome_sdk.data.remote.beans.h;
import com.incode.welcome_sdk.data.remote.beans.l;
import com.incode.welcome_sdk.modules.DynamicForms;
import com.incode.welcome_sdk.modules.EKYC;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.MachineLearningConsent;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.name.NamePresenter;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class q {

    /* JADX INFO: renamed from: b */
    private static int f9759b = 1;

    /* JADX INFO: renamed from: c */
    public static final b f9760c = new b((byte) 0);

    /* JADX INFO: renamed from: e */
    private static int f9761e = 0;

    private q() {
    }

    public static final class a extends q {

        /* JADX INFO: renamed from: d */
        private static int f9762d = 1;

        /* JADX INFO: renamed from: e */
        private static int f9763e = 0;

        /* JADX INFO: renamed from: a */
        private final boolean f9764a;

        /* JADX INFO: renamed from: b */
        private final boolean f9765b;

        public final boolean c() {
            int i2 = 2 % 2;
            int i3 = f9762d;
            int i4 = i3 + 97;
            f9763e = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.f9764a;
            int i6 = i3 + 1;
            f9763e = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean a() {
            int i2 = 2 % 2;
            int i3 = f9763e;
            int i4 = i3 + 35;
            f9762d = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.f9765b;
            int i6 = i3 + 115;
            f9762d = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public a(boolean z2, boolean z3) {
            super((byte) 0);
            this.f9764a = z2;
            this.f9765b = z3;
        }
    }

    public static final class c extends q {

        /* JADX INFO: renamed from: a */
        private final boolean f9790a;

        /* JADX INFO: renamed from: b */
        private final boolean f9791b;

        /* JADX INFO: renamed from: d */
        private final boolean f9792d;

        /* JADX INFO: renamed from: e */
        private final boolean f9793e;

        /* JADX INFO: renamed from: f */
        private final String f9794f;

        /* JADX INFO: renamed from: h */
        private final String f9795h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.f9791b = z2;
            this.f9793e = z3;
            this.f9790a = z4;
            this.f9792d = z5;
            this.f9795h = str;
            this.f9794f = str2;
        }
    }

    public static final class e extends q {

        /* JADX INFO: renamed from: d */
        private static int f9798d = 1;

        /* JADX INFO: renamed from: e */
        private static int f9799e = 0;

        /* JADX INFO: renamed from: a */
        private final String f9800a;

        public final String b() {
            int i2 = 2 % 2;
            int i3 = f9799e + 93;
            f9798d = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f9800a;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(str, "");
            this.f9800a = str;
        }
    }

    public static final class d extends q {

        /* JADX INFO: renamed from: a */
        private final List<com.incode.welcome_sdk.data.remote.beans.g> f9796a;

        /* JADX INFO: renamed from: b */
        private final String f9797b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.incode.welcome_sdk.data.remote.beans.g> list, String str) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.f9796a = list;
            this.f9797b = str;
        }
    }

    public static final class g extends q {

        /* JADX INFO: renamed from: a */
        private static int f9805a = 0;

        /* JADX INFO: renamed from: h */
        private static int f9806h = 1;

        /* JADX INFO: renamed from: b */
        private final String f9807b;

        /* JADX INFO: renamed from: d */
        private final String f9808d;

        /* JADX INFO: renamed from: e */
        private final String f9809e;

        public final String e() {
            int i2 = 2 % 2;
            int i3 = f9805a;
            int i4 = i3 + 71;
            f9806h = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            String str = this.f9807b;
            int i5 = i3 + 91;
            f9806h = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, String str3) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.f9807b = str;
            this.f9809e = str2;
            this.f9808d = str3;
        }
    }

    public static final class h extends q {

        /* JADX INFO: renamed from: b */
        private static int f9810b = 1;

        /* JADX INFO: renamed from: e */
        private static int f9811e = 0;

        /* JADX INFO: renamed from: a */
        private final List<DynamicForms.Screen> f9812a;

        public final List<DynamicForms.Screen> e() {
            int i2 = 2 % 2;
            int i3 = f9810b;
            int i4 = i3 + 33;
            f9811e = i4 % 128;
            int i5 = i4 % 2;
            List<DynamicForms.Screen> list = this.f9812a;
            int i6 = i3 + 17;
            f9811e = i6 % 128;
            if (i6 % 2 == 0) {
                return list;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<DynamicForms.Screen> list) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(list, "");
            this.f9812a = list;
        }
    }

    public static final class i extends q {

        /* JADX INFO: renamed from: g */
        private static int f9813g = 0;

        /* JADX INFO: renamed from: h */
        private static int f9814h = 1;

        /* JADX INFO: renamed from: a */
        private final boolean f9815a;

        /* JADX INFO: renamed from: b */
        private final com.incode.welcome_sdk.data.remote.beans.l f9816b;

        /* JADX INFO: renamed from: d */
        private final com.incode.welcome_sdk.data.remote.beans.l f9817d;

        /* JADX INFO: renamed from: e */
        private final boolean f9818e;

        /* JADX INFO: renamed from: f */
        private final com.incode.welcome_sdk.data.remote.beans.l f9819f;

        /* JADX INFO: renamed from: j */
        private final boolean f9820j;

        public final boolean b() {
            int i2 = 2 % 2;
            int i3 = f9813g + 117;
            f9814h = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f9815a;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean a() {
            int i2 = 2 % 2;
            int i3 = f9814h;
            int i4 = i3 + 47;
            f9813g = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.f9818e;
            int i6 = i3 + 53;
            f9813g = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean c() {
            int i2 = 2 % 2;
            int i3 = f9814h + 25;
            f9813g = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f9820j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.incode.welcome_sdk.data.remote.beans.l lVar, com.incode.welcome_sdk.data.remote.beans.l lVar2, boolean z2, boolean z3, boolean z4, com.incode.welcome_sdk.data.remote.beans.l lVar3) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(lVar, "");
            Intrinsics.checkNotNullParameter(lVar2, "");
            Intrinsics.checkNotNullParameter(lVar3, "");
            this.f9816b = lVar;
            this.f9817d = lVar2;
            this.f9815a = z2;
            this.f9818e = z3;
            this.f9820j = z4;
            this.f9819f = lVar3;
        }
    }

    public static final class j extends q {

        /* JADX INFO: renamed from: p */
        private static int f9821p = 1;

        /* JADX INFO: renamed from: q */
        private static int f9822q = 0;

        /* JADX INFO: renamed from: a */
        private final boolean f9823a;

        /* JADX INFO: renamed from: b */
        private final EKYC.DataInputSource f9824b;

        /* JADX INFO: renamed from: d */
        private final EKYC.DataInputSource f9825d;

        /* JADX INFO: renamed from: e */
        private final boolean f9826e;

        /* JADX INFO: renamed from: f */
        private final boolean f9827f;

        /* JADX INFO: renamed from: g */
        private final boolean f9828g;

        /* JADX INFO: renamed from: h */
        private final boolean f9829h;

        /* JADX INFO: renamed from: i */
        private final EKYC.DataInputSource f9830i;

        /* JADX INFO: renamed from: j */
        private final EKYC.DataInputSource f9831j;

        /* JADX INFO: renamed from: k */
        private final EKYC.DataInputSource f9832k;

        /* JADX INFO: renamed from: l */
        private final EKYC.DataInputSource f9833l;

        /* JADX INFO: renamed from: m */
        private final boolean f9834m;

        /* JADX INFO: renamed from: n */
        private final boolean f9835n;

        /* JADX INFO: renamed from: o */
        private final EKYC.DataInputSource f9836o;

        public static /* synthetic */ Object a(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
            int i8 = ~(i7 | i3);
            int i9 = (~i4) | (~i3);
            int i10 = (~i9) | i7;
            int i11 = (~(i3 | i4)) | (~((~i7) | i4)) | (~(i9 | i7));
            int i12 = i4 + i7 + i6 + ((-101282902) * i2) + ((-829309908) * i5);
            int i13 = i12 * i12;
            int i14 = ((i4 * 42798203) - 224002048) + (42798203 * i7) + ((-1233194106) * i8) + (1828579084 * i10) + (1233194106 * i11) + ((-1190395904) * i6) + (1710751744 * i2) + ((-1643118592) * i5) + ((-1134166016) * i13);
            int i15 = (i4 * 1745018779) + 1790267665 + (i7 * 1745018779) + (i8 * (-58)) + (i10 * (-116)) + (i11 * 58) + (i6 * 1745018721) + (i2 * (-1587019414)) + (i5 * (-1871011668)) + (i13 * 1017511936);
            return i14 + ((i15 * i15) * (-1139146752)) != 1 ? c(objArr) : e(objArr);
        }

        public final boolean b() {
            int i2 = 2 % 2;
            int i3 = f9821p + 29;
            int i4 = i3 % 128;
            f9822q = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9826e;
            int i6 = i4 + 87;
            f9821p = i6 % 128;
            if (i6 % 2 != 0) {
                return z2;
            }
            throw null;
        }

        public final EKYC.DataInputSource a() {
            int i2 = 2 % 2;
            int i3 = f9822q + 95;
            f9821p = i3 % 128;
            int i4 = i3 % 2;
            EKYC.DataInputSource dataInputSource = this.f9825d;
            if (i4 == 0) {
                int i5 = 29 / 0;
            }
            return dataInputSource;
        }

        public final boolean e() {
            int i2 = 2 % 2;
            int i3 = f9822q;
            int i4 = i3 + 63;
            f9821p = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                throw null;
            }
            boolean z2 = this.f9823a;
            int i5 = i3 + 33;
            f9821p = i5 % 128;
            if (i5 % 2 != 0) {
                return z2;
            }
            obj.hashCode();
            throw null;
        }

        public final boolean c() {
            int i2 = 2 % 2;
            int i3 = f9821p + 53;
            int i4 = i3 % 128;
            f9822q = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            boolean z2 = this.f9827f;
            int i5 = i4 + 29;
            f9821p = i5 % 128;
            int i6 = i5 % 2;
            return z2;
        }

        public final EKYC.DataInputSource d() {
            int i2 = 2 % 2;
            int i3 = f9822q + 85;
            f9821p = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f9831j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean i() {
            int i2 = 2 % 2;
            int i3 = f9821p;
            int i4 = i3 + 91;
            f9822q = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.f9828g;
            int i6 = i3 + 97;
            f9822q = i6 % 128;
            if (i6 % 2 == 0) {
                return z2;
            }
            throw null;
        }

        private static /* synthetic */ Object c(Object[] objArr) {
            j jVar = (j) objArr[0];
            int i2 = 2 % 2;
            int i3 = f9822q;
            int i4 = i3 + 45;
            f9821p = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = jVar.f9829h;
            if (i5 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = i3 + 109;
            f9821p = i6 % 128;
            int i7 = i6 % 2;
            return Boolean.valueOf(z2);
        }

        public final boolean g() {
            int i2 = 2 % 2;
            int i3 = f9821p + 61;
            int i4 = i3 % 128;
            f9822q = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9834m;
            int i6 = i4 + 73;
            f9821p = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            j jVar = (j) objArr[0];
            int i2 = 2 % 2;
            int i3 = f9822q + 45;
            int i4 = i3 % 128;
            f9821p = i4;
            int i5 = i3 % 2;
            EKYC.DataInputSource dataInputSource = jVar.f9836o;
            if (i5 == 0) {
                throw null;
            }
            int i6 = i4 + 13;
            f9822q = i6 % 128;
            if (i6 % 2 == 0) {
                return dataInputSource;
            }
            throw null;
        }

        public final boolean f() {
            int i2 = 2 % 2;
            int i3 = f9821p + 61;
            int i4 = i3 % 128;
            f9822q = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9835n;
            int i6 = i4 + 79;
            f9821p = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 75 / 0;
            }
            return z2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z2, EKYC.DataInputSource dataInputSource, boolean z3, EKYC.DataInputSource dataInputSource2, boolean z4, EKYC.DataInputSource dataInputSource3, boolean z5, EKYC.DataInputSource dataInputSource4, boolean z6, EKYC.DataInputSource dataInputSource5, boolean z7, EKYC.DataInputSource dataInputSource6, boolean z8, EKYC.DataInputSource dataInputSource7) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(dataInputSource, "");
            Intrinsics.checkNotNullParameter(dataInputSource2, "");
            Intrinsics.checkNotNullParameter(dataInputSource3, "");
            Intrinsics.checkNotNullParameter(dataInputSource4, "");
            Intrinsics.checkNotNullParameter(dataInputSource5, "");
            Intrinsics.checkNotNullParameter(dataInputSource6, "");
            Intrinsics.checkNotNullParameter(dataInputSource7, "");
            this.f9826e = z2;
            this.f9825d = dataInputSource;
            this.f9823a = z3;
            this.f9824b = dataInputSource2;
            this.f9827f = z4;
            this.f9831j = dataInputSource3;
            this.f9828g = z5;
            this.f9830i = dataInputSource4;
            this.f9829h = z6;
            this.f9832k = dataInputSource5;
            this.f9834m = z7;
            this.f9836o = dataInputSource6;
            this.f9835n = z8;
            this.f9833l = dataInputSource7;
        }

        public final EKYC.DataInputSource h() {
            int iA = NamePresenter.b.a();
            int iA2 = NamePresenter.b.a();
            return (EKYC.DataInputSource) a(NamePresenter.b.a(), iA, new Object[]{this}, 2024871166, NamePresenter.b.a(), iA2, -2024871165);
        }

        public final boolean j() {
            int iA = NamePresenter.b.a();
            int iA2 = NamePresenter.b.a();
            return ((Boolean) a(NamePresenter.b.a(), iA, new Object[]{this}, -446517511, NamePresenter.b.a(), iA2, 446517511)).booleanValue();
        }
    }

    public static final class f extends q {

        /* JADX INFO: renamed from: a */
        private static int f9801a = 1;

        /* JADX INFO: renamed from: b */
        private static int f9802b = 0;

        /* JADX INFO: renamed from: d */
        private final boolean f9803d;

        /* JADX INFO: renamed from: e */
        private final int f9804e;

        public final boolean a() {
            int i2 = 2 % 2;
            int i3 = f9802b + 77;
            f9801a = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f9803d;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public f(boolean z2, int i2) {
            super((byte) 0);
            this.f9803d = z2;
            this.f9804e = i2;
        }
    }

    public static final class l extends q {

        /* JADX INFO: renamed from: i */
        private static int f9842i = 0;

        /* JADX INFO: renamed from: n */
        private static int f9843n = 1;

        /* JADX INFO: renamed from: a */
        private final int f9844a;

        /* JADX INFO: renamed from: b */
        private final int f9845b;

        /* JADX INFO: renamed from: d */
        private final boolean f9846d;

        /* JADX INFO: renamed from: e */
        private final boolean f9847e;

        /* JADX INFO: renamed from: f */
        private final com.incode.welcome_sdk.data.remote.beans.h f9848f;

        /* JADX INFO: renamed from: g */
        private final boolean f9849g;

        /* JADX INFO: renamed from: h */
        private final boolean f9850h;

        /* JADX INFO: renamed from: j */
        private final boolean f9851j;

        public final boolean c() {
            int i2 = 2 % 2;
            int i3 = f9843n + 7;
            f9842i = i3 % 128;
            int i4 = i3 % 2;
            boolean z2 = this.f9847e;
            if (i4 != 0) {
                int i5 = 17 / 0;
            }
            return z2;
        }

        public final int a() {
            int i2 = 2 % 2;
            int i3 = f9843n + 87;
            int i4 = i3 % 128;
            f9842i = i4;
            int i5 = i3 % 2;
            int i6 = this.f9844a;
            int i7 = i4 + 53;
            f9843n = i7 % 128;
            if (i7 % 2 != 0) {
                return i6;
            }
            throw null;
        }

        public final int e() {
            int i2 = 2 % 2;
            int i3 = f9843n + 23;
            int i4 = i3 % 128;
            f9842i = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = this.f9845b;
            int i6 = i4 + 75;
            f9843n = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final boolean d() {
            int i2 = 2 % 2;
            int i3 = f9843n + 3;
            int i4 = i3 % 128;
            f9842i = i4;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z2 = this.f9846d;
            int i5 = i4 + 51;
            f9843n = i5 % 128;
            int i6 = i5 % 2;
            return z2;
        }

        public final boolean b() {
            int i2 = 2 % 2;
            int i3 = f9842i;
            int i4 = i3 + 43;
            f9843n = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.f9850h;
            int i6 = i3 + 107;
            f9843n = i6 % 128;
            if (i6 % 2 != 0) {
                return z2;
            }
            throw null;
        }

        public final boolean h() {
            int i2 = 2 % 2;
            int i3 = f9843n + 109;
            int i4 = i3 % 128;
            f9842i = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9849g;
            int i6 = i4 + 117;
            f9843n = i6 % 128;
            if (i6 % 2 != 0) {
                return z2;
            }
            throw null;
        }

        public final boolean f() {
            int i2 = 2 % 2;
            int i3 = f9842i + 37;
            int i4 = i3 % 128;
            f9843n = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9851j;
            int i6 = i4 + 101;
            f9842i = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 55 / 0;
            }
            return z2;
        }

        public final com.incode.welcome_sdk.data.remote.beans.h j() {
            int i2 = 2 % 2;
            int i3 = f9842i + 113;
            f9843n = i3 % 128;
            int i4 = i3 % 2;
            com.incode.welcome_sdk.data.remote.beans.h hVar = this.f9848f;
            if (i4 == 0) {
                int i5 = 26 / 0;
            }
            return hVar;
        }

        public l(boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, boolean z6, com.incode.welcome_sdk.data.remote.beans.h hVar) {
            super((byte) 0);
            this.f9847e = z2;
            this.f9844a = i2;
            this.f9845b = i3;
            this.f9846d = z3;
            this.f9850h = z4;
            this.f9849g = z5;
            this.f9851j = z6;
            this.f9848f = hVar;
        }
    }

    public static final class k extends q {

        /* JADX INFO: renamed from: b */
        private static int f9837b = 0;

        /* JADX INFO: renamed from: f */
        private static int f9838f = 1;

        /* JADX INFO: renamed from: a */
        private final com.incode.welcome_sdk.data.remote.beans.m f9839a;

        /* JADX INFO: renamed from: d */
        private final FaceMatch.MatchType f9840d;

        /* JADX INFO: renamed from: e */
        private final boolean f9841e;

        public final FaceMatch.MatchType b() {
            int i2 = 2 % 2;
            int i3 = f9837b;
            int i4 = i3 + 19;
            f9838f = i4 % 128;
            int i5 = i4 % 2;
            FaceMatch.MatchType matchType = this.f9840d;
            int i6 = i3 + 23;
            f9838f = i6 % 128;
            if (i6 % 2 != 0) {
                return matchType;
            }
            throw null;
        }

        public final boolean e() {
            int i2 = 2 % 2;
            int i3 = f9838f;
            int i4 = i3 + 91;
            f9837b = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            boolean z2 = this.f9841e;
            int i5 = i3 + 55;
            f9837b = i5 % 128;
            int i6 = i5 % 2;
            return z2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(FaceMatch.MatchType matchType, boolean z2, com.incode.welcome_sdk.data.remote.beans.m mVar) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(matchType, "");
            Intrinsics.checkNotNullParameter(mVar, "");
            this.f9840d = matchType;
            this.f9841e = z2;
            this.f9839a = mVar;
        }
    }

    public static final class m extends q {

        /* JADX INFO: renamed from: a */
        private static int f9852a = 0;

        /* JADX INFO: renamed from: b */
        private static int f9853b = 1;

        /* JADX INFO: renamed from: e */
        private final String f9854e;

        public final String b() {
            int i2 = 2 % 2;
            int i3 = f9853b + 83;
            f9852a = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f9854e;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(str, "");
            this.f9854e = str;
        }
    }

    public static final class n extends q {

        /* JADX INFO: renamed from: a */
        private static int f9855a = 0;

        /* JADX INFO: renamed from: d */
        private static int f9856d = 1;

        /* JADX INFO: renamed from: b */
        private final boolean f9857b;

        /* JADX INFO: renamed from: e */
        private final boolean f9858e;

        public final boolean b() {
            int i2 = 2 % 2;
            int i3 = f9855a;
            int i4 = i3 + 63;
            f9856d = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z2 = this.f9857b;
            int i5 = i3 + 123;
            f9856d = i5 % 128;
            int i6 = i5 % 2;
            return z2;
        }

        public n(boolean z2, boolean z3) {
            super((byte) 0);
            this.f9858e = z2;
            this.f9857b = z3;
        }
    }

    public static final class t extends q {

        /* JADX INFO: renamed from: p */
        private static int f9876p = 0;

        /* JADX INFO: renamed from: q */
        private static int f9877q = 1;

        /* JADX INFO: renamed from: a */
        private final boolean f9878a;

        /* JADX INFO: renamed from: b */
        private final boolean f9879b;

        /* JADX INFO: renamed from: d */
        private final boolean f9880d;

        /* JADX INFO: renamed from: e */
        private final boolean f9881e;

        /* JADX INFO: renamed from: f */
        private final int f9882f;

        /* JADX INFO: renamed from: g */
        private final int f9883g;

        /* JADX INFO: renamed from: h */
        private final boolean f9884h;

        /* JADX INFO: renamed from: i */
        private final boolean f9885i;

        /* JADX INFO: renamed from: j */
        private final boolean f9886j;

        /* JADX INFO: renamed from: k */
        private final boolean f9887k;

        /* JADX INFO: renamed from: l */
        private final boolean f9888l;

        /* JADX INFO: renamed from: m */
        private final int f9889m;

        /* JADX INFO: renamed from: n */
        private final boolean f9890n;

        /* JADX INFO: renamed from: o */
        private final boolean f9891o;

        /* JADX INFO: renamed from: t */
        private final boolean f9892t;

        public static /* synthetic */ Object e(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
            int i8 = ~i5;
            int i9 = ~i2;
            int i10 = ~i7;
            int i11 = (~(i9 | i10)) | i8;
            int i12 = (~(i7 | i2)) | (~(i8 | i10));
            int i13 = ~(i10 | i5 | i2);
            int i14 = i5 + i2 + i4 + ((-194346734) * i3) + (9035316 * i6);
            int i15 = i14 * i14;
            int i16 = (((-787818500) * i5) - 443744256) + ((-1492047866) * i2) + (352114683 * i11) + (i12 * (-352114683)) + ((-352114683) * i13) + ((-1139933184) * i4) + (1190920192 * i3) + (1456996352 * i6) + ((-1774911488) * i15);
            int i17 = (i5 * 1174986172) + 1294669563 + (i2 * 1174986598) + (i11 * (-213)) + (i12 * Mp4VideoDirectory.TAG_COLOR_TABLE) + (i13 * Mp4VideoDirectory.TAG_COLOR_TABLE) + (i4 * 1174986385) + (i3 * (-1060063438)) + (i6 * 107475828) + (i15 * 168099840);
            return i16 + ((i17 * i17) * 40566784) != 1 ? e(objArr) : b(objArr);
        }

        public final boolean a() {
            int i2 = 2 % 2;
            int i3 = f9877q + 49;
            f9876p = i3 % 128;
            int i4 = i3 % 2;
            boolean z2 = this.f9880d;
            if (i4 != 0) {
                int i5 = 27 / 0;
            }
            return z2;
        }

        public final boolean d() {
            int i2 = 2 % 2;
            int i3 = f9876p + 79;
            int i4 = i3 % 128;
            f9877q = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9886j;
            int i6 = i4 + 89;
            f9876p = i6 % 128;
            if (i6 % 2 == 0) {
                return z2;
            }
            throw null;
        }

        public final int c() {
            int i2 = 2 % 2;
            int i3 = f9877q;
            int i4 = i3 + 125;
            f9876p = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.f9883g;
            int i7 = i3 + 35;
            f9876p = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public final int e() {
            int i2 = 2 % 2;
            int i3 = f9876p;
            int i4 = i3 + 37;
            f9877q = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.f9882f;
            int i7 = i3 + 31;
            f9877q = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        private static /* synthetic */ Object b(Object[] objArr) {
            t tVar = (t) objArr[0];
            int i2 = 2 % 2;
            int i3 = f9876p + 109;
            int i4 = i3 % 128;
            f9877q = i4;
            int i5 = i3 % 2;
            int i6 = tVar.f9889m;
            int i7 = i4 + 63;
            f9876p = i7 % 128;
            if (i7 % 2 == 0) {
                return Integer.valueOf(i6);
            }
            int i8 = 85 / 0;
            return Integer.valueOf(i6);
        }

        public final boolean g() {
            int i2 = 2 % 2;
            int i3 = f9877q + 5;
            f9876p = i3 % 128;
            int i4 = i3 % 2;
            boolean z2 = this.f9890n;
            if (i4 != 0) {
                int i5 = 45 / 0;
            }
            return z2;
        }

        public final boolean i() {
            int i2 = 2 % 2;
            int i3 = f9876p + 51;
            int i4 = i3 % 128;
            f9877q = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9891o;
            int i6 = i4 + 123;
            f9876p = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean j() {
            int i2 = 2 % 2;
            int i3 = f9876p + 53;
            int i4 = i3 % 128;
            f9877q = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z2 = this.f9887k;
            int i5 = i4 + 87;
            f9876p = i5 % 128;
            int i6 = i5 % 2;
            return z2;
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            t tVar = (t) objArr[0];
            int i2 = 2 % 2;
            int i3 = f9876p + 113;
            f9877q = i3 % 128;
            int i4 = i3 % 2;
            boolean z2 = tVar.f9892t;
            if (i4 != 0) {
                return Boolean.valueOf(z2);
            }
            throw null;
        }

        public t(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i2, int i3, int i4, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
            super((byte) 0);
            this.f9880d = z2;
            this.f9879b = z3;
            this.f9878a = z4;
            this.f9881e = z5;
            this.f9886j = z6;
            this.f9885i = z7;
            this.f9884h = z8;
            this.f9883g = i2;
            this.f9882f = i3;
            this.f9889m = i4;
            this.f9890n = z9;
            this.f9888l = z10;
            this.f9891o = z11;
            this.f9887k = z12;
            this.f9892t = z13;
        }

        public final IdScan.IdType f() {
            int i2 = 2 % 2;
            if (this.f9892t) {
                int i3 = f9877q + 5;
                f9876p = i3 % 128;
                int i4 = i3 % 2;
                return IdScan.IdType.ID;
            }
            boolean z2 = this.f9879b;
            if (z2 && this.f9878a) {
                int i5 = f9876p + 61;
                f9877q = i5 % 128;
                int i6 = i5 % 2;
                return null;
            }
            if (z2) {
                IdScan.IdType idType = IdScan.IdType.ID;
                int i7 = f9876p + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f9877q = i7 % 128;
                int i8 = i7 % 2;
                return idType;
            }
            if (!this.f9878a) {
                return null;
            }
            int i9 = f9877q + 73;
            f9876p = i9 % 128;
            if (i9 % 2 == 0) {
                return IdScan.IdType.PASSPORT;
            }
            IdScan.IdType idType2 = IdScan.IdType.PASSPORT;
            throw null;
        }

        public final boolean h() {
            int iD = IncodeWelcome.cm.d();
            int iD2 = IncodeWelcome.cm.d();
            return ((Boolean) e(-1775562723, IncodeWelcome.cm.d(), iD2, new Object[]{this}, 1775562723, IncodeWelcome.cm.d(), iD)).booleanValue();
        }

        public final int b() {
            int iD = IncodeWelcome.cm.d();
            int iD2 = IncodeWelcome.cm.d();
            return ((Integer) e(1071022772, IncodeWelcome.cm.d(), iD2, new Object[]{this}, -1071022771, IncodeWelcome.cm.d(), iD)).intValue();
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.remote.beans.q$q */
    public static final class C0237q extends q {

        /* JADX INFO: renamed from: a */
        private static int f9867a = 0;

        /* JADX INFO: renamed from: b */
        private static int f9868b = 1;

        /* JADX INFO: renamed from: e */
        private final boolean f9869e;

        public final boolean b() {
            int i2 = 2 % 2;
            int i3 = f9867a + 59;
            int i4 = i3 % 128;
            f9868b = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9869e;
            int i6 = i4 + 27;
            f9867a = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public C0237q(boolean z2) {
            super((byte) 0);
            this.f9869e = z2;
        }
    }

    public static final class s extends q {

        /* JADX INFO: renamed from: a */
        private static int f9873a = 0;

        /* JADX INFO: renamed from: d */
        public static final s f9874d = new s();

        /* JADX INFO: renamed from: e */
        private static int f9875e = 1;

        private s() {
            super((byte) 0);
        }

        static {
            int i2 = f9875e + 33;
            f9873a = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class r extends q {

        /* JADX INFO: renamed from: a */
        private static int f9870a = 0;

        /* JADX INFO: renamed from: b */
        private static int f9871b = 1;

        /* JADX INFO: renamed from: d */
        private final MachineLearningConsent.ConsentType f9872d;

        public final MachineLearningConsent.ConsentType d() {
            int i2 = 2 % 2;
            int i3 = f9871b + 17;
            f9870a = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f9872d;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(MachineLearningConsent.ConsentType consentType) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(consentType, "");
            this.f9872d = consentType;
        }
    }

    public static final class b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int f9782a = 0;

        /* JADX INFO: renamed from: d */
        private static int f9783d = 0;

        /* JADX INFO: renamed from: e */
        private static int[] f9784e = null;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r9, byte r10, int r11) {
            /*
                int r8 = r10 + 98
                int r7 = r11 * 3
                int r1 = r7 + 1
                int r0 = r9 * 2
                int r6 = 4 - r0
                byte[] r5 = com.incode.welcome_sdk.data.remote.beans.q.b.$$a
                byte[] r4 = new byte[r1]
                r3 = 0
                if (r5 != 0) goto L2c
                r1 = r8
                r2 = r3
                r0 = r6
            L14:
                int r6 = r6 + r1
                int r0 = r0 + 1
                r1 = r2
                r8 = r6
                r6 = r0
            L1a:
                byte r0 = (byte) r8
                r4[r1] = r0
                int r2 = r1 + 1
                if (r1 != r7) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L27:
                r1 = r5[r6]
                r0 = r6
                r6 = r8
                goto L14
            L2c:
                r1 = r3
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.q.b.$$c(byte, byte, int):java.lang.String");
        }

        static void init$0() {
            $$a = new byte[]{67, 32, -18, 9};
            $$b = 83;
        }

        private static void b(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            com.c.a.e eVar = new com.c.a.e();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = f9784e;
            int i4 = 1605946101;
            int i5 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                        Object objC = com.c.a.e.e.c(i4);
                        if (objC == null) {
                            byte b2 = (byte) i5;
                            byte b3 = (byte) (b2 + 1);
                            objC = com.c.a.e.e.e((char) (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)), KeyEvent.keyCodeFromString("") + 19, 554 - ((Process.getThreadPriority(i5) + 20) >> 6), 1596115084, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objC).invoke(null, objArr2)).intValue();
                        i6++;
                        i4 = 1605946101;
                        i5 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = f9784e;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i7 = 0;
                while (i7 < length3) {
                    int i8 = $11 + 63;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        Object[] objArr3 = {Integer.valueOf(iArr5[i7])};
                        Object objC2 = com.c.a.e.e.c(1605946101);
                        if (objC2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 1);
                            objC2 = com.c.a.e.e.e((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 19 - View.MeasureSpec.getSize(0), 554 - Color.argb(0, 0, 0, 0), 1596115084, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i7] = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
                        i7 <<= 1;
                    } else {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i7])};
                        Object objC3 = com.c.a.e.e.c(1605946101);
                        if (objC3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objC3 = com.c.a.e.e.e((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 19 - TextUtils.getTrimmedLength(""), ExpandableListView.getPackedPositionGroup(0L) + IptcDirectory.TAG_ACTION_ADVISED, 1596115084, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i7] = ((Integer) ((Method) objC3).invoke(null, objArr4)).intValue();
                        i7++;
                    }
                }
                int i9 = $10 + 67;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            eVar.f2735a = 0;
            while (eVar.f2735a < iArr.length) {
                int i11 = $10 + 69;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr[0] = (char) (iArr[eVar.f2735a] >> 16);
                cArr[1] = (char) iArr[eVar.f2735a];
                cArr[2] = (char) (iArr[eVar.f2735a + 1] >> 16);
                cArr[3] = (char) iArr[eVar.f2735a + 1];
                eVar.f2736c = (cArr[0] << 16) + cArr[1];
                eVar.f2737d = (cArr[2] << 16) + cArr[3];
                com.c.a.e.b(iArr4);
                int i13 = 0;
                while (i13 < 16) {
                    int i14 = $10 + 83;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        eVar.f2736c ^= iArr4[i13];
                        Object[] objArr5 = {eVar, Integer.valueOf(com.c.a.e.c(eVar.f2736c)), eVar, eVar};
                        Object objC4 = com.c.a.e.e.c(-190252621);
                        if (objC4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objC4 = com.c.a.e.e.e((char) Color.green(0), TextUtils.lastIndexOf("", '0', 0) + 20, (Process.myPid() >> 22) + 167, -197985334, false, $$c(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objC4).invoke(null, objArr5)).intValue();
                        eVar.f2736c = eVar.f2737d;
                        eVar.f2737d = iIntValue;
                        i13 += 76;
                    } else {
                        eVar.f2736c ^= iArr4[i13];
                        Object[] objArr6 = {eVar, Integer.valueOf(com.c.a.e.c(eVar.f2736c)), eVar, eVar};
                        Object objC5 = com.c.a.e.e.c(-190252621);
                        if (objC5 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objC5 = com.c.a.e.e.e((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19, 167 - View.MeasureSpec.getMode(0), -197985334, false, $$c(b10, b11, b11), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objC5).invoke(null, objArr6)).intValue();
                        eVar.f2736c = eVar.f2737d;
                        eVar.f2737d = iIntValue2;
                        i13++;
                    }
                }
                int i15 = eVar.f2736c;
                eVar.f2736c = eVar.f2737d;
                eVar.f2737d = i15;
                eVar.f2737d ^= iArr4[16];
                eVar.f2736c ^= iArr4[17];
                int i16 = eVar.f2736c;
                int i17 = eVar.f2737d;
                cArr[0] = (char) (eVar.f2736c >>> 16);
                cArr[1] = (char) eVar.f2736c;
                cArr[2] = (char) (eVar.f2737d >>> 16);
                cArr[3] = (char) eVar.f2737d;
                com.c.a.e.b(iArr4);
                cArr2[eVar.f2735a * 2] = cArr[0];
                cArr2[(eVar.f2735a * 2) + 1] = cArr[1];
                cArr2[(eVar.f2735a * 2) + 2] = cArr[2];
                cArr2[(eVar.f2735a * 2) + 3] = cArr[3];
                Object[] objArr7 = {eVar, eVar};
                Object objC6 = com.c.a.e.e.c(-1176571471);
                if (objC6 == null) {
                    objC6 = com.c.a.e.e.e((char) (KeyEvent.keyCodeFromString("") + 42780), 16 - TextUtils.indexOf("", "", 0, 0), 133 - TextUtils.lastIndexOf("", '0', 0), -1186663480, false, "a", new Class[]{Object.class, Object.class});
                }
                ((Method) objC6).invoke(null, objArr7);
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        private b() {
        }

        @JvmStatic
        public static q e(Modules modules, JSONObject jSONObject) throws Throwable {
            Intrinsics.checkNotNullParameter(modules, "");
            Intrinsics.checkNotNullParameter(jSONObject, "");
            switch (C0236b.f9787b[modules.ordinal()]) {
                case 1:
                    return new a(jSONObject.optBoolean("uploadDocument"), jSONObject.optBoolean("downloadDocument"));
                case 2:
                    boolean zOptBoolean = jSONObject.optBoolean("addressFieldsMandatory");
                    boolean zOptBoolean2 = jSONObject.optBoolean("dateFieldMandatory");
                    boolean zOptBoolean3 = jSONObject.optBoolean("disableSkipPoa");
                    boolean zOptBoolean4 = jSONObject.optBoolean("poaAsBankStatement");
                    String strOptString = jSONObject.optString("title");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "");
                    String strOptString2 = jSONObject.optString("text");
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                    return new c(zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, strOptString, strOptString2);
                case 3:
                    return new x(jSONObject.optBoolean("enableConferenceOtp"));
                case 4:
                    String strOptString3 = jSONObject.optString("title");
                    List listD = com.incode.welcome_sdk.commons.extensions.i.d(com.incode.welcome_sdk.commons.extensions.i.b(jSONObject, "customFields"), new a(com.incode.welcome_sdk.data.remote.beans.g.f9664b));
                    Intrinsics.checkNotNull(strOptString3);
                    return new d(listD, strOptString3);
                case 5:
                    String strOptString4 = jSONObject.optString("processingType");
                    Intrinsics.checkNotNullExpressionValue(strOptString4, "");
                    String strOptString5 = jSONObject.optString("title");
                    Intrinsics.checkNotNullExpressionValue(strOptString5, "");
                    String strOptString6 = jSONObject.optString("text");
                    Intrinsics.checkNotNullExpressionValue(strOptString6, "");
                    return new g(strOptString4, strOptString5, strOptString6);
                case 6:
                    l.b bVar = com.incode.welcome_sdk.data.remote.beans.l.f9708e;
                    Object[] objArr = new Object[1];
                    b(new int[]{1822837646, -458507646, -29625597, 1168070929}, TextUtils.lastIndexOf("", '0', 0, 0) + 8, objArr);
                    String strOptString7 = jSONObject.optString(((String) objArr[0]).intern());
                    Intrinsics.checkNotNullExpressionValue(strOptString7, "");
                    com.incode.welcome_sdk.data.remote.beans.l lVarC = l.b.c(strOptString7);
                    boolean zOptBoolean5 = jSONObject.optBoolean("checkBusinessName");
                    l.b bVar2 = com.incode.welcome_sdk.data.remote.beans.l.f9708e;
                    String strOptString8 = jSONObject.optString("businessNameSource");
                    Intrinsics.checkNotNullExpressionValue(strOptString8, "");
                    com.incode.welcome_sdk.data.remote.beans.l lVarC2 = l.b.c(strOptString8);
                    boolean zOptBoolean6 = jSONObject.optBoolean("checkAddress");
                    boolean zOptBoolean7 = jSONObject.optBoolean("checkTaxId");
                    l.b bVar3 = com.incode.welcome_sdk.data.remote.beans.l.f9708e;
                    return new i(lVarC, lVarC2, zOptBoolean6, zOptBoolean5, zOptBoolean7, l.b.c("taxIdSource"));
                case 7:
                    boolean zOptBoolean8 = jSONObject.optBoolean("verifyName") | jSONObject.optBoolean("checkName");
                    EKYC.DataInputSource.b bVar4 = EKYC.DataInputSource.Companion;
                    EKYC.DataInputSource dataInputSourceB = EKYC.DataInputSource.b.b(jSONObject.optString("nameSource"));
                    boolean zOptBoolean9 = jSONObject.optBoolean("verifyEmail") | jSONObject.optBoolean("checkEmail");
                    EKYC.DataInputSource.b bVar5 = EKYC.DataInputSource.Companion;
                    EKYC.DataInputSource dataInputSourceB2 = EKYC.DataInputSource.b.b(jSONObject.optString("emailSource"));
                    boolean zOptBoolean10 = jSONObject.optBoolean("verifyAddress") | jSONObject.optBoolean("checkAddress");
                    EKYC.DataInputSource.b bVar6 = EKYC.DataInputSource.Companion;
                    EKYC.DataInputSource dataInputSourceB3 = EKYC.DataInputSource.b.b(jSONObject.optString("addressSource"));
                    boolean zOptBoolean11 = jSONObject.optBoolean("verifyPhone") | jSONObject.optBoolean("checkPhone");
                    EKYC.DataInputSource.b bVar7 = EKYC.DataInputSource.Companion;
                    EKYC.DataInputSource dataInputSourceB4 = EKYC.DataInputSource.b.b(jSONObject.optString("phoneSource"));
                    boolean zOptBoolean12 = jSONObject.optBoolean("verifyTaxId") | jSONObject.optBoolean("checkSsn");
                    EKYC.DataInputSource.b bVar8 = EKYC.DataInputSource.Companion;
                    EKYC.DataInputSource dataInputSourceB5 = EKYC.DataInputSource.b.b(jSONObject.optString("ssnSource"));
                    boolean zOptBoolean13 = jSONObject.optBoolean("verifyDob") | jSONObject.optBoolean("checkDob");
                    EKYC.DataInputSource.b bVar9 = EKYC.DataInputSource.Companion;
                    EKYC.DataInputSource dataInputSourceB6 = EKYC.DataInputSource.b.b(jSONObject.optString("dobSource"));
                    boolean zOptBoolean14 = jSONObject.optBoolean("verifyNationality") | jSONObject.optBoolean("checkNationality");
                    EKYC.DataInputSource.b bVar10 = EKYC.DataInputSource.Companion;
                    return new j(zOptBoolean8, dataInputSourceB, zOptBoolean9, dataInputSourceB2, zOptBoolean10, dataInputSourceB3, zOptBoolean11, dataInputSourceB4, zOptBoolean12, dataInputSourceB5, zOptBoolean13, dataInputSourceB6, zOptBoolean14, EKYC.DataInputSource.b.b(jSONObject.optString("nationalitySource")));
                case 8:
                    return new f(jSONObject.optBoolean("otpVerification"), jSONObject.optInt("otpExpirationInMinutes"));
                case 9:
                    FaceMatch.MatchType.c cVar = FaceMatch.MatchType.Companion;
                    FaceMatch.MatchType matchTypeE = FaceMatch.MatchType.c.e(jSONObject.optString("matchingType"));
                    boolean z2 = !jSONObject.optBoolean("disableFaceMatchAnimation");
                    String strOptString9 = jSONObject.optString("idRank", "FIRST_ID");
                    Intrinsics.checkNotNullExpressionValue(strOptString9, "");
                    return new k(matchTypeE, z2, com.incode.welcome_sdk.data.remote.beans.m.valueOf(strOptString9));
                case 10:
                    String strOptString10 = jSONObject.optString("finishgptCompanyName");
                    Intrinsics.checkNotNullExpressionValue(strOptString10, "");
                    return new m(strOptString10);
                case 11:
                    return s.f9874d;
                case 12:
                    return new C0237q(jSONObject.optBoolean("editableOcr"));
                case 13:
                    return new n(jSONObject.optBoolean("failUnsupportedId"), jSONObject.optBoolean("backgroundExecution"));
                case 14:
                    MachineLearningConsent.ConsentType.e eVar = MachineLearningConsent.ConsentType.Companion;
                    String strOptString11 = jSONObject.optString("consentType");
                    Intrinsics.checkNotNullExpressionValue(strOptString11, "");
                    return new r(MachineLearningConsent.ConsentType.e.d(strOptString11));
                case 15:
                    return new p(jSONObject.optBoolean("nfcAvailability"), jSONObject.optBoolean("nfcValidation"), jSONObject.optBoolean("showInitialDataConfirmationScreen"));
                case 16:
                    return new y(jSONObject.optBoolean("otpVerification"), jSONObject.optBoolean("prefill"));
                case 17:
                    return new t(jSONObject.optBoolean("showTutorial"), jSONObject.optBoolean("enableId"), jSONObject.optBoolean("enablePassport"), jSONObject.optBoolean("barcodeClassification"), jSONObject.optBoolean("secondId"), jSONObject.optBoolean("thirdId"), jSONObject.optBoolean("allowManualReview"), jSONObject.optInt("autoCaptureTimeout", -1), jSONObject.optInt("deviceIdleTimeout", -1), jSONObject.optInt("captureAttempts", -1), jSONObject.optBoolean("enableIdRecording"), jSONObject.optBoolean("ageAssurance"), jSONObject.optBoolean("showDocumentChooserScreen"), jSONObject.optBoolean("onlyFront"), jSONObject.optBoolean("onlyBack"));
                case 18:
                    boolean zOptBoolean15 = jSONObject.optBoolean("showTutorial");
                    boolean zOptBoolean16 = jSONObject.optBoolean("showPreview");
                    boolean zOptBoolean17 = jSONObject.optBoolean("assistedOnboarding");
                    boolean zOptBoolean18 = jSONObject.optBoolean("enableFaceRecording");
                    int iOptInt = jSONObject.optInt("autoCaptureTimeout", -1);
                    int iOptInt2 = jSONObject.optInt("captureAttempts", -1);
                    boolean zOptBoolean19 = jSONObject.optBoolean("livenessEnabled");
                    boolean zOptBoolean20 = jSONObject.optBoolean("validateClosedEyes");
                    boolean zOptBoolean21 = jSONObject.optBoolean("validateLenses");
                    boolean zOptBoolean22 = jSONObject.optBoolean("validateFaceMask");
                    boolean zOptBoolean23 = jSONObject.optBoolean("validateBrightness");
                    boolean zOptBoolean24 = jSONObject.optBoolean("validateHeadCover");
                    boolean zOptBoolean25 = jSONObject.optBoolean("allowManualReview");
                    boolean zOptBoolean26 = jSONObject.optBoolean("ageAssurance");
                    h.d dVar = com.incode.welcome_sdk.data.remote.beans.h.f9677e;
                    String strOptString12 = jSONObject.optString("deepsightLiveness");
                    Intrinsics.checkNotNullExpressionValue(strOptString12, "");
                    return new w(zOptBoolean15, zOptBoolean16, zOptBoolean17, zOptBoolean18, iOptInt, iOptInt2, zOptBoolean19, zOptBoolean20, zOptBoolean21, zOptBoolean22, zOptBoolean23, zOptBoolean24, zOptBoolean25, zOptBoolean26, h.d.a(strOptString12));
                case 19:
                    boolean zOptBoolean27 = jSONObject.optBoolean("showTutorial");
                    int iOptInt3 = jSONObject.optInt("autoCaptureTimeout");
                    int iOptInt4 = jSONObject.optInt("numberOfAttempts");
                    boolean zOptBoolean28 = jSONObject.optBoolean("validateLenses");
                    boolean zOptBoolean29 = jSONObject.optBoolean("validateFaceMask");
                    boolean zOptBoolean30 = jSONObject.optBoolean("validateHeadCover");
                    boolean zOptBoolean31 = jSONObject.optBoolean("validateClosedEyes");
                    h.d dVar2 = com.incode.welcome_sdk.data.remote.beans.h.f9677e;
                    String strOptString13 = jSONObject.optString("deepsightLiveness");
                    Intrinsics.checkNotNullExpressionValue(strOptString13, "");
                    return new l(zOptBoolean27, iOptInt3, iOptInt4, zOptBoolean28, zOptBoolean29, zOptBoolean31, zOptBoolean30, h.d.a(strOptString13));
                case 20:
                    String strOptString14 = jSONObject.optString("title");
                    Intrinsics.checkNotNullExpressionValue(strOptString14, "");
                    String strOptString15 = jSONObject.optString("text");
                    Intrinsics.checkNotNullExpressionValue(strOptString15, "");
                    return new u(strOptString14, strOptString15);
                case 21:
                    String strOptString16 = jSONObject.optString("combinedConsents");
                    Intrinsics.checkNotNullExpressionValue(strOptString16, "");
                    return new e(strOptString16);
                case 22:
                    boolean zOptBoolean32 = jSONObject.optBoolean("useAsSelfie");
                    boolean zOptBoolean33 = jSONObject.optBoolean("showTutorials");
                    boolean zOptBoolean34 = jSONObject.optBoolean("authorizationScreen");
                    String strOptString17 = jSONObject.optString("companyName");
                    Intrinsics.checkNotNullExpressionValue(strOptString17, "");
                    return new ac(zOptBoolean32, zOptBoolean33, zOptBoolean34, strOptString17, jSONObject.optBoolean("checkLiveness"), jSONObject.optBoolean("checkIdScan"), jSONObject.optBoolean("checkDocumentScan"), jSONObject.optBoolean("compareIdEnabled"), jSONObject.optBoolean("compareOcrEnabled"), jSONObject.optBoolean("compareBackIdEnabled"), jSONObject.optBoolean("compareBackOcrEnabled"), jSONObject.optBoolean("checkVoiceConsent"), jSONObject.optInt("voiceConsentQuestions"), jSONObject.optInt("maxWaitingVideoSelfieFile"));
                case 23:
                    b bVar11 = q.f9760c;
                    return c(jSONObject);
                default:
                    return o.f9861e;
            }
        }

        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<JSONObject, com.incode.welcome_sdk.data.remote.beans.g> {

            /* JADX INFO: renamed from: a */
            private static int f9785a = 1;

            /* JADX INFO: renamed from: d */
            private static int f9786d = 0;

            private com.incode.welcome_sdk.data.remote.beans.g c(JSONObject jSONObject) {
                int i2 = 2 % 2;
                int i3 = f9785a + 73;
                f9786d = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(jSONObject, "");
                com.incode.welcome_sdk.data.remote.beans.g gVarC = g.b.c(jSONObject);
                int i5 = f9786d + 5;
                f9785a = i5 % 128;
                int i6 = i5 % 2;
                return gVarC;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ com.incode.welcome_sdk.data.remote.beans.g invoke(JSONObject jSONObject) {
                int i2 = 2 % 2;
                int i3 = f9785a + 75;
                f9786d = i3 % 128;
                int i4 = i3 % 2;
                com.incode.welcome_sdk.data.remote.beans.g gVarC = c(jSONObject);
                int i5 = f9785a + 63;
                f9786d = i5 % 128;
                int i6 = i5 % 2;
                return gVarC;
            }

            a(Object obj) {
                super(1, obj, g.b.class, "parse", "parse(Lorg/json/JSONObject;)Lcom/incode/welcome_sdk/data/remote/beans/CustomField;", 0);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static com.incode.welcome_sdk.data.remote.beans.q c(org.json.JSONObject r5) {
            /*
                r4 = 2
                int r0 = r4 % r4
                int r0 = com.incode.welcome_sdk.data.remote.beans.q.b.f9782a
                int r1 = r0 + 83
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.q.b.f9783d = r0
                int r1 = r1 % r4
                java.lang.String r0 = "screens"
                org.json.JSONArray r3 = r5.optJSONArray(r0)
                if (r3 == 0) goto L2e
                int r0 = com.incode.welcome_sdk.data.remote.beans.q.b.f9782a
                int r1 = r0 + 111
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.q.b.f9783d = r0
                int r1 = r1 % r4
                if (r1 == 0) goto L4a
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r0 = r3.length()
                if (r0 > 0) goto L3c
                com.incode.welcome_sdk.data.remote.beans.q$o r2 = com.incode.welcome_sdk.data.remote.beans.q.o.f9861e
                com.incode.welcome_sdk.data.remote.beans.q r2 = (com.incode.welcome_sdk.data.remote.beans.q) r2
            L2c:
                if (r2 != 0) goto L32
            L2e:
                com.incode.welcome_sdk.data.remote.beans.q$o r2 = com.incode.welcome_sdk.data.remote.beans.q.o.f9861e
                com.incode.welcome_sdk.data.remote.beans.q r2 = (com.incode.welcome_sdk.data.remote.beans.q) r2
            L32:
                int r0 = com.incode.welcome_sdk.data.remote.beans.q.b.f9782a
                int r1 = r0 + 33
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.remote.beans.q.b.f9783d = r0
                int r1 = r1 % r4
                return r2
            L3c:
                com.incode.welcome_sdk.data.remote.beans.q$h r2 = new com.incode.welcome_sdk.data.remote.beans.q$h
                com.incode.welcome_sdk.data.remote.beans.DynamicFormsResponseParser$e r0 = com.incode.welcome_sdk.data.remote.beans.DynamicFormsResponseParser.Companion
                java.util.List r0 = com.incode.welcome_sdk.data.remote.beans.DynamicFormsResponseParser.e.b(r3)
                r2.<init>(r0)
                com.incode.welcome_sdk.data.remote.beans.q r2 = (com.incode.welcome_sdk.data.remote.beans.q) r2
                goto L2c
            L4a:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                r3.length()
                r0 = 0
                r0.hashCode()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.q.b.c(org.json.JSONObject):com.incode.welcome_sdk.data.remote.beans.q");
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.remote.beans.q$b$b */
        public /* synthetic */ class C0236b {

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ int[] f9787b;

            /* JADX INFO: renamed from: c */
            private static int f9788c = 1;

            /* JADX INFO: renamed from: d */
            private static int f9789d = 0;

            static {
                int[] iArr = new int[Modules.values().length];
                try {
                    iArr[Modules.AE_SIGNATURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Modules.ADDRESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Modules.CONFERENCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Modules.CUSTOM_FIELDS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Modules.DOCUMENT_CAPTURE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Modules.EKYB.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Modules.EXTERNAL_VERIFICATION.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Modules.EMAIL.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Modules.FACE_MATCH.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Modules.FINISH_GPT.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Modules.ID.ordinal()] = 11;
                    int i2 = 2 % 2;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Modules.ID_OCR.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Modules.INE_VALIDATION.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Modules.ML_CONSENT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Modules.NFC_SCAN.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Modules.PHONE.ordinal()] = 16;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[Modules.TUTORIAL_ID.ordinal()] = 17;
                    int i4 = 2 % 2;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[Modules.SELFIE.ordinal()] = 18;
                    int i5 = f9789d + 51;
                    f9788c = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[Modules.AUTHENTICATION.ordinal()] = 19;
                    int i8 = f9788c + 65;
                    f9789d = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[Modules.USER_CONSENT.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[Modules.COMBINED_CONSENT.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[Modules.VIDEO_ONBOARDING.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[Modules.DYNAMIC_FORMS.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                f9787b = iArr;
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f9782a = 0;
            f9783d = 1;
            f9784e = new int[]{-1592857267, 2139283249, -2060616881, -993018313, 669846541, -821465473, -1190818904, -1762267247, -602509919, 689986578, -1312990728, 1727855376, 760320836, 222163145, -1649034643, -1354924920, -458190927, 152010025};
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class p extends q {

        /* JADX INFO: renamed from: a */
        private static int f9862a = 0;

        /* JADX INFO: renamed from: g */
        private static int f9863g = 1;

        /* JADX INFO: renamed from: b */
        private final boolean f9864b;

        /* JADX INFO: renamed from: d */
        private final boolean f9865d;

        /* JADX INFO: renamed from: e */
        private final boolean f9866e;

        public final boolean d() {
            int i2 = 2 % 2;
            int i3 = f9862a + 25;
            int i4 = i3 % 128;
            f9863g = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9865d;
            int i6 = i4 + 1;
            f9862a = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean b() {
            int i2 = 2 % 2;
            int i3 = f9862a + 57;
            int i4 = i3 % 128;
            f9863g = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9866e;
            int i6 = i4 + 65;
            f9862a = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean c() {
            boolean z2;
            int i2 = 2 % 2;
            int i3 = f9862a;
            int i4 = i3 + 3;
            f9863g = i4 % 128;
            if (i4 % 2 == 0) {
                z2 = this.f9864b;
                int i5 = 23 / 0;
            } else {
                z2 = this.f9864b;
            }
            int i6 = i3 + 17;
            f9863g = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public p(boolean z2, boolean z3, boolean z4) {
            super((byte) 0);
            this.f9865d = z2;
            this.f9866e = z3;
            this.f9864b = z4;
        }
    }

    public static final class y extends q {

        /* JADX INFO: renamed from: a */
        private static int f9920a = 1;

        /* JADX INFO: renamed from: e */
        private static int f9921e = 0;

        /* JADX INFO: renamed from: b */
        private final boolean f9922b;

        /* JADX INFO: renamed from: d */
        private final boolean f9923d;

        public final boolean a() {
            boolean z2;
            int i2 = 2 % 2;
            int i3 = f9920a;
            int i4 = i3 + 79;
            f9921e = i4 % 128;
            if (i4 % 2 != 0) {
                z2 = this.f9923d;
                int i5 = 66 / 0;
            } else {
                z2 = this.f9923d;
            }
            int i6 = i3 + 35;
            f9921e = i6 % 128;
            if (i6 % 2 == 0) {
                return z2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean c() {
            int i2 = 2 % 2;
            int i3 = f9920a + 103;
            f9921e = i3 % 128;
            int i4 = i3 % 2;
            boolean z2 = this.f9922b;
            if (i4 != 0) {
                int i5 = 65 / 0;
            }
            return z2;
        }

        public y(boolean z2, boolean z3) {
            super((byte) 0);
            this.f9923d = z2;
            this.f9922b = z3;
        }
    }

    public static final class v extends q {

        /* JADX INFO: renamed from: d */
        private static int f9897d = 0;

        /* JADX INFO: renamed from: e */
        private static int f9898e = 1;

        /* JADX INFO: renamed from: a */
        private final boolean f9899a;

        public final boolean d() {
            int i2 = 2 % 2;
            int i3 = f9898e + 35;
            int i4 = i3 % 128;
            f9897d = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9899a;
            int i6 = i4 + 55;
            f9898e = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }
    }

    public static final class w extends q {

        /* JADX INFO: renamed from: p */
        private static int f9900p = 1;

        /* JADX INFO: renamed from: s */
        private static int f9901s = 0;

        /* JADX INFO: renamed from: a */
        private final boolean f9902a;

        /* JADX INFO: renamed from: b */
        private final boolean f9903b;

        /* JADX INFO: renamed from: d */
        private final boolean f9904d;

        /* JADX INFO: renamed from: e */
        private final boolean f9905e;

        /* JADX INFO: renamed from: f */
        private final int f9906f;

        /* JADX INFO: renamed from: g */
        private final boolean f9907g;

        /* JADX INFO: renamed from: h */
        private final boolean f9908h;

        /* JADX INFO: renamed from: i */
        private final boolean f9909i;

        /* JADX INFO: renamed from: j */
        private final int f9910j;

        /* JADX INFO: renamed from: k */
        private final boolean f9911k;

        /* JADX INFO: renamed from: l */
        private final boolean f9912l;

        /* JADX INFO: renamed from: m */
        private final boolean f9913m;

        /* JADX INFO: renamed from: n */
        private final boolean f9914n;

        /* JADX INFO: renamed from: o */
        private final boolean f9915o;

        /* JADX INFO: renamed from: q */
        private final com.incode.welcome_sdk.data.remote.beans.h f9916q;

        public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
            int i8 = ~i4;
            int i9 = (~(i8 | i7)) | i2;
            int i10 = ~i7;
            int i11 = ~i2;
            int i12 = (~(i10 | i11)) | i4;
            int i13 = (~(i2 | i10 | i4)) | (~(i8 | i10 | i11)) | (~(i11 | i7 | i4));
            int i14 = i7 + i4 + i6 + ((-104759182) * i5) + ((-453318476) * i3);
            int i15 = i14 * i14;
            int i16 = (i7 * 1504131295) + 1805123584 + (1504131295 * i4) + (179255518 * i9) + ((-358511036) * i12) + ((-179255518) * i13) + (1324875776 * i6) + (711983104 * i5) + (1180696576 * i3) + (1022754816 * i15);
            int i17 = ((i7 * (-1431886989)) - 1507491630) + (i4 * (-1431886989)) + (i9 * (-122)) + (i12 * 244) + (i13 * 122) + (i6 * (-1431886867)) + (i5 * 722567050) + (i3 * (-1618605404)) + (i15 * 297664512);
            return i16 + ((i17 * i17) * (-277217280)) != 1 ? a(objArr) : d(objArr);
        }

        public final boolean a() {
            int i2 = 2 % 2;
            int i3 = f9900p + 91;
            f9901s = i3 % 128;
            int i4 = i3 % 2;
            boolean z2 = this.f9902a;
            if (i4 != 0) {
                int i5 = 33 / 0;
            }
            return z2;
        }

        private static /* synthetic */ Object d(Object[] objArr) {
            w wVar = (w) objArr[0];
            int i2 = 2 % 2;
            int i3 = f9901s + 123;
            f9900p = i3 % 128;
            int i4 = i3 % 2;
            boolean z2 = wVar.f9905e;
            if (i4 == 0) {
                int i5 = 1 / 0;
            }
            return Boolean.valueOf(z2);
        }

        public final boolean c() {
            int i2 = 2 % 2;
            int i3 = f9901s;
            int i4 = i3 + 23;
            f9900p = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.f9904d;
            int i6 = i3 + 113;
            f9900p = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 53 / 0;
            }
            return z2;
        }

        public final int e() {
            int i2 = 2 % 2;
            int i3 = f9901s + 23;
            f9900p = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f9910j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int d() {
            int i2 = 2 % 2;
            int i3 = f9901s;
            int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f9900p = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.f9906f;
            int i7 = i3 + 95;
            f9900p = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        private static /* synthetic */ Object a(Object[] objArr) {
            w wVar = (w) objArr[0];
            int i2 = 2 % 2;
            int i3 = f9901s + 29;
            int i4 = i3 % 128;
            f9900p = i4;
            int i5 = i3 % 2;
            Object obj = null;
            boolean z2 = wVar.f9908h;
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = i4 + 75;
            f9901s = i6 % 128;
            if (i6 % 2 == 0) {
                return Boolean.valueOf(z2);
            }
            obj.hashCode();
            throw null;
        }

        public final boolean g() {
            int i2 = 2 % 2;
            int i3 = f9900p + 19;
            int i4 = i3 % 128;
            f9901s = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9909i;
            int i6 = i4 + 91;
            f9900p = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 99 / 0;
            }
            return z2;
        }

        public final boolean i() {
            int i2 = 2 % 2;
            int i3 = f9900p;
            int i4 = i3 + 49;
            f9901s = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z2 = this.f9912l;
            int i5 = i3 + 107;
            f9901s = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 65 / 0;
            }
            return z2;
        }

        public final boolean j() {
            int i2 = 2 % 2;
            int i3 = f9901s + 99;
            int i4 = i3 % 128;
            f9900p = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            boolean z2 = this.f9915o;
            int i5 = i4 + 27;
            f9901s = i5 % 128;
            int i6 = i5 % 2;
            return z2;
        }

        public final boolean f() {
            int i2 = 2 % 2;
            int i3 = f9901s;
            int i4 = i3 + 3;
            f9900p = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z2 = this.f9911k;
            int i5 = i3 + 27;
            f9900p = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 25 / 0;
            }
            return z2;
        }

        public final com.incode.welcome_sdk.data.remote.beans.h m() {
            int i2 = 2 % 2;
            int i3 = f9900p + 65;
            f9901s = i3 % 128;
            int i4 = i3 % 2;
            com.incode.welcome_sdk.data.remote.beans.h hVar = this.f9916q;
            if (i4 != 0) {
                int i5 = 89 / 0;
            }
            return hVar;
        }

        public w(boolean z2, boolean z3, boolean z4, boolean z5, int i2, int i3, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, com.incode.welcome_sdk.data.remote.beans.h hVar) {
            super((byte) 0);
            this.f9902a = z2;
            this.f9903b = z3;
            this.f9905e = z4;
            this.f9904d = z5;
            this.f9910j = i2;
            this.f9906f = i3;
            this.f9907g = z6;
            this.f9908h = z7;
            this.f9909i = z8;
            this.f9912l = z9;
            this.f9915o = z10;
            this.f9911k = z11;
            this.f9913m = z12;
            this.f9914n = z13;
            this.f9916q = hVar;
        }

        public final boolean h() {
            int iA = com.incode.welcome_sdk.commons.utils.h.a();
            int iA2 = com.incode.welcome_sdk.commons.utils.h.a();
            int iA3 = com.incode.welcome_sdk.commons.utils.h.a();
            return ((Boolean) d(iA, com.incode.welcome_sdk.commons.utils.h.a(), 1388377246, iA3, iA2, new Object[]{this}, -1388377246)).booleanValue();
        }

        public final boolean b() {
            int iA = com.incode.welcome_sdk.commons.utils.h.a();
            int iA2 = com.incode.welcome_sdk.commons.utils.h.a();
            int iA3 = com.incode.welcome_sdk.commons.utils.h.a();
            return ((Boolean) d(iA, com.incode.welcome_sdk.commons.utils.h.a(), 1223284828, iA3, iA2, new Object[]{this}, -1223284827)).booleanValue();
        }
    }

    public static final class u extends q {

        /* JADX INFO: renamed from: a */
        private static int f9893a = 0;

        /* JADX INFO: renamed from: b */
        private static int f9894b = 1;

        /* JADX INFO: renamed from: d */
        private final String f9895d;

        /* JADX INFO: renamed from: e */
        private final String f9896e;

        public final String b() {
            int i2 = 2 % 2;
            int i3 = f9893a;
            int i4 = i3 + 77;
            f9894b = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.f9896e;
            int i5 = i3 + 59;
            f9894b = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String c() {
            int i2 = 2 % 2;
            int i3 = f9893a + 121;
            int i4 = i3 % 128;
            f9894b = i4;
            int i5 = i3 % 2;
            String str = this.f9895d;
            int i6 = i4 + 125;
            f9893a = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, String str2) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.f9896e = str;
            this.f9895d = str2;
        }
    }

    public static final class x extends q {

        /* JADX INFO: renamed from: b */
        private static int f9917b = 1;

        /* JADX INFO: renamed from: d */
        private static int f9918d = 0;

        /* JADX INFO: renamed from: e */
        private final boolean f9919e;

        public final boolean b() {
            int i2 = 2 % 2;
            int i3 = f9918d + 21;
            int i4 = i3 % 128;
            f9917b = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z2 = this.f9919e;
            int i5 = i4 + 103;
            f9918d = i5 % 128;
            int i6 = i5 % 2;
            return z2;
        }

        public x(boolean z2) {
            super((byte) 0);
            this.f9919e = z2;
        }
    }

    public static final class ac extends q {

        /* JADX INFO: renamed from: p */
        private static int f9766p = 0;

        /* JADX INFO: renamed from: r */
        private static int f9767r = 1;

        /* JADX INFO: renamed from: a */
        private final boolean f9768a;

        /* JADX INFO: renamed from: b */
        private final boolean f9769b;

        /* JADX INFO: renamed from: d */
        private final boolean f9770d;

        /* JADX INFO: renamed from: e */
        private final String f9771e;

        /* JADX INFO: renamed from: f */
        private final boolean f9772f;

        /* JADX INFO: renamed from: g */
        private final boolean f9773g;

        /* JADX INFO: renamed from: h */
        private final boolean f9774h;

        /* JADX INFO: renamed from: i */
        private final boolean f9775i;

        /* JADX INFO: renamed from: j */
        private final boolean f9776j;

        /* JADX INFO: renamed from: k */
        private final int f9777k;

        /* JADX INFO: renamed from: l */
        private final boolean f9778l;

        /* JADX INFO: renamed from: m */
        private final boolean f9779m;

        /* JADX INFO: renamed from: n */
        private final int f9780n;

        /* JADX INFO: renamed from: o */
        private final boolean f9781o;

        public static /* synthetic */ Object a(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
            int i8 = ~i5;
            int i9 = ~i2;
            int i10 = ~(i8 | i9);
            int i11 = ~i4;
            int i12 = ~(i11 | i9);
            int i13 = i10 | i12 | (~(i5 | i4 | i2));
            int i14 = i8 | i11;
            int i15 = i10 | (~i14) | i12;
            int i16 = (~(i2 | i4)) | (~(i14 | i9)) | (~(i5 | i2));
            int i17 = i5 + i4 + i6 + ((-298151579) * i3) + ((-427515960) * i7);
            int i18 = i17 * i17;
            int i19 = (i5 * (-431502880)) + 875560960 + ((-431502880) * i4) + ((-1881159201) * i13) + ((-532648894) * i15) + (1881159201 * i16) + (1449656320 * i6) + ((-16252928) * i3) + (423624704 * i7) + (1109590016 * i18);
            int i20 = ((i5 * (-2003555040)) - 1632655964) + (i4 * (-2003555040)) + (i13 * (-423)) + (i15 * 846) + (i16 * 423) + (i6 * (-2003554617)) + (i3 * 1812671363) + (i7 * (-1519508360)) + (i18 * (-1288372224));
            if (i19 + (i20 * i20 * (-1796407296)) == 1) {
                return c(objArr);
            }
            ac acVar = (ac) objArr[0];
            int i21 = 2 % 2;
            int i22 = f9767r;
            int i23 = i22 + 7;
            f9766p = i23 % 128;
            int i24 = i23 % 2;
            boolean z2 = acVar.f9774h;
            int i25 = i22 + 55;
            f9766p = i25 % 128;
            int i26 = i25 % 2;
            return Boolean.valueOf(z2);
        }

        public final boolean c() {
            int i2 = 2 % 2;
            int i3 = f9766p + 61;
            int i4 = i3 % 128;
            f9767r = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9769b;
            int i6 = i4 + 91;
            f9766p = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 56 / 0;
            }
            return z2;
        }

        public final boolean b() {
            int i2 = 2 % 2;
            int i3 = f9766p;
            int i4 = i3 + 33;
            f9767r = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.f9770d;
            int i6 = i3 + 9;
            f9767r = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean a() {
            boolean z2;
            int i2 = 2 % 2;
            int i3 = f9766p + 105;
            int i4 = i3 % 128;
            f9767r = i4;
            if (i3 % 2 == 0) {
                z2 = this.f9775i;
                int i5 = 67 / 0;
            } else {
                z2 = this.f9775i;
            }
            int i6 = i4 + 25;
            f9766p = i6 % 128;
            if (i6 % 2 == 0) {
                return z2;
            }
            throw null;
        }

        public final boolean e() {
            int i2 = 2 % 2;
            int i3 = f9767r + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f9766p = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f9772f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean f() {
            int i2 = 2 % 2;
            int i3 = f9767r + 15;
            f9766p = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f9773g;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean h() {
            int i2 = 2 % 2;
            int i3 = f9767r + 37;
            int i4 = i3 % 128;
            f9766p = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9776j;
            int i6 = i4 + 57;
            f9767r = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean g() {
            int i2 = 2 % 2;
            int i3 = f9767r;
            int i4 = i3 + 21;
            f9766p = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.f9781o;
            int i6 = i3 + 97;
            f9766p = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean j() {
            boolean z2;
            int i2 = 2 % 2;
            int i3 = f9767r;
            int i4 = i3 + 113;
            f9766p = i4 % 128;
            if (i4 % 2 != 0) {
                z2 = this.f9778l;
                int i5 = 37 / 0;
            } else {
                z2 = this.f9778l;
            }
            int i6 = i3 + 73;
            f9766p = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean i() {
            int i2 = 2 % 2;
            int i3 = f9766p + 29;
            int i4 = i3 % 128;
            f9767r = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f9779m;
            int i6 = i4 + 111;
            f9766p = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final int n() {
            int i2 = 2 % 2;
            int i3 = f9766p;
            int i4 = i3 + 97;
            f9767r = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.f9777k;
            int i7 = i3 + 29;
            f9767r = i7 % 128;
            if (i7 % 2 != 0) {
                return i6;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object c(Object[] objArr) {
            ac acVar = (ac) objArr[0];
            int i2 = 2 % 2;
            int i3 = f9766p + 83;
            f9767r = i3 % 128;
            int i4 = i3 % 2;
            int i5 = acVar.f9780n;
            if (i4 != 0) {
                return Integer.valueOf(i5);
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ac(boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i2, int i3) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(str, "");
            this.f9769b = z2;
            this.f9770d = z3;
            this.f9768a = z4;
            this.f9771e = str;
            this.f9775i = z5;
            this.f9774h = z6;
            this.f9772f = z7;
            this.f9773g = z8;
            this.f9776j = z9;
            this.f9781o = z10;
            this.f9778l = z11;
            this.f9779m = z12;
            this.f9777k = i2;
            this.f9780n = i3;
        }

        public final int k() {
            int iC = com.incode.welcome_sdk.data.local.db.c.a.a.c();
            int iC2 = com.incode.welcome_sdk.data.local.db.c.a.a.c();
            return ((Integer) a(iC, com.incode.welcome_sdk.data.local.db.c.a.a.c(), new Object[]{this}, 1177297104, -1177297103, iC2, com.incode.welcome_sdk.data.local.db.c.a.a.c())).intValue();
        }

        public final boolean d() {
            int iC = com.incode.welcome_sdk.data.local.db.c.a.a.c();
            int iC2 = com.incode.welcome_sdk.data.local.db.c.a.a.c();
            return ((Boolean) a(iC, com.incode.welcome_sdk.data.local.db.c.a.a.c(), new Object[]{this}, -833971025, 833971025, iC2, com.incode.welcome_sdk.data.local.db.c.a.a.c())).booleanValue();
        }
    }

    public static final class o extends q {

        /* JADX INFO: renamed from: a */
        private static int f9859a = 1;

        /* JADX INFO: renamed from: b */
        private static int f9860b = 0;

        /* JADX INFO: renamed from: e */
        public static final o f9861e = new o();

        private o() {
            super((byte) 0);
        }

        static {
            int i2 = f9860b + 31;
            f9859a = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    static {
        int i2 = f9759b + 71;
        f9761e = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
        }
    }

    public /* synthetic */ q(byte b2) {
        this();
    }
}
