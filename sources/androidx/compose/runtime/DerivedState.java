package androidx.compose.runtime;

import androidx.collection.ObjectIntMap;
import androidx.compose.runtime.snapshots.StateObject;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?2JD^\u008czU0şyzd*k&\u0002C\u0002TH}Z\bX\u001f}uob`\u001bE\u001f\u0006Lю\u0019. Ǩzٕ\u0016\u0013JDuBAQ@UGe\r>\u0015\"B\"nц\u001b\u007fH0\u001fǜxټGO$\u00146G~Bƞ\f˟ī\u001a\u0016\u000e@& L[ʊR@ՠp\\"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000eFi%.#", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "1ta?X5M@\u0019|\u0005k+", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000eFi%.\f0;i>+\u0014>", "5dc\u0010h9KS\"\u000eg^*\u0007\u0016.", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006U%B]\u000f 6[%*\\CyX4\u001c\u001fu`\u000f", ">n[6V@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*\\GEt\u001f(\u001cl_M\\", "5dc\u001db3BQ-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d.1d\f#A|}>\\?Jo>'\u007frh=\u0005w\u0002", " dR<e+", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface DerivedState<T> extends State<T> {

    /* JADX INFO: compiled from: DerivedState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&˛\bDRш|\u0004G\b8\u000bDB\u0007\"B\u0012\u007f\u0007lk?\u0015Z͜p0XR8\u000e\u001c{b$,4\u007fDSUP|x߂QɁkk\u0007L`\rQ\u0012V,\u0007nDOezm\u0012=8pt\u0016ݳOڱA=xv<\f.:ƫ7цڑ\u0001\u001e2J\u0016\u0016)BƠ\u0010\u001bٔDo"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000eFi%.\f0;i>+\u0014>", "\"", "", "1ta?X5MD\u0015\u0006\u000b^", "5dc\u0010h9KS\"\u000ekZ3\r\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "2d_2a+>\\\u0017\u0003zl", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d \u007f4\u001dU\tu", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;U1#\u0015fp\u000f", "5dc\u0011X7>\\\u0018~\u0004\\0|\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`\u0001Dt\u000e:\u0006\t>he\u001cBC", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Record<T> {
        T getCurrentValue();

        ObjectIntMap<StateObject> getDependencies();
    }

    Record<T> getCurrentRecord();

    SnapshotMutationPolicy<T> getPolicy();
}
