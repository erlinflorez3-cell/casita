package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r-4\u0012}\u0007njGNLeV:ZS0\u0011s{J$c$wDCU0}*\tUOog\u0005Jb\u000bI\u0014\f\u0016\u000f̓\\I\u0004w\u001e%\u001f6PoW3{pM=nvN\u0005N5ŕ<y\u0013\u0005b2V*\u000f|YJ:\u0011vTAR`\u0012e\u000b*\u0014\u0016>N\bLb\u001e#\rԶnҺ>3;\u0005oJ\\00D\u000bW%Nd)\u001dv\u0010%A?e;kǯ_Ϋ\u000bRcΪSQ\u007fH\u001dhU3\u0002ɵuɱ:^\bϬ--U\u001ak\u0001vh\u0013Sx\fU.&ҭMח\u0012(\u007f\u07beL\u001fJ\u0013&\u0006UXdmpǔ\nԧ7x\u000bUFa\u0010p\u0013\f\taN\u0017S\u0001\nڂ;ӸjQiݢi`E\u000f\u001d\rL77CwƓV\u05f8d\u00193V}f?g\u0011OVe\"Ykt:E9̺,˙4K\u00181\u0002)<0Ï;v"}, d2 = {"\u001aj^A_0G\u001d(~\u000emud\u0005>c\u0003(\t(|&\u0015J\\\u000eJ\u0007,D/", "\u001aj^A_0G\u001d(~\u000emud\u0005>c\u0003\u0015{N\u0011\u001e&\u001d", ";`c0[,K", "\u001aiPCTuNb\u001d\u0006Dk,~\tB/g$\u000b>\u0004\u0017$\u001d", "7m_Bg", "", "uKY.i(\bc(\u0003\u0002(9|\u000b/xI\u0010wO~\u001a\u0017TEtAr61#\u0005\u001c@o_\fP?HY4*%hj7\u00079o?", "5q^Bc\u001d:Z)~\t", "", "", "5dc\u0014e6N^\nz\u0002n,\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "5q^Bc\u001d:Z)~\tX", "5q^Bc:", "\u001aj^A_0G\u001d(~\u000emud\u0005>c\u0003\n\tJ\u0011\"tQv\u0015<t49c\u0007u", "5dc\u0014e6N^'", "u(;8b;EW\"H\n^?\fR\u0017a\u000f&~\"\u000e!'RM\u0018C}%3h\u0002*@C", ";`c0[\u0019>a)\u0006\n", "\u001aiPCTuNb\u001d\u0006Dk,~\tB/g$\u000b>\u0004\u0004\u0017U\u007f\u0015KL", "5dc\u001aT;<V\u0006~\tn3\f", "u(;7T=:\u001d)\u000e~eu\n\t1e\u0013qc<\u0010\u0015\u001a4o\u001cL}4\u000b", "@`]4X", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "5dc\u001fT5@S", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", "D`[BX", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "<dgA", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class MatcherMatchResult implements MatchResult {
    private List<String> groupValues_;
    private final MatchGroupCollection groups;
    private final CharSequence input;
    private final Matcher matcher;

    public MatcherMatchResult(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.matcher = matcher;
        this.input = input;
        this.groups = new MatcherMatchResult$groups$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult getMatchResult() {
        return this.matcher;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult.Destructured getDestructured() {
        return MatchResult.DefaultImpls.getDestructured(this);
    }

    @Override // kotlin.text.MatchResult
    public List<String> getGroupValues() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new AbstractList<String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ boolean contains(Object obj) {
                    if (obj instanceof String) {
                        return contains((String) obj);
                    }
                    return false;
                }

                public /* bridge */ boolean contains(String str) {
                    return super.contains(str);
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public String get(int i2) {
                    String strGroup = this.this$0.getMatchResult().group(i2);
                    return strGroup == null ? "" : strGroup;
                }

                @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
                public int getSize() {
                    return this.this$0.getMatchResult().groupCount() + 1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
                    if (obj instanceof String) {
                        return indexOf((String) obj);
                    }
                    return -1;
                }

                public /* bridge */ int indexOf(String str) {
                    return super.indexOf(str);
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
                    if (obj instanceof String) {
                        return lastIndexOf((String) obj);
                    }
                    return -1;
                }

                public /* bridge */ int lastIndexOf(String str) {
                    return super.lastIndexOf(str);
                }
            };
        }
        List<String> list = this.groupValues_;
        Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    public MatchGroupCollection getGroups() {
        return this.groups;
    }

    @Override // kotlin.text.MatchResult
    public IntRange getRange() {
        return RegexKt.range(getMatchResult());
    }

    @Override // kotlin.text.MatchResult
    public String getValue() {
        String strGroup = getMatchResult().group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult next() {
        int iEnd = getMatchResult().end() + (getMatchResult().end() == getMatchResult().start() ? 1 : 0);
        if (iEnd > this.input.length()) {
            return null;
        }
        Matcher matcher = this.matcher.pattern().matcher(this.input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return RegexKt.findNext(matcher, iEnd, this.input);
    }
}
