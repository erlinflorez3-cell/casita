package androidx.compose.ui.node;

import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.Sequence;
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
/* JADX INFO: compiled from: ModifierNodeElement.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007|jAӄLe^.ZS@\u000fs{:(c$\u007fOCU ~*\t]ȞogtMb\u000bQ\u0018\u000e\u0016~j4Ic~e܈\u00172PoG3SqC^vҚ^\u000b&݅07\"\u0005/\u001aZH>w+Cy\u000eR3Ϯt:`\u0010\u0016\u0010((\u001e>Vҵd\u0001ʄR6V\u0004&K=;\u001bipgWe>\u0017e\u000f\\SU =Ҕ\u001esFEP-%\u0002\u001fMv$R\u0011\\\n=3\u0007W+9h\fWlݙF8Ʀ/O\u001b};0j&i`:ESO\u0012P\u0017\"x\u0006\t\u007f%>\u001a\r4,\u001f͖9բj\b\u0016ޗE\baFh\bnD\u0010z\u0010>E,6wڢ=\u001f~SgD'X\b\u000e\u0013\u00186#/sW\u001c+טbڠ\u001fX\u0010S7]NJ\u0019_\u0018gUo\u001ao\u0011\u0011`HΥK\u0004G}\u0017>%6\blG59m\u0018Grz-I¾lW\u0002TNT0\u0004ޔ;L"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u0015`}(7v%\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%*JJ;\\0%%h7", "u(E", "-h]@c,<b#\fkZ3\r\t=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "7mb=X*MO\u0016\u0006z>3|\u0011/n\u000f6", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&U\u000507M\u001d.UCDz\n", "5dc\u0016a:IS\u0017\u000ev[3|h6e\b(\u0005O\u000f", "u(;8b;EW\"H\t^8\r\t8c\u007f6E.\u0001#'Gx\f<L", "7mb=X*M]&ove<|\u0017", "5dc\u0016a:IS\u0017\u000e\u0005k\u001dx\u0010?e\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#a)Ex\u0016,\\MHO=\u001f\u001f>", "<`\\29(EZ\u0016zxd", "", "5dc\u001bT4>4\u0015\u0006\u0002[(z\u000f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "D`[BX\u0016OS&\f~],", "", "5dc#T3NS\u0003\u0010zk9\u0001\b/", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1qT.g,", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B\u0018f*6mk", "3pd._:", "", "=sW2e", "6`b566=S", "", "CoS.g,", "", "<nS2", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2sB\b\u001f7CY\u001f", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ModifierNodeElement<N extends Modifier.Node> implements Modifier.Element, InspectableValue {
    public static final int $stable = 0;
    private InspectorInfo _inspectorValues;

    public abstract N create();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract void update(N n2);

    private final InspectorInfo getInspectorValues() {
        InspectorInfo inspectorInfo = this._inspectorValues;
        if (inspectorInfo != null) {
            return inspectorInfo;
        }
        InspectorInfo inspectorInfo2 = new InspectorInfo();
        inspectorInfo2.setName(Reflection.getOrCreateKotlinClass(getClass()).getSimpleName());
        inspectableProperties(inspectorInfo2);
        this._inspectorValues = inspectorInfo2;
        return inspectorInfo2;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final String getNameFallback() {
        return getInspectorValues().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        return getInspectorValues().getValue();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final Sequence<ValueElement> getInspectableElements() {
        return getInspectorValues().getProperties();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Actual_jvmKt.tryPopulateReflectively(inspectorInfo, this);
    }
}
