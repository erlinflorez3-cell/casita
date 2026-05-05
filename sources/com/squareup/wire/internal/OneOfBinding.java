package com.squareup.wire.internal;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.OneOf;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\u007fLCU \u0002*\t]TogtKb\u000bY\u000f\u000e\u0016~m4Ic\u0005e\u0012\u00159JoM2UoC:htL\u0005(20\u0600\u0002\u0005\u0007\u001d2H\u001ev\u0003CQ\u0013\u0018ؓV\u0081bd\u0013˟\u0013\u0019:\u0012N\"\u0011\u001e#f^8Xl$;]#+{HM5`X\t]\u000fVTm\f\u0007c.+\u00078c\u0017U_\u0013\tb[\u0006\u0002OsM\u0005/(U.\n%]̬h\u0004\"\u0019CO;b\u00030j\u000bif\u001c);O\u001aJ~\u00158\u007f\t\u0004%@\u0014\u000e\f(v7=\u001et\u0012&3#}ՂDR\bjP\rC|DG=\u007fa\\i\u001ft\u0004y;OMg\u007f\u0013=6#/\u001agoڍ\u0012`#N\u001d\u0015_ei@ky~\u000ego\u0006\u0004'a20\u0012`_\u0002Ez?Y]9ھ_91T4\u0018Vy\u007fx\u001b_\u0017~\u001aVVv:nLճpµ\fʑHd\u0013#\u0019ifd)O2S5)8\u0017.\u000f\u0010<W$Vbћlix\u0007.\u001633~7\bsBސYߍb3=ȡ4 oZ\u000f\u0018O<h\u0006\u0007o\u0019Ͱ\u000eȺ`(*õ\u0019|\u001e\u0002\u0014D|\u0017iՌAۇ :4ջ1^\u001bV\u0011-\u0013M\u000b\u0019wZ\u0017\u0015Uԡ5ʗ\u0007i,ڏY\u0013^m\to\u0016\u000b\u007f\u0001Sʷ$έEUM\u001b,h0|\u0005\u000f1\u001c\u0017s.]\u001e!\u001eƙnטyY\u0014\"\u001c1Gi\u007fO!(\u0017)`\rc\u001a#Ȁg˛Q\u0016?|\u0003\u0014\u001dJ9@u#\u0003pZ|!\u001f&ݎ\u0019Ȕzb\u000b%\u000e\u0002\u000e\u00182X\tf{T9wt\u001eIÜ[\u0084R<\u0015\u0007%>3\u001f@4\u000bVECU9LLjڃ\u0017˸am\b0\u007f\u0005\u001dDEw\u0012O{\u0016\u001em\b2\tօ:ա]\u0003V$*\u0010\u0011Q\u0019|\u0006,Z\tb\u0018i\u001d\u0018уrެ<Q#1\u0004\u000b\u0015;]\u0003d\u0001R\u0013\u001e$j\u00036͟uʸ\u0002\u0018vE+8[{8\f{tt\u0011Z\u0011\u001a\u000b*\\\u001d<R\u0012vݟYť\r:\u0016u\u001ebOhz\u0007B72cʟ@B"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006`.5C~|;v\u00152VE\u0011", "\u001b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "\u0010", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013IoL\u0019\u0007)<X}-\r", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006W)5`|\nDW\u001f.7D\u0018o=\u001d\u0019qc\u000f", ";db@T.>4\u001d~\u0002]", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fq\\D\u0001\u001e\u0016\u001d", "0tX9W,KB-\nz", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "9dh", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqeI\u0001\u0001\u0018\u0006U\u000ePL", "EqXAX\u0010=S\"\u000e~m@m\u00056u\u007f6", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(9|\n6e}7E!\u0005\u0017\u001eFEtAr61#\u0005\u001c@o_\fT?Iy\n\u0005\u0013ri\u0003\u0015o<J\u0004'WW\u0018>`_r\u0007}\u001bZwOir\u0005m\u0017\u001925", "5dc$e0MS|}zg;\u0001\u0018CV{/\f@\u000f", "u(I", "0tX9W,K4\u001d~\u0002]", "B`V", "", "5dc!T.", "u(8", ":`Q2_", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017wKo\u0015;5\f1V}'\r", "5dc\u0019T)>Z", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nr\u001b$GP\u0012<}$s@y\u001d7tk", "@dS.V;>R", "5dc\u001fX+:Q(~y", "Eha290>Z\u0018c\th5e\u00057e", "", "5dc$\\9>4\u001d~\u0002]\u0011\u000b\u00138N{0{", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "<`\\2", "5dc\u001bT4>", "2dR9T9>R\u0002z\u0003^", "5dc\u0011X*EO&~yG(\u0005\t", "7r<.c", "7r<2f::U\u0019", "9dh\u000eW(Ib\u0019\f", "", "5dc\u0018X@\u001aR\u0015\n\n^9", "u(;7T=:\u001d z\u0004`um\u00133dU", "Ah]4_,\u001aR\u0015\n\n^9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "", "5dc \\5@Z\u0019ZyZ7\f\t<${1\u0005J\u0010\u0013&Ky\u0017J", "u(E", "5dc \\5@Z\u0019ZyZ7\f\t<", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nk$!Vyi;r0DY\u000bu", "D`[BX", "", "0tX9W,K", "uKR<`uL_)z\b^<\bRAi\r(E(\u0001%%Cq\u000ezS59`| DC|3IT75;\u001a\u001ej+#\u0004h,L\u0006|\u000b=", "Adc", "5dc", ";db@T.>", "uKR<`uL_)z\b^<\bRAi\r(E(\u0001%%Cq\u000e\u0012:\f:U\u000f\u001c\u0001t\u00127O\r%h9\u001e\u0013w7", "5dc\u0013e6F0)\u0003\u0002],\n", "uKR<`uL_)z\b^<\bRAi\r(E(\u0001%%Cq\u000ezS59`| DCY\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneOfBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> extends FieldOrOneOfBinding<M, B> {
    private final Field builderField;
    private final OneOf.Key<?> key;
    private final Field messageField;
    private final boolean writeIdentityValues;

    public OneOfBinding(Field messageField, Class<B> builderType, OneOf.Key<?> key, boolean z2) throws NoSuchFieldException {
        Intrinsics.checkNotNullParameter(messageField, "messageField");
        Intrinsics.checkNotNullParameter(builderType, "builderType");
        Intrinsics.checkNotNullParameter(key, "key");
        this.messageField = messageField;
        this.key = key;
        this.writeIdentityValues = z2;
        Field declaredField = builderType.getDeclaredField(messageField.getName());
        Intrinsics.checkNotNullExpressionValue(declaredField, "getDeclaredField(...)");
        this.builderField = declaredField;
    }

    public static /* synthetic */ void getSingleAdapter$annotations() {
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object get(M message) {
        Intrinsics.checkNotNullParameter(message, "message");
        OneOf oneOf = (OneOf) this.messageField.get(message);
        if (oneOf != null) {
            return oneOf.getOrNull(this.key);
        }
        return null;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getDeclaredName() {
        return this.key.getDeclaredName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object getFromBuilder(B builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        OneOf oneOf = (OneOf) this.builderField.get(builder);
        if (oneOf != null) {
            return oneOf.getOrNull(this.key);
        }
        return null;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public /* bridge */ /* synthetic */ ProtoAdapter getKeyAdapter() {
        return (ProtoAdapter) m8728getKeyAdapter();
    }

    /* JADX INFO: renamed from: getKeyAdapter, reason: collision with other method in class */
    public Void m8728getKeyAdapter() {
        throw new IllegalStateException("not a map".toString());
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public WireField.Label getLabel() {
        return WireField.Label.OPTIONAL;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getName() {
        return this.key.getDeclaredName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getRedacted() {
        return this.key.getRedacted();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<Object> getSingleAdapter() {
        ProtoAdapter<?> adapter = this.key.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        return adapter;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public int getTag() {
        return this.key.getTag();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getWireFieldJsonName() {
        return this.key.getJsonName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getWriteIdentityValues() {
        return this.writeIdentityValues;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMap() {
        return false;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMessage() {
        KClass<?> type = getSingleAdapter().getType();
        return Message.class.isAssignableFrom(type != null ? JvmClassMappingKt.getJavaObjectType(type) : null);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void set(B builder, Object obj) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Field field = this.builderField;
        OneOf.Key<?> key = this.key;
        Intrinsics.checkNotNull(key, "null cannot be cast to non-null type com.squareup.wire.OneOf.Key<kotlin.Any>");
        Intrinsics.checkNotNull(obj);
        field.set(builder, new OneOf(key, obj));
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void value(B builder, Object value) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(value, "value");
        set((Message.Builder) builder, value);
    }
}
