package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.JvmActuals_jvmKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
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
/* JADX INFO: compiled from: SemanticsConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLc\u0003\u001eI\u0006>/6B\u0015\"4\u0012\u0006јnj?0LeV7ZS0\u0013s{BGcҕyCIU\"}(\u0015WN}gvJ`\fK\u000f\u0014\u001c\u0001̓4Ic\u001fe\u0012\u00157JoM?UڎC>vҚf\u0005N1RP\n\u0019\u0011,:N z\u000bCQ\r@2PtJT#L3\u001d@\u0007l A!֔kNDL5pH=;\u0003\u0018Q~+m@\u0015M;Ͽ\u001b܋˼za$<\tRC'=S1\rr]EšM\u0005m\u000fv;?1Yug6\u001f\u0013B\u0017q̄\r&}4q\u001dQ\u000f\u0012m˃յgKV$p{\t\u0013%<2\u05faN8VFE\u001a\u0015\u000e>9\u0003\fkBf\u0001\rEFфa~73\u001aK+\u007f.\u0007Sgݢ'ag\u0006\u0013!6)\u0011p1[\u001b!\u000f\u0017aƟwΦ5QNX\u0011y\u0018uUmJ\u0004\u0003\u00040ʶ>Z09\n%F\u001d59k9i4\u001a\u0004xNu\u0014\u001dfxUyR\u000fSP\rގ;*\u0017+#sr%\u0004RjWr$m\u001eZ͵\f\u001bC*j\fT'5\u0012^O/|\u0019O\u000e\u00163L~?ir{\u0010m8%FcoӒ\u0014a`\u0016\\EJ\u0004\u001dX\u0015d\u001a #{6EJ`z$\b\u000eTT\u001c\u0017B?w\u001db.A\u001dl\u0017^\u0002LEo}7\u0004!ӧ\u0010GgAI\u001biR\u00049\u0005^\u0003\to\u0016ծ\u0010ؓʬd\"3h\u001a]'Nm\"\u0017C\u001d%\rѨ\u0002\u0013wqZ[dr&we{f)H;\u00023K<'~oEHΦEʆve_wZ-\t(\u0012\u000fi\u0015t{X\u0003~1xjxU+Ϧ.Ցb~+Ψ|\u0002\u007ffT\u0002geZ\u0013iG\u001a\u000b\u0011cTNf\u0003[ț*ݵ\u0005{*ĜM/I1+\u001d\u0018\u00165 of:\u000e<\u0006z!6zu\b<c\u001cp\u0011Sm6K:_X-AP1CÚD\u05f8nw\u0010ȷޯ8:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMlc@$", "", "u(E", "7r29X(KW\"\u0001h^4x\u0012>i}6", "", "u(I", "Adc\u0010_,:`\u001d\b|L,\u0005\u00058t\u0004&\n", "uY\u0018#", "7r<2e.B\\\u001blzf(\u0006\u00183c\u000e\u0012|\u001f\u0001%\u0015Gx\r8\u007f4C", "Adc\u001aX9@W\"\u0001h^4x\u0012>i}6eA_\u0017%Eo\u0017;r.Dg", ">q^=f", "", "1n[9T7LS\u0004~zk", "", ">dT?", "1n[9T7LS\u0004~zkj\r\r)r\u007f/{<\u000f\u0017", "1n]AT0Ga", "\"", "9dh", "1n]AT0Ga|\u0007\u0006h9\f\u00058t`2\t\u001c~\u0015\u0017U}\u00129z,9h\u0012", "1n]AT0Ga|\u0007\u0006h9\f\u00058t`2\t\u001c~\u0015\u0017U}\u00129z,9h\u0012^Gq\u0010;MJ;gB\u001e", "1n_F", "3pd._:", "=sW2e", "5dc", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bI,bLj.QJ=X\u001cy9\u001d\u0014$wK0\r\u0003h\u0017", "5dc\u001ce\fEa\u0019", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bI,bL\u000eMV]3`[<B%\u001a$\u000f^4\u000b\u0014]K-|\u000e\u0018/\u0011*X\u0006EqKaYt:f\u0002> \u0017C\u0003\u0017?+&mFWnO", "5dc\u001ce\fEa\u0019g\u000be3x\u00066e", "6`b566=S", "", "7sT?T;H`", "", ";da4X\nAW }", "1gX9W", ";da4X\nAW }9n0v\u0016/l\u007f$\n@", "Adc", "D`[BX", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bI,bL\u000eLH_(&YnF\u0016[D\u000bS+\u000b\u0014/\u0005\u0015", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, KMappedMarker {
    public static final int $stable = 8;
    private boolean isClearingSemantics;
    private boolean isMergingSemanticsOfDescendants;
    private final Map<SemanticsPropertyKey<?>, Object> props = new LinkedHashMap();

    public final <T> T get(SemanticsPropertyKey<T> semanticsPropertyKey) {
        T t2 = (T) this.props.get(semanticsPropertyKey);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    public final <T> T getOrElse(SemanticsPropertyKey<T> semanticsPropertyKey, Function0<? extends T> function0) {
        T t2 = (T) this.props.get(semanticsPropertyKey);
        return t2 == null ? function0.invoke() : t2;
    }

    public final <T> T getOrElseNullable(SemanticsPropertyKey<T> semanticsPropertyKey, Function0<? extends T> function0) {
        T t2 = (T) this.props.get(semanticsPropertyKey);
        return t2 == null ? function0.invoke() : t2;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        return this.props.entrySet().iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public <T> void set(SemanticsPropertyKey<T> semanticsPropertyKey, T t2) {
        if ((t2 instanceof AccessibilityAction) && contains(semanticsPropertyKey)) {
            Object obj = this.props.get(semanticsPropertyKey);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
            Map<SemanticsPropertyKey<?>, Object> map = this.props;
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) t2;
            String label = accessibilityAction2.getLabel();
            if (label == null) {
                label = accessibilityAction.getLabel();
            }
            Function action = accessibilityAction2.getAction();
            if (action == null) {
                action = accessibilityAction.getAction();
            }
            map.put(semanticsPropertyKey, new AccessibilityAction(label, action));
            return;
        }
        this.props.put(semanticsPropertyKey, t2);
    }

    public final <T> boolean contains(SemanticsPropertyKey<T> semanticsPropertyKey) {
        return this.props.containsKey(semanticsPropertyKey);
    }

    public final boolean containsImportantForAccessibility$ui_release() {
        Set<SemanticsPropertyKey<?>> setKeySet = this.props.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            if (((SemanticsPropertyKey) it.next()).isImportantForAccessibility$ui_release()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    public final void setMergingSemanticsOfDescendants(boolean z2) {
        this.isMergingSemanticsOfDescendants = z2;
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final void setClearingSemantics(boolean z2) {
        this.isClearingSemantics = z2;
    }

    public final void mergeChild$ui_release(SemanticsConfiguration semanticsConfiguration) {
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : semanticsConfiguration.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.props.get(key);
            Intrinsics.checkNotNull(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object objMerge = key.merge(obj, value);
            if (objMerge != null) {
                this.props.put(key, objMerge);
            }
        }
    }

    public final void collapsePeer$ui_release(SemanticsConfiguration semanticsConfiguration) {
        if (semanticsConfiguration.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (semanticsConfiguration.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : semanticsConfiguration.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.props.containsKey(key)) {
                this.props.put(key, value);
            } else if (value instanceof AccessibilityAction) {
                Object obj = this.props.get(key);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                Map<SemanticsPropertyKey<?>, Object> map = this.props;
                String label = accessibilityAction.getLabel();
                if (label == null) {
                    label = ((AccessibilityAction) value).getLabel();
                }
                Function action = accessibilityAction.getAction();
                if (action == null) {
                    action = ((AccessibilityAction) value).getAction();
                }
                map.put(key, new AccessibilityAction(label, action));
            }
        }
    }

    public final SemanticsConfiguration copy() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration.isClearingSemantics = this.isClearingSemantics;
        semanticsConfiguration.props.putAll(this.props);
        return semanticsConfiguration;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return Intrinsics.areEqual(this.props, semanticsConfiguration.props) && this.isMergingSemanticsOfDescendants == semanticsConfiguration.isMergingSemanticsOfDescendants && this.isClearingSemantics == semanticsConfiguration.isClearingSemantics;
    }

    public int hashCode() {
        return (((this.props.hashCode() * 31) + Boolean.hashCode(this.isMergingSemanticsOfDescendants)) * 31) + Boolean.hashCode(this.isClearingSemantics);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (!this.isMergingSemanticsOfDescendants) {
            str = "";
        } else {
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.isClearingSemantics) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : this.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(key.getName());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + "{ " + ((Object) sb) + " }";
    }
}
