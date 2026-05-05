package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.ui.text.input.EditCommand;
import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: InputEventCallback2.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012}\u0007njGNLe^.ZS0\u000fs{J$c$wECU0}*\tUNog|Sb\u000bI\u0013\ft\u000f̓\\I\u0004w& \u001d2Zom4}sK;xtd\bfVjL\b\t\u0019\u001aXI@\u0001\tHc\u0012\"2PphY;SK>Z\u001eL(\u0019\u001e\u000bh~:Vuu:]-I\u000eƢMϋۢ4~S\u0018T`o\u001b\u0005n6+n8e\u00193a\u001b\u0007\u0001j\u0006'\b(K\u0015\u0001'U,yweGp\u007fB'[S\u001bp\u000b&\u000b\u0017\u0002d\u001a;CO\u0012]\u0001\u00126\r\u0013{;N4\u0012\u0014=`.[,\u0017\f\u001cJ\rr\u0002R\u0017&\u0081A~аaA\u001f(\u0006ĳGg\u001anSgZGM҂\u007f\u001dڽ\"\""}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PG5Y\u00076']N5k0nD\u001b\u000fV\fTwb", "", "=m2<a5>Q(\u0003\u0005g\n\u0004\u0013=e~", "", "7m_Bg\nH\\\"~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PP,L\u00014FPW.@[}M#od\u0017W+\u000b\u0014]K-D", "=m41\\;\u001c]!\u0007vg+\u000b", "3cXA66F[\u0015\byl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "=m8:X\b<b\u001d\t\u0004", "7lT\u000eV;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "=m8:X\b<b\u001d\t\u0004&\u0012\u0004t8J]z", "uH\u0018#", "=m:2l\fOS\"\u000e", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "=mA2d<>a(\\\u000bk:\u0007\u0016\u000bn}+\u0006Md \u0018Q", "7l\\2W0:b\u0019", "", ";n]6g6K", "7mR9h+>7\"\rzk;\u0001\u00138M{5\u0002@\u000e", "7mR9h+>1\u001cz\bZ*\f\t<B\n8\u0005?\u000f", "7mR9h+>3\u0018\u0003\nh9Y\u0013?n~6", "7mR9h+>:\u001d\bz;6\r\u0012.s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface InputEventCallback2 {
    void onConnectionClosed(RecordingInputConnection recordingInputConnection);

    void onEditCommands(List<? extends EditCommand> list);

    /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
    void mo1511onImeActionKlQnJC8(int i2);

    void onKeyEvent(KeyEvent keyEvent);

    void onRequestCursorAnchorInfo(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);
}
