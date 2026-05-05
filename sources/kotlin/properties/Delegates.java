package kotlin.properties;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007njO0Le^.ZS0\u0011s{B$c$wCCU(\u0007*ޛUɥg}ñzZ9BO\u000b\u001cx̶0Icx&.\u001d3Z}O7]qS8\u000fsF\u000702h;(\u0007! 0Ϻ\u001ey#Cy\u000bZؔ?~>j\u001b]\t*\u0014\u001c=N\u007f.^wN|K\u001b_Z1)ɅwE~+m5\u0015MSI\u0005v\u0013xo$C\nGJ%8c\u0003\rS\nGƄC{C\u000ex--5Yu]<~\u000b$&;^S`ę*f\u000bZp\u0012-5_eQV44\b\f\f\u001c\u0003\u0007؝\n1N7= l\u0012\u001e5zxyM`\u0004nB.\t\u0010=]Ӣ\u0006Ɗ*ݍӸjQoJa\u05cc6\n\u0015%,3\u0005~#qS<_%\u001ddw\u00184\u007fB]JTˣg@\u001e\b~g\u001a*J3wO5}\u001f4/nGpI61k\bIroЛ\tjn\\yXNJ2p\u001c=P\u0014\u001ckTsKnÏXb2\u001a]\"Z\u0011\u000e\n\u0019&\u0003\u0004L25\u001f\u0015RŹmtSf\u001a+5pG[tq4dI`C5\u007ft>h\u0019Ο\u001aά;ϵۖ\\fPbۑZa0%8ʥ\u001b>vԤH`"}, d2 = {"\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqZ@\b\u0017\u0019C~\u000eJL", "", "u(E", "<nc\u001bh3E", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqh@|\u0016\tTs\u001d<a2?d}-F\u0002k", "\"", "=ab2e=:P ~", "7mXA\\(ED\u0015\u0006\u000b^", "=m25T5@S", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[E", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ">q^=X9Mg", "=kS#T3NS", "<df#T3NS", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00101\u0002\u0012]-Q[U0e\u001c}J\u001e\u001dZ\u001b]/\r\u0013#.$jC),\f;IlHr\f\f#\u001dI@", "Ddc<T)ES", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Delegates {
    public static final Delegates INSTANCE = new Delegates();

    private Delegates() {
    }

    public final <T> ReadWriteProperty<Object, T> notNull() {
        return new NotNullVar();
    }

    public final <T> ReadWriteProperty<Object, T> observable(T t2, final Function3<? super KProperty<?>, ? super T, ? super T, Unit> onChange) {
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        return new ObservableProperty<T>(t2) { // from class: kotlin.properties.Delegates.observable.1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, T t3, T t4) {
                Intrinsics.checkNotNullParameter(property, "property");
                onChange.invoke(property, t3, t4);
            }
        };
    }

    public final <T> ReadWriteProperty<Object, T> vetoable(T t2, final Function3<? super KProperty<?>, ? super T, ? super T, Boolean> onChange) {
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        return new ObservableProperty<T>(t2) { // from class: kotlin.properties.Delegates.vetoable.1
            @Override // kotlin.properties.ObservableProperty
            protected boolean beforeChange(KProperty<?> property, T t3, T t4) {
                Intrinsics.checkNotNullParameter(property, "property");
                return onChange.invoke(property, t3, t4).booleanValue();
            }
        };
    }
}
