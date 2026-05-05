package kotlin.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDZc|\u0004Oي8\u000b4E\u0007\":\u0012\u007fјnjO0LeN0ZS8\u0018s{:)c$\u007fOC٥ \"8ޛwPm˧|I\u000b\u0019S\u0013\u0016\u0018\u000fiZJezm\u0012U1po\u007f>]sK;xtlӌڶ6\"F|M((0`\u0010%\u0002sS\u001a\u001aHD\u0001:X\u000e{\u000eJ\u0016\u0014H8\u0001Tձ\u0018RDS\u0005]pǂi\u0015ݦFN5kx$[\u001a^TU\u001b'i,3X;E\u0015+T1\u0010\u0003_M\rWqsݛ\u0019+56as\u000e̬\u001f\u0012Џ\u0019+]\u001c&\u00154l\u001dQ\u0017ϯW1]tcR$'&{,\u0015J\f&\n7H4.HoNԛ3ϢvSNbJ\tP\u0013\u0013ad\u001eU\u0006A<Q\u001d|P\u0010<IVE\u0004\u001d\u0011.#\u0007oOd\u0005\u0012n\u00193T.\u0383wҜ@ףLN\u0018m\u0006s\u0012\u0006z\u0002X\u001av[P=\n\u0015F\u0017[ڛ2ހ/\u074co\u0004PDu{ݼd\u007f"}, d2 = {"\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqe=\u000f\u0017$Xk\u000bCv\u0010Bc\t D|*\u0004", "$", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqh@|\u0016\tTs\u001d<a2?d}-F\u0002k", "", "7mXA\\(ED\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "D`[BX", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "/ec2e\nAO\"\u0001z", "", ">q^=X9Mg", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[E", "=kS#T3NS", "<df#T3NS", "uKZ<g3B\\b\fz_3|\u0007>/e\u0013\tJ\f\u0017$V\u0004c#{!FUG'3v\u0018w7@@k2-jOf5\u0018_uUr0I\u00168)aRpLiUK", "0dU<e,\u001cV\u0015\b|^", "", "uKZ<g3B\\b\fz_3|\u0007>/e\u0013\tJ\f\u0017$V\u0004c#{!FUG'3v\u0018w7@@k2-jOf5\u0018_uUr0I\u00168)aRpLiUO", "5dc#T3NS", "BgX@E,?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWIv&<Y{/\u0001S\u0001;WN;xC2j,H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g", "Adc#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWIv&<Y{/\u0001S\u0001;WN;xC2jOf5\u0018_uUr0I\u00168)aRpLiUK", "BnBAe0GU", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class ObservableProperty<V> implements ReadWriteProperty<Object, V> {
    private V value;

    public ObservableProperty(V v2) {
        this.value = v2;
    }

    protected void afterChange(KProperty<?> property, V v2, V v3) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    protected boolean beforeChange(KProperty<?> property, V v2, V v3) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public V getValue(Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object obj, KProperty<?> property, V v2) {
        Intrinsics.checkNotNullParameter(property, "property");
        V v3 = this.value;
        if (beforeChange(property, v3, v2)) {
            this.value = v2;
            afterChange(property, v3, v2);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
