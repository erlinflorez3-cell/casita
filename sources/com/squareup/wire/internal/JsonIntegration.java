package com.squareup.wire.internal;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import okio.ByteString;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0006DLc\u0003İI\u00066\u000e6B\u0015\"4\u0012}\u000bnjO0LeN3ZS8-s{:%c$\bCCU ~*\teNo˧vJp\u000bK\u000f\f\u0017\u0001jBI]xc\u001a\u0015VXģg5SڎK8\tv<\u0004.2R8(\u00069 Po8 %nw9R5Ϯt<X\u000f[\bb-\u0014B8\u0001T[\u0018RDM\u0005]pǂS\u0007wHf'\u000e7CqϘJT5\u0015?t,4X7k\u0014UW\u0011\u0011j[u\u0002\u0006\u0016ݘ\th52sp\u0002cNX6\u0013E/]\u0012ur\\ؘ5Yn\u0019?/_cQQ<6(~\n\u001cT\u0004D\u0005mlͶ1\u001at\u0018VF\u0003\u0004k@\u0007\u0001\u000fF\u000e\u007fy6MӛFWڢ=\u001bt\\*R'`O{;\fN+\u000f\u00029_d\u000ef\u0016Ib>uśU@K\\\u0017IgR\u0006\n\u0001d\u0012*:/u\u0016O\u0002\u0017.%<_[g$Aq\bIR\u007f\u001f\u0005\u000fi\u0004y`aX.~\u0018G*O#jFt\u00052h\u0003r\\\u0015[!l\u00074ܱ˙$\\\u0006Wih\u001ejgh imc\u0010%=}_Y\u001dl.]?_AMyc>b\u0003z\"DTb;֚\u0017Fa)r\\V@bXx/\u0010\bTP\u001c\u0013xV\u0002\u001eD,w1\u000b5\u000f\u0003ٿFA\u000b*(zv2\u0017ZC$\tj:s7\u000f\u0001`~\r\u007fxwJ-h0PYUE\u0019,VP\rz|k\u001d\r\u0019\u0018KwLMM\u001b$&]\nC.\u001eIQ5>A3E)ɮ\u0006["}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?ba)Fm\u0018;IR?u=s", "\u0014", "\u000f", "", "\nh]6g\u0005", "u(E", "4qP:X>H`\u001fZyZ7\f\t<", "4qP:X>H`\u001f", "Bx_2", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqjT\f\u0017l", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExnBY~'7k%w<WFk\na{m]J\u0003-3J\u007f)\u00116K1\\P\u0002\u0013", ":hbA4+:^(~\b", "3kT:X5M/\u0018z\u0006m,\n", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", ";`_\u000eW(Ib\u0019\f", "9dh\u0013b9FO(\u000ezk", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?b^*Du\u0012=\\CHA", "D`[BX\b=O$\u000ezk", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b>\u000b\u001f`U{\u001e8\u0004%EdG2;z\u0016wQLJkA'\u0011o+\u001e\u0015m5/\u00014OH];\\_H$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002\rh@d\u0012\b_\u00151sr\f@\rLy\u0013\u0005\u0017", "AsaBV;\u001aR\u0015\n\n^9", "4na:T;MS&ZyZ7\f\t<", "8r^;F;KW\"\u0001V](\b\u0018/r", "uKR<`uL_)z\b^<\bRAi\r(ED\n&\u0017Tx\nC@\nCc\u0007\u0001Az\u001e*\\R;x\na{m]J\u0003-3J\u007f)\u00116K1\\P\u0002\u0013", "8r^;4+:^(~\bl", "", "\u001b", "\u0010", "/cP=g,K", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006c5>h\u0002(7U\u0016<[?=k\u0010\u001d\u0011sp9\u00149", "uKR<`uL_)z\b^<\bRAi\r(ED\n&\u0017Tx\nC@\u0012Eb\r$?m}.[Q7m4y\u0014dlH\u0007p\u00025{#XH\u00183X[t\u0007}\u000f_\u000eL:bH@F \u007f@\u0001/\u00170PK\"l\u000f\u001bk", "8r^;4+:^(~\b", "Ax]AT?", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqiT\n&\u0013ZE", "4hT9W", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006W)5`|\nDW\u001f.7D\u0018o=\u001d\u0019qc\u000f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b>\u000b\u001f`U{\u001e8\u0004%EdG2;z\u0016w;WDz01jO_C\u000f-:Z\u0007#TL^7&dvJ\u0014[^\u0017]+\u001a\u000eUHmOH7&\u0007\u0016VkDhj\rr\u0012>itKXe\u000b`\u001aqR%2MUh{\u0011+Bg*b\u001b5", "8r^;96K[\u0015\u000e\n^9", ">q^Ab\b=O$\u000ezk", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", ";`_\u0018X@#a#\b[h9\u0005\u0005>t\u007f5", "#mb6Z5>R\u007f\t\u0004`\b\u000bq?m|(\t%\u000f! (y\u001bDr4DY\u000b", "#mb6Z5>R\u007f\t\u0004`\b\u000bv>r\u00041}%\u000f! (y\u001bDr4DY\u000b", "\u001an]44:,b&\u0003\u0004`\u0011\u000b\u00138F\n5\u0004<\u0010&\u0017T", "#mb6Z5>R|\b\n::e\u00197b\u007f5`N\u000b wQ|\u00168\u000645f", "#mb6Z5>R|\b\n::j\u0018<i\t*`N\u000b wQ|\u00168\u000645f", "\u0017mc\u000ef\u001aM`\u001d\b|C:\u0007\u0012\u0010o\r0wO\u0010\u0017$", "\u0010xc2F;KW\"\u0001_l6\u0006i9r\b$\u000bO\u0001$", "!sa6a.#a#\b[h9\u0005\u0005>t\u007f5", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class JsonIntegration<F, A> {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\f6B\r.4\u0012}\bl˔9FǏ\u0016N>Tc*=k*3db*qٴ?W ~0\u000b\u0018\\uj\u0007J\t\u000fs\u0013\u0014\u001b\u0011jZI\u001c\r&\"\u001d8ZqU2{om=nyN\u0005N6hLѯ\t\b"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?ba)Fm\u0018;IR?u=\\q|p9tr9R\u007f),ZX5=\\\u007fE\u0010!i\u000e[\u0001", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?b^*Du\u0012=\\CHA", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "u(E", "BnBAe0GU\u0003\fcn4y\t<", "", "D`[BX", "4q^:F;KW\"\u0001", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class ByteStringJsonFormatter implements JsonFormatter<ByteString> {
        public static final ByteStringJsonFormatter INSTANCE = new ByteStringJsonFormatter();

        private ByteStringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public ByteString fromString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return ByteString.Companion.decodeBase64(value);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public String toStringOrNumber(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.base64();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLc\u0003\nI\u00066\r6B\r.4\u0012}\bl˔9FǏ\u0016N>Tc*=k*3db*qٴ?W ~0\u000b\u0018auj\u0007J\t\u000bs\u0013\u0014\u001a\u0011jZN\u001c\rٕ\u0016\u000f@H8MAT\b=ge%:\u0013$J\"fyK\u0015ʆ.P"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?ba)Fm\u0018;IR?u=\\xqp\u0015\u0015Q;[z0I1\\6e3|J\u001c\u000ei\u001dN8b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?b^*Du\u0012=\\CHA", "", "\nh]6g\u0005", "u(E", "4q^:F;KW\"\u0001", "D`[BX", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~=\u0007/7o\u0016;#", "BnBAe0GU\u0003\fcn4y\t<", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class IntAsStringJsonFormatter implements JsonFormatter<Integer> {
        public static final IntAsStringJsonFormatter INSTANCE = new IntAsStringJsonFormatter();

        private IntAsStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Integer fromString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Integer.valueOf(Integer.parseInt(value));
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }

        public String toStringOrNumber(int i2) {
            return String.valueOf(i2);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLc\u0003\u000bI\u00066\f6B\r.4\u0012}\tl˔9FǏ\u0016N>Tc*=k*3db*qٴ?W ~0\u000b\u0018\\uj\u0007J\t\u000fs\u0013\u0014\u001b\u0011jZI\u001c\r&%\u001d8Zom3}sK>xtd\tfFŕ<y\u0013\bʆ.P"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?ba)Fm\u0018;IR?u=\\{rj;bq\u001a]\u0004+PN3:f[SG!\u001aV\u001d]+\u001aZ", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?b^*Du\u0012=\\CHA", "", "\nh]6g\u0005", "u(E", "BnBAe0GU\u0003\fcn4y\t<", "", "D`[BX", "4q^:F;KW\"\u0001", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~@\b)9C", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class LongAsStringJsonFormatter implements JsonFormatter<Long> {
        public static final LongAsStringJsonFormatter INSTANCE = new LongAsStringJsonFormatter();

        private LongAsStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Long fromString(String value) {
            long jLongValueExact;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                jLongValueExact = Long.parseLong(value);
            } catch (Exception unused) {
                jLongValueExact = new BigDecimal(value).longValueExact();
            }
            return Long.valueOf(jLongValueExact);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l2) {
            return toStringOrNumber(l2.longValue());
        }

        public String toStringOrNumber(long j2) {
            return String.valueOf(j2);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\u0010I\u00066\u000f4ɓ~8ܥB}\u0017hz9^D\u0014GnYY*Ƃo}:%i&:QIX2}P\t\u007fRuk\u0007J\t\u000b\n#N$\u0007oDI\u0004x\u000e\u0016\u001d6Zom3\u0014\u0004\u07b2=f"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?ba)Fm\u0018;IR?u=\\\u0003wn=\u0010e\u0011\\\u00010(V[4Xa\u0002=!g", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?b^*Du\u0012=\\CHA", "", "\nh]6g\u0005", "u(E", "BnBAe0GU\u0003\fcn4y\t<", "D`[BX", "4q^:F;KW\"\u0001", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class StringJsonFormatter implements JsonFormatter<String> {
        public static final StringJsonFormatter INSTANCE = new StringJsonFormatter();

        private StringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public String fromString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public String toStringOrNumber(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLc\u0003\nI\u00066\f6B\r)4\u0012}\bnjG<LeN.ZS8şsڔ:Ɯ[:ڎsAe\u001c\u000e\"7O|f(uPZŲG\u0011\f\u0017\u0007lt\\c~u\u0012=2rsM:eokA'\tȥ\t @+\u0001\b\u0013\u000b2*v\u001b'~QR$\u0012^@7N#\u0019[\b2\u00124BvҸp֔kN>ԟ=iH4;\u0003\u0018F%ώ2݁\u0001M\u0015Ͽÿ+\u0019"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?ba)Fm\u0018;IR?u=\\\u0005qo=\tl,MZ0V(\\\u0015lZo=!vh\u0018W\f\u0017\u0012a=3}DDt", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?b^*Du\u0012=\\CHA", "", "\nh]6g\u0005", "u(E", ">nf2ey\u000b", "", ";`g\u0016a;", "4q^:F;KW\"\u0001", "D`[BX", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~=\u0007/7o\u0016;#", "BnBAe0GU\u0003\fcn4y\t<", "", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class UnsignedIntAsNumberJsonFormatter implements JsonFormatter<Integer> {
        public static final UnsignedIntAsNumberJsonFormatter INSTANCE = new UnsignedIntAsNumberJsonFormatter();
        private static final long maxInt = 2147483647L;
        private static final long power32 = 4294967296L;

        private UnsignedIntAsNumberJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Integer fromString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            long j2 = (long) Double.parseDouble(value);
            if (j2 >= maxInt) {
                j2 -= power32;
            }
            return Integer.valueOf((int) j2);
        }

        public Object toStringOrNumber(int i2) {
            return i2 < 0 ? Long.valueOf(((long) i2) + power32) : Integer.valueOf(i2);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLc\u0003\nI\u00066\f6B\r)4\u0012}\u0007njG<LeN.ZS8şsڔ:Ɯ[:ڎsAe\u001c\u000e\"7O|f(uPZŲG\u0011\f\u0017\u0007lt\\c}u\u0012=2rsM9eok@'\tȥ\t @*\u0001\b\u0013\n2*v\u001a'~QQ$\u0012^@7N#\u0019[\b2\u00124BvҸp֔kN>ԟǶaE"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?ba)Fm\u0018;IR?u=\\\u0005qo=\tl,MZ0V(\\\u001ak_vF\u0016vh\u0018W\f\u0017\u0012a=3}DDt", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?b^*Du\u0012=\\CHA", "", "\nh]6g\u0005", "u(E", ">nf2ey\u000b", "", "4q^:F;KW\"\u0001", "D`[BX", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~=\u0007/7o\u0016;#", "BnBAe0GU\u0003\fcn4y\t<", "", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class UnsignedIntAsStringJsonFormatter implements JsonFormatter<Integer> {
        public static final UnsignedIntAsStringJsonFormatter INSTANCE = new UnsignedIntAsStringJsonFormatter();
        private static final long power32 = 4294967296L;

        private UnsignedIntAsStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Integer fromString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Integer.valueOf((int) Long.parseLong(value));
        }

        public Object toStringOrNumber(int i2) {
            return i2 < 0 ? String.valueOf(((long) i2) + power32) : String.valueOf(i2);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLc\u0003\u000bI\u00066\f6B\u0015\"4\u0012}\nnjG<LeN.ZS8şsڔ:Ɯ[:ڎsAe\u001c\u000e\"7O|f(uPZŲG\u0011\f\u0017\u0007lt\\c\u0001u\u0012=2rsM<eokC'\tȥ\t @-\u0001\b\u0013\r2*v\u001d'~QT$\u0012^@7N#\u0019[\b2\u00124BvҸ ֔kN>ԟ=sH4;\u000b\bHv)u/+Q;J+\u070e\u000fțe 3@E<տ)a"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?ba)Fm\u0018;IR?u=\\\u0005qo=\tl,M]1PN*:Ebz:\u0014\u001f?\u001cX4m\u000ffI }S7,]", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?b^*Du\u0012=\\CHA", "", "\nh]6g\u0005", "u(E", ">nf2e|\r", "\u001aiPCTuFO(\u0002D;0~l8t\u007f*{MV", ";`g\u0019b5@", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "\u001aiPCTuFO(\u0002D;0~l8t\u007f*{MV", "4q^:F;KW\"\u0001", "D`[BX", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~@\b)9C", "BnBAe0GU\u0003\fcn4y\t<", "", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class UnsignedLongAsNumberJsonFormatter implements JsonFormatter<Long> {
        public static final UnsignedLongAsNumberJsonFormatter INSTANCE = new UnsignedLongAsNumberJsonFormatter();
        private static final BigInteger power64 = new BigInteger("18446744073709551616");
        private static final BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);

        private UnsignedLongAsNumberJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Long fromString(String value) {
            BigInteger bigInteger;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                bigInteger = new BigInteger(value);
            } catch (Exception unused) {
                bigInteger = new BigDecimal(value).toBigInteger();
            }
            return Long.valueOf(bigInteger.compareTo(maxLong) > 0 ? bigInteger.subtract(power64).longValue() : bigInteger.longValue());
        }

        public Object toStringOrNumber(long j2) {
            return j2 < 0 ? power64.add(BigInteger.valueOf(j2)) : Long.valueOf(j2);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l2) {
            return toStringOrNumber(l2.longValue());
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLc\u0003\u000bI\u00066\f6B\r.4\u0012}\tl˔9FǏ\u0016N>Tc*=k*3db*qٴ?W ~0\u000b\u0018\\uj\u0007J\t\u000fs\u0013\u0014\u001b\u0011jZI\u001c\r&%\u001d8Zom3}sK>xtd\tfFŕ<y\u0013\bʆ.P"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?ba)Fm\u0018;IR?u=\\\u0005qo=\tl,M]1PN*:Ja\u007fA\u001d\u0014?\u001cX4m\u000ffI }S7,]", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006[3?b^*Du\u0012=\\CHA", "", "\nh]6g\u0005", "u(E", "BnBAe0GU\u0003\fcn4y\t<", "", "D`[BX", "4q^:F;KW\"\u0001", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~@\b)9C", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class UnsignedLongAsStringJsonFormatter implements JsonFormatter<Long> {
        public static final UnsignedLongAsStringJsonFormatter INSTANCE = new UnsignedLongAsStringJsonFormatter();

        private UnsignedLongAsStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Long fromString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return UnsignedLongAsNumberJsonFormatter.INSTANCE.fromString(value);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l2) {
            return toStringOrNumber(l2.longValue());
        }

        public String toStringOrNumber(long j2) {
            return UnsignedLongAsNumberJsonFormatter.INSTANCE.toStringOrNumber(j2).toString();
        }
    }

    private final <M, B> A jsonAdapter(F f2, Syntax syntax, FieldOrOneOfBinding<M, B> fieldOrOneOfBinding) {
        A aFrameworkAdapter;
        if (fieldOrOneOfBinding.getSingleAdapter().isStruct$wire_runtime()) {
            return structAdapter(f2);
        }
        JsonFormatter<?> jsonFormatter = jsonFormatter(syntax, fieldOrOneOfBinding.getSingleAdapter());
        if (jsonFormatter != null) {
            aFrameworkAdapter = formatterAdapter(jsonFormatter);
        } else {
            KClass<?> type = fieldOrOneOfBinding.getSingleAdapter().getType();
            Class javaObjectType = type != null ? JvmClassMappingKt.getJavaObjectType(type) : null;
            Intrinsics.checkNotNull(javaObjectType, "null cannot be cast to non-null type java.lang.reflect.Type");
            aFrameworkAdapter = frameworkAdapter(f2, javaObjectType);
        }
        return fieldOrOneOfBinding.getLabel().isRepeated() ? listAdapter(aFrameworkAdapter) : fieldOrOneOfBinding.isMap() ? mapAdapter(f2, mapKeyJsonFormatter(fieldOrOneOfBinding.getKeyAdapter()), aFrameworkAdapter) : aFrameworkAdapter;
    }

    private final JsonFormatter<?> jsonFormatter(Syntax syntax, ProtoAdapter<?> protoAdapter) {
        if (Intrinsics.areEqual(protoAdapter, ProtoAdapter.BYTES) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.BYTES_VALUE)) {
            return ByteStringJsonFormatter.INSTANCE;
        }
        if (Intrinsics.areEqual(protoAdapter, ProtoAdapter.DURATION)) {
            return DurationJsonFormatter.INSTANCE;
        }
        if (Intrinsics.areEqual(protoAdapter, ProtoAdapter.INSTANT)) {
            return InstantJsonFormatter.INSTANCE;
        }
        if (protoAdapter instanceof EnumAdapter) {
            return new EnumJsonFormatter((EnumAdapter) protoAdapter);
        }
        if (syntax == Syntax.PROTO_2) {
            if (Intrinsics.areEqual(protoAdapter, ProtoAdapter.UINT64) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.UINT64_VALUE)) {
                return UnsignedLongAsNumberJsonFormatter.INSTANCE;
            }
            return null;
        }
        if (Intrinsics.areEqual(protoAdapter, ProtoAdapter.UINT32) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.FIXED32) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.UINT32_VALUE)) {
            return UnsignedIntAsNumberJsonFormatter.INSTANCE;
        }
        if (Intrinsics.areEqual(protoAdapter, ProtoAdapter.INT64) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.SFIXED64) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.SINT64) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.INT64_VALUE)) {
            return LongAsStringJsonFormatter.INSTANCE;
        }
        if (Intrinsics.areEqual(protoAdapter, ProtoAdapter.FIXED64) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.UINT64) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.UINT64_VALUE)) {
            return UnsignedLongAsStringJsonFormatter.INSTANCE;
        }
        return null;
    }

    private final JsonFormatter<?> mapKeyJsonFormatter(ProtoAdapter<?> protoAdapter) {
        if (Intrinsics.areEqual(protoAdapter, ProtoAdapter.STRING)) {
            return StringJsonFormatter.INSTANCE;
        }
        if (Intrinsics.areEqual(protoAdapter, ProtoAdapter.INT32) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.SINT32) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.SFIXED32)) {
            return IntAsStringJsonFormatter.INSTANCE;
        }
        if (Intrinsics.areEqual(protoAdapter, ProtoAdapter.FIXED32) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.UINT32)) {
            return UnsignedIntAsStringJsonFormatter.INSTANCE;
        }
        if (Intrinsics.areEqual(protoAdapter, ProtoAdapter.INT64) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.SFIXED64) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.SINT64)) {
            return LongAsStringJsonFormatter.INSTANCE;
        }
        if (Intrinsics.areEqual(protoAdapter, ProtoAdapter.FIXED64) || Intrinsics.areEqual(protoAdapter, ProtoAdapter.UINT64)) {
            return UnsignedLongAsStringJsonFormatter.INSTANCE;
        }
        throw new IllegalStateException(("Unexpected map key type: " + protoAdapter.getType()).toString());
    }

    public abstract A formatterAdapter(JsonFormatter<?> jsonFormatter);

    public abstract A frameworkAdapter(F f2, Type type);

    public final <M, B> List<A> jsonAdapters(RuntimeMessageAdapter<M, B> adapter, F f2) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr = (FieldOrOneOfBinding[]) adapter.getFields().values().toArray(new FieldOrOneOfBinding[0]);
        ArrayList arrayList = new ArrayList(fieldOrOneOfBindingArr.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : fieldOrOneOfBindingArr) {
            arrayList.add(jsonAdapter(f2, adapter.getSyntax(), fieldOrOneOfBinding));
        }
        return arrayList;
    }

    public abstract A listAdapter(A a2);

    public abstract A mapAdapter(F f2, JsonFormatter<?> jsonFormatter, A a2);

    public abstract A structAdapter(F f2);
}
