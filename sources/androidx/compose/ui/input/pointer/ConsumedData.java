package androidx.compose.ui.input.pointer;

import kotlin.Deprecated;
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
/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "\u0018Y\u0001ta\u0004\u001eelL:c^%Ab?T\n5\fmY[\n)}xa\n1kl\fePQ\u001cXHO,G?$?Z\n7l+CfL;\u0017YJ#R.\fA\u0007:T/@*^\u0012\u0001^&")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4L\u0005'Bߚ(\u0007\u0015iyGTkN.`SB\u000f\u001a|D*a$\u007fESUH~̀\rO\\j8\u0011X\\#C=\u0007L|)0 ǉ\u0005ٕ\u0016!:ԏ\u007fA9Q}BQbz<\u0013'R$>\u0002\u0013\njLV\u0010\u000fzqLB\u0016nDGõ^ҫQ\u0017\"Ň\u0016@&\u000b,a\u007fP<SzdZ1)\u000fwKĠ+l"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001K 7[SCk3|\u0011w]\u000f", "", ">nb6g0H\\v\u0002vg.|", "", "2nf;6/:\\\u001b~", "uYIuI", "5dc\u0011b>G1\u001cz\u0004`,;\u00058n\n7wO\u0005! U", "u(E", "5dc\u0011b>G1\u001cz\u0004`,", "u(I", "Adc\u0011b>G1\u001cz\u0004`,", "uY\u0018#", "5dc\u001db:Bb\u001d\t\u0004</x\u00121e>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u001db:Bb\u001d\t\u0004</x\u00121e", "Adc\u001db:Bb\u001d\t\u0004</x\u00121e", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ConsumedData {
    public static final int $stable = 8;
    private boolean downChange;
    private boolean positionChange;

    /* JADX WARN: Illegal instructions before constructor call */
    public ConsumedData() {
        boolean z2 = false;
        this(z2, z2, 3, null);
    }

    @Deprecated(message = "\u0013G\u000eIzu!\u0017[V6\u000ee\"<be[\u0017f\u001ci\u001f\u0012zK~|Sw%zmP2\u0002Bomx6-<H&[^^8]VO3GGt\u001bU'Y({8As\u001asv\fZ\u0007\nq'\u001a`^\u0015M\u000f\u000f17?f\u0005HXc7;)\u00045X\u0015'\u0003h")
    @InterfaceC1492Gx
    public static /* synthetic */ void getDownChange$annotations() {
    }

    @Deprecated(message = "\u0013G\u000eIzu!\u0017[V6\u000ee\"<be[\u0017f\u001ci\u001f\u0012zK~|Sw%zmP2\u0002Bomx6-<H&[^^8]VO3GGt\u001bU'Y({8As\u001asv\fZ\u0007\nq'\u001a`^\u0015M\u000f\u000f17?f\u0005HXc7;)\u00045X\u0015'\u0003h")
    @InterfaceC1492Gx
    public static /* synthetic */ void getPositionChange$annotations() {
    }

    public ConsumedData(boolean z2, boolean z3) {
        this.positionChange = z2;
        this.downChange = z3;
    }

    public /* synthetic */ ConsumedData(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? false : z2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? false : z3);
    }

    public final boolean getPositionChange() {
        return this.positionChange;
    }

    public final void setPositionChange(boolean z2) {
        this.positionChange = z2;
    }

    public final boolean getDownChange() {
        return this.downChange;
    }

    public final void setDownChange(boolean z2) {
        this.downChange = z2;
    }
}
