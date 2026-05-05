package com.incode.welcome_sdk.commons.theme;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.CompareOcrException;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel;
import cz.msebera.android.httpclient.impl.client.cache.CacheValidityPolicy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a */
    private static int f5643a = 1;

    /* JADX INFO: renamed from: b */
    private static final ColorScheme f5644b;

    /* JADX INFO: renamed from: c */
    private static final androidx.compose.material3.Typography f5645c;

    /* JADX INFO: renamed from: d */
    private static int f5646d = 0;

    /* JADX INFO: renamed from: e */
    public static final g f5647e = new g();

    /* JADX INFO: renamed from: h */
    private static int f5648h = 0;

    /* JADX INFO: renamed from: j */
    private static int f5649j = 1;

    private g() {
    }

    public static final /* synthetic */ ColorScheme c() {
        int i2 = 2 % 2;
        int i3 = f5646d + 71;
        f5643a = i3 % 128;
        if (i3 % 2 != 0) {
            return f5644b;
        }
        throw null;
    }

    public static final class b {

        /* JADX INFO: renamed from: a */
        private static final long f5653a;

        /* JADX INFO: renamed from: b */
        private static final long f5654b;

        /* JADX INFO: renamed from: c */
        private static final long f5655c;

        /* JADX INFO: renamed from: f */
        private static final long f5658f;

        /* JADX INFO: renamed from: g */
        private static final long f5659g;

        /* JADX INFO: renamed from: h */
        private static final long f5660h;

        /* JADX INFO: renamed from: i */
        private static final long f5661i;

        /* JADX INFO: renamed from: j */
        private static final long f5662j;

        /* JADX INFO: renamed from: k */
        private static final long f5663k;

        /* JADX INFO: renamed from: l */
        private static int f5664l = 0;

        /* JADX INFO: renamed from: m */
        private static int f5665m = 1;

        /* JADX INFO: renamed from: n */
        private static int f5666n = 0;

        /* JADX INFO: renamed from: o */
        private static int f5667o = 1;

        /* JADX INFO: renamed from: e */
        public static final b f5657e = new b();

        /* JADX INFO: renamed from: d */
        private static final long f5656d = ColorKt.Color(4294967295L);

        public static /* synthetic */ Object c(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~i7;
            int i9 = ~i3;
            int i10 = ~(i8 | i9);
            int i11 = ~((~i5) | i7);
            int i12 = i10 | i11 | (~(i7 | i3));
            int i13 = (~(i3 | i5)) | (~(i8 | i5));
            int i14 = i9 | i11;
            int i15 = i5 + i7 + i6 + (793188503 * i2) + (2090109681 * i4);
            int i16 = i15 * i15;
            int i17 = (837707615 * i5) + 1286602752 + ((-1676358574) * i7) + (i12 * (-838022063)) + (1676044126 * i13) + ((-838022063) * i14) + ((-838336512) * i6) + (1186463744 * i2) + (1166540800 * i4) + ((-1956446208) * i16);
            int i18 = ((i5 * 1389925299) - 652765764) + (i7 * 1389927018) + (i12 * 573) + (i13 * (-1146)) + (i14 * 573) + (i6 * 1389926445) + (i2 * (-1551828341)) + (i4 * (-2047638435)) + (i16 * 1214709760);
            return i17 + ((i18 * i18) * 445972480) != 1 ? c(objArr) : a(objArr);
        }

        private b() {
        }

        static {
            ColorKt.Color(2164260863L);
            f5654b = ColorKt.Color(4278235901L);
            ColorKt.Color(4280444632L);
            ColorKt.Color(4284963059L);
            ColorKt.Color(4281281873L);
            f5653a = ColorKt.Color(4280297021L);
            f5655c = ColorKt.Color(4278190080L);
            ColorKt.Color(CacheValidityPolicy.MAX_AGE);
            ColorKt.Color(CacheValidityPolicy.MAX_AGE);
            ColorKt.Color(CacheValidityPolicy.MAX_AGE);
            ColorKt.Color(4292862970L);
            f5658f = ColorKt.Color(4284704368L);
            f5659g = ColorKt.Color(4288124823L);
            f5662j = ColorKt.Color(4290559164L);
            f5661i = ColorKt.Color(4293519851L);
            ColorKt.Color(4294572799L);
            f5660h = ColorKt.Color(4294925423L);
            ColorKt.Color(4294159164L);
            f5663k = ColorKt.Color(4279031202L);
            ColorKt.Color(2148324770L);
            int i2 = f5665m + 81;
            f5664l = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public static long c() {
            int i2 = 2 % 2;
            int i3 = f5667o + 97;
            int i4 = i3 % 128;
            f5666n = i4;
            int i5 = i3 % 2;
            long j2 = f5656d;
            int i6 = i4 + 97;
            f5667o = i6 % 128;
            int i7 = i6 % 2;
            return j2;
        }

        private static /* synthetic */ Object c(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f5666n + 75;
            int i4 = i3 % 128;
            f5667o = i4;
            int i5 = i3 % 2;
            long j2 = f5654b;
            int i6 = i4 + 45;
            f5666n = i6 % 128;
            if (i6 % 2 == 0) {
                return Long.valueOf(j2);
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static long d() {
            int i2 = 2 % 2;
            int i3 = f5667o + 53;
            int i4 = i3 % 128;
            f5666n = i4;
            int i5 = i3 % 2;
            long j2 = f5653a;
            int i6 = i4 + 89;
            f5667o = i6 % 128;
            int i7 = i6 % 2;
            return j2;
        }

        private static /* synthetic */ Object a(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f5666n + 121;
            int i4 = i3 % 128;
            f5667o = i4;
            int i5 = i3 % 2;
            long j2 = f5655c;
            if (i5 == 0) {
                int i6 = 35 / 0;
            }
            int i7 = i4 + 39;
            f5666n = i7 % 128;
            if (i7 % 2 == 0) {
                return Long.valueOf(j2);
            }
            int i8 = 95 / 0;
            return Long.valueOf(j2);
        }

        public static long e() {
            int i2 = 2 % 2;
            int i3 = f5667o + 25;
            int i4 = i3 % 128;
            f5666n = i4;
            int i5 = i3 % 2;
            long j2 = f5658f;
            int i6 = i4 + 7;
            f5667o = i6 % 128;
            if (i6 % 2 != 0) {
                return j2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static long j() {
            int i2 = 2 % 2;
            int i3 = f5667o + 5;
            f5666n = i3 % 128;
            if (i3 % 2 == 0) {
                return f5659g;
            }
            throw null;
        }

        public static long h() {
            long j2;
            int i2 = 2 % 2;
            int i3 = f5666n;
            int i4 = i3 + 41;
            f5667o = i4 % 128;
            if (i4 % 2 == 0) {
                j2 = f5662j;
                int i5 = 94 / 0;
            } else {
                j2 = f5662j;
            }
            int i6 = i3 + 53;
            f5667o = i6 % 128;
            int i7 = i6 % 2;
            return j2;
        }

        public static long f() {
            int i2 = 2 % 2;
            int i3 = f5666n + 113;
            int i4 = i3 % 128;
            f5667o = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            long j2 = f5661i;
            int i5 = i4 + 25;
            f5666n = i5 % 128;
            if (i5 % 2 == 0) {
                return j2;
            }
            obj.hashCode();
            throw null;
        }

        public static long i() {
            int i2 = 2 % 2;
            int i3 = f5667o;
            int i4 = i3 + 111;
            f5666n = i4 % 128;
            int i5 = i4 % 2;
            long j2 = f5660h;
            int i6 = i3 + 69;
            f5666n = i6 % 128;
            int i7 = i6 % 2;
            return j2;
        }

        public static long g() {
            int i2 = 2 % 2;
            int i3 = f5667o + 25;
            f5666n = i3 % 128;
            if (i3 % 2 == 0) {
                return f5663k;
            }
            throw null;
        }

        public static long b() {
            int iE = CompareOcrException.e();
            int iE2 = CompareOcrException.e();
            return ((Long) c(CompareOcrException.e(), new Object[0], iE, CompareOcrException.e(), 547854677, iE2, -547854676)).longValue();
        }

        public static long a() {
            int iE = CompareOcrException.e();
            int iE2 = CompareOcrException.e();
            return ((Long) c(CompareOcrException.e(), new Object[0], iE, CompareOcrException.e(), 675099086, iE2, -675099086)).longValue();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a */
        private static final TextStyle f5673a;

        /* JADX INFO: renamed from: b */
        private static final FontFamily f5674b;

        /* JADX INFO: renamed from: c */
        private static final FontFamily f5675c;

        /* JADX INFO: renamed from: d */
        private static final TextStyle f5676d;

        /* JADX INFO: renamed from: e */
        public static final d f5677e = new d();

        /* JADX INFO: renamed from: f */
        private static final TextStyle f5678f;

        /* JADX INFO: renamed from: g */
        private static final TextStyle f5679g;

        /* JADX INFO: renamed from: h */
        private static final TextStyle f5680h;

        /* JADX INFO: renamed from: i */
        private static final TextStyle f5681i;

        /* JADX INFO: renamed from: j */
        private static final TextStyle f5682j;

        /* JADX INFO: renamed from: k */
        private static final TextStyle f5683k;

        /* JADX INFO: renamed from: l */
        private static final TextStyle f5684l;

        /* JADX INFO: renamed from: m */
        private static final TextStyle f5685m;

        /* JADX INFO: renamed from: n */
        private static final TextStyle f5686n;

        /* JADX INFO: renamed from: o */
        private static final TextStyle f5687o;

        /* JADX INFO: renamed from: p */
        private static int f5688p = 0;

        /* JADX INFO: renamed from: q */
        private static final TextStyle f5689q;

        /* JADX INFO: renamed from: r */
        private static int f5690r = 0;

        /* JADX INFO: renamed from: s */
        private static int f5691s = 1;

        /* JADX INFO: renamed from: t */
        private static int f5692t = 1;

        public static /* synthetic */ Object e(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
            int i8 = (~(i3 | i7)) | i6;
            int i9 = (~((~i7) | i3)) | i6;
            int i10 = (~i6) | i3;
            int i11 = i6 + i3 + i5 + (440753341 * i4) + ((-634449194) * i2);
            int i12 = i11 * i11;
            int i13 = ((-907101825) * i6) + 1075183616 + ((-1421434046) * i3) + (i8 * (-1603099839)) + ((-1603099839) * i9) + (1603099839 * i10) + (181665792 * i5) + (780402688 * i4) + ((-180879360) * i2) + (353763328 * i12);
            int i14 = (i6 * 892202253) + 1676176333 + (i3 * 892200102) + (i8 * (-717)) + (i9 * (-717)) + (i10 * 717) + (i5 * 892200819) + (i4 * (-770690073)) + (i2 * 448958498) + (i12 * 1390542848);
            return i13 + ((i14 * i14) * (-1042677760)) != 1 ? a(objArr) : d(objArr);
        }

        private d() {
        }

        static {
            FontFamily FontFamily = FontFamilyKt.FontFamily(FontKt.m6216FontYpTlLL0$default(R.font.onboard_sdk_circular_std_book, FontWeight.Companion.getNormal(), 0, 0, 12, null));
            f5675c = FontFamily;
            FontFamily FontFamily2 = FontFamilyKt.FontFamily(FontKt.m6216FontYpTlLL0$default(R.font.onboard_sdk_circular_std_bold, FontWeight.Companion.getBold(), 0, 0, 12, null));
            f5674b = FontFamily2;
            TextStyle textStyle = TextStyle.Companion.getDefault();
            FontWeight w400 = FontWeight.Companion.getW400();
            b bVar = b.f5657e;
            TextStyle textStyleM6136copyp1EtxEg$default = TextStyle.m6136copyp1EtxEg$default(textStyle, b.d(), 0L, w400, null, null, FontFamily, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777178, null);
            f5673a = textStyleM6136copyp1EtxEg$default;
            TextStyle textStyle2 = TextStyle.Companion.getDefault();
            FontWeight w700 = FontWeight.Companion.getW700();
            b bVar2 = b.f5657e;
            TextStyle textStyleM6136copyp1EtxEg$default2 = TextStyle.m6136copyp1EtxEg$default(textStyle2, b.d(), 0L, w700, null, null, FontFamily2, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777178, null);
            f5676d = textStyleM6136copyp1EtxEg$default2;
            TextStyle textStyle3 = TextStyle.Companion.getDefault();
            FontWeight w7002 = FontWeight.Companion.getW700();
            b bVar3 = b.f5657e;
            TextStyle.m6136copyp1EtxEg$default(textStyle3, b.d(), 0L, w7002, null, null, FontFamily2, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777178, null);
            TextStyle textStyle4 = TextStyle.Companion.getDefault();
            FontWeight w7003 = FontWeight.Companion.getW700();
            b bVar4 = b.f5657e;
            TextStyle.m6136copyp1EtxEg$default(textStyle4, b.d(), 0L, w7003, null, null, FontFamily2, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777178, null);
            f5680h = TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default2, 0L, TextUnitKt.getSp(36), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            f5678f = TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default2, 0L, TextUnitKt.getSp(25), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            f5681i = TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default, 0L, TextUnitKt.getSp(18), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            f5682j = TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default, 0L, TextUnitKt.getSp(14), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default2, 0L, TextUnitKt.getSp(40), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            f5679g = TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default, 0L, TextUnitKt.getSp(20), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default, 0L, TextUnitKt.getSp(15), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default, 0L, TextUnitKt.getSp(20), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            f5686n = TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default, 0L, TextUnitKt.getSp(16), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            f5684l = TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default, 0L, TextUnitKt.getSp(13), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            f5683k = TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default, 0L, TextUnitKt.getSp(11), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            f5687o = TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default2, 0L, TextUnitKt.getSp(16), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default, 0L, TextUnitKt.getSp(12), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            f5685m = TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default2, 0L, TextUnitKt.getSp(20), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default2, 0L, TextUnitKt.getSp(18), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            f5689q = TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default2, 0L, TextUnitKt.getSp(16), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            TextStyle.m6136copyp1EtxEg$default(textStyleM6136copyp1EtxEg$default2, 0L, TextUnitKt.getSp(12), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            int i2 = f5691s + 73;
            f5688p = i2 % 128;
            int i3 = i2 % 2;
        }

        public static TextStyle d() {
            int i2 = 2 % 2;
            int i3 = f5692t;
            int i4 = i3 + 125;
            f5690r = i4 % 128;
            int i5 = i4 % 2;
            TextStyle textStyle = f5680h;
            int i6 = i3 + 97;
            f5690r = i6 % 128;
            if (i6 % 2 == 0) {
                return textStyle;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static TextStyle c() {
            int i2 = 2 % 2;
            int i3 = f5690r + 75;
            f5692t = i3 % 128;
            int i4 = i3 % 2;
            TextStyle textStyle = f5678f;
            if (i4 == 0) {
                int i5 = 62 / 0;
            }
            return textStyle;
        }

        private static /* synthetic */ Object d(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f5690r + 69;
            f5692t = i3 % 128;
            if (i3 % 2 != 0) {
                return f5681i;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static TextStyle e() {
            int i2 = 2 % 2;
            int i3 = f5692t;
            int i4 = i3 + 53;
            f5690r = i4 % 128;
            int i5 = i4 % 2;
            TextStyle textStyle = f5682j;
            int i6 = i3 + 85;
            f5690r = i6 % 128;
            int i7 = i6 % 2;
            return textStyle;
        }

        public static TextStyle a() {
            int i2 = 2 % 2;
            int i3 = f5690r;
            int i4 = i3 + 9;
            f5692t = i4 % 128;
            int i5 = i4 % 2;
            TextStyle textStyle = f5679g;
            int i6 = i3 + 53;
            f5692t = i6 % 128;
            int i7 = i6 % 2;
            return textStyle;
        }

        public static TextStyle f() {
            int i2 = 2 % 2;
            int i3 = f5690r;
            int i4 = i3 + 5;
            f5692t = i4 % 128;
            int i5 = i4 % 2;
            TextStyle textStyle = f5686n;
            int i6 = i3 + 23;
            f5692t = i6 % 128;
            if (i6 % 2 != 0) {
                return textStyle;
            }
            throw null;
        }

        private static /* synthetic */ Object a(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f5692t + 19;
            int i4 = i3 % 128;
            f5690r = i4;
            int i5 = i3 % 2;
            TextStyle textStyle = f5684l;
            int i6 = i4 + 43;
            f5692t = i6 % 128;
            if (i6 % 2 != 0) {
                return textStyle;
            }
            throw null;
        }

        public static TextStyle j() {
            int i2 = 2 % 2;
            int i3 = f5690r + 91;
            int i4 = i3 % 128;
            f5692t = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TextStyle textStyle = f5683k;
            int i5 = i4 + 89;
            f5690r = i5 % 128;
            int i6 = i5 % 2;
            return textStyle;
        }

        public static TextStyle h() {
            int i2 = 2 % 2;
            int i3 = f5692t + 81;
            int i4 = i3 % 128;
            f5690r = i4;
            int i5 = i3 % 2;
            TextStyle textStyle = f5687o;
            int i6 = i4 + 113;
            f5692t = i6 % 128;
            if (i6 % 2 != 0) {
                return textStyle;
            }
            throw null;
        }

        public static TextStyle g() {
            int i2 = 2 % 2;
            int i3 = f5690r;
            int i4 = i3 + 45;
            f5692t = i4 % 128;
            int i5 = i4 % 2;
            TextStyle textStyle = f5685m;
            int i6 = i3 + 5;
            f5692t = i6 % 128;
            int i7 = i6 % 2;
            return textStyle;
        }

        public static TextStyle n() {
            int i2 = 2 % 2;
            int i3 = f5692t;
            int i4 = i3 + 95;
            f5690r = i4 % 128;
            int i5 = i4 % 2;
            TextStyle textStyle = f5689q;
            int i6 = i3 + 31;
            f5690r = i6 % 128;
            int i7 = i6 % 2;
            return textStyle;
        }

        public static TextStyle i() {
            int iD = IdCaptureViewModel.z.d();
            int iD2 = IdCaptureViewModel.z.d();
            int iD3 = IdCaptureViewModel.z.d();
            return (TextStyle) e(IdCaptureViewModel.z.d(), -1741876537, iD3, new Object[0], iD2, 1741876537, iD);
        }

        public static TextStyle b() {
            int iD = IdCaptureViewModel.z.d();
            int iD2 = IdCaptureViewModel.z.d();
            int iD3 = IdCaptureViewModel.z.d();
            return (TextStyle) e(IdCaptureViewModel.z.d(), 682056034, iD3, new Object[0], iD2, -682056033, iD);
        }
    }

    static {
        d dVar = d.f5677e;
        TextStyle textStyleD = d.d();
        d dVar2 = d.f5677e;
        TextStyle textStyleC = d.c();
        d dVar3 = d.f5677e;
        int iD = IdCaptureViewModel.z.d();
        int iD2 = IdCaptureViewModel.z.d();
        TextStyle textStyle = (TextStyle) d.e(IdCaptureViewModel.z.d(), 682056034, IdCaptureViewModel.z.d(), new Object[0], iD2, -682056033, iD);
        d dVar4 = d.f5677e;
        TextStyle textStyleC2 = d.c();
        d dVar5 = d.f5677e;
        int iD3 = IdCaptureViewModel.z.d();
        int iD4 = IdCaptureViewModel.z.d();
        TextStyle textStyle2 = (TextStyle) d.e(IdCaptureViewModel.z.d(), 682056034, IdCaptureViewModel.z.d(), new Object[0], iD4, -682056033, iD3);
        d dVar6 = d.f5677e;
        TextStyle textStyleE = d.e();
        d dVar7 = d.f5677e;
        TextStyle textStyleF = d.f();
        d dVar8 = d.f5677e;
        int iD5 = IdCaptureViewModel.z.d();
        int iD6 = IdCaptureViewModel.z.d();
        TextStyle textStyle3 = (TextStyle) d.e(IdCaptureViewModel.z.d(), -1741876537, IdCaptureViewModel.z.d(), new Object[0], iD6, 1741876537, iD5);
        d dVar9 = d.f5677e;
        TextStyle textStyleJ = d.j();
        d dVar10 = d.f5677e;
        TextStyle textStyleF2 = d.f();
        d dVar11 = d.f5677e;
        int iD7 = IdCaptureViewModel.z.d();
        int iD8 = IdCaptureViewModel.z.d();
        TextStyle textStyle4 = (TextStyle) d.e(IdCaptureViewModel.z.d(), -1741876537, IdCaptureViewModel.z.d(), new Object[0], iD8, 1741876537, iD7);
        d dVar12 = d.f5677e;
        f5645c = new androidx.compose.material3.Typography(null, null, null, textStyleD, textStyleC, textStyle, textStyleC2, textStyle2, textStyleE, textStyleF, textStyle3, textStyleJ, textStyleF2, textStyle4, d.j(), 7, null);
        b bVar = b.f5657e;
        long jLongValue = ((Long) b.c(CompareOcrException.e(), new Object[0], CompareOcrException.e(), CompareOcrException.e(), 547854677, CompareOcrException.e(), -547854676)).longValue();
        b bVar2 = b.f5657e;
        long jLongValue2 = ((Long) b.c(CompareOcrException.e(), new Object[0], CompareOcrException.e(), CompareOcrException.e(), 547854677, CompareOcrException.e(), -547854676)).longValue();
        b bVar3 = b.f5657e;
        long jLongValue3 = ((Long) b.c(CompareOcrException.e(), new Object[0], CompareOcrException.e(), CompareOcrException.e(), 547854677, CompareOcrException.e(), -547854676)).longValue();
        b bVar4 = b.f5657e;
        long jC = b.c();
        b bVar5 = b.f5657e;
        f5644b = ColorSchemeKt.m1953lightColorSchemeCXl9yA$default(jLongValue, 0L, 0L, 0L, 0L, jLongValue2, 0L, 0L, 0L, jLongValue3, 0L, 0L, 0L, 0L, 0L, 0L, ((Long) b.c(CompareOcrException.e(), new Object[0], CompareOcrException.e(), CompareOcrException.e(), 547854677, CompareOcrException.e(), -547854676)).longValue(), jC, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -197154, 15, null);
        int i2 = f5649j + 47;
        f5648h = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        private static int f5650b = 0;

        /* JADX INFO: renamed from: c */
        private static int f5651c = 1;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ View f5652e;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f5650b + 15;
            f5651c = i3 % 128;
            int i4 = i3 % 2;
            b();
            Unit unit = Unit.INSTANCE;
            int i5 = f5650b + 97;
            f5651c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 38 / 0;
            }
            return unit;
        }

        private void b() {
            WindowInsetsControllerCompat insetsController;
            boolean z2;
            int i2 = 2 % 2;
            int i3 = f5651c + 93;
            f5650b = i3 % 128;
            if (i3 % 2 != 0) {
                Context context = this.f5652e.getContext();
                Intrinsics.checkNotNull(context, "");
                Window window = ((Activity) context).getWindow();
                window.setStatusBarColor(ColorKt.m4232toArgb8_81llA(g.c().m1928getPrimary0d7_KjU()));
                insetsController = WindowCompat.getInsetsController(window, this.f5652e);
                z2 = true;
            } else {
                Context context2 = this.f5652e.getContext();
                Intrinsics.checkNotNull(context2, "");
                Window window2 = ((Activity) context2).getWindow();
                window2.setStatusBarColor(ColorKt.m4232toArgb8_81llA(g.c().m1928getPrimary0d7_KjU()));
                insetsController = WindowCompat.getInsetsController(window2, this.f5652e);
                z2 = false;
            }
            insetsController.setAppearanceLightStatusBars(z2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.f5652e = view;
        }
    }

    public final void d(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1032107209);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 0) {
            i3 |= !composerStartRestartGroup.changed(this) ? 16 : 32;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                int i5 = f5643a + 101;
                f5646d = i5 % 128;
                if (i5 % 2 != 0) {
                    ComposerKt.traceEventStart(-1032107209, i3, -1, "com.incode.welcome_sdk.commons.theme.IncodeLegacyTheme.IncodeLegacyTheme (IncodeLegacyTheme.kt:144)");
                    throw null;
                }
                ComposerKt.traceEventStart(-1032107209, i3, -1, "com.incode.welcome_sdk.commons.theme.IncodeLegacyTheme.IncodeLegacyTheme (IncodeLegacyTheme.kt:144)");
            }
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            View view = (View) objConsume;
            composerStartRestartGroup.startReplaceableGroup(2016242201);
            if (!view.isInEditMode()) {
                EffectsKt.SideEffect(new a(view), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MaterialThemeKt.MaterialTheme(f5644b, null, f5645c, function2, composerStartRestartGroup, (i3 << 9) & 7168, 2);
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f5643a + 59;
                f5646d = i6 % 128;
                int i7 = i6 % 2;
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c(function2, i2));
        }
    }

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f5668c = 0;

        /* JADX INFO: renamed from: e */
        private static int f5669e = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Function2<Composer, Integer, Unit> f5670a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ int f5671b;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f5669e + 49;
            f5668c = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f5669e + 9;
            f5668c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f5668c + 83;
            f5669e = i3 % 128;
            int i4 = i3 % 2;
            g.this.d(this.f5670a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5671b | 1));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super Composer, ? super Integer, Unit> function2, int i2) {
            super(2);
            this.f5670a = function2;
            this.f5671b = i2;
        }
    }
}
