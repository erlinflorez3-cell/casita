package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eOLш|\u0004O\u001d8\u000b4B\u0007\":\u0018\u007f\u0007lmA0RoP.XV2\u000fy\b<řc$\u007fCCU }(ޛeȞ\u0018g\u001dI\u001b\u0016S\u0013\u0014\u0016\u0011jZJǤ|] \u0011zQ}HKM\u001eGid\u0003A\u001d `&~ѝ\u0005I08T(v)B{\u0010 =XphV=Q\u0013(*\u0006l$G2%{\\E`l\fJ_'\u0011vZNUc`\u0001[\u001b^TU\u0011?m,<X7c'UW\u0011\u001aj[m\u0007\u0010}K\u0005\u0001'U, ֘Y͏\\\u007f\u001cƃ{g\u001b`\u000b&\u000b\t(ӷ\u0018ˏ/[k֟h\u0010.|\t\u0002->\n\u0015\u0014/χ2A"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\nZP7\u007f\u0010,\u0003hmI\u0007l*NL", "", "0tU3X9", "", "uZ2uI", ":d]4g/", "", "5dc\u0019X5@b\u001c", "u(8", "Adc\u0019X5@b\u001c", "uH\u0018#", "5dc", "", "7mS2k", "AtQ X8NS\"|z", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "AtQ@g9B\\\u001b", "", "BqX:", "", "<df \\A>", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ArrayAsSequence implements CharSequence {
    private final char[] buffer;
    private int length;

    public ArrayAsSequence(char[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        this.length = buffer.length;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i2) {
        return get(i2);
    }

    public char get(int i2) {
        return this.buffer[i2];
    }

    public int getLength() {
        return this.length;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public void setLength(int i2) {
        this.length = i2;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return StringsKt.concatToString(this.buffer, i2, Math.min(i3, length()));
    }

    public final String substring(int i2, int i3) {
        return StringsKt.concatToString(this.buffer, i2, Math.min(i3, length()));
    }

    public final void trim(int i2) {
        setLength(Math.min(this.buffer.length, i2));
    }
}
