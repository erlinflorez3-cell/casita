package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: NestedScrollInteropConnection.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!,n\bӵLc\u0003\nI\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nʑA0ZeP.XT2\u000fy\u000f<$a(yCQU\"}(\u000bg\\ul\u0007J\t\fs\u0013\u0014\u001c\u0011jZH\u001cތu'\u001d9Zom;}uC9n}N\u0005N<h=ѩ\t\u0001(5`0\u0005\u0007[K:\u0014`D~Gj\r{\u0013J\u0016\u0014M8\u0001L^.NʝGǍҺ>1)\u0013wSf1mB\u0015M;E|';u(\u001eCJEH-%\u0002\u0002/R\n@I?\nQ\u0013|?'YJ\u001cWdmF\u0014Ǽ*˽ոat,r\u0013hx\u00165CgcyO6(&yB\r\\\u0010\u001cͺ?H\\,pǔZԧ7tzԟ`f\u0010^Z\u007f)b^\u0017S\u0002ik\u0010ӘhЂe?1P=~\u0013\u0011̗#\u0006v$aڌ*\u000f\u0014úX\u0011"}, d2 = {"!ba<_3B\\\u001bZ\u000e^:k\f<e\u000e+\u0006G\u007f", "", "Aba<_3\u001af\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc V9HZ Z\u000e^:D\u000fv4\u0007\u0014F(", "uI\u0018\u0016", "1n\\=b:>B#o~^>f\n0s\u007f7", "=eU@X;", "@d\\2`)>`\u0002~\tm,{v-r\n/\u0003$\n&\u0017Ty\u0019\u001a\u0001.>Y{/;w\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "6nbAI0>e", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152?C\u000fn6\\v4\u001d02oCN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuM\u000bFx\u0010U\u001f\u000eCypAd\u000eT\u0004\u001c|\u000b\u0012hTh_x5?Rl1kii&e:83\u0018{\"p", "Bn>3Y:>b", "1n]@h4>R", "", "/uP6_(;Z\u0019", "Bn>3Y:>b`n\f17Gq\u000b", "uZ8\u0017\u001c\u0011", "1dX94>:gy\f\u0005f!|\u00169", "@de2e:>/,\u0003\t", "BnE6X>-g$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3Ud1WYL,2", "BnE6X>-g$~B@@\\\u0014<tR", "uH\u0018\u0016", "BnE6X>/S \txb;\u0011", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NestedScrollInteropConnectionKt {
    private static final float ScrollingAxesThreshold = 0.5f;

    private static final float reverseAxis(int i2) {
        return i2 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toViewVelocity(float f2) {
        return f2 * (-1.0f);
    }

    private static final float ceilAwayFromZero(float f2) {
        return (float) (f2 >= 0.0f ? Math.ceil(f2) : Math.floor(f2));
    }

    public static final int composeToViewOffset(float f2) {
        return ((int) ceilAwayFromZero(f2)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toOffset-Uv8p0NA, reason: not valid java name */
    public static final long m5901toOffsetUv8p0NA(int[] iArr, long j2) {
        float fCoerceAtLeast;
        float fCoerceAtLeast2;
        if (Offset.m3937getXimpl(j2) >= 0.0f) {
            fCoerceAtLeast = RangesKt.coerceAtMost(reverseAxis(iArr[0]), Offset.m3937getXimpl(j2));
        } else {
            fCoerceAtLeast = RangesKt.coerceAtLeast(reverseAxis(iArr[0]), Offset.m3937getXimpl(j2));
        }
        if (Offset.m3938getYimpl(j2) >= 0.0f) {
            fCoerceAtLeast2 = RangesKt.coerceAtMost(reverseAxis(iArr[1]), Offset.m3938getYimpl(j2));
        } else {
            fCoerceAtLeast2 = RangesKt.coerceAtLeast(reverseAxis(iArr[1]), Offset.m3938getYimpl(j2));
        }
        return OffsetKt.Offset(fCoerceAtLeast, fCoerceAtLeast2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toViewType-GyEprt8, reason: not valid java name */
    public static final int m5902toViewTypeGyEprt8(int i2) {
        return !NestedScrollSource.m5268equalsimpl0(i2, NestedScrollSource.Companion.m5280getUserInputWNlRxjI()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m5900getScrollAxesk4lQ0M(long j2) {
        int i2 = Math.abs(Offset.m3937getXimpl(j2)) >= 0.5f ? 1 : 0;
        return Math.abs(Offset.m3938getYimpl(j2)) >= 0.5f ? (i2 + 2) - (i2 & 2) : i2;
    }

    public static final NestedScrollConnection rememberNestedScrollInteropConnection(View view, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 1075877987, "C(rememberNestedScrollInteropConnection)234@8199L7,235@8235L66:NestedScrollInteropConnection.android.kt#itgzvw");
        if ((i3 & 1) != 0) {
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(composer);
            view = (View) objConsume;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1075877987, i2, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:235)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -5563766, "CC(remember):NestedScrollInteropConnection.android.kt#9igjgp");
        boolean zChanged = composer.changed(view);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new NestedScrollInteropConnection(view);
            composer.updateRememberedValue(objRememberedValue);
        }
        NestedScrollInteropConnection nestedScrollInteropConnection = (NestedScrollInteropConnection) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return nestedScrollInteropConnection;
    }
}
