package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: StateObjectImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4E\u0007\":\u001b\u007f\u0007lrA0RqP.XX0š*\u0012éBsTqq:\u000e\u0019\u0016b\u0018_Tmg|Jr\u000bq\u0010و\u001azp.WXAu \u0015JB\u001eFcS}EQb\u000b53\u001fxƉ9ѩ\t\u0003 3V\u001a?\tQV$\u0012^A7ńQҫQ\u0007 \u001e\u0014Ah\u001a,i\u007fNdO\u001daH=;\u0003\u0018ĩ\u0015ϒeޗ{ձϘJV-\u001c\u0005qf9NHM\u0015SeI߮QÜC\u0005E\u0005K\u00191@5@as\u0006̬\t\u0004\"#CO;ƞ9̭b՝PӠВ+-UyYg^7\u0006z\u0014\rj\u0005؝\n-P͓E\u001cl\f\u001c8ψqSöP\u0007fE\u0006я}d\u0016Ԅ\u0004L"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0003.IB;x\u001a\"\u001eg7", "", ";`b8", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "5dc\u001aT:D", "u(8", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "7rA2T+\"\\", "@dP1X9", "7rA2T+\"\\`\u0002t_xN\r\u0002", "uH8uM", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "Ehc5E,:R|\b", "Ehc5E,:R|\bB,\u0018j\u001c{D\u0012", "uH8u<", "\u0011n\\=T5B]\"", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class ReaderKind {
    public static final Companion Companion = new Companion(null);
    private final int mask;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m3768boximpl(int i2) {
        return new ReaderKind(i2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3769constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3771equalsimpl(int i2, Object obj) {
        return (obj instanceof ReaderKind) && i2 == ((ReaderKind) obj).m3777unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3772equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3773hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    /* JADX INFO: renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m3774isReadInh_f27i8(int i2, int i3) {
        return (-1) - (((-1) - i2) | ((-1) - i3)) != 0;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3775toStringimpl(int i2) {
        return "ReaderKind(mask=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m3771equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m3773hashCodeimpl(this.mask);
    }

    public String toString() {
        return m3775toStringimpl(this.mask);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3777unboximpl() {
        return this.mask;
    }

    private /* synthetic */ ReaderKind(int i2) {
        this.mask = i2;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m3770constructorimpl$default(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return m3769constructorimpl(i2);
    }

    public final int getMask() {
        return this.mask;
    }

    /* JADX INFO: renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m3776withReadIn3QSx2Dw(int i2, int i3) {
        return m3769constructorimpl(i2 | i3);
    }

    /* JADX INFO: compiled from: StateObjectImpl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005'2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005:i%\nCiWPՉ\"\u0093NȞ̭fmН^\u000f[\u0011\f\u0019\u0007n|_c}u\u0012=4xŪ?߅Lڎ\u00818_ҽ:\t84(>\b\tQ08O(v)E\u0002ď\u0012ڌ?\u0081ŦQ\f̂\t\u001e*\bD(\u000f\"մgW>KrҹV]\"\u000biHmϴc9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0003.IB;x\u001a\"\u001eg \u0017\u0011k7J\u007f+QU$", "", "u(E", "\u0011n\\=b:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0003.IB;x\u001a\"\u001eg7", "5dc\u0010b4I]'\u0003\nb6\u0006P\u007ffR\u0011\u00065S", "u(8", "!mP=f/Hby\u0006\u0005p", "5dc a(Ia\u001c\t\n?3\u0007\u001bv6\u0001zdJui", "!mP=f/Hb\u0007\u000evm,f\u0006=e\r9{M", "5dc a(Ia\u001c\t\nL;x\u0018/O|6{M\u0012\u0017$\u000f@\u000f\u000f_/*,", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m3778getComposition6f8NoZ8() {
            return ReaderKind.m3769constructorimpl(1);
        }

        /* JADX INFO: renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m3780getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m3769constructorimpl(2);
        }

        /* JADX INFO: renamed from: getSnapshotFlow-6f8NoZ8, reason: not valid java name */
        public final int m3779getSnapshotFlow6f8NoZ8() {
            return ReaderKind.m3769constructorimpl(4);
        }
    }
}
