package androidx.compose.ui.text.android.selection;

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
/* JADX INFO: compiled from: SegmentFinder.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004O\u00118é6B\u0015\"4\u0012}\u0007njG6LeN1Xݷ@ş\u001c{b#\u001c7\u0002GIU2}P\n_Rui\u0007J\t\u000eß\u0013\u0006$|3:WZ\u0011]@\u0015bF}FKM\u001eC\u007ft=D\u0013(J\"f\u007f5\u0005(1`\u0010%\u0001\n_T >I\t:\u0001\u0013}\t(\u0019\u001e>N\u0007dp0\\DR\u0005]h5S\u0007wIf'\u000e6Ca]Rb'%v\u0010\u001f\u0002«9߱\u0019%[ΈW^iA\u001b? @[ؕ)ݳ/I{Ɏ͕\\\u000b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iEm\u001d.KR?u=g\u0007rn8tc.Vv0V-R5[R\u007f\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iEm\u001d.KR?u=g\u0003hcA\u0007l;/z0FL[\u0002", "BdgA", "", "Ena1<;>`\u0015\u000e\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|iEm\u001d.KR?u=g\u0007rn8jr,[r6QY$", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\nEu2?]|3\u0001k 6XMIk}.\u00192p9\u001aruJ\u007f&TVR+&`rD\u0014\u0010i\u0012X4VvcN#RS7,\u0004;S\u000f\u0011,q", "<dgA85=0#\u000f\u0004](\n\u001d", "", "=eU@X;", "<dgAF;:`([\u0005n5{\u0005<y", ">qTC\\6Nax\by;6\r\u0012.a\r<", ">qTC\\6Na\u0007\u000evk;Y\u0013?n~$\tT", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WordSegmentFinder implements SegmentFinder {
    public static final int $stable = 8;
    private final CharSequence text;
    private final WordIterator wordIterator;

    public WordSegmentFinder(CharSequence charSequence, WordIterator wordIterator) {
        this.text = charSequence;
        this.wordIterator = wordIterator;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousStartBoundary(int i2) {
        do {
            i2 = this.wordIterator.prevBoundary(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i2)));
        return i2;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousEndBoundary(int i2) {
        do {
            i2 = this.wordIterator.prevBoundary(i2);
            if (i2 == -1 || i2 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i2 - 1)));
        return i2;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextStartBoundary(int i2) {
        do {
            i2 = this.wordIterator.nextBoundary(i2);
            if (i2 == -1 || i2 == this.text.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i2)));
        return i2;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextEndBoundary(int i2) {
        do {
            i2 = this.wordIterator.nextBoundary(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i2 - 1)));
        return i2;
    }
}
