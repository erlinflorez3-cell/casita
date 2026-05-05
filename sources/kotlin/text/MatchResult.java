package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":0\u007f\u0007tvA0JfP.hS2\u000fq|<$q$yCA[ b8ޛ\u007fN\u0016f'IoSK\u001d\u001a.z\u0001+wǁ?\u0002b!@B\b?aN&\u0012\u0010Ųvȥ\t$J$>{\u0013\u0004j@V\u0014\u000f\u0001SM\u001c\u0012^F\u001f?)үOŋ\u001e\u0016\u001e@&\b,d8^DQ\u0005]h9yɬkŌR+w2\u0003X\u001bR%7\u001b\u0004y\u001eYN\u000eߵ\u0017ȏW\u0007\u001fTaN\u0011OBM\u0013y?'YOJɵ8ݼ\u0004\u0018--U\u001fk\u0006͏`\u001b"}, d2 = {"\u001aj^A_0G\u001d(~\u000emud\u0005>c\u0003\u0015{N\u0011\u001e&\u001d", "", "2dbAe<<b)\fz]", "\u001aj^A_0G\u001d(~\u000emud\u0005>c\u0003\u0015{N\u0011\u001e&\u0006N\u000eJ\u00062EW\r0Dm\u0015\u0004", "5dc\u0011X:M`)|\nn9|\b", "u(;8b;EW\"H\n^?\fR\u0017a\u000f&~-\u0001%'N~L\u001bv3Df\u000e\u001eF}#.L\u0019", "5q^Bc\u001d:Z)~\t", "", "", "5dc\u0014e6N^\nz\u0002n,\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "5q^Bc:", "\u001aj^A_0G\u001d(~\u000emud\u0005>c\u0003\n\tJ\u0011\"tQv\u0015<t49c\u0007u", "5dc\u0014e6N^'", "u(;8b;EW\"H\n^?\fR\u0017a\u000f&~\"\u000e!'RM\u0018C}%3h\u0002*@C", "@`]4X", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "5dc\u001fT5@S", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", "D`[BX", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "<dgA", "\u0012dbAe<<b)\fz]", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface MatchResult {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static Destructured getDestructured(MatchResult matchResult) {
            return new Destructured(matchResult);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4D\u0007\":\u001e\u007f\u0007lrA0R\u0004P\u008chݷZ\u000f\u001azt1aҕ\u0002GIU2}P\nҊRgup\u0013a\u0019H'\u0006D~1ߢQ\u001e\u007fk\u0019'2pu\u0006ݔU8DGh\r63&xĺ@B\f\u000f#BH>|AŗST\u0019>J\t:\u0001\u0013\u0014İ\"Z\rL+\u0019\u001e\u000bm\u0015ȬP5dH;;\u0003\u0018H\u0015ϓgx\u0004[\u001a^TU\u0013=ѵ&sGEC-%\u0002\tMҀc\b\nM\u0001U\u0005\u0017-mǪQ<aDh\u0018\u001a%-_\r\fxTmU`n\f?+}dׂT\u00140»\u0013}\u0013?\u0012\u0012Σ+Z"}, d2 = {"\u001aj^A_0G\u001d(~\u000emud\u0005>c\u0003\u0015{N\u0011\u001e&\u0006N\u000eJ\u00062EW\r0Dm\u0015\u0004", "", ";`c0[", "\u001aj^A_0G\u001d(~\u000emud\u0005>c\u0003\u0015{N\u0011\u001e&\u001d", "uKZ<g3B\\b\u000ezq;Fp+t}+h@\u000f'\u001eVEQ-", "5dc\u001aT;<V", "u(;8b;EW\"H\n^?\fR\u0017a\u000f&~-\u0001%'N~c", "1n\\=b5>\\(J", "", "1n\\=b5>\\(JE", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "Bn;6f;", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Destructured {
        private final MatchResult match;

        public Destructured(MatchResult match) {
            Intrinsics.checkNotNullParameter(match, "match");
            this.match = match;
        }

        private final String component1() {
            return getMatch().getGroupValues().get(1);
        }

        private final String component10() {
            return getMatch().getGroupValues().get(10);
        }

        private final String component2() {
            return getMatch().getGroupValues().get(2);
        }

        private final String component3() {
            return getMatch().getGroupValues().get(3);
        }

        private final String component4() {
            return getMatch().getGroupValues().get(4);
        }

        private final String component5() {
            return getMatch().getGroupValues().get(5);
        }

        private final String component6() {
            return getMatch().getGroupValues().get(6);
        }

        private final String component7() {
            return getMatch().getGroupValues().get(7);
        }

        private final String component8() {
            return getMatch().getGroupValues().get(8);
        }

        private final String component9() {
            return getMatch().getGroupValues().get(9);
        }

        public final MatchResult getMatch() {
            return this.match;
        }

        public final List<String> toList() {
            return this.match.getGroupValues().subList(1, this.match.getGroupValues().size());
        }
    }

    Destructured getDestructured();

    List<String> getGroupValues();

    MatchGroupCollection getGroups();

    IntRange getRange();

    String getValue();

    MatchResult next();
}
