package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLcz\u0004I\u0006>'6Ȑ\u0007\":\u0018\u007f\u0007ljA0ReP\u008cZS@\u000fsڔ<$iҕyCAU\"}8\tWNmgtϺpŏa\u001e6\u0016'idHd9b\u0018#̓FoM3\u000e\u0007MAnuN\t02(9(\u0007\u0011\u001e8K(v)Gƚ\u0010\u0012>E9H`\u0013e\u0005H\u00196B.\t6\\\u0016W|\\5cH9;\u0003\u0018M\u0015'(>\u000bY%F\u0003.=zo+C@eC[9$\u0013\u0015SsC\u0013?w>3j}ݓ7ʁwW>ݙP #.g\r\fv|؛\u0007Ōd\f/˃ջg["}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\u00135f\u0002\u001c>q+.L!Er;\u001e\u0013weC\u00109", "\u001aiPCTuB]b^\u000em,\n\u0012+l\u0004=w=\b\u0017l", "u(E", "1n[9X*MW#\b", "", "B`V", "", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlz\u000b`", "@dP18?MS&\bve", "", "7m_Bg", "\u001aiPCTuB]bhwc,z\u0018\u0013n\u000b8\u000b\u0016", "@dP1E,L] \u0010z", "", "EqXAX\fQb\u0019\f\u0004Z3", "=tc=h;", "\u001aiPCTuB]bhwc,z\u0018\u0019u\u000f3\fOV", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SerializedCollection implements Externalizable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;
    private Collection<?> collection;
    private final int tag;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":\u0018\u007f\u0007lj?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>˪AН^\u000bKƤV\"\u0007mDI\u0004|4\u070fa̓FoG\u074c\u001e{K>xtd\tv\u074ctأ}\u0005\tɝݻL\u0016"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\u00135f\u0002\u001c>q+.L!Er;\u001e\u0013weC\u0010\"\nX~2CUR6e(", "", "u(E", "Ada6T3/S&\r~h5ll\u000e", "", "B`V\u0019\\:M", "", "B`V X;", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SerializedCollection() {
        this(CollectionsKt.emptyList(), 0);
    }

    public SerializedCollection(Collection<?> collection, int i2) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.collection = collection;
        this.tag = i2;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws InvalidObjectException {
        List listBuild;
        Intrinsics.checkNotNullParameter(input, "input");
        byte b2 = input.readByte();
        int i2 = (b2 + 1) - (1 | b2);
        if ((b2 - 2) - ((-2) | b2) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b2) + '.');
        }
        int i3 = input.readInt();
        if (i3 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i3 + '.');
        }
        int i4 = 0;
        if (i2 == 0) {
            List listCreateListBuilder = CollectionsKt.createListBuilder(i3);
            while (i4 < i3) {
                listCreateListBuilder.add(input.readObject());
                i4++;
            }
            listBuild = CollectionsKt.build(listCreateListBuilder);
        } else {
            if (i2 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i2 + '.');
            }
            Set setCreateSetBuilder = SetsKt.createSetBuilder(i3);
            while (i4 < i3) {
                setCreateSetBuilder.add(input.readObject());
                i4++;
            }
            listBuild = SetsKt.build(setCreateSetBuilder);
        }
        this.collection = listBuild;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(this.tag);
        output.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }
}
