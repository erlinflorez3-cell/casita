package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d̉=!4i\bDJc|\u0004W\u00068\u000bDB\u0007\"2\u0015\u007f\u0007tsA0JfP.hS2şs{J$c$wCCU0}*\tUNog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4I[yu>\u001d>Zom@}sKGxtd\u0014P8(8\b\u0015\u0019\u001aXQ@|\u0001CY\u001d*0n\u0003\u0001WԁLĨܨ\u0016\bD3\u000f2t\u0016\\B`l\fG_)\tiP^?_^\u0006}\u0013LT5\u001e\u000faL=p=;\u00153a\u001b\u0007\u0001p\u0006\bՃpܵݾl)-AW\u000bodf\u0018,\u0015Yh=cx&j\u0015i`:0[UiK^\u001f@w)\u000e=B\n\u000e\u00145`.[/-\u0007ս2οɤWBV\u001cl] \u0007oا/%.2\u0002ݐ\u001dƻUaCϊnC\n\u0005%\u001eQ\u007fEĒ]ڍ\u0012`\u001dÑt\u001a_2iHML^\fo<\u001c\u0007\u001fd8oZΊIĬ3\b\u0019ф''=_G(9m\bNRn\u0017%npkobJP\"\u001d\u001fe,?Q1խfʰo\\\\А<\u0013S&b\f\u0016\n\u0019+j~˖!*\u0018QUŸ\u0006\u0019Lϓ\u000eA"}, d2 = {"\u0012dU.h3M0#\u000f\u0004],{u3p\u000b/{", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c)@d\u0005  w\u0015..?9z>+)>", "\u0012dU.h3MC\"{\u0005n5{\t.R\u00043\u0007G\u0001", "\u001anR._\u0019B^$\u0006z<6\u0006\n3g\u00105wO\u0005! ", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169Xy\u001d>ms8UNEy8-\u0019rj \u0011a(UL", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c)@d\u0005 \u0015w\u001f/QEKx0-\u0019rj\u000f", "5dc\u0019b*:Z\u0006\u0003\u0006i3|f9n\u0001,}P\u000e\u0013&Ky\u0017zr.>c\r\u001cFq 7[", "u(E", "5dc\u0019b*:Z\u0006\u0003\u0006i3|f9n\u0001,}P\u000e\u0013&Ky\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a2?j\u0002\u001f3j\u001d.+MCv>,\u0019weC\u0010J6Lr.\u001d", "\u001anR._\u001cLSyz\u0002e)x\u00075R\u00043\u0007G\u0001z\u001fRv\u000eDv.DU\r$Av", "", "5dc\u0019b*:Z\t\rz?(\u0004\u0010,a}.hD\f\"\u001eGS\u0016G}%=Y\u0007/3|\u001a8V\u00027t=($dp=\u0011l:", "5dc\u0019b*:Z\t\rz?(\u0004\u0010,a}.hD\f\"\u001eGS\u0016G}%=Y\u0007/3|\u001a8V", "@h_=_,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\t>X\u0002\u001e3|\u001a8V,Ej4~\u0011fpC\u0014w\u0002", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DX#8LS9kAs", "0nd;W,=", "@`S6h:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "@h_=_,\u0006e{Ow/\r`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7\b'Az\u0001;WBKi4+j]B|m_5M\u00041KKauZ\\zH\u001e ZWO5\u001d\u000eX=3rN@hk5H\u00069d\u0010\u0010 \u0017\u001etoB7\fE\t\u001f\u0003U~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "@h_=_,\u00066ek`a7\u000b", "uY5\u0017\u001c\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`\u0018Q\u007f\u0017;r49c\u0007i\u001bv\u00152K?Jo>'}r`9g_*]\u00014[\"", "@h_=_,(`yz\u0002e)x\u00075I\b3\u0003@\t\u0017 Vk\u001d@\u0001.", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\t>X\u0002\u001e3|\u001a8V\u0019", "@h_=_,(`yz\u0002e)x\u00075I\b3\u0003@\t\u0017 Vk\u001d@\u0001.|-a\u0015\n_\u00168", "uY5\u0017?(GR&\t~]?F\u00079m\u000b2\n@J$'P~\u0012Dvn\u0013c\u0006+A{\u0016;#'\u001f/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001csG$\u001bY\n]/\u0017\u000e#%-mH5\u001b\u00170S\u000b\u0011", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RippleKt {
    private static final ProvidableCompositionLocal<Boolean> LocalUseFallbackRippleImplementation = CompositionLocalKt.staticCompositionLocalOf(new Function0<Boolean>() { // from class: androidx.compose.material3.RippleKt$LocalUseFallbackRippleImplementation$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return false;
        }
    });
    private static final ProvidableCompositionLocal<RippleConfiguration> LocalRippleConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new Function0<RippleConfiguration>() { // from class: androidx.compose.material3.RippleKt$LocalRippleConfiguration$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final RippleConfiguration invoke() {
            return new RippleConfiguration(0L, null, 3, null);
        }
    }, 1, null);
    private static final RippleNodeFactory DefaultBoundedRipple = new RippleNodeFactory(true, Dp.Companion.m6658getUnspecifiedD9Ej5fM(), Color.Companion.m4214getUnspecified0d7_KjU(), (DefaultConstructorMarker) null);
    private static final RippleNodeFactory DefaultUnboundedRipple = new RippleNodeFactory(false, Dp.Companion.m6658getUnspecifiedD9Ej5fM(), Color.Companion.m4214getUnspecified0d7_KjU(), (DefaultConstructorMarker) null);

    public static /* synthetic */ void getLocalRippleConfiguration$annotations() {
    }

    public static /* synthetic */ void getLocalUseFallbackRippleImplementation$annotations() {
    }

    /* JADX INFO: renamed from: ripple-H2RKhps$default */
    public static /* synthetic */ IndicationNodeFactory m2422rippleH2RKhps$default(boolean z2, float f2, long j2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            z2 = true;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            f2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            j2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        return m2421rippleH2RKhps(z2, f2, j2);
    }

    /* JADX INFO: renamed from: ripple-H2RKhps */
    public static final IndicationNodeFactory m2421rippleH2RKhps(boolean z2, float f2, long j2) {
        if (Dp.m6643equalsimpl0(f2, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) && Color.m4179equalsimpl0(j2, Color.Companion.m4214getUnspecified0d7_KjU())) {
            return z2 ? DefaultBoundedRipple : DefaultUnboundedRipple;
        }
        return new RippleNodeFactory(z2, f2, j2, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: ripple-wH6b6FI$default */
    public static /* synthetic */ IndicationNodeFactory m2424ripplewH6b6FI$default(ColorProducer colorProducer, boolean z2, float f2, int i2, Object obj) {
        if ((2 & i2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            f2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        return m2423ripplewH6b6FI(colorProducer, z2, f2);
    }

    /* JADX INFO: renamed from: ripple-wH6b6FI */
    public static final IndicationNodeFactory m2423ripplewH6b6FI(ColorProducer colorProducer, boolean z2, float f2) {
        return new RippleNodeFactory(z2, f2, colorProducer, (DefaultConstructorMarker) null);
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalUseFallbackRippleImplementation() {
        return LocalUseFallbackRippleImplementation;
    }

    public static final ProvidableCompositionLocal<RippleConfiguration> getLocalRippleConfiguration() {
        return LocalRippleConfiguration;
    }

    /* JADX INFO: renamed from: rippleOrFallbackImplementation-9IZ8Weo */
    public static final Indication m2425rippleOrFallbackImplementation9IZ8Weo(boolean z2, float f2, long j2, Composer composer, int i2, int i3) {
        IndicationNodeFactory indicationNodeFactoryM2421rippleH2RKhps;
        ComposerKt.sourceInformationMarkerStart(composer, -1315814667, "C(rippleOrFallbackImplementation)P(!1,2:c#ui.unit.Dp,1:c#ui.graphics.Color):Ripple.kt#uh7d8r");
        if ((i3 + 1) - (1 | i3) != 0) {
            z2 = true;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            f2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            j2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1315814667, i2, -1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)");
        }
        composer.startReplaceGroup(-1280632857);
        ComposerKt.sourceInformation(composer, "231@10696L7,232@10748L38");
        ProvidableCompositionLocal<Boolean> providableCompositionLocal = LocalUseFallbackRippleImplementation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (((Boolean) objConsume).booleanValue()) {
            indicationNodeFactoryM2421rippleH2RKhps = androidx.compose.material.ripple.RippleKt.m1763rememberRipple9IZ8Weo(z2, f2, j2, composer, (-1) - (((-1) - i2) | ((-1) - PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION)), 0);
        } else {
            indicationNodeFactoryM2421rippleH2RKhps = m2421rippleH2RKhps(z2, f2, j2);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return indicationNodeFactoryM2421rippleH2RKhps;
    }
}
