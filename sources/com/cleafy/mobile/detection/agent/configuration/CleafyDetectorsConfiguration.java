package com.cleafy.mobile.detection.agent.configuration;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLc\u0003\rI\u00066\u000b6B\r.4\u0012}\u0016njG0LeN>hݷZ\u000f\u001aztƃZ*ڎSA[\u001a\f#!O|gwtPZ\u0019E'\u0006Dxz2OU\u0007a*\u000f`E\u007fE9M}BQ`#6\u0015&8\"F\u007f\u001d\u0001H*X\u0016|zQR$\u0012^@\u0001@X\r[\r2\u00124>0\u0007$\\uWNH\u001b]J5)\u0003wLf'\u000e0\rS\u0013Fb2%v\u0010\u001e;F=5#1k\u00035RkE\t?\u007fJ\u001dhU';OyWDf\u0018\u0014C+_\u0013cr4k\u001dQ\u000f\f71UcY`&(&z\f\u0013B\u0004\u001c\u0017?H\\-բj\n\u0014E\u0003\u0006\u0014ēO\brR\u0006\u0001aD\u0018=\u007fa+I!lQo=1Ne{\u0015\u0013$#\u000fr9[\u0003\u0011p\u001b!T\u0006VIQn=XT\u0010YKs\u001cp\u0011\u0002:\n6G\u000e6\u0014\u0011\\\u00175=a91)\u0004\u0002vDw|\u000b`v\\\u0002Rv@2t\u001c78\u0013$Zrd\u0015qVTf7)MJT\u0017\u0004\u000e\u0013.i\u0010<O% TUhwxe]8%?l=Y|z&Wg^C;Wc\u001eqjvB?Lh\u000bXtSk\f\t\\͈&4N|\u001e\f<͵M\u0012!BEw\u001cBBI\u0019\u000b*X\u0007,YY|7_jl\u001e\u0017l3R\u0003y(\u0003\"\u0019P\u000bs\u007fk\u0007cD|\u000f\"=E_P1&\u0004\"x8\u000b?\u001f~\"\u007fWkZddlDue\u007f.429\u007f/M\u0017\u001d\u001eA20-UP\u0001\u0006iM@'\u000b\u0001\b0Sh\\g\u0018n~NxjxOd\u001b0\u001avrQ\bt\u0004\b\u0006^zucd\u000ficar1Y\u0084R:\u0003\u0017-Dݻ\u0005\u0017"}, d2 = {"\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBPA3Nr([+N;\\P\u0002G! 8\u0018W,\u0011\u0007iN }HA(]", "", "", "7r7Ag7\u001dS(~xm6\nh8a|/{?", "7r22e;\u001dS(~xm6\nh8a|/{?", "", "1daA7,MS\u0017\u000e\u0005k\f\u0006\b:o\u00041\u000b", "7r<<a0M]&~y:7\bh8a|/{?", "7r00g0OW(\u0013Y^;|\u0007>o\r\b\u0005<}\u001e\u0017F", "7r01i(GQ\u0019}]m;\bf/r\u000f\u0007{O\u0001\u0015&Q|mEr\"<Y|", "7rA<b;\u001dS(~xm6\nh8a|/{?", "7rC.f2\"\\\u001e~xm0\u0007\u0012\u000fn{%\u0003@\u007f", "7r<<V2%]\u0017z\nb6\u0006g/t\u007f&\u000bJ\u000ev Cl\u0015<u", "7r01i(GQ\u0019}bh*\u0003o9c{7\u007fJ\nu\u0017Vo\fK\u00012\u0015by\u001d>m\u0015", "7rE=a\u000b>b\u0019|\nh9\\\u0012+b\u0007(z", "7r>;6(EZw~\n^*\f\u0013<E\t$xG\u0001\u0016", "7r7B`(G2\u0019\u000ez\\;\u0007\u0016\u000fn{%\u0003@\u007f", "7r=3V\u000b>b\u0019|\nh9\\\u0012+b\u0007(z", "7r6=f\u000b>b\u0019|\nh9\\\u0012+b\u0007(z", "7r4Eg,GR\u0019}do,\n\u0010+y^(\u000b@~&!TO\u00178s,5X", "\nh]6g\u0005", "uYI\u0019](OOb\u0006vg.Fv>r\u00041}\u0016u\f\f<d\u00031k\u001a*Nr\u0015z^", "uYI\u0019](OOb\u0006vg.Fv>r\u00041}\u0016u\f\f<d\u00031k\u001a*Nrc(", "", "2t\\:l", ">Hb\u0015g;I2\u0019\u000ez\\;\u0007\u0016\u000fn{%\u0003@\u007f", ">Hb\u0010X9M2\u0019\u000ez\\;\u0007\u0016\u000fn{%\u0003@\u007f", ">BT?g\u000b>b\u0019|\nh9\\\u0012.p\n,\u0005O", ">Hb\u001ab5Bb#\fz]\b\b\u0014\u000fn{%\u0003@\u007f", ">Hb\u000eV;Bd\u001d\u000e\u000f=,\f\t-t\n5[I|\u0014\u001eGn", ">Hb\u000eW=:\\\u0017~yA;\f\u0014\re\r7Z@\u0010\u0017\u0015Vy\u001b\u001c\u007f!2`}\u001f", ">Hb\u001fb6M2\u0019\u000ez\\;\u0007\u0016\u000fn{%\u0003@\u007f", ">Hb!T:D7\"\u0004z\\;\u0001\u00138E\t$xG\u0001\u0016", ">Hb\u001ab*D:#|vm0\u0007\u0012\u000ee\u000f(yO\u000b$vPk\u000bCv$", ">Hb\u000eW=:\\\u0017~yF6z\u000f\u0016o}$\u000bD\u000b uG~\u000e:\u0006/B9\u0007\u001c4t\u0016-", ">Hb\u001ca\n:Z ]zm,z\u00189r_1w=\b\u0017\u0016", ">Hb\u0015h4:\\w~\n^*\f\u0013<E\t$xG\u0001\u0016", ">Hb\u001bY*\u001dS(~xm6\nh8a|/{?", ">Hb\u0014c:\u001dS(~xm6\nh8a|/{?", ">Hb\u0012k;>\\\u0018~yH=|\u00166a\u0014\u0007{O\u0001\u0015&Q|mEr\"<Y|", "uKZ<g3B\\bn\u0004b;R}$L\u0005$\r<J\u001e\u0013PqW*\u000629b\u007fu,b\u000b#B80`)\u0013\n]%*", "/fT;g&KS ~vl,"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CleafyDetectorsConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f2813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2815o;

    public CleafyDetectorsConfiguration() {
        this(false, false, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, false, 65535, (DefaultConstructorMarker) null);
    }

    public CleafyDetectorsConfiguration(Unit unit, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this(z2, z3, str, z4, z5, z6, z7, z8, z9, z10, false, z11, z12, z13, z14, z15);
    }

    public /* synthetic */ CleafyDetectorsConfiguration(Unit unit, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Unit.INSTANCE : unit, z2, z3, str, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15);
    }

    public CleafyDetectorsConfiguration(boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this(z2, z3, str, z4, z5, z6, z7, z8, z9, z10, false, z11, z12, z13, z14, z15);
    }

    public /* synthetic */ CleafyDetectorsConfiguration(boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 + 2) - (i2 | 2) != 0 ? false : z3, (i2 + 4) - (i2 | 4) != 0 ? "" : str, (i2 & 8) != 0 ? true : z4, (i2 & 16) != 0 ? false : z5, (-1) - (((-1) - i2) | ((-1) - 32)) != 0 ? false : z6, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? true : z7, (i2 & 128) != 0 ? false : z8, (i2 + 256) - (i2 | 256) != 0 ? true : z9, (i2 + 512) - (i2 | 512) != 0 ? false : z10, (i2 & 1024) != 0 ? true : z11, (i2 & 2048) != 0 ? false : z12, (i2 + 4096) - (i2 | 4096) != 0 ? true : z13, (i2 & 8192) != 0 ? false : z14, (i2 + 16384) - (i2 | 16384) == 0 ? z15 : true);
    }

    public CleafyDetectorsConfiguration(boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f2801a = z2;
        this.f2802b = z3;
        this.f2803c = str;
        this.f2804d = z4;
        this.f2805e = z5;
        this.f2806f = z6;
        this.f2807g = z7;
        this.f2808h = z8;
        this.f2809i = z9;
        this.f2810j = z10;
        this.f2811k = z12;
        this.f2812l = z13;
        this.f2813m = z14;
        this.f2814n = z15;
        this.f2815o = z16;
    }

    public /* synthetic */ CleafyDetectorsConfiguration(boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 + 2) - (i2 | 2) != 0 ? false : z3, (i2 + 4) - (i2 | 4) != 0 ? "" : str, (i2 & 8) != 0 ? true : z4, (i2 + 16) - (i2 | 16) != 0 ? false : z5, (i2 & 32) != 0 ? false : z6, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? true : z7, (i2 & 128) != 0 ? false : z8, (i2 + 256) - (i2 | 256) != 0 ? true : z9, (-1) - (((-1) - i2) | ((-1) - 512)) != 0 ? false : z10, (i2 & 1024) != 0 ? false : z11, (i2 + 2048) - (i2 | 2048) != 0 ? true : z12, (i2 & 4096) != 0 ? false : z13, (i2 & 8192) != 0 ? true : z14, (-1) - (((-1) - i2) | ((-1) - 16384)) != 0 ? false : z15, (i2 + 32768) - (i2 | 32768) != 0 ? true : z16);
    }
}
