package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: CommonRipple.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "\u0015K\fArw\u001a[\u0018IA:d\u001d1\u000ejQ fvq\u001cb\u0003K\\yRycou\\pGZavMG2<I ")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007|jA0ZeP.XS2\u000f\u0002{<řc$\bCC٥\"}8\tWNmhtIpŏs\u000f4\u00159\f<Mcxu\u0012=3RsM5eok<p~D\t882:\n\u0005/ XMǘzzQRTV>H\t:\u0001\u0016}\t(\u001c\u001e>N\fN`uNNH\u001b^j31\u0005\u0002B|*\u0010:\u000bQ%Ld)\u001dv\u0010$YEg?#1k\t\u0017Tk?1L BK}Ӡ&ǢʁwY<f\u000e#Ɔ+T\u0015`x͈x3Pԉ\u00107"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i\u0015w\u001e6WL(o?)\u001ch7", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0011", "0nd;W,=", "", "@`S6h:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "uY5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0013DU\r \rT\u001c8\\J?t}#&p+=\u0010r,[\u007f#N\u0016-,]N\u0003D#od\u0017\\:\u001a\u0015WP.{,3,\u000e,VW~Y", "@d\\2`)>`\t\nyZ;|\b\u001ci\u000b3\u0003@d %Vk\u0017:v", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u001ft3\"\u0013dp=\u0011l\u0010W\u00056CUL,2", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "@h_=_,\u001aZ$\u0002v", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017r?!\u0011>", "@d\\2`)>`\t\nyZ;|\b\u001ci\u000b3\u0003@d %Vk\u0017:vl\t(J-=R ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f\u0015Q\\[*\\(g\u001ez\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\u000fKq\u0010\u0010\u001e\u000e~X\u007f>e\u0010\u001d`\u0011~@6rJXrCEKMm4r\f)*lCI(\u001cqb\twL=\nQ:\r{Q\u0007qkF,D6.FxeTE9bL}6#S{Ao<`\u007f5\u0003-\u0011\n\u000eyK\u0001Tf%Hbw(uZK/1@J\u0013\tS_\u0005lK\u0012d&+\u0015\u0012m@8\u0019/RgS\u001a\u000e]zd4e]|FV\u0010G-x#6B\b@[O", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CommonRipple extends Ripple {
    public static final int $stable = 0;

    public /* synthetic */ CommonRipple(boolean z2, float f2, State state, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, f2, state);
    }

    private CommonRipple(boolean z2, float f2, State<Color> state) {
        super(z2, f2, state, null);
    }

    @Override // androidx.compose.material.ripple.Ripple
    /* JADX INFO: renamed from: rememberUpdatedRippleInstance-942rkJo, reason: not valid java name */
    public RippleIndicationInstance mo1752rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z2, float f2, State<Color> state, State<RippleAlpha> state2, Composer composer, int i2) {
        composer.startReplaceGroup(-1768051227);
        ComposerKt.sourceInformation(composer, "C(rememberUpdatedRippleInstance)P(2!1,3:c#ui.unit.Dp)60@2195L125:CommonRipple.kt#vhb33q");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1768051227, i2, -1, "androidx.compose.material.ripple.CommonRipple.rememberUpdatedRippleInstance (CommonRipple.kt:59)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1865672267, "CC(remember):CommonRipple.kt#9igjgp");
        boolean z3 = (((((-1) - (((-1) - i2) | ((-1) - 14))) ^ 6) > 4 && composer.changed(interactionSource)) || (6 & i2) == 4) | (((((-1) - (((-1) - 458752) | ((-1) - i2))) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(this)) || (i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072);
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new CommonRippleIndicationInstance(z2, f2, state, state2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        CommonRippleIndicationInstance commonRippleIndicationInstance = (CommonRippleIndicationInstance) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return commonRippleIndicationInstance;
    }
}
