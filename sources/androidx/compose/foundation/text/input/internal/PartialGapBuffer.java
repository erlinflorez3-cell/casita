package androidx.compose.foundation.text.input.internal;

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
/* JADX INFO: compiled from: GapBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eOLcz\u0005I\u0006>\u00116B\u0005\"4\u0012\u000e\u0007nj?2LeV7ZS0\u000fs{B.c$wCCU(}*\tUTog|Vb\u000bI\u000f\fǝ\u000f̓Jd\u0006x\f\u0011G1]0JCQ}=Q`#5ӯ$209B\u0011\u000f$BH>\u0002+GY\u0018*0no\u0003a\u001bZ\u001d\u001a@\u0014n$\u000f-tg|9\u000fǤ]\u0003_1\u0013\u0002B|8\u00104\u000b_%F\u0003*=zo1C@e8E)a\u0003\u001fR\n>3Ew=\u0013|?'YL$]<X\u000e)-+}\u0010&\t4r\u001dQ\u000f\u000bW/]zcP<+(~\n%T\u0004<\tm\\v3(\u007f \u000ea\u000f9g\u0011\\\u0010`Z\u007f)d\rА1ő7+Aӕ7]o?1Ne~[ٿ*ţ\u0005n)ż%\u001cn\u001a3V\u000eP_W\u0017׃Tݳ\u000eYEЧT\u0003p\tB\u0004^J6\u0004R\u00940ϲ);s;))y\u000b\u0019Puv\u001d`\u0017R@ɰTغ&n\u001eճҐ\r("}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PN([\u0006+CS0(g/\u0003>\u0015\u0012gc", "", "BdgA", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001d3~", "0tU\u0012a+", "", "0tU g(Kb", "0tU3X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PE(YS7HMN92", ":d]4g/", "5dc\u0019X5@b\u001c", "u(8", "1n]AX5M3%\u000fve:", "", "=sW2e", "5dc", "", "7mS2k", "@d_9T*>", "", "AsP?g", "3mS", "BdgAF;:`(", "BdgA85=", "AtQ X8NS\"|z", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PartialGapBuffer implements CharSequence {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private GapBuffer buffer;
    private CharSequence text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    /* JADX INFO: compiled from: GapBuffer.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005#2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PN([\u0006+CS0(g/\u0003>\u0015\u0012gL,5\u0015\u0010UJ(xM\r", "", "u(E", "\u0010T5,F\u001033", "", "\u001cNF\u00158\u0019\u001e", "!TA\u001fB\u001c'2|g\\X\u001a`}\u000f", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PartialGapBuffer(CharSequence charSequence) {
        this.text = charSequence;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i2) {
        return get(i2);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public int getLength() {
        GapBuffer gapBuffer = this.buffer;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    public static /* synthetic */ void replace$default(PartialGapBuffer partialGapBuffer, int i2, int i3, CharSequence charSequence, int i4, int i5, int i6, Object obj) {
        if ((-1) - (((-1) - i6) | ((-1) - 8)) != 0) {
            i4 = 0;
        }
        if ((i6 + 16) - (i6 | 16) != 0) {
            i5 = charSequence.length();
        }
        partialGapBuffer.replace(i2, i3, charSequence, i4, i5);
    }

    public final void replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (i2 > i3) {
            throw new IllegalArgumentException(("start=" + i2 + " > end=" + i3).toString());
        }
        if (i4 > i5) {
            throw new IllegalArgumentException(("textStart=" + i4 + " > textEnd=" + i5).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("start must be non-negative, but was " + i2).toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(("textStart must be non-negative, but was " + i4).toString());
        }
        GapBuffer gapBuffer = this.buffer;
        int i6 = i5 - i4;
        if (gapBuffer == null) {
            int iMax = Math.max(255, i6 + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i2, 64);
            int iMin2 = Math.min(this.text.length() - i3, 64);
            int i7 = i2 - iMin;
            ToCharArray_androidKt.toCharArray(this.text, cArr, 0, i7, i2);
            int i8 = iMax - iMin2;
            int i9 = iMin2 + i3;
            ToCharArray_androidKt.toCharArray(this.text, cArr, i8, i3, i9);
            ToCharArray_androidKt.toCharArray(charSequence, cArr, iMin, i4, i5);
            this.buffer = new GapBuffer(cArr, iMin + i6, i8);
            this.bufStart = i7;
            this.bufEnd = i9;
            return;
        }
        int i10 = this.bufStart;
        int i11 = i2 - i10;
        int i12 = i3 - i10;
        if (i11 < 0 || i12 > gapBuffer.length()) {
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(i2, i3, charSequence, i4, i5);
            return;
        }
        gapBuffer.replace(i11, i12, charSequence, i4, i5);
    }

    public char get(int i2) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(i2);
        }
        if (i2 < this.bufStart) {
            return this.text.charAt(i2);
        }
        int length = gapBuffer.length();
        int i3 = this.bufStart;
        if (i2 < length + i3) {
            return gapBuffer.get(i2 - i3);
        }
        return this.text.charAt(i2 - ((length - this.bufEnd) + i3));
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return toString().subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.text, 0, this.bufStart);
        gapBuffer.append(sb);
        CharSequence charSequence = this.text;
        sb.append(charSequence, this.bufEnd, charSequence.length());
        return sb.toString();
    }

    public final boolean contentEquals(CharSequence charSequence) {
        return Intrinsics.areEqual(toString(), charSequence.toString());
    }
}
