package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: TextInputService.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "\u0018Y\u0001ta\u0001\u0016k^V:\bD\u001aDbEZ\u0019<\u0019U\u001bV\u007fLwo`b3jm\fmP`pm:Jk")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLш|\u0004O\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkA0ZeP\u008cZS@\u000fsڔ<$q$yCIs\"}8\tWȞog\u0005Jb\u000bI\u0014\u000e\u0016\u000fj4կ]xs\u0012\u0017˰JoU3UoC:fZLӌP2P7B\u000b\u000f\u001aBH>wAg\u0014\u001a 2XphS=Q\u0013\u001d*\u0006l$G2%m\\;`l\f;uGKoPT?_^}\u0014!\u000f\u00195\u0013\u000faL,p;C\u001c=S1\u000f\u0003_M\fWqk\u000f\u0019=56a\u0006g>h\u0006$\u0017;O;k!3l\u0007a`:(Y[\u0014[^\u001d@\u0004\u000b}\u001d<2\u001e\u0016)X.[\u001b\u0015\u0014TW=xaQh\u0002\rCF\u001f*N%7\u00183Y:Kl_tS\u001bd6*\r=\"1\u0015\u0007!\n\\T\u0005]]b\ri1\u007fAmL\\ q=\u001c\f!f\u0010A\u001c0u\u0018_\u007f\u001fG/%eui3/\u0007\u001aTTi\u0007\u0005\u000f\u0005ckbHn#\u001d\"g.\u0017)rD\u0013\t\u001cTbvD\u0011{ \u001b\u001bś\u0007ʶ\u0601\\{D#+/|Nſm\nݕa\t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#h'3|\u00178ZK*kG-xqlI\u0016Q,[\b+EL$", "", "6hS2F6?b+z\b^\u0012|\u001d,o{5z", "", "<nc6Y@\u001f]\u0017\u000f\t^+i\t-t", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "Ag^DF6?b+z\b^\u0012|\u001d,o{5z", "AsP?g\u0010G^)\u000e", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "7lT\u001cc;B]\"\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7W!=QMDy\n", "=m41\\;\u001c]!\u0007vg+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "=m8:X\b<b\u001d\t\u0004I,\n\n9r\b(z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "As^=<5Ic(", "CoS.g,,b\u0015\u000ez", "=kS#T3NS", "<df#T3NS", "CoS.g,-S,\u000eaZ@\u0007\u0019>R\u007f6\fG\u0010", "BdgA90>Z\u0018ove<|", "=eU@X;&O$\n~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#g!8{\u0016=5?Fv8'\u0017>", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "BdgA90>Z\u0018m\u0005K6\u0007\u0018\u001er{1\nA\u000b$\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "7m]2e\u001b>f(_~^3{e9u\t'\n", "2dR<e(MW#\bWh?Y\u0013?n~6", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface PlatformTextInputService {
    void hideSoftwareKeyboard();

    default void notifyFocusedRect(Rect rect) {
    }

    void showSoftwareKeyboard();

    default void startInput() {
    }

    void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1<? super List<? extends EditCommand>, Unit> function1, Function1<? super ImeAction, Unit> function12);

    void stopInput();

    void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2);

    default void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1<? super Matrix, Unit> function1, Rect rect, Rect rect2) {
    }
}
