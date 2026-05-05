package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000e6B\r(4\u0012}\bnjO0LeN/ZS@\u000fs{:%c$\bCCU \u007f:?]Ȟ\u007fg\u001dI\u000b\u0011I\u000f\u0014\u0016\u0011jZJ\u0006~c\u0012\u001d4Zom4}uC9nwN\u0005N3R>\u007f\u0005\u000f\u001eBH>wےBŷë\u00162FuHX%y\u0013܅*\u0006l\u001f1$bg\\6`l\fA_)\tiPP?_^\u0004}\u0013LT5\u0010\u000faL2p=;\u00153W\u001b\u0007\u0001bW\u0013MyU\u0005\u0017&O+wr\b:f\t,\u0015YN%g\u00010t\u0005\u007f_4'YZ*֟h\u001d6\u0004\u0013{;G,\u000e4&\u000f3ǉ\u001ef\u0016\u001bK\u0005\u0001_XP0ij\u007f)`f\u001b3\u000eK+g*~aoK1Nez-\rL\"1r/dl\u000e\u000f\u00143n\u0006bIQn<pN8Xmq\u0012\u0003z\u0002X\u0017ϻFĉ\u009e\u007f\u00134+3LsI17\u0004\u0002vC\u0010v3_\u0019Ww[`@Pmݮ7/\u0011\u000f`և\u00013jÕXo"}, d2 = {"%h]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", ":dUA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "Bn_", "@hV5g", "0ncAb4", "%h]1b>\"\\'~\nlsx\\\u001fjc7J", "uE5\u00139o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Hy\u001eEu!D]\b)\u0001t\u0012BWSJ5&\"\u001egkKjl:N\u00065\u001d", "", "/cS", "7mb2g:", "/r8;f,Ma", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "/r?.W+B\\\u001bove<|\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_ QL:uF\u0002\u001evaH\u00159\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001a\u0015bP(vD\u0001|\u00124T\fIh\u000eayQ\u001cfyAc\u001aKx(??3pQcmy\u0011BOr3c\bn!fC\u0004+\u0010\u0006#+w\u001a\u0019\u0006zR\u0015{TjcnW\u0019\t\u000e", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "3wR9h+>", "=m[F", "AhS2f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpGtg+N\u0005|", "=m[F )(=\u001c_\f`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_ QL:uF\u0002\u001evaH\u00159\u0010\u0012]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNZK4wC3.\f6RKBd\u0015\u0016&\u001d~\\tKU\u001aY]\u001e\u0004A8v\u001c", "CmX<a", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WindowInsetsKt {
    public static final WindowInsets union(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new UnionInsets(windowInsets, windowInsets2);
    }

    public static final WindowInsets exclude(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new ExcludeInsets(windowInsets, windowInsets2);
    }

    public static final WindowInsets add(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new AddedInsets(windowInsets, windowInsets2);
    }

    /* JADX INFO: renamed from: only-bOOhFvg */
    public static final WindowInsets m1089onlybOOhFvg(WindowInsets windowInsets, int i2) {
        return new LimitInsets(windowInsets, i2, null);
    }

    public static final PaddingValues asPaddingValues(WindowInsets windowInsets, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1485016250, "C(asPaddingValues)244@9228L7:WindowInsets.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485016250, i2, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:244)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        InsetsPaddingValues insetsPaddingValues = new InsetsPaddingValues(windowInsets, (Density) objConsume);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return insetsPaddingValues;
    }

    public static final PaddingValues asPaddingValues(WindowInsets windowInsets, Density density) {
        return new InsetsPaddingValues(windowInsets, density);
    }

    public static final WindowInsets asInsets(PaddingValues paddingValues) {
        return new PaddingValuesInsets(paddingValues);
    }

    public static /* synthetic */ WindowInsets WindowInsets$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 + 1) - (1 | i6) != 0) {
            i2 = 0;
        }
        if ((i6 + 2) - (2 | i6) != 0) {
            i3 = 0;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 4)) != 0) {
            i4 = 0;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 8)) != 0) {
            i5 = 0;
        }
        return WindowInsets(i2, i3, i4, i5);
    }

    public static final WindowInsets WindowInsets(int i2, int i3, int i4, int i5) {
        return new FixedIntInsets(i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: WindowInsets-a9UjIt4 */
    public static final WindowInsets m1087WindowInsetsa9UjIt4(float f2, float f3, float f4, float f5) {
        return new FixedDpInsets(f2, f3, f4, f5, null);
    }

    /* JADX INFO: renamed from: WindowInsets-a9UjIt4$default */
    public static /* synthetic */ WindowInsets m1088WindowInsetsa9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = Dp.m6638constructorimpl(0);
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            f4 = Dp.m6638constructorimpl(0);
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            f5 = Dp.m6638constructorimpl(0);
        }
        return m1087WindowInsetsa9UjIt4(f2, f3, f4, f5);
    }
}
