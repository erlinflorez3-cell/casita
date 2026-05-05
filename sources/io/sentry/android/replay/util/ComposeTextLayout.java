package io.sentry.android.replay.util;

import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r+4\u0012}\u0007njG6LeN:ZS8\u0014s{:$aҕ\bّkUH|b\u001c_Rug\u0007J\t\fS\u0013\u0014\u0018\u0011jZLǤ|] \u0013zP}MKM\u001eCid\u0003E\u001d `(~\u000eM\u000f(:`\u0010%\u0001sO\u001a!H@\u001f@\u0019!\u0016\u0013(#\u001e>N\u0007N`u]NH\u001bc\u0001Ck\u0011wTf'\u000e6-Q\u001bUl';|(2sNEH-%\u0002\t7ViN\u001b? CK|o=9]\fWdm0\u0018#:g\r\fxV`\u0013gx\fU1\u0016w\u001cd\u001c-\u0010|\u0012\fj\nDZ}ε0ǉ\u001ej \u00109{\u0001[\u0011\\\u0010`Z\u007f)d\rА'ő7+Aӕ7co;1Ne|[ٽ ţ\u0005t)żl\u0010f\u001e)^Hc?\\X=vT@.\u0014о\u0006Ͳf\u0006B\u00066S\u000e<ɮ\u0015E"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001eKz,~7\b(Bw$.<CNz\u001b\u001a)rqH\\", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001eKz,~H}3FT\u0012BWSJA", ":`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "6`b\u0013\\3E;#}~_0|\u0016", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8D@y4A}%\u001bMQKrCs\n,R", "2n\\6a(Gb\b~\u000em\n\u0007\u00109r", "", "5dc\u0011b4B\\\u0015\b\nM,\u0010\u0018\ro\u00072\t", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "5dc\u0019T@Hc(=\t^5\f\u0016C_{1zM\u000b\u001b\u0016A|\u000eG}!IS\u000b >m\u0012<M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhd\u001cKw&=:CI{;-j", ":h]266N\\(", "5dc\u0019\\5>1#\u000f\u0004m", "u(8", "5dc\u0012_3B^'\u0003\t<6\r\u0012>", ":h]2", "5dc\u0019\\5>0#\u000e\nh4", "5dc\u0019\\5>A(z\bm", "5dc\u0019\\5>B#\n", "5dc\u0019\\5>D\u001d\r~[3|h8d", "5dc\u001de0FO&\u0013]h9\u0001\u001e9n\u000f$\u0003", "", "=eU@X;", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposeTextLayout implements TextLayout {
    private final boolean hasFillModifier;
    private final TextLayoutResult layout;

    public ComposeTextLayout(TextLayoutResult layout, boolean z2) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
        this.hasFillModifier = z2;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public Integer getDominantTextColor() {
        return null;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getEllipsisCount(int i2) {
        return this.layout.isLineEllipsized(i2) ? 1 : 0;
    }

    public final TextLayoutResult getLayout$sentry_android_replay_release() {
        return this.layout;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineBottom(int i2) {
        return MathKt.roundToInt(this.layout.getLineBottom(i2));
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineStart(int i2) {
        return this.layout.getLineStart(i2);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineTop(int i2) {
        return MathKt.roundToInt(this.layout.getLineTop(i2));
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineVisibleEnd(int i2) {
        return this.layout.getLineEnd(i2, true);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public float getPrimaryHorizontal(int i2, int i3) {
        float horizontalPosition = this.layout.getHorizontalPosition(i3, true);
        return (this.hasFillModifier || getLineCount() != 1) ? horizontalPosition : horizontalPosition - this.layout.getLineLeft(i2);
    }
}
