package androidx.compose.runtime;

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
/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&˛\bDZc|\u0004G\u00068\u000b<H\u0007\"2\u0016\u007f\u0007tjA0JrN\u008chݷR\u0011qڔB#\f*\u0002EKU`|P\t\u0010gwq|Kr\u0011S\u0011\u0016\u0016/̓ZIe|k\u0014'2prУ7M}A\u0002f\u0003?\u001d `,~\u000eM\u0014(5`\u0010%\u0005sO\u001a\u001eH@'í\u0019!̂\t\u001a \u0013\u0007;\u000f,tg|@xpkIG#1lrR5oH|\u0004ε\rhܮ\u0011vo/s[EG-%\u0002\r7ViN\u001b? @5l57CI*Ɏ|lÿ\u0018\u00159`U{\u00019t\u0005\u007fj<+9c{K~\u0011X{\t\u0011%<2\u00116+VDE\u001a\u0015\u000bTG=\taWh\u0002\rL0~oE/%.6[=)|iai\u001c\u0015KD\u000b\u001b6;\u0001\u001d+\"h^r#\u001cl}a3a@sʰ|\n0Ơoձtb\nÏTBU\u0005G{GфMy\u000eٚ;؝%o\u001aJJm\u0005\f1taqjHn%EݮCҊ\r\fbե5\u0011yRlXZ\u0014$ȿVΘ\u0002\b\u001b\u05feϨ{U"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9w=w35hY+Bt\u001a.Z\u0019", "\u001c", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "/o_9\\,K", "=eU@X;", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u0018\u00020<]}-\rQY\u001f", "1ta?X5M", "5dc\u0010h9KS\"\u000e", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "<dbA\\5@", "1kT.e", "", "2nf;", "<nS2", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "7mb2e;\u001b](\u000e\u0005f\u001c\b", "7mS2k", "7mbAT5<S", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "7mb2e;-]$]\u0005p5", ";ne2", "4q^:", "Bn", "1nd;g", "@d\\<i,", "Co", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class OffsetApplier<N> implements Applier<N> {
    public static final int $stable = 8;
    private final Applier<N> applier;
    private int nesting;
    private final int offset;

    public OffsetApplier(Applier<N> applier, int i2) {
        this.applier = applier;
        this.offset = i2;
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n2) {
        this.nesting++;
        this.applier.down(n2);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        if (!(this.nesting > 0)) {
            ComposerKt.composeImmediateRuntimeError("OffsetApplier up called with no corresponding down");
        }
        this.nesting--;
        this.applier.up();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i2, N n2) {
        this.applier.insertTopDown(i2 + (this.nesting == 0 ? this.offset : 0), n2);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i2, N n2) {
        this.applier.insertBottomUp(i2 + (this.nesting == 0 ? this.offset : 0), n2);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i2, int i3) {
        this.applier.remove(i2 + (this.nesting == 0 ? this.offset : 0), i3);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i2, int i3, int i4) {
        int i5 = this.nesting == 0 ? this.offset : 0;
        this.applier.move(i2 + i5, i3 + i5, i4);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
    }
}
