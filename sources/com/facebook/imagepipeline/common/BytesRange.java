package com.facebook.imagepipeline.common;

import com.facebook.common.internal.Preconditions;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4E\u0007\":\u001b\u007f\u0007lnA0RqP.XT0ŧq\u0012éBkTqq:\u000e\u0019\u000eb\u001c_Rug\u0007J\t\fS\u0013\u0014\u0018\u0011jZJǤ|] \u0012zI}CKM\u001e>\u007fƢu~\f.7:8(\u0006Gʤ+\u0011!\u0005\u0001[K:\u0019`F~Bj\u000fc\u0004HŇL̋ I9jpf6vǍ\u000e@5#\u0011iZNU``\u0003S\rTV?\r%bdү?\u007fF#/k\u00035Y\fE\u0011J\n?\u001bgU&qɵs <f\f,\u0015YPSq;*j\u0012i`:5sUqZh\u000eV\u0006A\u0010]J\u0012\u000e\u001e'v/c\u001e=ڤ\u0010\u07baxr[ó!\u0010lD\u0018z\u00107M)Vę-ݰ\u001ffYĥދ\u001d_"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001J*=MQ(g= \u0015>", "", "4q^:", "", "Bn", "uH8uI", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n]AT0Ga", "", "1n\\=T9>", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "Bn7Ag7+O\"\u0001zA,x\b/rp$\u0003P\u0001", "", "BnBAe0GU", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BytesRange {
    public static final int TO_END_OF_CONTENT = Integer.MAX_VALUE;
    public final int from;
    public final int to;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<Pattern> headerParsingRegEx$delegate = LazyKt.lazy(new Function0<Pattern>() { // from class: com.facebook.imagepipeline.common.BytesRange$Companion$headerParsingRegEx$2
        @Override // kotlin.jvm.functions.Function0
        public final Pattern invoke() {
            return Pattern.compile("[-/ ]");
        }
    });

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007f\u0007lmA0ZeP.XS2\u000fy\b<$a'w٘<kڼ.\"7N\u000flmnН^\u000bQ\u000fN$\u0007sDI\u0004\u0003\u000e\u0016\u001d;Zom5\u0014t\u0006Kn\u007fN\u000761PB*\u000b\u000f&BJ&u)P\u0012\u0011Z>N~RR;W5\u001e \u0015V / #l\u0017DV|u:]03mP_?_^~\u0014\r\u0017`5\u000e\u000faL-\u0017ˁ\bչ)S\u000bޗ#tM\u0006Wqk\t\u001fg}ǥɣsɱ:b\b\u0016\u001b2]\u0015ut,a\u0013Wԉ\u00109"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001J*=MQ(g= \u0015'?C\u000fn(Wz1P\"", "", "u(E", "\"NN\u0012A\u000b8=yxXH\u0015kh\u0018T", "", "6dP1X9)O&\r~g.i\t1E\u0013", "\u001aiPCTuNb\u001d\u0006Dk,~\tB/j$\u000bO\u0001$ \u001d", "5dc\u0015X(=S&ivk:\u0001\u00121R\u007f*[S", "u(;7T=:\u001d)\u000e~eu\n\t1e\u0013qf<\u0010&\u0017Txc", "6dP1X9)O&\r~g.i\t1E\u0013fz@\b\u0017\u0019C~\u000e", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "4q^:", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001J*=MQ(g= \u0015>", "4q^:66Gb\u0019\b\nK(\u0006\u000b/H\u007f$z@\u000e", "6dP1X9", "", "Bn<.k", "Bn", "D`[BX\u0016K3!\n\nr", "<", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pattern getHeaderParsingRegEx() {
            Object value = BytesRange.headerParsingRegEx$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-headerParsingRegEx>(...)");
            return (Pattern) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String valueOrEmpty(int i2) {
            return i2 == Integer.MAX_VALUE ? "" : String.valueOf(i2);
        }

        @JvmStatic
        public final BytesRange from(int i2) {
            Preconditions.checkArgument(Boolean.valueOf(i2 >= 0));
            return new BytesRange(i2, Integer.MAX_VALUE);
        }

        @JvmStatic
        public final BytesRange fromContentRangeHeader(String str) throws IllegalArgumentException {
            if (str == null) {
                return null;
            }
            try {
                String[] strArrSplit = getHeaderParsingRegEx().split(str);
                Preconditions.checkArgument(Boolean.valueOf(strArrSplit.length == 4));
                Preconditions.checkArgument(Boolean.valueOf(Intrinsics.areEqual(strArrSplit[0], "bytes")));
                String str2 = strArrSplit[1];
                Intrinsics.checkNotNullExpressionValue(str2, "headerParts[1]");
                int i2 = Integer.parseInt(str2);
                String str3 = strArrSplit[2];
                Intrinsics.checkNotNullExpressionValue(str3, "headerParts[2]");
                int i3 = Integer.parseInt(str3);
                String str4 = strArrSplit[3];
                Intrinsics.checkNotNullExpressionValue(str4, "headerParts[3]");
                int i4 = Integer.parseInt(str4);
                Preconditions.checkArgument(Boolean.valueOf(i3 > i2));
                Preconditions.checkArgument(Boolean.valueOf(i4 > i3));
                return i3 < i4 - 1 ? new BytesRange(i2, i3) : new BytesRange(i2, Integer.MAX_VALUE);
            } catch (IllegalArgumentException e2) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str5 = String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(str5, "format(locale, format, *args)");
                throw new IllegalArgumentException(str5, e2);
            }
        }

        @JvmStatic
        public final BytesRange toMax(int i2) {
            Preconditions.checkArgument(Boolean.valueOf(i2 > 0));
            return new BytesRange(0, i2);
        }
    }

    public BytesRange(int i2, int i3) {
        this.from = i2;
        this.to = i3;
    }

    public static /* synthetic */ BytesRange copy$default(BytesRange bytesRange, int i2, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i2 = bytesRange.from;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = bytesRange.to;
        }
        return bytesRange.copy(i2, i3);
    }

    @JvmStatic
    public static final BytesRange from(int i2) {
        return Companion.from(i2);
    }

    @JvmStatic
    public static final BytesRange fromContentRangeHeader(String str) throws IllegalArgumentException {
        return Companion.fromContentRangeHeader(str);
    }

    @JvmStatic
    public static final BytesRange toMax(int i2) {
        return Companion.toMax(i2);
    }

    public final int component1() {
        return this.from;
    }

    public final int component2() {
        return this.to;
    }

    public final boolean contains(BytesRange bytesRange) {
        return bytesRange != null && this.from <= bytesRange.from && bytesRange.to <= this.to;
    }

    public final BytesRange copy(int i2, int i3) {
        return new BytesRange(i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        BytesRange bytesRange = (BytesRange) obj;
        return this.from == bytesRange.from && this.to == bytesRange.to;
    }

    public int hashCode() {
        return (this.from * 31) + this.to;
    }

    public final String toHttpRangeHeaderValue() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Companion companion = Companion;
        String str = String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{companion.valueOrEmpty(this.from), companion.valueOrEmpty(this.to)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Companion companion = Companion;
        String str = String.format(null, "%s-%s", Arrays.copyOf(new Object[]{companion.valueOrEmpty(this.from), companion.valueOrEmpty(this.to)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }
}
