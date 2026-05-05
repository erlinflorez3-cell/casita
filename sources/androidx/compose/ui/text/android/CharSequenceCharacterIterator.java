package androidx.compose.ui.text.android;

import java.text.CharacterIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.CharCompanionObject;
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
/* JADX INFO: compiled from: CharSequenceCharacterIterator.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<M\u0007Ӭ4\u0012\u0006\rnj?2LeV\u008cZݷ2\u000fy\u0006<$a,wّQ٥J}P\b\u007fN\u0016g/ej\u000fQ\u0010\u001e\u0016'l<Mc{u\u0012=6RsM8eok=žx6\u0013&z(F\u0002\u001d\u0001H3\u000f$?\u0001QU$\u0012^K7N\u001b\u0013[\u00112\u00124If\u0015fbu[NH\u001ba\u0001Ck\twPf'\u000e4CaULb6%v\u0010\"qT\u007f;#5k\u00035]\"SKF\u007fN\u001dhU2qɵs <f\u0012,\u0015YZSq;4j\u0018i`:2[Sq_h\u000eV{A\u0010]H\u0012\u000f\u001e'v0\u0004Ղhڿ\u00123|Ɂ$L^\u0007vB.~8ت\u0019Ӿ\u000433ݍkr_hS\u0019|;R˟\u0019̷'\u0001vď,`\u001cc-\u001b\u0003{(ĻS͘AHVˣ\u0558A\u0003"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u0015p\u0012;;CG{4'\u0013h?<\u0003p(L\u0006'T0],iN\u0002G!g", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "\u001aiPCTuMS,\u000eD</x\u0016+c\u000f(\t$\u0010\u0017$C~\u0018IL", "1gP?F,Jc\u0019\bx^", "", "AsP?g", "", "3mS", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dSq\u007fg", "7mS2k", "1k^;X", "", "1ta?X5M", "", "4ha@g", "5dc\u000fX.B\\|\by^?", "5dc\u0012a+\"\\\u0018~\u000e", "5dc\u0016a+>f", ":`bA", "<dgA", ">qTC\\6Na", "Adc\u0016a+>f", ">nb6g0H\\", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CharSequenceCharacterIterator implements CharacterIterator {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final int end;
    private int index;
    private final int start;

    public CharSequenceCharacterIterator(CharSequence charSequence, int i2, int i3) {
        this.charSequence = charSequence;
        this.start = i2;
        this.end = i3;
        this.index = i2;
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.index = this.start;
        return current();
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i2 = this.start;
        int i3 = this.end;
        if (i2 == i3) {
            this.index = i3;
            return CharCompanionObject.MAX_VALUE;
        }
        int i4 = i3 - 1;
        this.index = i4;
        return this.charSequence.charAt(i4);
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i2 = this.index;
        return i2 == this.end ? CharCompanionObject.MAX_VALUE : this.charSequence.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i2 = this.index + 1;
        this.index = i2;
        int i3 = this.end;
        if (i2 < i3) {
            return this.charSequence.charAt(i2);
        }
        this.index = i3;
        return CharCompanionObject.MAX_VALUE;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i2 = this.index;
        if (i2 <= this.start) {
            return CharCompanionObject.MAX_VALUE;
        }
        int i3 = i2 - 1;
        this.index = i3;
        return this.charSequence.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i2) {
        int i3 = this.start;
        if (i2 <= this.end && i3 <= i2) {
            this.index = i2;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.start;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.end;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.index;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }
}
