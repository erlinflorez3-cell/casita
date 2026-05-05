package androidx.compose.ui.text.input;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: GapBuffer.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":\u0018\u007f\u0007ljA0ZeP.XX2\u000fy\u0006<$a$yCIU\"}(\fUS}˧\r`\u000b\u000bq\u000e>\u0015\u000f+7YY\u0007]*\u000f`CņC3[q\u0006Hn\u0003N\u0005NAR<\b\u0015\u0019\u001aXLV͓z\fg\u001a#H@\u001fL\u0003\u0011[\u00182\u00124BP\u0005,p\u007fNdL\u001daH/;\u0003\u0018C\u0017-mE\u0015M;G\u001b;]\u0003o!C@e9kǯ_Ϋ\u000bRcΪSK\u007fB\u001dhU+\u0002ɡ\u007fɱ:X\bϬe9]\u0013ut<[3X7ϲ3˦ScSִ^7\u0006\u0003\u0014\rj\bDJόL2E\u001cl\u0011\u001c=E\u000ba@h\u0002\rCVдmي\u001b1\bđC;!q_m[\u001bTD\n\u0007ڥ\":"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#h\u001cD|\u001a*T%7v\u0011.\u0016iaF\\", "", "BdgA", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0tU\u0012a+", "", "0tU g(Kb", "0tU3X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#_\u001cBJ&/NCHA", ":d]4g/", "5dc\u0019X5@b\u001c", "u(8", "5dc!X?M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc!X?M", "5dc", "", "7mS2k", "@d_9T*>", "", "AsP?g", "3mS", "BnBAe0GU", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private GapBuffer buffer;
    private String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    public PartialGapBuffer(String str) {
        this.text = str;
    }

    /* JADX INFO: compiled from: GapBuffer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005#2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#h\u001cD|\u001a*T%7v\u0011.\u0016iaFEA6V\u0002#PPX52", "", "u(E", "\u0010T5,F\u001033", "", "\u001cNF\u00158\u0019\u001e", "!TA\u001fB\u001c'2|g\\X\u001a`}\u000f", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final int getLength() {
        GapBuffer gapBuffer = this.buffer;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    public final void replace(int i2, int i3, String str) {
        if (i2 > i3) {
            throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i2 + " > " + i3).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("start must be non-negative, but was " + i2).toString());
        }
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i2, 64);
            int iMin2 = Math.min(this.text.length() - i3, 64);
            int i4 = i2 - iMin;
            GapBuffer_jvmKt.toCharArray(this.text, cArr, 0, i4, i2);
            int i5 = iMax - iMin2;
            int i6 = iMin2 + i3;
            GapBuffer_jvmKt.toCharArray(this.text, cArr, i5, i3, i6);
            GapBufferKt.toCharArray(str, cArr, iMin);
            this.buffer = new GapBuffer(cArr, iMin + str.length(), i5);
            this.bufStart = i4;
            this.bufEnd = i6;
            return;
        }
        int i7 = this.bufStart;
        int i8 = i2 - i7;
        int i9 = i3 - i7;
        if (i8 < 0 || i9 > gapBuffer.length()) {
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(i2, i3, str);
            return;
        }
        gapBuffer.replace(i8, i9, str);
    }

    public final char get(int i2) {
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

    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.text, 0, this.bufStart);
        gapBuffer.append(sb);
        String str = this.text;
        sb.append((CharSequence) str, this.bufEnd, str.length());
        return sb.toString();
    }
}
