package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: ComposableLambda.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!,o\bDJc|\u0004Oي8\u000b4D\u0007\"B\u0012\u007fјnjO0LeN.ZS8\u0018s{:)c$\bCCU }:\u001f]Q\u007fg\u001dI\u000b\u000fQ\u0013\u001e\u0016'i\\Mc}u\u0012=1\tģWY[uU9\u000f{f\t.::8(\u000e1\u001e8R(v)B{\u0010 ;Xph^=Q\u0013'*\u0006l\"G#t\u0006\\D`l\fA_'\u0011sZNU^`\u0001[\u0018^TU\u0019'e,8X7c\u0017kX\u001b\u0015`jW\u0003mpm\tv,?+wr\u001e̬p#\"%CO;d#*j\u000fi`:&[SqVh\u000eV\u0004+\u007f\u001bI\u001c\u000e4)\u000f3ǉ\u001ef\u0016\u001fK\u0003\u0001eXP0]r\u0004\tfN\u0017S~yٿQ/tdy;GZ_}\u001b\fL71r/pl\u000e\u000f)aƘ\u0018]?҅X=vM`Բ\u0010ъ\bpj̣J\u0010>G\u0018/*\u0010\u0005ϐwھ_9+ܩ\f\u000eVE\u007fv3b?\u05c8kʐL@*Âޔ;@"}, d2 = {"\u0010HC R\u0017\u001e@\u0013laH\u001b", "", "!K>!F&)3\u0006x^G\u001b", ":`\\/W($S-", "", "0hc@96KA \t\n", "0hc@", "Ak^A", "1n\\=b::P ~aZ4y\b+", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u0012E\u0006%Bby'\u0001K 6XMIg1%\u0015O]A\u0004b($", "1n\\=b:>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "9dh", "BqP0^,=", "", "0k^0^", "1n\\=b::P ~aZ4y\b+I\t6\u000b<\n\u0015\u0017", "2hU3X9>\\([~m:", "@d\\2`)>`v\t\u0003i6\u000b\u0005,l\u007f\u000fwH}\u0016\u0013", "uHI\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016g\u0013 F|\u0018@u8~W\b(Bw$.\u0017PKtC\"\u001dh+\u0017\u0011k7X\u0005'T\"2oCN{<!\u001c^\rat\u000b\u000faL.|D\u0001,\u00185X\u0006ChJ\u0010\u001f\u001d5wy>]Y%\u0004\u001d\u0001K7dC`_`CIBa&:", "A`\\250Ma", "@d_9T*:P ~lb;\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u0011", "=sW2e", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposableLambdaKt {
    private static final int BITS_PER_SLOT = 3;
    public static final int SLOTS_PER_INT = 10;
    private static final Object lambdaKey = new Object();

    public static final int bitsForSlot(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final int sameBits(int i2) {
        return bitsForSlot(1, i2);
    }

    public static final int differentBits(int i2) {
        return bitsForSlot(2, i2);
    }

    public static final boolean replacableWith(RecomposeScope recomposeScope, RecomposeScope recomposeScope2) {
        if (recomposeScope != null) {
            if ((recomposeScope instanceof RecomposeScopeImpl) && (recomposeScope2 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
                if (!recomposeScopeImpl.getValid() || Intrinsics.areEqual(recomposeScope, recomposeScope2) || Intrinsics.areEqual(recomposeScopeImpl.getAnchor(), ((RecomposeScopeImpl) recomposeScope2).getAnchor())) {
                }
            }
            return false;
        }
        return true;
    }

    @ComposeCompilerApi
    public static final ComposableLambda composableLambdaInstance(int i2, boolean z2, Object obj) {
        return new ComposableLambdaImpl(i2, z2, obj);
    }

    @ComposeCompilerApi
    public static final ComposableLambda rememberComposableLambda(int i2, boolean z2, Object obj, Composer composer, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -1573003438, "C(rememberComposableLambda)P(1,2)*628@13280L54:ComposableLambda.kt#9drcc");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1573003438, i3, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1920923313, "CC(remember):ComposableLambda.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new ComposableLambdaImpl(i2, z2, obj);
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        composableLambdaImpl.update(obj);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return composableLambdaImpl;
    }

    @ComposeCompilerApi
    public static final ComposableLambda composableLambda(Composer composer, int i2, boolean z2, Object obj) {
        ComposableLambdaImpl composableLambdaImpl;
        composer.startMovableGroup(Integer.rotateLeft(i2, 1), lambdaKey);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            composableLambdaImpl = new ComposableLambdaImpl(i2, z2, obj);
            composer.updateRememberedValue(composableLambdaImpl);
        } else {
            Intrinsics.checkNotNull(objRememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) objRememberedValue;
            composableLambdaImpl.update(obj);
        }
        composer.endMovableGroup();
        return composableLambdaImpl;
    }
}
