package kotlinx.serialization.json.internal;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007lnA0ReP.XT2\u000fy~<$i.yCIY\"}0\u000eWNumvJh\u0012K\u000f\u0014\u001e\u0001j:U]xc\u0015\u0015@Xģo3{n}DpxD\u000582P9ѩ\t\u0001(,\u0011\u0016\u0005\u0005[K:\u001dvT9@`\u0019e\u0005H\u001dLRh\u000f,i\u007fNdS\u001daH=;\u0003\u0018F\u0015;(>\u000bZ%F\u00032=zo,C@eD[9\u001c\u000f\u0015_s?1J\"A\u0013v?'YY<eDe\u0018\u0014C6\u007f\u0011k\u0001>\\3b' o9]pcP<3(~\n\u001bT\u0004<\u0018m\\v;(s \u000ea\u007f#WN^\u001a^p\u0013Au~%3\rK+g&\u0017UoI1Ne\u0010K!f1\u000f{9[\u0003\u0019\u0011\u0019)b\u0010Q_f\u0007Q\u0011Z\u0018fUm2{\u0013\u00068\u0012HG.ED\u001f<.=7\nDS%y\u001a`D\u0016\rKt1Ywk`@Py\\Kr\u000f\u001at\\d3v\u0017h):\u001fM4T5~>ʶvρy˶%%\u0018ʚ \u000bwoe]8)_jE\\\u0007k<[w!\n̗]Ӓ\u0014mZΘ,ABh\u0013_\u0007DY\u0014he͎&M"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\fWKFuB\u001e\">", "", "EqXAX9", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MD]A\"$hn\u000f", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@)>h}-@i\u001dw2QEt&+\u0019waF\\'\u001d", "\nrTA \u0006\u0017", "", "EqXA\\5@4\u001d\f\tm", "5dc$e0MW\"\u0001[b9\u000b\u0018", "u(I", "Adc$e0MW\"\u0001[b9\u000b\u0018", "uY\u0018#", "7mS2a;", "", "<dgA<;>[", ">qX;g", "D", "", "", "", "", "", "", "", "", ">qX;g\u0018N](~y", "D`[BX", "AoP0X", "Cm8;W,Gb", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class Composer {
    public final JsonWriter writer;
    private boolean writingFirst;

    public Composer(JsonWriter writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.writer = writer;
        this.writingFirst = true;
    }

    public final boolean getWritingFirst() {
        return this.writingFirst;
    }

    public void indent() {
        this.writingFirst = true;
    }

    public void nextItem() {
        this.writingFirst = false;
    }

    public void print(byte b2) {
        this.writer.writeLong(b2);
    }

    public final void print(char c2) {
        this.writer.writeChar(c2);
    }

    public void print(double d2) {
        this.writer.write(String.valueOf(d2));
    }

    public void print(float f2) {
        this.writer.write(String.valueOf(f2));
    }

    public void print(int i2) {
        this.writer.writeLong(i2);
    }

    public void print(long j2) {
        this.writer.writeLong(j2);
    }

    public final void print(String v2) {
        Intrinsics.checkNotNullParameter(v2, "v");
        this.writer.write(v2);
    }

    public void print(short s2) {
        this.writer.writeLong(s2);
    }

    public void print(boolean z2) {
        this.writer.write(String.valueOf(z2));
    }

    public void printQuoted(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.writer.writeQuoted(value);
    }

    protected final void setWritingFirst(boolean z2) {
        this.writingFirst = z2;
    }

    public void space() {
    }

    public void unIndent() {
    }
}
