package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
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
/* JADX INFO: compiled from: TextInputSession.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":\u001b\u007fјnjO0L͜P.`S2şs{J$c$wDCU(\u0004*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0014\u00172XoG3coE9vt>\u0005&2*8\u0010\u0005\tɝ0'&͌+Cy\u000bZ>NtRR;R5\u001e \fV /%#\f\u0017NVtu:],3mPX?_^\b\u00141ѸS܋˼zc$7ND}#3a\u001b\u0007\u0001jo\u0007M\u0002U\u0005\u00178mO\u0012\feHp\u007fB\u001a[S\u001bm\u000b&\u000b\u0018\u0002f\u001a;CQyJ~#n\u001cC\n\u001bR\u001c\u000e40x2;1~\b<B;\u0017\u001c_^\u001avB.\u0004\u0012K%>\u0018D;;+f\u007f|K\u001b^7*\u000e;8ţ\u0005n'w\u001b2)#)q\u0010Q_ZpAVl\"Yk\rJ\u00153\u00128\u0004HG.0R¤0ϲ);s;)#y\u0005ӿCfϻ\u0005kpVoʏdn!v\u0018=I7\u000bʗH\u0005ˎoO"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000bPW^;JR\u0001K\u0018\u001ccc", "", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "5dc!X?M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ5#\u001e(wB=\u0007j+,y#T:N8lR{;\u0014g", "=m2<`4Bbv\t\u0004m,\u0006\u0018", "", "BqP;f->`\u0015{\u0002^\n\u0007\u0012>e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_\u001dZ?Dy5\u001e\"d^@\u0007A6W\u0006'P[$", "=m8:X\b<b\u001d\t\u0004", "", "7lT\u000eV;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "=m8:X\b<b\u001d\t\u0004&\u0012\u0004t8J]z", "uH\u0018#", ">da3b9F6\u0015\byp9\u0001\u00183n\u0002\n{N\u0010'$G", "", "5dbAh9>", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9p8\u007f$Gf\u0002/;v\u0018\u0010MQJ{A\u001ej", ">qTC\\,P6\u0015\byp9\u0001\u00183n\u0002\n{N\u0010'$G", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9xIv69Y\u0010\u001c4t\u0016\u0011IL:}A\"$lj;hc:]\u00074G\"", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "@d`BX:M1)\f\th9l\u0014.a\u000f(\n", "1ta@b9.^\u0018z\n^\u0014\u0007\b/", "@d`BX:M3\u0018\u0003\n", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PC+R\u0006+PN+<]SrJi", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "Ad]1>,R3*~\u0004m", "9dh\u0012i,Gb", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface TextInputSession {
    TextFieldCharSequence getText();

    boolean onCommitContent(TransferableContent transferableContent);

    /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
    void mo1474onImeActionKlQnJC8(int i2);

    int performHandwritingGesture(HandwritingGesture handwritingGesture);

    boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal);

    void requestCursorUpdates(int i2);

    void requestEdit(Function1<? super EditingBuffer, Unit> function1);

    void sendKeyEvent(KeyEvent keyEvent);
}
