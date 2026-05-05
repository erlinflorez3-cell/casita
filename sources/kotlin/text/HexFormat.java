package kotlin.text;

import cz.msebera.android.httpclient.message.TokenParser;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007|jA0JkP.`_2\u000fq~:)qҕ\u0010TkUH|Z\u000b^^xy/g`ŏS\u0013\u0014\u0016\u0011jZJe|k\u0014'2prO7[sU9\u000fyȥ\t @(\u0001\u007f\u0013\u000e2*v\u001e=\u000f\u0014Z\u001a\u0014H@\u001f=ň\u0011S\r܅*\bD'\u000f&-v\\:`l\f?ǥ'\tqĩf)e9\u000bW]Ub'%v\u0010\u001fҋD==Ֆ=U\t\u0012`gϓ\u0007R"}, d2 = {"\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010l", "", "Co_2e\n:a\u0019", "", "0xc2f", "\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010Us[~\u000eJY%H:\b-?i%\u0004", "<t\\/X9", "\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010U\u007fWw\u000b<\u0004\b5l^*Du\u0012=#", "uY;8b;EW\"H\n^?\fR\u0012e\u0013\t\u0006M\t\u0013&\u0006L\"Kv3\u0018Y\u0011\u0001Az\u001e*\\\u0019\"q>-\u001clj\u0003\u0016c?]@\nG_/6iZnLRzj\u0016K+\u001agYT\u0005xQ?\u001b\u0017\u0002\rr", "5dc\u000fl;>a", "u(;8b;EW\"H\n^?\fR\u0012e\u0013\t\u0006M\t\u0013&\u0006L\"Kv3\u0018Y\u0011\u0001Az\u001e*\\\u0019", "5dc\u001bh4;S&", "u(;8b;EW\"H\n^?\fR\u0012e\u0013\t\u0006M\t\u0013&\u0006X\u001eDs%B<}3\u0018w#6IR\u0011", "5dc\"c7>`vz\t^", "u(I", "BnBAe0GU", "", "\u0010tX9W,K", "\u0010xc2f\u000f>fy\t\bf(\f", "\u0011n\\=T5B]\"", "\u001ct\\/X9!S,_\u0005k4x\u0018", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class HexFormat {
    public static final Companion Companion = new Companion(null);
    private static final HexFormat Default = new HexFormat(false, BytesHexFormat.Companion.getDefault$kotlin_stdlib(), NumberHexFormat.Companion.getDefault$kotlin_stdlib());
    private static final HexFormat UpperCase = new HexFormat(true, BytesHexFormat.Companion.getDefault$kotlin_stdlib(), NumberHexFormat.Companion.getDefault$kotlin_stdlib());
    private final BytesHexFormat bytes;
    private final NumberHexFormat number;
    private final boolean upperCase;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007loA0RnP.XV2\u000f\u0002{<$i$yّCU0}*\teNo˧\u0005Ϻ\u000b\u000bq\u000eF\u001b~i߽MU\u0007]Z\u0015@S\b?a_6<\u0002\u0004\u0003;\u001d `5h\u000f\u0013\u00152;X\u0012\u0007zqM\u001c\u0014@@\u001fM\u0001\"̂\t\u001a\u0018\u001c\u0005İ\u0007ʟ[ɡ\u0017YVtu:]63~Pb?p@~]\rtX7\u000f\u0007aL>nL߱\u0019%Y\u0019MҀaУ\u0002ӊBK\u0013i?)AH\"Y\rݜ\fЏ\u0019+WՕ.\u00014_\u001dSv\u000bU/&ҭWח\u0012(\u007f\u07beL\u001cJ\t&\u0006UJdqբj\f&5zxaG!\u0011lJ\u0018z\u0010:Miő7/Q\u001dlZoEifE\u0007\u001d\rL/W͠-ƟX\u001ahٽ3V}^?_`?N]\u0018iƠm\txe\bé4^FĲ3\u0013"}, d2 = {"\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010UsWs\u0015;v2\u000b", "", "u(E", "-ahAX:", "\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010Us[~\u000eJY%H:\b-?i%l*S?r3\u001e\">", "-md:U,K", "\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010U\u007fWw\u000b<\u0004\b5l^*Du\u0012=\f Ko;\u001d\u0015u7", "0xc2f", "5dc\u000fl;>a", "u(;8b;EW\"H\n^?\fR\u0012e\u0013\t\u0006M\t\u0013&\u0006L\"Kv3\u0018Y\u0011\u0001Az\u001e*\\\u0002\u0018{8%\u0014hn\u000f", "<t\\/X9", "5dc\u001bh4;S&", "u(;8b;EW\"H\n^?\fR\u0012e\u0013\t\u0006M\t\u0013&\u0006X\u001eDs%B<}3\u0018w#6IRyHD\"\u001cgaF\\", "Co_2e\n:a\u0019", "", "5dc\"c7>`vz\t^", "u(I", "Adc\"c7>`vz\t^", "uY\u0018#", "0tX9W", "\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010l", "", "0tX9W,K/\u0017\u000e~h5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private BytesHexFormat.Builder _bytes;
        private NumberHexFormat.Builder _number;
        private boolean upperCase = HexFormat.Companion.getDefault().getUpperCase();

        private final void bytes(Function1<? super BytesHexFormat.Builder, Unit> builderAction) {
            Intrinsics.checkNotNullParameter(builderAction, "builderAction");
            builderAction.invoke(getBytes());
        }

        private final void number(Function1<? super NumberHexFormat.Builder, Unit> builderAction) {
            Intrinsics.checkNotNullParameter(builderAction, "builderAction");
            builderAction.invoke(getNumber());
        }

        public final HexFormat build() {
            BytesHexFormat default$kotlin_stdlib;
            NumberHexFormat default$kotlin_stdlib2;
            boolean z2 = this.upperCase;
            BytesHexFormat.Builder builder = this._bytes;
            if (builder == null || (default$kotlin_stdlib = builder.build$kotlin_stdlib()) == null) {
                default$kotlin_stdlib = BytesHexFormat.Companion.getDefault$kotlin_stdlib();
            }
            NumberHexFormat.Builder builder2 = this._number;
            if (builder2 == null || (default$kotlin_stdlib2 = builder2.build$kotlin_stdlib()) == null) {
                default$kotlin_stdlib2 = NumberHexFormat.Companion.getDefault$kotlin_stdlib();
            }
            return new HexFormat(z2, default$kotlin_stdlib, default$kotlin_stdlib2);
        }

        public final BytesHexFormat.Builder getBytes() {
            if (this._bytes == null) {
                this._bytes = new BytesHexFormat.Builder();
            }
            BytesHexFormat.Builder builder = this._bytes;
            Intrinsics.checkNotNull(builder);
            return builder;
        }

        public final NumberHexFormat.Builder getNumber() {
            if (this._number == null) {
                this._number = new NumberHexFormat.Builder();
            }
            NumberHexFormat.Builder builder = this._number;
            Intrinsics.checkNotNull(builder);
            return builder;
        }

        public final boolean getUpperCase() {
            return this.upperCase;
        }

        public final void setUpperCase(boolean z2) {
            this.upperCase = z2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u001e\u007f\u0007luA0ZeP.hS2\u000fq\u0001Jřy=\"CiTR}:\"\u0010\u0004m˧~Nh\u000b[\u000f4\u0017\tn:Kmx\f\u0013\u001f6PrW3{sM=nyN\u0005N62<\b\u000b\u0019\u001aXL z\tJc\f@4Ϯt:`\u0015\u0016((#\u001eBN\u0013\u0007\\FafPzqR3Q\u0015RB-:\u00104\u000bb%F\u0003+SǸҐ\"+FM}\u001b3j\u001b\u0007\u0001_\u0006\u0017\u0010\u0001K\u000b\u0001'U/ʁw]>ݙ\u0018\u0016\u001b4]\u0017.\u00024a\u001dQ\u000f\u0010ˏ/Uk֟h\u0010.\u0003\t\u0006]K\u0012\u0015\u001e'v2ǉ\u001el\u0010ԄKvx_NZRmP\u0002\u0013ad\u0018Ӿ\u000493ݍ3hWnI'\u001fF\n\u0005%\u001eQ\u0002ͼ%a\\וx\u0017!c\u0006_\u0002`N@`N8]ǀq\nxç\u001a,\n@U\n¤\u007f+"}, d2 = {"\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010Us[~\u000eJY%H:\b-?i%\u0004", "", "0xc2f\u0017>`\u007f\u0003\u0004^", "", "0xc2f\u0017>`z\f\u0005n7", "5q^Bc\u001a>^\u0015\fvm6\n", "", "0xc2F,IO&z\nh9", "0xc2C9>T\u001d\u0012", "0xc2F<?T\u001d\u0012", "uH8\u0019](OOb\u0006vg.Fv>r\u00041}\u0016g\u001c\u0013XkWCr.7#k/Dq\u001f0#*@gE\u001a^o]B\t-\u001a]\u0004+PN$\u0013aN\u00049]\u0019V\u0017Ptz\u0014fE-p\u001az\u0010", "5dc\u000fl;>>&~{b?", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u000fl;>A\u0019\nvk(\f\u0013<", "5dc\u000fl;>A)\u007f{b?", "5dc\u000fl;>a\u0004~\b@9\u0007\u0019:", "u(8", "5dc\u000fl;>a\u0004~\bE0\u0006\t", "5dc\u0014e6N^\u0007~\u0006Z9x\u00189r", "/o_2a+(^(\u0003\u0005g:k\u0013", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "Aa", "7mS2a;", "/o_2a+(^(\u0003\u0005g:k\u0013mk\n7\u0003D\n\u0011%Vn\u0015@s", "BnBAe0GU", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class BytesHexFormat {
        public static final Companion Companion = new Companion(null);
        private static final BytesHexFormat Default = new BytesHexFormat(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");
        private final String bytePrefix;
        private final String byteSeparator;
        private final String byteSuffix;
        private final int bytesPerGroup;
        private final int bytesPerLine;
        private final String groupSeparator;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005+4\u0012\u0006\rnj?:Le^.ZS0\u000f\u0002ڔd$\n#2HA٥۟\u0002\"\u0017O\u0017ru\tbZ9^UإȀ|j2e&\u001bk\u0015'2pqo7[pU9\u000fvtIv\u074c.أ}\u0011\tɝBJ\u0016z\tHk\u000e\u00186Nw\u000bt\u001bU\u001d\u001a@\bn$\u000f\u001ftg|8\u000714Ƅ;ݭ\u0007uJ÷?a6\u0006[\u0012fV-\u0017\u0005hnMNBM\u0015SU3\u000b`\\W\u0003ms{I?Ѯ3ȅM\u007f_̬p\u0002\u001a!9T-_x3j\f\"\u0003\u001a6CO\u0012Y\u0001\u00126x\u0013{;JBR\\ΰTͶ1&nڜ&5z\u0003aQp\u0004dT\u000e\u000e2X%9\u00183YGKj_bS\u0019|E:Ic̛/ъr-c٪&b\u001b0b\tq3WVK[\u001f\"gT\u0006\u0004\u001fdXÖ\u0010ΥK\f7Ʌ)0\u001d=E`Y%'\u0005\u0010Oלk\u0014"}, d2 = {"\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010Us[~\u000eJY%H:\b-?i%l*S?r3\u001e\">", "", "u(E", "D`[BX", "", "0xc2C9>T\u001d\u0012", "5dc\u000fl;>>&~{b?", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fl;>>&~{b?", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0xc2F,IO&z\nh9", "5dc\u000fl;>A\u0019\nvk(\f\u0013<", "Adc\u000fl;>A\u0019\nvk(\f\u0013<", "0xc2F<?T\u001d\u0012", "5dc\u000fl;>A)\u007f{b?", "Adc\u000fl;>A)\u007f{b?", "", "0xc2f\u0017>`z\f\u0005n7", "5dc\u000fl;>a\u0004~\b@9\u0007\u0019:", "u(8", "Adc\u000fl;>a\u0004~\b@9\u0007\u0019:", "uH\u0018#", "0xc2f\u0017>`\u007f\u0003\u0004^", "5dc\u000fl;>a\u0004~\bE0\u0006\t", "Adc\u000fl;>a\u0004~\bE0\u0006\t", "5q^Bc\u001a>^\u0015\fvm6\n", "5dc\u0014e6N^\u0007~\u0006Z9x\u00189r", "Adc\u0014e6N^\u0007~\u0006Z9x\u00189r", "0tX9W", "\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010Us[~\u000eJY%H:\b-?i%\u0004", "0tX9WjD](\u0006~g&\u000b\u0018.l\u0004%", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public static final class Builder {
            private int bytesPerLine = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getBytesPerLine();
            private int bytesPerGroup = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getBytesPerGroup();
            private String groupSeparator = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getGroupSeparator();
            private String byteSeparator = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getByteSeparator();
            private String bytePrefix = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getBytePrefix();
            private String byteSuffix = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getByteSuffix();

            public final BytesHexFormat build$kotlin_stdlib() {
                return new BytesHexFormat(this.bytesPerLine, this.bytesPerGroup, this.groupSeparator, this.byteSeparator, this.bytePrefix, this.byteSuffix);
            }

            public final String getBytePrefix() {
                return this.bytePrefix;
            }

            public final String getByteSeparator() {
                return this.byteSeparator;
            }

            public final String getByteSuffix() {
                return this.byteSuffix;
            }

            public final int getBytesPerGroup() {
                return this.bytesPerGroup;
            }

            public final int getBytesPerLine() {
                return this.bytesPerLine;
            }

            public final String getGroupSeparator() {
                return this.groupSeparator;
            }

            public final void setBytePrefix(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                String str = value;
                if (StringsKt.contains$default((CharSequence) str, '\n', false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, TokenParser.CR, false, 2, (Object) null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + value);
                }
                this.bytePrefix = value;
            }

            public final void setByteSeparator(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                String str = value;
                if (StringsKt.contains$default((CharSequence) str, '\n', false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, TokenParser.CR, false, 2, (Object) null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + value);
                }
                this.byteSeparator = value;
            }

            public final void setByteSuffix(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                String str = value;
                if (StringsKt.contains$default((CharSequence) str, '\n', false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, TokenParser.CR, false, 2, (Object) null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + value);
                }
                this.byteSuffix = value;
            }

            public final void setBytesPerGroup(int i2) {
                if (i2 <= 0) {
                    throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + i2);
                }
                this.bytesPerGroup = i2;
            }

            public final void setBytesPerLine(int i2) {
                if (i2 <= 0) {
                    throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + i2);
                }
                this.bytesPerLine = i2;
            }

            public final void setGroupSeparator(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.groupSeparator = str;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00056i%\nCiWpԃ$\u07beSTo˧\u0007L`\u000eQ\u0013َ\u001a}"}, d2 = {"\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010Us[~\u000eJY%H:\b-?i%l+MCv0'\u0019rj\u000f", "", "u(E", "\u0012dU.h3M", "\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010Us[~\u000eJY%H:\b-?i%\u0004", "5dc\u0011X-:c \u000e9d6\f\u00103ny6\u000b?\b\u001b\u0014", "u(;8b;EW\"H\n^?\fR\u0012e\u0013\t\u0006M\t\u0013&\u0006L\"Kv3\u0018Y\u0011\u0001Az\u001e*\\\u0019", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BytesHexFormat getDefault$kotlin_stdlib() {
                return BytesHexFormat.Default;
            }
        }

        public BytesHexFormat(int i2, int i3, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            Intrinsics.checkNotNullParameter(groupSeparator, "groupSeparator");
            Intrinsics.checkNotNullParameter(byteSeparator, "byteSeparator");
            Intrinsics.checkNotNullParameter(bytePrefix, "bytePrefix");
            Intrinsics.checkNotNullParameter(byteSuffix, "byteSuffix");
            this.bytesPerLine = i2;
            this.bytesPerGroup = i3;
            this.groupSeparator = groupSeparator;
            this.byteSeparator = byteSeparator;
            this.bytePrefix = bytePrefix;
            this.byteSuffix = byteSuffix;
        }

        public final StringBuilder appendOptionsTo$kotlin_stdlib(StringBuilder sb, String indent) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            StringBuilder sbAppend = sb.append(indent).append("bytesPerLine = ").append(this.bytesPerLine);
            Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
            StringBuilder sbAppend2 = sbAppend.append(",");
            Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
            Intrinsics.checkNotNullExpressionValue(sbAppend2.append('\n'), "append(...)");
            StringBuilder sbAppend3 = sb.append(indent).append("bytesPerGroup = ").append(this.bytesPerGroup);
            Intrinsics.checkNotNullExpressionValue(sbAppend3, "append(...)");
            StringBuilder sbAppend4 = sbAppend3.append(",");
            Intrinsics.checkNotNullExpressionValue(sbAppend4, "append(...)");
            Intrinsics.checkNotNullExpressionValue(sbAppend4.append('\n'), "append(...)");
            StringBuilder sbAppend5 = sb.append(indent).append("groupSeparator = \"").append(this.groupSeparator);
            Intrinsics.checkNotNullExpressionValue(sbAppend5, "append(...)");
            StringBuilder sbAppend6 = sbAppend5.append("\",");
            Intrinsics.checkNotNullExpressionValue(sbAppend6, "append(...)");
            Intrinsics.checkNotNullExpressionValue(sbAppend6.append('\n'), "append(...)");
            StringBuilder sbAppend7 = sb.append(indent).append("byteSeparator = \"").append(this.byteSeparator);
            Intrinsics.checkNotNullExpressionValue(sbAppend7, "append(...)");
            StringBuilder sbAppend8 = sbAppend7.append("\",");
            Intrinsics.checkNotNullExpressionValue(sbAppend8, "append(...)");
            Intrinsics.checkNotNullExpressionValue(sbAppend8.append('\n'), "append(...)");
            StringBuilder sbAppend9 = sb.append(indent).append("bytePrefix = \"").append(this.bytePrefix);
            Intrinsics.checkNotNullExpressionValue(sbAppend9, "append(...)");
            StringBuilder sbAppend10 = sbAppend9.append("\",");
            Intrinsics.checkNotNullExpressionValue(sbAppend10, "append(...)");
            Intrinsics.checkNotNullExpressionValue(sbAppend10.append('\n'), "append(...)");
            sb.append(indent).append("byteSuffix = \"").append(this.byteSuffix).append("\"");
            return sb;
        }

        public final String getBytePrefix() {
            return this.bytePrefix;
        }

        public final String getByteSeparator() {
            return this.byteSeparator;
        }

        public final String getByteSuffix() {
            return this.byteSuffix;
        }

        public final int getBytesPerGroup() {
            return this.bytesPerGroup;
        }

        public final int getBytesPerLine() {
            return this.bytesPerLine;
        }

        public final String getGroupSeparator() {
            return this.groupSeparator;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            StringBuilder sbAppend = sb.append("BytesHexFormat(");
            Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
            Intrinsics.checkNotNullExpressionValue(sbAppend.append('\n'), "append(...)");
            Intrinsics.checkNotNullExpressionValue(appendOptionsTo$kotlin_stdlib(sb, "    ").append('\n'), "append(...)");
            sb.append(")");
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^[R\u001d\u000b.x\u0019.֒Y~e܈'4HuM7ޢsD"}, d2 = {"\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010UtQw\u00198\u007f)?bS", "", "u(E", "\u0012dU.h3M", "\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010l", "5dc\u0011X-:c \u000e", "u(;8b;EW\"H\n^?\fR\u0012e\u0013\t\u0006M\t\u0013&\u001d", "#o_2e\n:a\u0019", "5dc\"c7>`vz\t^", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HexFormat getDefault() {
            return HexFormat.Default;
        }

        public final HexFormat getUpperCase() {
            return HexFormat.UpperCase;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":\u001b\u007f\u0007loA0ZeP.hS2\u000fq\u0001Jřy7\"CiTR}4\u001c\u0010km˧~Nh\u000b[\u000f4\u0017\tn:Kmx\f\u0013\u001f6PrW3{sެ=`\u0003;MC@-P}3\r\u0003*'\u001d'\u0003QY$\u0016^LY:1\u001a}\t(!\u001e>N\u0002dձʄR6N|&@=4\u001bipOms\u0001\f[\r^TU\u000ețe$3¨O7\u001b+a\nWaiB\u001b? Aݾl-/Ǣau]>f\td$9Q%]!'ػ\tWhϯ?-UmYW˔,\f"}, d2 = {"\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010U\u007fWw\u000b<\u0004\b5l^*Du\u0012=#", "", ">qT3\\?", "", "AtU3\\?", "@d\\<i,%S\u0015}~g.q\t<o\u000e", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#\u00114", "5dc\u001de,?W,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001fX4Hd\u0019ezZ+\u0001\u00121Z\u007f5\u0006N", "u(I", "5dc h-?W,", "/o_2a+(^(\u0003\u0005g:k\u0013", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "Aa", "7mS2a;", "/o_2a+(^(\u0003\u0005g:k\u0013mk\n7\u0003D\n\u0011%Vn\u0015@s", "BnBAe0GU", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class NumberHexFormat {
        public static final Companion Companion = new Companion(null);
        private static final NumberHexFormat Default = new NumberHexFormat("", "", false);
        private final String prefix;
        private final boolean removeLeadingZeros;
        private final String suffix;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005&4\u0012\u0006\u0010nj?6Le^.ZS0\u000f\u0002ڔd$\n#2HA٥۟\u0002\"\u0017O\u0017ru\u007fbZ9UUإȀ|j2\\&\u001bk\u0015'2pqo7[pU9\u000fvtIv\u074c.أ}\u0011\tɝBJ\u0016z\tHk\u000e\u00186Nw\u000bj\u001bU\u001d\u001a@\u000f\u0015į\rɉ`sVȤ`ncD=.#kHZ5l\u0001\u001f[\u001b^TU\u000f'e,,X7c\u0017c\u0018Yޞ^ÜC\u000fGмU\u0007n650iu]Ff\u0007Е\u0019?"}, d2 = {"\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010U\u007fWw\u000b<\u0004\b5l^*Du\u0012=\f Ko;\u001d\u0015u7", "", "u(E", "D`[BX", "", ">qT3\\?", "5dc\u001de,?W,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001de,?W,", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "@d\\<i,%S\u0015}~g.q\t<o\u000e", "", "5dc\u001fX4Hd\u0019ezZ+\u0001\u00121Z\u007f5\u0006N", "u(I", "Adc\u001fX4Hd\u0019ezZ+\u0001\u00121Z\u007f5\u0006N", "uY\u0018#", "AtU3\\?", "5dc h-?W,", "Adc h-?W,", "0tX9W", "\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010U\u007fWw\u000b<\u0004\b5l^*Du\u0012=#", "0tX9WjD](\u0006~g&\u000b\u0018.l\u0004%", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public static final class Builder {
            private String prefix = NumberHexFormat.Companion.getDefault$kotlin_stdlib().getPrefix();
            private String suffix = NumberHexFormat.Companion.getDefault$kotlin_stdlib().getSuffix();
            private boolean removeLeadingZeros = NumberHexFormat.Companion.getDefault$kotlin_stdlib().getRemoveLeadingZeros();

            public final NumberHexFormat build$kotlin_stdlib() {
                return new NumberHexFormat(this.prefix, this.suffix, this.removeLeadingZeros);
            }

            public final String getPrefix() {
                return this.prefix;
            }

            public final boolean getRemoveLeadingZeros() {
                return this.removeLeadingZeros;
            }

            public final String getSuffix() {
                return this.suffix;
            }

            public final void setPrefix(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                String str = value;
                if (StringsKt.contains$default((CharSequence) str, '\n', false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, TokenParser.CR, false, 2, (Object) null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + value);
                }
                this.prefix = value;
            }

            public final void setRemoveLeadingZeros(boolean z2) {
                this.removeLeadingZeros = z2;
            }

            public final void setSuffix(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                String str = value;
                if (StringsKt.contains$default((CharSequence) str, '\n', false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, TokenParser.CR, false, 2, (Object) null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + value);
                }
                this.suffix = value;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00056i%\nCiWpԃ$\u07beSTo˧\u0007L`\u000eQ\u0013َ\u001a}"}, d2 = {"\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010U\u007fWw\u000b<\u0004\b5l^*Du\u0012=\f!Es?\u001a\u001elkB\\", "", "u(E", "\u0012dU.h3M", "\u001aj^A_0G\u001d(~\u000emu_\tBF\n5\u0004<\u0010U\u007fWw\u000b<\u0004\b5l^*Du\u0012=#", "5dc\u0011X-:c \u000e9d6\f\u00103ny6\u000b?\b\u001b\u0014", "u(;8b;EW\"H\n^?\fR\u0012e\u0013\t\u0006M\t\u0013&\u0006X\u001eDs%B<}3\u0018w#6IR\u0011", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final NumberHexFormat getDefault$kotlin_stdlib() {
                return NumberHexFormat.Default;
            }
        }

        public NumberHexFormat(String prefix, String suffix, boolean z2) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.prefix = prefix;
            this.suffix = suffix;
            this.removeLeadingZeros = z2;
        }

        public final StringBuilder appendOptionsTo$kotlin_stdlib(StringBuilder sb, String indent) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            StringBuilder sbAppend = sb.append(indent).append("prefix = \"").append(this.prefix);
            Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
            StringBuilder sbAppend2 = sbAppend.append("\",");
            Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
            Intrinsics.checkNotNullExpressionValue(sbAppend2.append('\n'), "append(...)");
            StringBuilder sbAppend3 = sb.append(indent).append("suffix = \"").append(this.suffix);
            Intrinsics.checkNotNullExpressionValue(sbAppend3, "append(...)");
            StringBuilder sbAppend4 = sbAppend3.append("\",");
            Intrinsics.checkNotNullExpressionValue(sbAppend4, "append(...)");
            Intrinsics.checkNotNullExpressionValue(sbAppend4.append('\n'), "append(...)");
            sb.append(indent).append("removeLeadingZeros = ").append(this.removeLeadingZeros);
            return sb;
        }

        public final String getPrefix() {
            return this.prefix;
        }

        public final boolean getRemoveLeadingZeros() {
            return this.removeLeadingZeros;
        }

        public final String getSuffix() {
            return this.suffix;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            StringBuilder sbAppend = sb.append("NumberHexFormat(");
            Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
            Intrinsics.checkNotNullExpressionValue(sbAppend.append('\n'), "append(...)");
            Intrinsics.checkNotNullExpressionValue(appendOptionsTo$kotlin_stdlib(sb, "    ").append('\n'), "append(...)");
            sb.append(")");
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    public HexFormat(boolean z2, BytesHexFormat bytes, NumberHexFormat number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.upperCase = z2;
        this.bytes = bytes;
        this.number = number;
    }

    public final BytesHexFormat getBytes() {
        return this.bytes;
    }

    public final NumberHexFormat getNumber() {
        return this.number;
    }

    public final boolean getUpperCase() {
        return this.upperCase;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbAppend = sb.append("HexFormat(");
        Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        Intrinsics.checkNotNullExpressionValue(sbAppend.append('\n'), "append(...)");
        StringBuilder sbAppend2 = sb.append("    upperCase = ").append(this.upperCase);
        Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        StringBuilder sbAppend3 = sbAppend2.append(",");
        Intrinsics.checkNotNullExpressionValue(sbAppend3, "append(...)");
        Intrinsics.checkNotNullExpressionValue(sbAppend3.append('\n'), "append(...)");
        StringBuilder sbAppend4 = sb.append("    bytes = BytesHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sbAppend4, "append(...)");
        Intrinsics.checkNotNullExpressionValue(sbAppend4.append('\n'), "append(...)");
        Intrinsics.checkNotNullExpressionValue(this.bytes.appendOptionsTo$kotlin_stdlib(sb, "        ").append('\n'), "append(...)");
        StringBuilder sbAppend5 = sb.append("    ),");
        Intrinsics.checkNotNullExpressionValue(sbAppend5, "append(...)");
        Intrinsics.checkNotNullExpressionValue(sbAppend5.append('\n'), "append(...)");
        StringBuilder sbAppend6 = sb.append("    number = NumberHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sbAppend6, "append(...)");
        Intrinsics.checkNotNullExpressionValue(sbAppend6.append('\n'), "append(...)");
        Intrinsics.checkNotNullExpressionValue(this.number.appendOptionsTo$kotlin_stdlib(sb, "        ").append('\n'), "append(...)");
        StringBuilder sbAppend7 = sb.append("    )");
        Intrinsics.checkNotNullExpressionValue(sbAppend7, "append(...)");
        Intrinsics.checkNotNullExpressionValue(sbAppend7.append('\n'), "append(...)");
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
