package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&˛\bDRш|İI\u0006>\u00176Ȑ\u0007\":\u001b\u007f\u0007ljA0ZeP.X\\2\u000f\u0002{<řc$\bCCU \u0002*\t]NogtL`\u0010YƤ.\u0018~̓:H\u0006x\f\u0012OGH}O7[pU9\u000fvF\t.5:8(\tв\u001e*V\u00157.IY\u001c\u0016>A\t:\u0001\u000f]\t(\u0015\u001e>N\u0005.vuTN^|aJ19\u0002 ĩ^)o03ձ\u001dJd)#u\u0018ӜYG˝9\u00153[C2b_M\u0004Wqk\u0007xC-+WyoLh\u0004$\u0017ANCƞ\u0003(l\u0005\bӠ\u001c+;QyJ\u0007ʫV~ߡ\u007f\rJ\rV&5YF-PǑ8\u0012A\u0007\u000bSnc2fP\u0014\u0013eF\u0017+\u0001a@\u007fӜfЂe;'d\u007f\u0019\u0013$6%\u0017mWż\u0005\u0014n-3V\u000ePg҅pAVg\"YsЧձtb\u0010DLXU\u001bG{?JG)EmQ#O~2PR{\u000f\tphYj\u0001]p&|3O*?ȱ!լdʰoPbvt\u0017[;l\u0007,\nY4-\u0014J$=\u0010|S\u0019mxWu\nS3%w0ʥwް[?fڨMSi\u001bo^G<MBz\u001bhjRU\"Y\u0013̥24XjFǮ\fH^\u000e)1uڤJ;\u0003ռ\u001bÅ\u0019N\u000bٜZC\u0003\u0016mh9\u001f\rUK$1k˨x\u000f\tˆtruv\u0007Yؼ\u0001\u0001"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMlc@$", "\"", "", "<`\\2", "", "7r8:c6Kb\u0015\b\n?6\nd-c\u007f6\nD}\u001b\u001eK~\"", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p\u0004q", ";da4X\u0017HZ\u001d|\u000f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p'\u0007!&Ns\u0017\u0006{6=#~0@k%2WLI5\u0015.\u001efp=\u0011lx$:\u0018", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012g", "\nrTA \u0006\u0017", "7r8:c6Kb\u0015\b\n?6\nd-c\u007f6\nD}\u001b\u001eK~\"z\u0007)/f}'7i$.", "u(I", "5dc\u001aX9@S\u0004\t\u0002b*\u0011G?iy5{G\u0001\u0013%G", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc#T3NS", "BgX@E,?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", ">q^=X9Mg", "\u001aj^A_0G\u001d&~{e,z\u0018xKj5\u0006K\u0001$&[E", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002CX|L\u001b\u0016cW[+\u000e\fY?38*\",\u00127I\u000fJ|VO|\u00131{l\f]\fP{^_>.hDh5", ";da4X", ">`a2a;/O \u000fz", "1gX9W\u001d:Z)~", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "Adc#T3NS", "", "D`[BX", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002CX|L\u001b\u0016cW[+\u000e\fY?38*\",\u00127I\u000fJ|Vr\u001b\nFf:IR\u0019IC~rF)fU/#j", "BnBAe0GU", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private boolean isImportantForAccessibility;
    private final Function2<T, T, T> mergePolicy;
    private final String name;

    /* JADX INFO: renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey$1 */
    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0006\u001d<;%,˛\u0018FZb;\u0003a\b6é<A/(:\u0012\u0010\t|i\u007f/tiV/jSp\u000e2\u0004Č(]*sQ>"}, d2 = {"\n`]<a@F])\rS", "\"", ">`a2a;/O \u000fz", "1gX9W\u001d:Z)~", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends Lambda implements Function2<T, T, T> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final T invoke(T t2, T t3) {
            return t2 == null ? t3 : t2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, Function2<? super T, ? super T, ? extends T> function2) {
        this.name = str;
        this.mergePolicy = function2;
    }

    public final String getName() {
        return this.name;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, AnonymousClass1 anonymousClass1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 + 2) - (i2 | 2) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1);
    }

    public final Function2<T, T, T> getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    public final boolean isImportantForAccessibility$ui_release() {
        return this.isImportantForAccessibility;
    }

    public SemanticsPropertyKey(String str, boolean z2) {
        this(str, null, 2, null);
        this.isImportantForAccessibility = z2;
    }

    public SemanticsPropertyKey(String str, boolean z2, Function2<? super T, ? super T, ? extends T> function2) {
        this(str, function2);
        this.isImportantForAccessibility = z2;
    }

    public final T merge(T t2, T t3) {
        return this.mergePolicy.invoke(t2, t3);
    }

    public final T getValue(SemanticsPropertyReceiver semanticsPropertyReceiver, KProperty<?> kProperty) {
        return (T) SemanticsPropertiesKt.throwSemanticsGetNotSupported();
    }

    public final void setValue(SemanticsPropertyReceiver semanticsPropertyReceiver, KProperty<?> kProperty, T t2) {
        semanticsPropertyReceiver.set(this, t2);
    }

    public String toString() {
        return "AccessibilityKey: " + this.name;
    }
}
