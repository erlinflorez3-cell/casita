package io.sentry.android.replay.util;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r+4\u0012}\u0012njG6L͜P.`_2şqڕ::ӋTqq:\u00162\u000e(\u0017Ofi}mx[\u001bG\u001d\b.x\u0019/רTތٕ\u0016\u000f@F8VAV\b?O_#7Kۚ3ƫ7y܇\u007f\u0019ߋGƵͯ~CQ\u0016Z7N{RR;PK\u074c\u0013Nf.\r6\\\u0016ޮfPr]H/;\u0005\u007fA|(\u00106\u0003M\u001bHl';y(ԣ*ġ64\u05cf$مΫ\u000bRaLKP\u007fK\u001dhU*[O\u0002fNZ\u0016\u0013C*\u0016֬^;-j\u0015i`:8q֩b\u0014W\u001c:\u0010z* \u0003Ƞ\rVAV.E\u001c|\u0007<4иqԟŬO\u0001\u0081A\u007fѐe<\u001fӛ\u001851>)l\"pI\u001bf7*\bڟ\")\t͙9]Z\u0015n\u001dÔT\u0005Y1WWEKT̅ukl\fph!ø\bD"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001eKz,~H}3FI%=ZG8{C\u001e#>", "", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "6`b\u0013\\3E;#}~_0|\u0016", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7\b'Azk#4IEz;\"\u001e2fJ\u000f-0W\u0006'TUJ3&1r>\u0010\"a\u001d,5\u0016\u0013hN4lSA,o(V\b;uVO\u0007", "5dc\u0010b3H``jc+!^y9", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[*>w#\u0004", "5dc\u0015T:\u001fW \u0006bh+\u0001\n3e\r", "u(I", "1n\\=b5>\\(J", "1n\\=b5>\\(JBJ\u0015I}\u0011V\n", "1n\\=b5>\\(K", "1n_F", "1n_F -+E\t\u0010N`", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextAttributes {
    private final Color color;
    private final boolean hasFillModifier;

    private TextAttributes(Color color, boolean z2) {
        this.color = color;
        this.hasFillModifier = z2;
    }

    public /* synthetic */ TextAttributes(Color color, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(color, z2);
    }

    /* JADX INFO: renamed from: copy-fRWUv9g$default, reason: not valid java name */
    public static /* synthetic */ TextAttributes m8944copyfRWUv9g$default(TextAttributes textAttributes, Color color, boolean z2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            color = textAttributes.color;
        }
        if ((i2 & 2) != 0) {
            z2 = textAttributes.hasFillModifier;
        }
        return textAttributes.m8946copyfRWUv9g(color, z2);
    }

    /* JADX INFO: renamed from: component1-QN2ZGVo, reason: not valid java name */
    public final Color m8945component1QN2ZGVo() {
        return this.color;
    }

    public final boolean component2() {
        return this.hasFillModifier;
    }

    /* JADX INFO: renamed from: copy-fRWUv9g, reason: not valid java name */
    public final TextAttributes m8946copyfRWUv9g(Color color, boolean z2) {
        return new TextAttributes(color, z2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAttributes)) {
            return false;
        }
        TextAttributes textAttributes = (TextAttributes) obj;
        return Intrinsics.areEqual(this.color, textAttributes.color) && this.hasFillModifier == textAttributes.hasFillModifier;
    }

    /* JADX INFO: renamed from: getColor-QN2ZGVo, reason: not valid java name */
    public final Color m8947getColorQN2ZGVo() {
        return this.color;
    }

    public final boolean getHasFillModifier() {
        return this.hasFillModifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public int hashCode() {
        Color color = this.color;
        int iM4185hashCodeimpl = (color == null ? 0 : Color.m4185hashCodeimpl(color.m4188unboximpl())) * 31;
        boolean z2 = this.hasFillModifier;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        return iM4185hashCodeimpl + r02;
    }

    public String toString() {
        return "TextAttributes(color=" + this.color + ", hasFillModifier=" + this.hasFillModifier + ')';
    }
}
