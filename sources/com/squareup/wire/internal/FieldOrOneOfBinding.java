package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0006DLc\u0003İI\u00066\f6B\r(4\u0012}\bnjO0LeN/ZS8\u0018s{:'c$\u007fOCU \u0003*\teNogtTb\u000bQ\u000f\u000e\u0016~q4Ikxe\u0012\u00152H\u0014U\u074cuqCʠns^\u0007&108*\u0005/\u001bjMǘz|IM\u001a\u0015x[~aj\r{-J\u0016\u0014g8\u0001T[\u0018RDo\u0005]h0i'ݦFN5\nx\u001a[8^TU5'e,TX7k\u0014UY\u0011.j]U\u0002mr\u0004)ص+'9s<mD\u0005\u0018\u0016+*}\u000e\u000ev4\n\u001dQ\u0017ϯm˪OӍOP\u001cV@\u0010\n<T\u0006$\u0005UI^1(\u0010 \u000eis9wĖT\u0002lpH\u0011of/%.@[=)\u0018iaiK~=\n,% 9\u007f\u001d\"$b\u001c\u0014-\u001b\u0003\u0005\u00025_qUH|< =>\u0014~f\u001a*25\u001eİ1ɨ\u00152/'=aG*q{\u0010P\\g%\u000e7ČUׂVLX$t E5Y\u001chP|\u0005\u001a]+з.ҭQ l\t\u0004\u0016!/-\bJ1=\u0010|\\?Ȱlܷa\u000e=1lGg}<\u001eeJv3c^:߫c؏z\u0018W>h\u0016fu\u0013c\u001alt(PE\u001fс\u0012ȑ\u007fHf\u000e\u0019FM\u0007lD:G1\\C[YڃD˩\u0001\rw\\n'\ri\u00044\u0011\u0002<t7\u0014'ʻr״k|a.\u0003y0B\u0012eC3>Y2h:}Q\"U΅\u0002ěkP_Nr2\u0004rL4$8QU?=\u0019\u0010-D\tį/։Pv}SS15\u0018M\n\u001d[\u0001.\u0016\u0015AҘ.߯nNgV\u001dC\u0005mCH\u0016\u0007\u0018\u007fqH\u000bG\u0012U9vt\u000eIÌʠ<ҡ<\r\r!$J\u000f\u00162~;PQ*5\u0018}8=2˾a\u001e"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006W)5`|\nDW\u001f.7D\u0018o=\u001d\u0019qc\u000f", "\u001b", "\u0010", "", "\nh]6g\u0005", "u(E", "B`V", "", "5dc!T.", "u(8", ":`Q2_", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017wKo\u0015;5\f1V}'\r", "5dc\u0019T)>Z", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nr\u001b$GP\u0012<}$s@y\u001d7tk", "@dS.V;>R", "", "5dc\u001fX+:Q(~y", "u(I", "7r<.c", "7r<2f::U\u0019", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "2dR9T9>R\u0002z\u0003^", "5dc\u0011X*EO&~yG(\u0005\t", "Eha290>Z\u0018c\th5e\u00057e", "5dc$\\9>4\u001d~\u0002]\u0011\u000b\u00138N{0{", "9dh\u000eW(Ib\u0019\f", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "5dc\u0018X@\u001aR\u0015\n\n^9", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nk$!Vyi;r0DY\u000bu", "Ah]4_,\u001aR\u0015\n\n^9", "5dc \\5@Z\u0019ZyZ7\f\t<", "EqXAX\u0010=S\"\u000e~m@m\u00056u\u007f6", "5dc$e0MS|}zg;\u0001\u0018CV{/\f@\u000f", "/cP=g,K", "5dc\u000eW(Ib\u0019\f9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "5dc\u000eW(Ib\u0019\f", "/cP=g,K\u0012\u0018~\u0002^.x\u0018/", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "D`[BX", "", "0tX9W,K", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "Adc", "5dc", ";db@T.>", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "5dc\u0013e6F0)\u0003\u0002],\n", "=lXA99H[}\r\u0005g", "Ax]AT?", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqiT\n&\u0013ZE", "=lXA<+>\\(\u0003\nr", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class FieldOrOneOfBinding<M, B> {
    private final Lazy adapter$delegate = LazyKt.lazy(new Function0() { // from class: com.squareup.wire.internal.FieldOrOneOfBinding$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FieldOrOneOfBinding.adapter_delegate$lambda$0(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter adapter_delegate$lambda$0(FieldOrOneOfBinding fieldOrOneOfBinding) {
        if (!fieldOrOneOfBinding.isMap()) {
            ProtoAdapter<?> protoAdapterWithLabel$wire_runtime = fieldOrOneOfBinding.getSingleAdapter().withLabel$wire_runtime(fieldOrOneOfBinding.getLabel());
            Intrinsics.checkNotNull(protoAdapterWithLabel$wire_runtime, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            return protoAdapterWithLabel$wire_runtime;
        }
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        ProtoAdapter<?> keyAdapter = fieldOrOneOfBinding.getKeyAdapter();
        Intrinsics.checkNotNull(keyAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        ProtoAdapter<?> singleAdapter = fieldOrOneOfBinding.getSingleAdapter();
        Intrinsics.checkNotNull(singleAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        ProtoAdapter protoAdapterNewMapAdapter = companion.newMapAdapter(keyAdapter, singleAdapter);
        Intrinsics.checkNotNull(protoAdapterNewMapAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        return protoAdapterNewMapAdapter;
    }

    public static /* synthetic */ void getAdapter$annotations() {
    }

    private final boolean omitIdentity(Syntax syntax) {
        if (getWriteIdentityValues()) {
            return false;
        }
        if (getLabel() == WireField.Label.OMIT_IDENTITY) {
            return true;
        }
        if (getLabel().isRepeated() && syntax == Syntax.PROTO_3) {
            return true;
        }
        return isMap() && syntax == Syntax.PROTO_3;
    }

    public abstract Object get(M m2);

    public final ProtoAdapter<Object> getAdapter() {
        return (ProtoAdapter) this.adapter$delegate.getValue();
    }

    public abstract String getDeclaredName();

    public abstract Object getFromBuilder(B b2);

    public abstract ProtoAdapter<?> getKeyAdapter();

    public abstract WireField.Label getLabel();

    public abstract String getName();

    public abstract boolean getRedacted();

    public abstract ProtoAdapter<?> getSingleAdapter();

    public abstract int getTag();

    public abstract String getWireFieldJsonName();

    public abstract boolean getWriteIdentityValues();

    public abstract boolean isMap();

    public abstract boolean isMessage();

    public final boolean omitFromJson(Syntax syntax, Object obj) {
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        if (obj == null) {
            return true;
        }
        return omitIdentity(syntax) && Intrinsics.areEqual(obj, getAdapter().getIdentity());
    }

    public abstract void set(B b2, Object obj);

    public abstract void value(B b2, Object obj);
}
