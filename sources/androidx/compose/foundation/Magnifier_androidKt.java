package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Magnifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d̉=!4i\bDZc|\u0004W\u00068\u000b4C\u0007\":\u001b\u007fјnjG6L͜P.`X2\u000fq{<$q$yّCU0}*\teNog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4Icxe\u0012\u00153JoU3UoC>htL\u0005(2(9\u0012\u0015\u000f\u001eBH>{+IQ\f 6XphYSL\u001d, \u000eV /#\u0005g|?xpkDG#1r\t÷?۔/\u000bX%F\u000335v\u0010*[UEB-6c\u0005\u0017R\nN\u0013A\u0002=3iU5ȅMs]F\t\u0019\u001a\u00159`%p\u0003(l\u0005\u007fo\u001c);O\u0012Lf\rV\u0006ߡ\u007f\rB\u0014>\u001a-H<?2t\u0018\u0010Ct!fPR\u0012^p\u0014\u0011`d%U\u00069+G0~Q\u0010DIT={\u0013#6#/\u0002QaZ\u000en,3T&iaWF=Vg\"Yk\u00064vh\u00028\u001eHG.4ʾ\u0010фϲ)9aT1=\u0004ɢGRr\u000f\u0005\u000ft{i\u0001Tp7|#O;\u0019\u000ejD\u0013\u0014{RdXZ\u0012{*Τ\u000b}\u000e#Pu}</6(a_jyj{l\u001a'?feZ\u0005j<eߍb3;a\u0014$gR\u0005&WJr\u0007hfpf\u001c\\l(PF^i>\u0006,JT\f!GWqJ=\\7\u001f\\#e\u001b\u001epF-\u000feZv&\u0017Ta73o*t\u0017\u0018h\\\u001f\b\u0018~O,\u000by:-oie\u001f,U0\u0007L|Q\f/{\u0006Guk_N\u0003\u0015$uB\u008dۿ\u0019ߙֺ3?\u00190\rKR ;զd~uY]\u00187|\ry=<\u0017.\u0016\u0007AѲ.߯nPWܷ/$|`\u0001&Ϋd\u0005\u0002dLۋc\u0012Sߕ_a"}, d2 = {"\u001b`V;\\-BS&i\u0005l0\f\r9nc1hJ\u000b&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMlc@$", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u001aT.GW\u001a\u0003zk\u0017\u0007\u00173t\u00042\u0005$\n\u0004!Q~", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\u000e7u\u00127\\G9y\u001f+\u001fsaF\u0016w\u0012N\u000b|", "7r?9T;?]&\u0007bZ.\u0006\r0i\u007f5iP\f\"!T~\u000e;", "", "AcZ#X9LW#\b", "", "3pd._:\"\\\u0017\u0006\u000b]0\u0006\u000b\u0018ah", "", "=sW2e", ";`V;\\-BS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "And?V,\u001cS\"\u000ezk", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ";`V;\\-BS&\\zg;|\u0016", "=mB6m,\u001cV\u0015\b|^+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "", "Hn^:", "Ahi2", "1na;X9+O\u0018\u0003\u000bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "3kTCT;B]\"", "1kX=", ";`V;\\-BS&Fji\u0015i{|w", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\tix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0013O{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013G)qW3Z\\+.\u0015\u000471HqZY\u000fm_D\u007f1-KE\b\u0016{@~*x.\b47\f", "CrT!X?M2\u0019\u007fvn3\f", "1kX=c0GUx\bv[3|\b", ">kPAY6K[\u0001z|g0}\r/r`$yO\u000b$+", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015uB5\u0005r6[\u000b|", ";`V;\\-BS&F\u007fI\u001ccZzQ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\tix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0013O{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013G)qg7ZH\\.\u0015\u000471HqZY\u000fm_D\u007f1-KEx\u001cBas'\u00041\u000e=s!k\u0001Zh\"Kf`\u0011.eE(*6Is;Ir\u007fyRc,\u0006]\u0011\ro?5\u0018x/aR\u0017\u0012g%[~qcJ\u001f\\\u0005BJs\u00154\u001c", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Magnifier_androidKt {
    private static final SemanticsPropertyKey<Function0<Offset>> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    public static final boolean isPlatformMagnifierSupported(int i2) {
        return i2 >= 28;
    }

    public static final SemanticsPropertyKey<Function0<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    /* JADX INFO: renamed from: magnifier-UpNRX3w$default */
    public static /* synthetic */ Modifier m641magnifierUpNRX3w$default(Modifier modifier, Function1 function1, Function1 function12, Function1 function13, float f2, long j2, float f3, float f4, boolean z2, int i2, Object obj) {
        boolean z3 = z2;
        Function1 function14 = function12;
        float fM6658getUnspecifiedD9Ej5fM = f4;
        float fM6658getUnspecifiedD9Ej5fM2 = f3;
        long jM6745getUnspecifiedMYxV2XQ = j2;
        float f5 = f2;
        if ((i2 + 2) - (i2 | 2) != 0) {
            function14 = null;
        }
        Function1 function15 = (i2 & 4) == 0 ? function13 : null;
        if ((i2 + 8) - (i2 | 8) != 0) {
            f5 = Float.NaN;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            jM6745getUnspecifiedMYxV2XQ = DpSize.Companion.m6745getUnspecifiedMYxV2XQ();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            fM6658getUnspecifiedD9Ej5fM2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            fM6658getUnspecifiedD9Ej5fM = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            z3 = true;
        }
        return m640magnifierUpNRX3w(modifier, function1, function14, function15, f5, jM6745getUnspecifiedMYxV2XQ, fM6658getUnspecifiedD9Ej5fM2, fM6658getUnspecifiedD9Ej5fM, z3);
    }

    /* JADX INFO: renamed from: magnifier-UpNRX3w */
    public static final Modifier m640magnifierUpNRX3w(Modifier modifier, Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, Function1<? super DpSize, Unit> function13, float f2, long j2, float f3, float f4, boolean z2) {
        return m643magnifierjPUL71Q$default(modifier, function1, function12, function13, f2, false, j2, f3, f4, z2, null, 512, null);
    }

    /* JADX INFO: renamed from: magnifier-jPUL71Q$default */
    public static /* synthetic */ Modifier m643magnifierjPUL71Q$default(Modifier modifier, Function1 function1, Function1 function12, Function1 function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory, int i2, Object obj) {
        boolean z4 = z3;
        float fM6658getUnspecifiedD9Ej5fM = f4;
        float fM6658getUnspecifiedD9Ej5fM2 = f3;
        long jM6745getUnspecifiedMYxV2XQ = j2;
        boolean z5 = z2;
        Function1 function14 = function13;
        float f5 = f2;
        Function1 function15 = function12;
        if ((i2 + 2) - (i2 | 2) != 0) {
            function15 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function14 = null;
        }
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        if ((i2 & 16) != 0) {
            z5 = false;
        }
        if ((i2 & 32) != 0) {
            jM6745getUnspecifiedMYxV2XQ = DpSize.Companion.m6745getUnspecifiedMYxV2XQ();
        }
        if ((i2 & 64) != 0) {
            fM6658getUnspecifiedD9Ej5fM2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((i2 + 128) - (i2 | 128) != 0) {
            fM6658getUnspecifiedD9Ej5fM = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 256) != 0) {
            z4 = true;
        }
        return m642magnifierjPUL71Q(modifier, function1, function15, function14, f5, z5, jM6745getUnspecifiedMYxV2XQ, fM6658getUnspecifiedD9Ej5fM2, fM6658getUnspecifiedD9Ej5fM, z4, (i2 & 512) == 0 ? platformMagnifierFactory : null);
    }

    /* JADX INFO: renamed from: magnifier-jPUL71Q */
    public static final Modifier m642magnifierjPUL71Q(Modifier modifier, Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, Function1<? super DpSize, Unit> function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory) {
        PlatformMagnifierFactory forCurrentPlatform = platformMagnifierFactory;
        if (!isPlatformMagnifierSupported$default(0, 1, null)) {
            return modifier;
        }
        if (forCurrentPlatform == null) {
            forCurrentPlatform = PlatformMagnifierFactory.Companion.getForCurrentPlatform();
        }
        return modifier.then(new MagnifierElement(function1, function12, function13, f2, z2, j2, f3, f4, z3, forCurrentPlatform, null));
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i2);
    }

    public static final boolean equalsIncludingNaN(float f2, float f3) {
        return (Float.isNaN(f2) && Float.isNaN(f3)) || f2 == f3;
    }
}
