package com.appsflyer.internal;

import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјnjG9L͜P.`S2\u000fq{<$i%yCAg #8ޛmm\u0018g\u001dI\u0013\nbO\u000bȀ|l2Icy&9\u001d;Zom;}sK<xtd\u0007P60=\u0012\u0005/\u001eZN\u0016v\tJc\f@6\u0007\u0006ĐV\u000fS\u000e(\u001cN\f.\u00116\\\u0016VfLz`R/Q\u0005\u001aF\\,w0+Q=Jb3%v\u0010)[F=5#2k\u00035X\fE\t?\u007fK\u001dhU-[OyWDg\u0018\u0014C1\u007f\u0013cr4c\u001dQ\u000f\u0012m@յgMV\u001e6\tC\u0019\u001bN\u001c\u000e4/x2;\u001d~\b<5%vaEh\u0002\rFF\u000fˋ:\u0019+\u0012A>\u0002Btey;GVg\u007f\u0013\u00106#/pQ_b\u0013x\u0015IX(W7QND`N8_\u0004\u0003ձtd\b>\u0012:\u0010'=\u0011).E-g_G&9k0Jtk\u0005\nxh\u0002m\u0003NF\"|\u001dO*7\u0012!Y\u0081\tmVif6Yt*j\u001f}6\u001bP`\u0006?9%>P\u007flwoe]8)_l=Y|r&WgdyJɄg\u0012gh\u0005\u001e\bWp\u001dpfpW4\\r'P6xn\u001e\u000f\u0014D|\u000eY5Ɛu\u001e:D?2%.V\u001d6Bo\u00011_\tl@\u0003b6<\u0003\u0018&;\bɹT^v\nu\u0012\u001aD\u000b{:-oWk.|ŵdמ8\u0007+\t\u0005\u000f\u000ec\u007fNMiz4"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u000b\u0013\u0014?S", "", "\nh]6g\u0005", "u(E", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0010\bt\u0013\u0014?S", "B`V", "", ";rV", "", "Ag^B_++S!\t\n^\u000b|\u0006?g", "", ExifInterface.GPS_MEASUREMENT_2D, "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn>B##8cu\u001er\u0012?I\rBg= ^VpF\u000bl.$kj8", "", "Bga<j(;Z\u0019", ">qX;g\u0014LU", ">qX;g\u001bA`#\u0011v[3|", "Ag^B_++S$\t\bm\u001b\u0007hBM{1wB\u0001$", ExifInterface.GPS_MEASUREMENT_3D, "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn>B##8cu\u001er\u0012?I\rBg= ^VpF\u000bl.$],C]JucN{?]\u0001]\u001bX=\t\u0002`Ayc9,\u0014K\u001d", "4na0X", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn>B##8cu\u001er\u0012?I\rBg= ^VpF\u000bl.$:\u0018", "7", "D", ExifInterface.LONGITUDE_EAST, ">/", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`Cz\u0019Jw,IY\u000bi;v%.ZL7r}yuj-7tB\u0012$:\u000eLH_(&YnF\u0016[H\u001d[/\u0016\u0007/", "Ehc5G(@\u0012\u0007]`X7\n\u0013.R\u007f/{<\u000f\u0017", "Ag^B_+\u001ef(~\u0004]\u0014\u000b\u000b", "(", "5dc [6NZ\u0018^\u000em,\u0006\b\u0017s\u0002", "u(I", "\u0011n\\=T5B]\""}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AFh1ySDK {
    private final boolean shouldExtendMsg;
    public static final Companion Companion = new Companion(null);
    public static long AFAdRevenueData = System.currentTimeMillis();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005\"2ߡx\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,6\u007fFSUH\u007fX\r&Ȧi̊rNb\rI\u0012\u0014\u001a"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u000b\u0013\u0014?<}Au!*VGEt\n", "", "\nh]6g\u0005", "u(E", "", "\u000fE01E,OS\"\u000fz=(\f\u0005", "\u0018"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void d$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        aFh1ySDK.d(aFg1cSDK, str, z2);
    }

    public static /* synthetic */ void e$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
        boolean z6 = z4;
        boolean z7 = z3;
        boolean z8 = z2;
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            z8 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            z7 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            z6 = true;
        }
        aFh1ySDK.e(aFg1cSDK, str, th, z8, z7, z6, (-1) - (((-1) - i2) | ((-1) - 64)) == 0 ? z5 : true);
    }

    public static /* synthetic */ void i$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = true;
        }
        aFh1ySDK.i(aFg1cSDK, str, z2);
    }

    public static /* synthetic */ void v$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            z2 = true;
        }
        aFh1ySDK.v(aFg1cSDK, str, z2);
    }

    public static /* synthetic */ void w$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        aFh1ySDK.w(aFg1cSDK, str, z2);
    }

    public final void d(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFg1cSDK, str, false, 4, null);
    }

    public void d(AFg1cSDK aFg1cSDK, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, false, false, false, false, 120, null);
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z2, false, false, false, PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, null);
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z2, z3, false, false, 96, null);
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z2, z3, z4, false, 64, null);
    }

    public void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
    }

    public void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    protected final String getMediationNetwork(String str, AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            str = "null";
        }
        String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1cSDK);
        if (!getShouldExtendMsg()) {
            return strWithTag$SDK_prodRelease;
        }
        return "(" + (System.currentTimeMillis() - AFAdRevenueData) + ") [" + Thread.currentThread().getName() + "] " + strWithTag$SDK_prodRelease;
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public final void i(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFg1cSDK, str, false, 4, null);
    }

    public void i(AFg1cSDK aFg1cSDK, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final void v(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFg1cSDK, str, false, 4, null);
    }

    public void v(AFg1cSDK aFg1cSDK, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final void w(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFg1cSDK, str, false, 4, null);
    }

    public void w(AFg1cSDK aFg1cSDK, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final String withTag$SDK_prodRelease(String str, AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        return "[" + aFg1cSDK.getCurrencyIso4217Code + "] " + str;
    }
}
