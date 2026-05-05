package com.squareup.wire;

import com.squareup.wire.OneOf.Key;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&˛\bDZc|İI\u0006>é6B\u0005.4\u0012\u0006\u0013nʑA0RkP\u008cZS8\u000fsڔ<$q$yCQU\"}(\fWNupvJ`\rIƫ\f,ю\u0013:Oǁ\u0007\\0\u000eZH\u007fACM6>g`\u001d8\u000b\u001f@#hy3\u0003R)iP\f\u000bGY\u000f*0v\u0081JV\u001bQ\u001d\u001aH\u0005̧$\u0003$auT~gzjR19\u00020Pn)e0\u000b[=Pb*%|q ;@}CC%٨\u0007\u0007`j\b\tM\u0002U\u0005\u00178m?\u0012weHp\u007fB(s[\u001bq\u000b&\u000b\u001a\u0002d\u001a=CO\u0012b\u0019\u001a6\f\u0013{;Q4\u0012\u0014=`.[2/\u0014\u001cL\rr\nó\u0017٣_۰\u0004zo>_1\u000eMC9Qe\u0018Ŭ<ϭR7\n\u0010UJ1\u001c\u0007-kV\u001e`KÑdya1\b?kʰ~\u0010_={\u0007\tb8Ï46M\u007f=\u007f).M$}ڊ8؝%k\u0010d\rx\u0005\"xh\u0002\b\u0003NNA\u0007\u0018M)7\u000e!ּeMr^tp,?`bϘ\u0006N\u0019!#twrƙٚ\u0014VWhwse_\u0010,=n\bj|o&Wo]ۋ9Yk\u0010o^\u000f\u0016EFp\u0010׃jd"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqeI\u0001\u0001\u0018\u001d", "\u0019", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqeI\u0001\u0001\u0018\u0006U\u000ePL", "\"", "", "9dh", "D`[BX", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E*\n\u0017\u0001H.s<\u000bz\u001c^y137\u001d*VE\u0005U1#\u0015fp\u000fJT", "5dc\u0018X@", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nj \u00171pL\"v9\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqeI\u0001\u0001\u0018\u0006U\u000ePL", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc\u001ce\u0015NZ ", "&", "uKR<`uL_)z\b^<\bRAi\r(E*\n\u0017\u0001H.s<\u000bzx@\u0003\u001cHi_5IL=5\u001e\u001b\u001ah_H\\", "BnBAe0GU", "", "3mR<W,=A\u001d\u0014zP0\f\f\u001ea\u0002", "", "3mR<W,0W(\u0002iZ.", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "uKR<`uL_)z\b^<\bRAi\r(E*\n\u0017\u0001H.s<\u000bz\u001c^y137\u001d*VE\u0005U1#\u0015fp\u000fJJ*X~pUX^(iR\u0003H]$^\u001bNtv\u000eY+%D", "3pd._:", "", "=sW2e", "6`b566=S", "\u0019dh", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneOf<K extends Key<T>, T> {
    private final K key;
    private final T value;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&˛\bDRш|İI\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjG<L͜P.`\\2\u000fq\u0007:Hqҕ\u001aEAU(|R\t}N(\u001f~Nh\f[\u000f4\u0018\tt:Lm~m\u0014\u001f2xom7]sK>xtd\u000b08(8\b\f\u0019\u001aXP |\u0001CY\u0015*0nvĐV\u000fS\u000f(\u001dVM.\u00026\\\u0016PɇLreŽG%\tuP[wt>\u007fe\u0013VV7\r-aL/Ë;;\u001dǬk\u0005\r`iNSN\u007fB\u001dhU-ȅMy_̬p\u0002\u001a%9`]l\u0001-t\u0005\u007fhВ+1WҪcR\u0014:\u0006\u000eL\u001cJ\r&\u0006UNͶ1 nڜ&5z\u0007aQй\u0006s"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqeI\u0001\u0001\u0018\u0006U\u000ePL", "\"", "", "B`V", "", "/cP=g,K", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "2dR9T9>R\u0002z\u0003^", "", "@dS.V;>R", "", "8r^;A(FS", "\nh]6g\u0005", "uH;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nk$!Vyi;r0DY\u000bu\u001er\u0012?I\rBg= ^VpF\u000bl.$k\u000eLH_(&YnF\u0016[H\u001d[/\u0016\u0007/\u0005\u0015", "5dc!T.", "u(8", "5dc\u000eW(Ib\u0019\f", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nk$!Vyi;r0DY\u000bu", "5dc\u0011X*EO&~yG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001fX+:Q(~y", "u(I", "5dc\u0017f6G<\u0015\u0007z", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static abstract class Key<T> {
        private final ProtoAdapter<T> adapter;
        private final String declaredName;
        private final String jsonName;
        private final boolean redacted;
        private final int tag;

        public Key(int i2, ProtoAdapter<T> adapter, String declaredName, boolean z2, String jsonName) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(declaredName, "declaredName");
            Intrinsics.checkNotNullParameter(jsonName, "jsonName");
            this.tag = i2;
            this.adapter = adapter;
            this.declaredName = declaredName;
            this.redacted = z2;
            this.jsonName = jsonName;
        }

        public /* synthetic */ Key(int i2, ProtoAdapter protoAdapter, String str, boolean z2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, protoAdapter, str, (i3 + 8) - (8 | i3) != 0 ? false : z2, (i3 & 16) != 0 ? "" : str2);
        }

        public final ProtoAdapter<T> getAdapter() {
            return this.adapter;
        }

        public final String getDeclaredName() {
            return this.declaredName;
        }

        public final String getJsonName() {
            return this.jsonName;
        }

        public final boolean getRedacted() {
            return this.redacted;
        }

        public final int getTag() {
            return this.tag;
        }
    }

    public OneOf(K key, T t2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.value = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneOf copy$default(OneOf oneOf, Key key, Object obj, int i2, Object obj2) {
        if ((1 & i2) != 0) {
            key = oneOf.key;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            obj = oneOf.value;
        }
        return oneOf.copy(key, obj);
    }

    public final K component1() {
        return this.key;
    }

    public final T component2() {
        return this.value;
    }

    public final OneOf<K, T> copy(K key, T t2) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new OneOf<>(key, t2);
    }

    public final void encodeWithTag(ProtoWriter writer) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.key.getAdapter().encodeWithTag(writer, this.key.getTag(), this.value);
    }

    public final void encodeWithTag(ReverseProtoWriter writer) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.key.getAdapter().encodeWithTag(writer, this.key.getTag(), this.value);
    }

    public final int encodedSizeWithTag() {
        return this.key.getAdapter().encodedSizeWithTag(this.key.getTag(), this.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneOf)) {
            return false;
        }
        OneOf oneOf = (OneOf) obj;
        return Intrinsics.areEqual(this.key, oneOf.key) && Intrinsics.areEqual(this.value, oneOf.value);
    }

    public final K getKey() {
        return this.key;
    }

    public final <X> X getOrNull(Key<X> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.areEqual(this.key, key)) {
            return this.value;
        }
        return null;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        T t2 = this.value;
        return iHashCode + (t2 == null ? 0 : t2.hashCode());
    }

    public String toString() {
        ProtoAdapter<T> adapter = this.key.getAdapter();
        return this.key.getDeclaredName() + '=' + ((Intrinsics.areEqual(adapter, ProtoAdapter.STRING) || Intrinsics.areEqual(adapter, ProtoAdapter.STRING_VALUE)) ? Internal.sanitize(String.valueOf(this.value)) : String.valueOf(this.value));
    }
}
