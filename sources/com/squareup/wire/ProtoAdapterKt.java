package com.squareup.wire;

import com.squareup.wire.WireField;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Utf8;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯĻ\u0014D߬)\u001ew\u0006L܀kt\u001aA\u000e0\u00110J~0,\u001aՄ\u000ff\u000198DkH6Ri*\u0017k\u00026,[:qKП]\u001a\f2\u0011OTgon`Z\u0013C\u0015\n\u001ex\u0001,QU~^\u001a\u000fHBwЀ;M}\\A`\u000b6\rړ:\"F\u0006\r\u0001 +P\u0010\rzKŷ\u0014\u0012>^x:X\u0010U\u0005(4\u000e>&\u0004&\\uW>HraB/1\nqBT*g0\u0013M\u0015Ͽ\\'#vi\u001e1A?5+%[\u0003\u001dRcΪ\u000b?\b=\rh='3IyY>X\u000e\u0013\u001dۀW\rkö.\\\u000bTx:5˃gcyO.*}\u07be\n\rd\n\u001e\b7Ht-Hg8\u0012Av\u000bSnO2dP\u0003\u0013cL\u0016k\u007fyڀ?ӸjQo?1zE\u0001\u001d\rL)!p'żb\u000e\t\u001b+V\bQwQn>xR\u0018`Um2x\u0013\u00068\u0007HGF/B߿4ϲ)7iB;Wy\f`D\u0016|%bnׅwRpF2p&7p\t:[th\u0013rhT\u00077AQ*V\u001f}6\u0012Pb\u0006?9'&M\u0016h0ҕSύ\u000e%=rO\u0010|u&WgdS7Wү\u001eaz|$ALbKX\u0015C\u0004\u0010hc@\"`P\u001b\u0014\u0006}\\N:\u0012bE\u007f\u001fL.G\u0018#\u0015\u000fҒ$նE|\u0017lr\u0015\u001e\rl3R\t\n&zէ\u000fP\u0005v\u007fi\tIr|\u000f#]E_D1&\u00042\u00198\u000b&\u001f~:\u007f\u000eцRܤPl$\u0007m .$29\u007fA]\u0015\u0015ȯ72*3UN\u0003e\u0018M@(+\u0001\b\u0012ShtgNοvݽdjXbl;0\u000bvrQ\u001d\u0005\u0002\u007fӓTzoid\rk>\u0010r1ZlRF\u007f\u001d\u001fd%GǼ(Ŀ9-Q=5:\u0006+G\u0015(]\nq4Ӡp\u000fNzu\u0006<c\\o\u0011R\u000e6IPaY-PhػrúFHx\u0011 f\u0017K%3\u000fA\u0005r\\Е[\u000bW\u0004v\t<\r7V\n;Cs\fLF_X\t\n͠\u001aڎG%\u001fgk\f{\u0005c\\QJ/\f\u0011֊?n:\"M\"fW)\t^\u0007$\u001cD\\Sb3XOӘ:ʙ@\b\u0019`l\u0017\u0014.\u0013\u007fte/\u00198߿\u0002;~\u0014dzlV\u000f\u0005\u000fF\u0011%8 \u0017\u000fa>)??&\u0006Ld1s2GSK+a˃U\u0017\u00143I\\Tg!HZ\u0007ՊS]kO\u00128\u0014Gom\u001ap<<&\u001c5BF>i[\u001f\u0001\u000f6n\red\u0015d%4-śT:C\r\u001f\u0015\u000ej//\r\u001fۚ\u0001o\u00131ZQ\u00107\n\u001aGӀJͫ\u000b\f\u000b\n^>;-M1MIp\u0015U|wUAջ\u0016 H-\u0014v1\\\u001e\u000e\u0015\u000b\u000e\u001fH>\n\u0016\u0011+OޑV8'<t\r~\u001a6\u0018<_\u0004C\u0002Y^\b\u0017&\"`)1ˊ\u0014Bsn\t\fsl*n\u0004\fIϠ7n\u001d|Yh)\u0019/]4#Zj:WSN\u0004?\u00014\u0017,˿D\b\u000b/ Qsh7k}\\SČ5\u0004koaHd.\f/\u0006\u0006\u0006:TnGKX]>+<\u000b\u001epX.`p۪r',+\u001a{\r{\u000f\u001b!h^x.f?7_Q\n\u000ewj\u00159]O6#AR\u0006Ne3Q¡.\u000f\u001d\u0011pzz\u0010,R\t!7\u0016-sõlI(_q*}f\u0013&yDfCNϴ)\u001a\u001fhr>0@l\u001aJ:\u007f4\b˒)\r#r\u001eu\u0017\u001bEj\u007fRS+Gε\u0019\u0019M5IqJuGrQ.=paʰ~G3q}R7\u000e\u0012ex}{d\u001d՟y8Wr]$\nWP\u007f8]R%L®;\fSp`0o^PV\"\u00162'pޟ\u0007P1\b\u0005~\u0004\f<iF2\u0013\\(ŪY\u0007\"Z\\D:/|\u0007s\f\u0017zQލ%Q\"y'\f95'|>\u000e Aqߐ\u000bS= u<A8J͡JgD?_@\bpLЌ*`q2\u0003saa 8@2;\u0005>ٚjl\u000e)5\u001e7M\u0007Fdq'N\bǓ#P\u001dmv8R\u0012\u001b\nDx1\u0017`Ixa[͵KW\u0002\u000e_\u001cf\u00021!?)\u000e\u0006\u00046\u0019H\u0006ޟ\ndK\tK\u0011}Lh5\u0014b3Vgɿ|C#P\u0003=>UfJ*,h\u0006<jtH\u0016E\u000fCV\u001f^1vɯ\u0017lQ/\u0019(/Ee\u001bu~8cMZ\u0013<Y8\u001e֙jc1\u007f\u0011\n\u0013\u0014Q\u001b)\nL'g3iё%?LP dYY\ro_\u000f17x\"uΦW]O\"\u0005^uC)YU}RwU%&\u0019*߬uj\u0012\u000eP53VD/AN[[!f\tB={%\u0010<ePU4bL\u0086\u0003(Chw@Z-Għ\u001aۅn{2ڜ\u0010r\u0003\beEYtoѥ\u0004߄\u0015cWǰ4z_\fp>EV|Ďe̎\u001e\u001d.ȿҮL\u0004"}, d2 = {"1n\\:b5\u001e\\\u0017\ty^+j\rDeq,\u000bCo\u0013\u0019", "", "\u0013", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "B`V", "D`[BX", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u0004\u001er\u0012?I\rBg= ^R^>\u0007a;$:\u000b", "2d[2Z(MSx\bxh+|", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u00075w\u001ew[OKgA\u001e%s+K\u000bp,\u0018c'XL[:\\=\u007fG#\u001cL\u001bR:\r\u0012/()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@43", "1n\\:b5\u001e\\\u0017\ty^\u001e\u0001\u00182T{*", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u00075w\u001ew[OKgA\u001e%s+K\u000bp,\u0018a4Q[X\u001eiV\u0002=!g>tS'\u001e\u0001#H wF\u0001\t\u00051I\u007fJ>D|", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u00075w\u001ew[OKgA\u001e%s+K\u000bp,\u0018c'XL[:\\=\u007fG#\u001cL\u001bR:\r\u0012/%\u000bs@H\u001bQ3E\u000b=2j\t\u001b\u000e3yF\u0006G", "1n\\:b5\u001e\\\u0017\ty^", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u0007As\u001a8\u0017 Kl5\u001e\"h`'\u000bl2$],C]JucN{?]{W\u0013N)\u001cZ\u001d2", "", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u0007<i'*\u0017J7t6g~ef9\u0005r\u0002\u0012l\u0004", "1n\\:b5\u001e\\\u0017\ty^\t\u0011\u0018/S\u000f5\u007fI\u0003", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u0007<i'*\u0017J7t6g~ef9\u0005r\u0002\u0012]1MPXu9f\u0002=\u0002!g\u0012W-b", "1n\\:b5\u001dS\u0017\ty^", "0xc2f", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u0016\u00141|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u0007As\u001a8\u0017 Oz4\f$ueB\t9o5{#XH\u00183X[t\u0007}\u000f_\u000eL:b", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&QK\r8\u000245fS\u0007As\u001a8\u0017 Kl5\u001e\"h`'\u0011s9Lv|\u000b3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy", "1n\\:b5-`-]z\\6{\t", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "2dbA\\5:b\u001d\t\u0004", "", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "1n\\:b5-]\u0007\u000e\bb5~", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "1n\\:b50W(\u0002aZ)|\u0010", ":`Q2_", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017wKo\u0015;5\f1V}'\r", "1n\\:b5\u001c`\u0019z\n^\u0017x\u00075e~", "", "1n\\:b5\u001c`\u0019z\n^\u0019|\u0014/a\u000f(z", "\u0014HG\u00127&\u001b=\u0003etL\u0010qh", "\u0014HG\u00127&\f \u0013l^S\f", "\u0014HG\u00127&\u000f\"\u0013l^S\f", "1n\\:b5'S+fvi\b{\u0005:t\u007f5", "", "\u0019", "$", "9dh\u000eW(Ib\u0019\f", "D`[BX\b=O$\u000ezk", "1n\\:b5\u001b]#\u0006", "", "1n\\:b5\"\\(LG", "1n\\:b5.W\"\u000eH+", "1n\\:b5,W\"\u000eH+", "1n\\:b5\u001fW,~y,x", "1n\\:b5,T\u001d\u0012z]yI", "1n\\:b5\"\\(OI", "", "1n\\:b5.W\"\u000eK-", "1n\\:b5,W\"\u000eK-", "1n\\:b5\u001fW,~y/z", "1n\\:b5,T\u001d\u0012z]|K", "1n\\:b5\u001fZ#z\n", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\G\u000b\u0013&2|\u0018K\u0001\u00014U\t/7zk", "1n\\:b5\u001d]){\u0002^", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqZJ\u0011\u0014\u001eGZ\u001bF\u0006/\u0011Xy+Fm#\u0004", "1n\\:b5,b&\u0003\u0004`", "1n\\:b5\u001bg(~\t", "1n\\:b5\u001dc&z\nb6\u0006", "\u001aiPCTuMW!~D=<\n\u0005>i\n1Q", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqZP\u000e\u0013&Ky\u0017\u0012", "1n\\:b5\"\\'\u000evg;", "\u001aiPCTuMW!~DB5\u000b\u0018+n\u000f}", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq_I\u000f&\u0013P~c", "1n\\:b5\u001e[$\u000e\u000f", "1n\\:b5,b&\u000fxm\u0014x\u0014", "1n\\:b5,b&\u000fxm\u0013\u0001\u0017>", "1n\\:b5,b&\u000fxm\u0015\r\u00106", "", "1n\\:b5,b&\u000fxm\u001dx\u0010?e", "", "1n\\:b50`\u0015\n\u0006^9", "\"", "2d[2Z(MS", "Bx_2H9E", "Eha2 9N\\(\u0003\u0003^"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ProtoAdapterKt {
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int FIXED_BOOL_SIZE = 1;

    /* JADX INFO: renamed from: com.squareup.wire.ProtoAdapterKt$delegateEncode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
    public static final class C11871 implements Function1<ProtoWriter, Unit> {
        final /* synthetic */ ProtoAdapter<E> $this_delegateEncode;
        final /* synthetic */ E $value;

        public C11871(ProtoAdapter<E> protoAdapter, E e2) {
            this.$this_delegateEncode = protoAdapter;
            this.$value = e2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ProtoWriter protoWriter) throws IOException {
            invoke2(protoWriter);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ProtoWriter forwardWriter) throws IOException {
            Intrinsics.checkNotNullParameter(forwardWriter, "forwardWriter");
            this.$this_delegateEncode.encode(forwardWriter, this.$value);
        }
    }

    public static final ProtoAdapter<Boolean> commonBool() {
        return new ProtoAdapter<Boolean>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Boolean.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonBool.1
            {
                boolean z2 = false;
                int i2 = 32;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = null;
                String str2 = null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Boolean.valueOf(reader.readVarint32() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Boolean.valueOf(reader.readVarint32() != 0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Boolean bool) throws IOException {
                encode(protoWriter, bool.booleanValue());
            }

            public void encode(ProtoWriter writer, boolean z2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(z2 ? 1 : 0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Boolean bool) {
                encode(reverseProtoWriter, bool.booleanValue());
            }

            public void encode(ReverseProtoWriter writer, boolean z2) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(z2 ? 1 : 0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Boolean bool) {
                return encodedSize(bool.booleanValue());
            }

            public int encodedSize(boolean z2) {
                return 1;
            }

            public Boolean redact(boolean z2) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Boolean redact(Boolean bool) {
                return redact(bool.booleanValue());
            }
        };
    }

    public static final ProtoAdapter<ByteString> commonBytes() {
        return new ProtoAdapter<ByteString>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(ByteString.class), Syntax.PROTO_2, ByteString.EMPTY) { // from class: com.squareup.wire.ProtoAdapterKt.commonBytes.1
            {
                int i2 = 32;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = null;
                String str2 = null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ByteString decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ByteString decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ByteString value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ByteString value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ByteString value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ByteString redact(ByteString value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final <E> ProtoAdapter<List<E>> commonCreatePacked(ProtoAdapter<E> protoAdapter) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        if (protoAdapter.getFieldEncoding$wire_runtime() != FieldEncoding.LENGTH_DELIMITED) {
            return new PackedProtoAdapter(protoAdapter);
        }
        throw new IllegalArgumentException("Unable to pack a length-delimited type.".toString());
    }

    public static final <E> ProtoAdapter<List<E>> commonCreateRepeated(ProtoAdapter<E> protoAdapter) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        return new RepeatedProtoAdapter(protoAdapter);
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, BufferedSource source) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return protoAdapter.decode(new ProtoReader(source));
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, ByteString bytes) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return protoAdapter.decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, byte[] bytes) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return protoAdapter.decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public static final DoubleProtoAdapter commonDouble() {
        return new DoubleProtoAdapter();
    }

    public static final ProtoAdapter<Duration> commonDuration() {
        return new ProtoAdapter<Duration>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Duration.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonDuration.1
            {
                int i2 = 48;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = "type.googleapis.com/google.protobuf.Duration";
                Object obj = null;
                String str2 = null;
            }

            private final int getSameSignNanos(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - 1000000000;
            }

            private final long getSameSignSeconds(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration decode(ProtoReader32 reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                int iBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        Duration durationOfSeconds = Duration.ofSeconds(jLongValue, iIntValue);
                        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                        return durationOfSeconds;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        Duration durationOfSeconds = Duration.ofSeconds(jLongValue, iIntValue);
                        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                        return durationOfSeconds;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Duration value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                long sameSignSeconds = getSameSignSeconds(value);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(sameSignSeconds));
                }
                int sameSignNanos = getSameSignNanos(value);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(sameSignNanos));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Duration value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                int sameSignNanos = getSameSignNanos(value);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(sameSignNanos));
                }
                long sameSignSeconds = getSameSignSeconds(value);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(sameSignSeconds));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Duration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                long sameSignSeconds = getSameSignSeconds(value);
                int iEncodedSizeWithTag = sameSignSeconds != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(sameSignSeconds)) : 0;
                int sameSignNanos = getSameSignNanos(value);
                return sameSignNanos != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(sameSignNanos)) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration redact(Duration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }
        };
    }

    public static final ProtoAdapter<Unit> commonEmpty() {
        return new ProtoAdapter<Unit>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Unit.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonEmpty.1
            {
                int i2 = 48;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = "type.googleapis.com/google.protobuf.Empty";
                Object obj = null;
                String str2 = null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit decode(ProtoReader32 protoReader32) throws IOException {
                decode2(protoReader32);
                return Unit.INSTANCE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit decode(ProtoReader protoReader) throws IOException {
                decode2(protoReader);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
            public void decode2(ProtoReader32 reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                int iBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        return;
                    }
                    reader.readUnknownField(iNextTag);
                }
            }

            /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
            public void decode2(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return;
                    }
                    reader.readUnknownField(iNextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Unit value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Unit value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Unit value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit redact(Unit unit) {
                redact2(unit);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: redact, reason: avoid collision after fix types in other method */
            public void redact2(Unit value) {
                Intrinsics.checkNotNullParameter(value, "value");
            }
        };
    }

    public static final <E> void commonEncode(ProtoAdapter<E> protoAdapter, BufferedSink sink, E e2) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        protoAdapter.encode(reverseProtoWriter, e2);
        reverseProtoWriter.writeTo(sink);
    }

    public static final <E> byte[] commonEncode(ProtoAdapter<E> protoAdapter, E e2) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Buffer buffer = new Buffer();
        protoAdapter.encode(buffer, e2);
        return buffer.readByteArray();
    }

    public static final <E> ByteString commonEncodeByteString(ProtoAdapter<E> protoAdapter, E e2) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Buffer buffer = new Buffer();
        protoAdapter.encode(buffer, e2);
        return buffer.readByteString();
    }

    public static final <E> void commonEncodeWithTag(ProtoAdapter<E> protoAdapter, ProtoWriter writer, int i2, E e2) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (e2 == null) {
            return;
        }
        writer.writeTag(i2, protoAdapter.getFieldEncoding$wire_runtime());
        if (protoAdapter.getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            writer.writeVarint32(protoAdapter.encodedSize(e2));
        }
        protoAdapter.encode(writer, e2);
    }

    public static final <E> void commonEncodeWithTag(ProtoAdapter<E> protoAdapter, ReverseProtoWriter writer, int i2, E e2) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (e2 == null) {
            return;
        }
        if (protoAdapter.getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            int byteCount = writer.getByteCount();
            protoAdapter.encode(writer, e2);
            writer.writeVarint32(writer.getByteCount() - byteCount);
        } else {
            protoAdapter.encode(writer, e2);
        }
        writer.writeTag(i2, protoAdapter.getFieldEncoding$wire_runtime());
    }

    public static final <E> int commonEncodedSizeWithTag(ProtoAdapter<E> protoAdapter, int i2, E e2) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        if (e2 == null) {
            return 0;
        }
        int iEncodedSize = protoAdapter.encodedSize(e2);
        if (protoAdapter.getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += ProtoWriter.Companion.varint32Size$wire_runtime(iEncodedSize);
        }
        return iEncodedSize + ProtoWriter.Companion.tagSize$wire_runtime(i2);
    }

    public static final ProtoAdapter<Integer> commonFixed32() {
        return new ProtoAdapter<Integer>(FieldEncoding.FIXED32, Reflection.getOrCreateKotlinClass(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonFixed32.1
            {
                int i2 = 0;
                int i3 = 32;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = null;
                String str2 = null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readFixed32());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readFixed32());
            }

            public void encode(ProtoWriter writer, int i2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed32(i2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                encode(protoWriter, num.intValue());
            }

            public void encode(ReverseProtoWriter writer, int i2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed32(i2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) throws IOException {
                encode(reverseProtoWriter, num.intValue());
            }

            public int encodedSize(int i2) {
                return 4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            public Integer redact(int i2) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }
        };
    }

    public static final ProtoAdapter<Long> commonFixed64() {
        return new ProtoAdapter<Long>(FieldEncoding.FIXED64, Reflection.getOrCreateKotlinClass(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonFixed64.1
            {
                long j2 = 0L;
                int i2 = 32;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = null;
                String str2 = null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readFixed64());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readFixed64());
            }

            public void encode(ProtoWriter writer, long j2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed64(j2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l2) throws IOException {
                encode(protoWriter, l2.longValue());
            }

            public void encode(ReverseProtoWriter writer, long j2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeFixed64(j2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l2) throws IOException {
                encode(reverseProtoWriter, l2.longValue());
            }

            public int encodedSize(long j2) {
                return 8;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l2) {
                return encodedSize(l2.longValue());
            }

            public Long redact(long j2) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l2) {
                return redact(l2.longValue());
            }
        };
    }

    public static final FloatProtoAdapter commonFloat() {
        return new FloatProtoAdapter();
    }

    public static final ProtoAdapter<Instant> commonInstant() {
        return new ProtoAdapter<Instant>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Instant.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonInstant.1
            {
                int i2 = 48;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = "type.googleapis.com/google.protobuf.Timestamp";
                Object obj = null;
                String str2 = null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Instant decode(ProtoReader32 reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                int iBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        Instant instantOfEpochSecond = Instant.ofEpochSecond(jLongValue, iIntValue);
                        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
                        return instantOfEpochSecond;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Instant decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        Instant instantOfEpochSecond = Instant.ofEpochSecond(jLongValue, iIntValue);
                        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
                        return instantOfEpochSecond;
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Instant value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                long epochSecond = value.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(epochSecond));
                }
                int nano = value.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(nano));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Instant value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                int nano = value.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(nano));
                }
                long epochSecond = value.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(epochSecond));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Instant value) {
                Intrinsics.checkNotNullParameter(value, "value");
                long epochSecond = value.getEpochSecond();
                int iEncodedSizeWithTag = epochSecond != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(epochSecond)) : 0;
                int nano = value.getNano();
                return nano != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(nano)) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Instant redact(Instant value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }
        };
    }

    public static final ProtoAdapter<Integer> commonInt32() {
        return new ProtoAdapter<Integer>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonInt32.1
            {
                int i2 = 0;
                int i3 = 32;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = null;
                String str2 = null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            public void encode(ProtoWriter writer, int i2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeSignedVarint32$wire_runtime(i2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                encode(protoWriter, num.intValue());
            }

            public void encode(ReverseProtoWriter writer, int i2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeSignedVarint32$wire_runtime(i2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) throws IOException {
                encode(reverseProtoWriter, num.intValue());
            }

            public int encodedSize(int i2) {
                return ProtoWriter.Companion.int32Size$wire_runtime(i2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            public Integer redact(int i2) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }
        };
    }

    public static final ProtoAdapter<Long> commonInt64() {
        return new ProtoAdapter<Long>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonInt64.1
            {
                long j2 = 0L;
                int i2 = 32;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = null;
                String str2 = null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            public void encode(ProtoWriter writer, long j2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(j2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l2) throws IOException {
                encode(protoWriter, l2.longValue());
            }

            public void encode(ReverseProtoWriter writer, long j2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(j2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l2) throws IOException {
                encode(reverseProtoWriter, l2.longValue());
            }

            public int encodedSize(long j2) {
                return ProtoWriter.Companion.varint64Size$wire_runtime(j2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l2) {
                return encodedSize(l2.longValue());
            }

            public Long redact(long j2) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l2) {
                return redact(l2.longValue());
            }
        };
    }

    public static final <K, V> ProtoAdapter<Map<K, V>> commonNewMapAdapter(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
        Intrinsics.checkNotNullParameter(keyAdapter, "keyAdapter");
        Intrinsics.checkNotNullParameter(valueAdapter, "valueAdapter");
        return new MapProtoAdapter(keyAdapter, valueAdapter);
    }

    public static final ProtoAdapter<Integer> commonSfixed32() {
        return commonFixed32();
    }

    public static final ProtoAdapter<Long> commonSfixed64() {
        return commonFixed64();
    }

    public static final ProtoAdapter<Integer> commonSint32() {
        return new ProtoAdapter<Integer>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonSint32.1
            {
                int i2 = 0;
                int i3 = 32;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = null;
                String str2 = null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(ProtoWriter.Companion.decodeZigZag32$wire_runtime(reader.readVarint32()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(ProtoWriter.Companion.decodeZigZag32$wire_runtime(reader.readVarint32()));
            }

            public void encode(ProtoWriter writer, int i2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(ProtoWriter.Companion.encodeZigZag32$wire_runtime(i2));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                encode(protoWriter, num.intValue());
            }

            public void encode(ReverseProtoWriter writer, int i2) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(ProtoWriter.Companion.encodeZigZag32$wire_runtime(i2));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            public int encodedSize(int i2) {
                return ProtoWriter.Companion.varint32Size$wire_runtime(ProtoWriter.Companion.encodeZigZag32$wire_runtime(i2));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            public Integer redact(int i2) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }
        };
    }

    public static final ProtoAdapter<Long> commonSint64() {
        return new ProtoAdapter<Long>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonSint64.1
            {
                long j2 = 0L;
                int i2 = 32;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = null;
                String str2 = null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(ProtoWriter.Companion.decodeZigZag64$wire_runtime(reader.readVarint64()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(ProtoWriter.Companion.decodeZigZag64$wire_runtime(reader.readVarint64()));
            }

            public void encode(ProtoWriter writer, long j2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(ProtoWriter.Companion.encodeZigZag64$wire_runtime(j2));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l2) throws IOException {
                encode(protoWriter, l2.longValue());
            }

            public void encode(ReverseProtoWriter writer, long j2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(ProtoWriter.Companion.encodeZigZag64$wire_runtime(j2));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l2) throws IOException {
                encode(reverseProtoWriter, l2.longValue());
            }

            public int encodedSize(long j2) {
                return ProtoWriter.Companion.varint64Size$wire_runtime(ProtoWriter.Companion.encodeZigZag64$wire_runtime(j2));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l2) {
                return encodedSize(l2.longValue());
            }

            public Long redact(long j2) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l2) {
                return redact(l2.longValue());
            }
        };
    }

    public static final ProtoAdapter<String> commonString() {
        return new ProtoAdapter<String>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(String.class), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonString.1
            {
                int i2 = 32;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = null;
                String str2 = "";
                String str3 = null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, String value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeString(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, String value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeString(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return (int) Utf8.size$default(value, 0, 0, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String redact(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new UnsupportedOperationException();
            }
        };
    }

    public static final ProtoAdapter<List<?>> commonStructList() {
        return new ProtoAdapter<List<?>>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Map.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructList.1
            {
                int i2 = 48;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = "type.googleapis.com/google.protobuf.ListValue";
                Object obj = null;
                String str2 = null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<?> decode(ProtoReader32 reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                int iBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        return arrayList;
                    }
                    if (iNextTag != 1) {
                        reader.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<?> decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return arrayList;
                    }
                    if (iNextTag != 1) {
                        reader.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, List<?> list) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (list == null) {
                    return;
                }
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, it.next());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, List<?> list) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (list == null) {
                    return;
                }
                for (int size = list.size() - 1; -1 < size; size--) {
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, list.get(size));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(List<?> list) {
                int iEncodedSizeWithTag = 0;
                if (list == null) {
                    return 0;
                }
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    iEncodedSizeWithTag += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(1, it.next());
                }
                return iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<Object> redact(List<?> list) {
                if (list == null) {
                    return null;
                }
                List<?> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(ProtoAdapter.STRUCT_VALUE.redact(it.next()));
                }
                return arrayList;
            }
        };
    }

    public static final ProtoAdapter<Map<String, ?>> commonStructMap() {
        return new ProtoAdapter<Map<String, ?>>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Map.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructMap.1
            {
                int i2 = 48;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = "type.googleapis.com/google.protobuf.Struct";
                Object obj = null;
                String str2 = null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, ?> decode(ProtoReader32 reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int iBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        return linkedHashMap;
                    }
                    if (iNextTag != 1) {
                        reader.skip();
                    } else {
                        int iBeginMessage2 = reader.beginMessage();
                        String strDecode = null;
                        Object objDecode = null;
                        while (true) {
                            int iNextTag2 = reader.nextTag();
                            if (iNextTag2 == -1) {
                                break;
                            }
                            if (iNextTag2 == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag2 != 2) {
                                reader.readUnknownField(iNextTag2);
                            } else {
                                objDecode = ProtoAdapter.STRUCT_VALUE.decode(reader);
                            }
                        }
                        reader.endMessageAndGetUnknownFields(iBeginMessage2);
                        if (strDecode != null) {
                            linkedHashMap.put(strDecode, objDecode);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, ?> decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return linkedHashMap;
                    }
                    if (iNextTag != 1) {
                        reader.skip();
                    } else {
                        long jBeginMessage2 = reader.beginMessage();
                        String strDecode = null;
                        Object objDecode = null;
                        while (true) {
                            int iNextTag2 = reader.nextTag();
                            if (iNextTag2 == -1) {
                                break;
                            }
                            if (iNextTag2 == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag2 != 2) {
                                reader.readUnknownField(iNextTag2);
                            } else {
                                objDecode = ProtoAdapter.STRUCT_VALUE.decode(reader);
                            }
                        }
                        reader.endMessageAndGetUnknownFields(jBeginMessage2);
                        if (strDecode != null) {
                            linkedHashMap.put(strDecode, objDecode);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Map<String, ?> map) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (map == null) {
                    return;
                }
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, key) + ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(2, value);
                    writer.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                    writer.writeVarint32(iEncodedSizeWithTag);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, key);
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 2, value);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Map<String, ?> map) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (map == null) {
                    return;
                }
                Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
                ArraysKt.reverse(entryArr);
                for (Map.Entry entry : entryArr) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    int byteCount = writer.getByteCount();
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 2, value);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, str);
                    writer.writeVarint32(writer.getByteCount() - byteCount);
                    writer.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Map<String, ?> map) {
                int iTagSize$wire_runtime = 0;
                if (map == null) {
                    return 0;
                }
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, entry.getKey()) + ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(2, entry.getValue());
                    iTagSize$wire_runtime += ProtoWriter.Companion.tagSize$wire_runtime(1) + ProtoWriter.Companion.varint32Size$wire_runtime(iEncodedSizeWithTag) + iEncodedSizeWithTag;
                }
                return iTagSize$wire_runtime;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, Object> redact(Map<String, ?> map) {
                if (map == null) {
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ProtoAdapter.STRUCT_VALUE.redact(entry));
                }
                return linkedHashMap;
            }
        };
    }

    public static final ProtoAdapter commonStructNull() {
        return new ProtoAdapter(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Void.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructNull.1
            {
                int i2 = 48;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = "type.googleapis.com/google.protobuf.NullValue";
                Object obj = null;
                String str2 = null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader32 reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                int varint32 = reader.readVarint32();
                if (varint32 == 0) {
                    return null;
                }
                throw new IOException("expected 0 but was " + varint32);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                int varint32 = reader.readVarint32();
                if (varint32 == 0) {
                    return null;
                }
                throw new IOException("expected 0 but was " + varint32);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Void r3) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Void r3) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter writer, int i2, Void r4) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeTag(i2, getFieldEncoding$wire_runtime());
                encode(writer, r4);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ReverseProtoWriter writer, int i2, Void r4) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                encode(writer, r4);
                writer.writeTag(i2, getFieldEncoding$wire_runtime());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Void r3) {
                return ProtoWriter.Companion.varint32Size$wire_runtime(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int i2, Void r5) {
                return ProtoWriter.Companion.tagSize$wire_runtime(i2) + ProtoWriter.Companion.varint32Size$wire_runtime(encodedSize(r5));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void redact(Void r2) {
                return null;
            }
        };
    }

    public static final ProtoAdapter<Object> commonStructValue() {
        return new ProtoAdapter<Object>(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Object.class), Syntax.PROTO_3) { // from class: com.squareup.wire.ProtoAdapterKt.commonStructValue.1
            {
                int i2 = 48;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = "type.googleapis.com/google.protobuf.Value";
                Object obj = null;
                String str2 = null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Object decode(ProtoReader32 reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                int iBeginMessage = reader.beginMessage();
                Object objDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        return objDecode;
                    }
                    switch (iNextTag) {
                        case 1:
                            objDecode = ProtoAdapter.STRUCT_NULL.decode(reader);
                            break;
                        case 2:
                            objDecode = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 3:
                            objDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            objDecode = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 5:
                            objDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                            break;
                        case 6:
                            objDecode = ProtoAdapter.STRUCT_LIST.decode(reader);
                            break;
                        default:
                            reader.skip();
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Object decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Object objDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return objDecode;
                    }
                    switch (iNextTag) {
                        case 1:
                            objDecode = ProtoAdapter.STRUCT_NULL.decode(reader);
                            break;
                        case 2:
                            objDecode = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 3:
                            objDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            objDecode = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 5:
                            objDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                            break;
                        case 6:
                            objDecode = ProtoAdapter.STRUCT_LIST.decode(reader);
                            break;
                        default:
                            reader.skip();
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Object obj) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (obj == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.STRUCT_MAP;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                    protoAdapter.encodeWithTag(writer, 5, (Map<String, ?>) obj);
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException("unexpected struct value: " + obj);
                    }
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, obj);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Object obj) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (obj == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.STRUCT_MAP;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                    protoAdapter.encodeWithTag(writer, 5, (Map<String, ?>) obj);
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException("unexpected struct value: " + obj);
                    }
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, obj);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter writer, int i2, Object obj) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (obj != null) {
                    super.encodeWithTag(writer, i2, obj);
                    return;
                }
                writer.writeTag(i2, getFieldEncoding$wire_runtime());
                writer.writeVarint32(encodedSize(obj));
                encode(writer, obj);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ReverseProtoWriter writer, int i2, Object obj) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (obj != null) {
                    super.encodeWithTag(writer, i2, obj);
                    return;
                }
                int byteCount = writer.getByteCount();
                encode(writer, obj);
                writer.writeVarint32(writer.getByteCount() - byteCount);
                writer.writeTag(i2, getFieldEncoding$wire_runtime());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Object obj) {
                if (obj == null) {
                    return ProtoAdapter.STRUCT_NULL.encodedSizeWithTag(1, obj);
                }
                if (obj instanceof Number) {
                    return ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(3, obj);
                }
                if (obj instanceof Boolean) {
                    return ProtoAdapter.BOOL.encodedSizeWithTag(4, obj);
                }
                if (obj instanceof Map) {
                    ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.STRUCT_MAP;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                    return protoAdapter.encodedSizeWithTag(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.encodedSizeWithTag(6, obj);
                }
                throw new IllegalArgumentException("unexpected struct value: " + obj);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int i2, Object obj) {
                if (obj != null) {
                    return super.encodedSizeWithTag(i2, obj);
                }
                int iEncodedSize = encodedSize(obj);
                return ProtoWriter.Companion.tagSize$wire_runtime(i2) + ProtoWriter.Companion.varint32Size$wire_runtime(iEncodedSize) + iEncodedSize;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Object redact(Object obj) {
                if (obj == null) {
                    return ProtoAdapter.STRUCT_NULL.redact(obj);
                }
                if (obj instanceof Number) {
                    return obj;
                }
                if (obj instanceof String) {
                    return null;
                }
                if (obj instanceof Boolean) {
                    return obj;
                }
                if (obj instanceof Map) {
                    ProtoAdapter<Map<String, ?>> protoAdapter = ProtoAdapter.STRUCT_MAP;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                    return protoAdapter.redact((Map) obj);
                }
                if (obj instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.redact(obj);
                }
                throw new IllegalArgumentException("unexpected struct value: " + obj);
            }
        };
    }

    public static final <E> String commonToString(E e2) {
        return String.valueOf(e2);
    }

    public static final <E> void commonTryDecode(ProtoAdapter<E> protoAdapter, ProtoReader32 reader, List<E> destination) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (reader.beforePossiblyPackedScalar()) {
            destination.add(protoAdapter.decode(reader));
        }
    }

    public static final <E> void commonTryDecode(ProtoAdapter<E> protoAdapter, ProtoReader reader, List<E> destination) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (reader.beforePossiblyPackedScalar$wire_runtime()) {
            destination.add(protoAdapter.decode(reader));
        }
    }

    public static final ProtoAdapter<Integer> commonUint32() {
        return new ProtoAdapter<Integer>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Integer.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonUint32.1
            {
                int i2 = 0;
                int i3 = 32;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = null;
                String str2 = null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Integer.valueOf(reader.readVarint32());
            }

            public void encode(ProtoWriter writer, int i2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(i2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                encode(protoWriter, num.intValue());
            }

            public void encode(ReverseProtoWriter writer, int i2) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint32(i2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            public int encodedSize(int i2) {
                return ProtoWriter.Companion.varint32Size$wire_runtime(i2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            public Integer redact(int i2) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }
        };
    }

    public static final ProtoAdapter<Long> commonUint64() {
        return new ProtoAdapter<Long>(FieldEncoding.VARINT, Reflection.getOrCreateKotlinClass(Long.TYPE), Syntax.PROTO_2) { // from class: com.squareup.wire.ProtoAdapterKt.commonUint64.1
            {
                long j2 = 0L;
                int i2 = 32;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = null;
                String str2 = null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readVarint64());
            }

            public void encode(ProtoWriter writer, long j2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(j2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l2) throws IOException {
                encode(protoWriter, l2.longValue());
            }

            public void encode(ReverseProtoWriter writer, long j2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeVarint64(j2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l2) throws IOException {
                encode(reverseProtoWriter, l2.longValue());
            }

            public int encodedSize(long j2) {
                return ProtoWriter.Companion.varint64Size$wire_runtime(j2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l2) {
                return encodedSize(l2.longValue());
            }

            public Long redact(long j2) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l2) {
                return redact(l2.longValue());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> ProtoAdapter<?> commonWithLabel(ProtoAdapter<E> protoAdapter, WireField.Label label) {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(label, "label");
        return label.isRepeated() ? label.isPacked() ? protoAdapter.asPacked() : protoAdapter.asRepeated() : protoAdapter;
    }

    public static final <T> ProtoAdapter<T> commonWrapper(final ProtoAdapter<T> delegate, String typeUrl) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
        return new ProtoAdapter<T>(typeUrl, FieldEncoding.LENGTH_DELIMITED, delegate.getType(), Syntax.PROTO_3, delegate.getIdentity()) { // from class: com.squareup.wire.ProtoAdapterKt.commonWrapper.1
            {
                int i2 = 32;
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str = null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T decode(ProtoReader32 reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                T identity = delegate.getIdentity();
                ProtoAdapter<T> protoAdapter = delegate;
                int iBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        return identity;
                    }
                    if (iNextTag == 1) {
                        identity = protoAdapter.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                T identity = delegate.getIdentity();
                ProtoAdapter<T> protoAdapter = delegate;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return identity;
                    }
                    if (iNextTag == 1) {
                        identity = protoAdapter.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, T t2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (t2 == null || Intrinsics.areEqual(t2, delegate.getIdentity())) {
                    return;
                }
                delegate.encodeWithTag(writer, 1, t2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, T t2) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (t2 == null || Intrinsics.areEqual(t2, delegate.getIdentity())) {
                    return;
                }
                delegate.encodeWithTag(writer, 1, t2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(T t2) {
                if (t2 == null || Intrinsics.areEqual(t2, delegate.getIdentity())) {
                    return 0;
                }
                return delegate.encodedSizeWithTag(1, t2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T redact(T t2) {
                if (t2 == null) {
                    return null;
                }
                return delegate.redact(t2);
            }
        };
    }

    public static final <E> void delegateEncode(ProtoAdapter<E> protoAdapter, ReverseProtoWriter writer, E e2) throws IOException {
        Intrinsics.checkNotNullParameter(protoAdapter, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.writeForward$wire_runtime(new C11871(protoAdapter, e2));
    }
}
