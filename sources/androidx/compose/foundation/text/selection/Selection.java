package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: Selection.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007luA0RkP.XS2\u000fy\b<řc$\bCCU \u007f(ޝUdʴ\u0018nxYCB)F3\tn:Imx\f\u0013\u001f6PqW3{pM?ftD\b82P<ѩ\t\u0001(/\u0011\u0017\u0005\u0006[K:\u0013vВq\u0003Y\u001bY\u001d\u001a@\u0007\u0005ů\u0002fcu[NH\u001ba\u0001ȉ$K\u000fP\\?_^ŧ}\u0013LT5\r\u000faL,p=;\u00153U\u001b\u0007\u0001\\o\tEqK\b\u0001'U/\u0010לV~i\u000e#-+}\u0011\u000ex4l\u001dSv\u000bU*\u0016ԁL\u0019\u00156\t\u0013{;NJّ\u0005oV<@2f6Ԅcz\u0001cXR\u0018]pȕChD+=\u007fa@\u007fԬe\u001arI/f7*\u001c۵\u001dŀҠm ƟX\u0010f-)mH`?SX=vŎ]CuՎ\td\b0\u00127\u0018\u000f=~).E)ھ_?+ܩ\u0004\u0004NLu\u007fUovS\u0002RvA̱r\u001c?ѧ!\u000e`Nr\fߛP]`,\u0017l$W\rĄ$A\u001fϨ{W"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", "", "AsP?g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007fe#UL/f_VF\u0015\u001c0", "3mS", "6`]1_,L1&\t\tl,{", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001{\u00165MAJo>'^Va@\u0007a;R\u00010\u0006(W*_\\\u007f!\u001d\u0013dc5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\r \u001e>ilQZ\u001aPC$uT82TYfyEPIl3.y_$\\8I(\u001ezWvqN1\u0014\t7\u001as\\O\\+8", "5dc\u0012a+", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]z1P\u000b*5ZU|Jw\u001b[\u0018$", "5dc\u0015T5=Z\u0019\rXk6\u000b\u0017/d", "u(I", "5dc g(Kb", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", ";da4X", "BnBAe0GU", "", "BnC2k;+O\"\u0001z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "BnC2k;+O\"\u0001z&+Przm_\b", "u(9", "\u000fmR5b9\"\\\u001a\t", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Selection {
    public static final int $stable = 0;
    private final AnchorInfo end;
    private final boolean handlesCrossed;
    private final AnchorInfo start;

    public static /* synthetic */ Selection copy$default(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            anchorInfo = selection.start;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            anchorInfo2 = selection.end;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            z2 = selection.handlesCrossed;
        }
        return selection.copy(anchorInfo, anchorInfo2, z2);
    }

    public final AnchorInfo component1() {
        return this.start;
    }

    public final AnchorInfo component2() {
        return this.end;
    }

    public final boolean component3() {
        return this.handlesCrossed;
    }

    public final Selection copy(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z2) {
        return new Selection(anchorInfo, anchorInfo2, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        return Intrinsics.areEqual(this.start, selection.start) && Intrinsics.areEqual(this.end, selection.end) && this.handlesCrossed == selection.handlesCrossed;
    }

    public int hashCode() {
        return (((this.start.hashCode() * 31) + this.end.hashCode()) * 31) + Boolean.hashCode(this.handlesCrossed);
    }

    public String toString() {
        return "Selection(start=" + this.start + ", end=" + this.end + ", handlesCrossed=" + this.handlesCrossed + ')';
    }

    public Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z2) {
        this.start = anchorInfo;
        this.end = anchorInfo2;
        this.handlesCrossed = z2;
    }

    public /* synthetic */ Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(anchorInfo, anchorInfo2, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? false : z2);
    }

    public final AnchorInfo getStart() {
        return this.start;
    }

    public final AnchorInfo getEnd() {
        return this.end;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    /* JADX INFO: compiled from: Selection.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4ߚ\u007f\u0007tqA0JoP.`\\2\u000fq|<$i0yّA٧ \u0014̝9O|f(\nZ^\u0019C'\u0006Dyz0WW\u0011]@\u0012BF}CKM\u001eB˃dtD\u000bh90E\u0012\u0005/\u001bpс\u0011?\u0002QY$\u0012^C7ĴSUT\u0013)*\u0006l%Gɭ]0sDX\u0005]hǂS\toB\\'w0+N=LZ'\u001bxy\u001eYCg;\u001b%a\u0007\u001fR\nDIԑp\u0006\u0016v8?+w\u0006\b<f\u0013,\u0017AN;\\9ͽ]MXn ?+}f\u0012؋\rp~\t\u0011%<2$LЀG~<(f \u000eauɤWFX\u061cvD\u0006\u0002o>g4\u000e5C9IiЂeA!\u05cbO}\u000b\u0016,-Q}/_l\u000e\u000f\u001aôX}YĸiBCS\\\u0016\u0558A\u0005"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007fe#UL/f_VF\u0015\u001c0", "", "2ha2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#j Ew\u001d?MB*kG-sln9\u0005r0X\u007f|", "=eU@X;", "", "Ad[2V;:P ~^]", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WJ\u00069<YG\r7{ 5^C:Z41$GeF\u0007a;R\u00010\u001d03oM", "5dc\u0011\\9>Q(\u0003\u0005g", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i$m$8TT;j#\u001e(w@=\u0014c*]z1P\"", "5dc\u001cY-LS(", "u(8", "5dc X3>Q(zwe,`\b", "u(9", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnchorInfo {
        public static final int $stable = 0;
        private final ResolvedTextDirection direction;
        private final int offset;
        private final long selectableId;

        public static /* synthetic */ AnchorInfo copy$default(AnchorInfo anchorInfo, ResolvedTextDirection resolvedTextDirection, int i2, long j2, int i3, Object obj) {
            if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
                resolvedTextDirection = anchorInfo.direction;
            }
            if ((2 & i3) != 0) {
                i2 = anchorInfo.offset;
            }
            if ((i3 & 4) != 0) {
                j2 = anchorInfo.selectableId;
            }
            return anchorInfo.copy(resolvedTextDirection, i2, j2);
        }

        public final ResolvedTextDirection component1() {
            return this.direction;
        }

        public final int component2() {
            return this.offset;
        }

        public final long component3() {
            return this.selectableId;
        }

        public final AnchorInfo copy(ResolvedTextDirection resolvedTextDirection, int i2, long j2) {
            return new AnchorInfo(resolvedTextDirection, i2, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            return this.direction == anchorInfo.direction && this.offset == anchorInfo.offset && this.selectableId == anchorInfo.selectableId;
        }

        public int hashCode() {
            return (((this.direction.hashCode() * 31) + Integer.hashCode(this.offset)) * 31) + Long.hashCode(this.selectableId);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.direction + ", offset=" + this.offset + ", selectableId=" + this.selectableId + ')';
        }

        public AnchorInfo(ResolvedTextDirection resolvedTextDirection, int i2, long j2) {
            this.direction = resolvedTextDirection;
            this.offset = i2;
            this.selectableId = j2;
        }

        public final ResolvedTextDirection getDirection() {
            return this.direction;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final long getSelectableId() {
            return this.selectableId;
        }
    }

    public final Selection merge(Selection selection) {
        if (selection == null) {
            return this;
        }
        boolean z2 = this.handlesCrossed;
        if (z2 || selection.handlesCrossed) {
            return new Selection(selection.handlesCrossed ? selection.start : selection.end, z2 ? this.end : this.start, true);
        }
        return copy$default(this, null, selection.end, false, 5, null);
    }

    /* JADX INFO: renamed from: toTextRange-d9O1mEE */
    public final long m1672toTextRanged9O1mEE() {
        return TextRangeKt.TextRange(this.start.getOffset(), this.end.getOffset());
    }
}
