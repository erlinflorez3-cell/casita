package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import kotlin.Deprecated;
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
/* JADX INFO: compiled from: InputMethodManager.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "\u0012T\bN1y-`k[;:d$kaq\\\u00196\u0017|Kf~K.vS{%i\u0002\fXGepQGV3G-\u0017hb\u0003%]\b\u001cU'G_K0(\u0004$\ns\u0010\u0002 /L/P\u0002;_;G|V)~]P;8@ftzV+r\u0001m5\u0003\u0004\u00135\u000f4T\u001a?\u0012&((Qvh\u0007\u00189Tz_k\u000b7+dG6o9iB&?\u000e\u0017ny~\u001dH\u0017Y#^6\u0003=<`\u0002}E!B:Jq]hc\"\u0011\u0007|qs\u001d:l\u001c")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r+4\u0012}\tnjO0LeN.ZS8\u0015sڔ<$q$yCAY ]8ޛ\u007fN\u0016f7Ph\u000b[\u000f4\u0017?\u000ftOczu\u0012=5\t\u0014\b9[sU9\u000fu|)h80=\u0012\u0005/\u001bplX\u0005\tIc\f@1ptHY%M3\"X*\u00076\u000f'tg|7xpkDG#1trR5kH|{\u001a\rxo3\u0005o6+n8e\u00193b\u001b\u0007\u0001fo\u0007M\u0002U\u0005\u00172W/W\u0005o6\u0007\u000bD\u00199a%]!1#)Ƣ_ϯʯ+SkMV-Vvߧ\u007f ʞ\b\r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a)B}%\u0016MR>u3\u0006\u0011q];\u0007p\u0002", "", "6hS2F6?b|\b\u0006n;", "", "7r00g0OS", "", "@dbAT9M7\"\n\u000bm", "Ag^DF6?b|\b\u0006n;", "CoS.g,\u001cc&\r\u0005k\b\u0006\u00072o\r\f\u0005A\u000b", "1ta@b9\u001a\\\u0017\u0002\u0005k\u0010\u0006\n9", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kL\u00043?fY)5p ;1L<u\n", "CoS.g,\u001ef(\fv\\;|\b\u001ee\u00137", "BnZ2a", "", "3wc?T*MS\u0018mzq;", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9mO\u000621W\r 6\\\u0016A\\\u0019", "CoS.g,,S ~xm0\u0007\u0012", "Ad[2V;B]\"l\nZ9\f", "Ad[2V;B]\"^\u0004]", "1n\\=b:Bb\u001d\t\u0004L;x\u0016>", "1n\\=b:Bb\u001d\t\u0004>5{", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface InputMethodManager {
    void hideSoftInput();

    boolean isActive();

    void restartInput();

    void showSoftInput();

    void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo);

    void updateExtractedText(int i2, ExtractedText extractedText);

    void updateSelection(int i2, int i3, int i4, int i5);
}
