package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&˛\bDRш|İI\u0006F\u000b6B\u0005%4\u0012\u0006\u0010nj?2LeV4ZS0\u0010s{B0c$wDCU(}*ޛWN}gvJp\u000bK\u000f\u001c\u0016\u0001j2J[ޔ\u001c(ƁZDuЀAL =g`5C\u0015$@#Py3\u0003ʀ.J\u0016y\tG\u0014$ 7XphZ=S\u0013#*\bT\u001f/\u001e#ʸOɇLncD=.KwPZ?_^\n\u0014ЌEù+\u000f|o,:\tEC%=S1\u0018\u0019Đ>ƄCsC\u0017v:oXW\bo6\u0007\u0015D09e%t\u0003.l\u000bab\u001c'aՒ\u0012c`\u00108w)\u0011;SǬ\u0012\u0006-atƭ Ǵ\f\u00109\u000f\u0001n\u0011d\u0010_Z\u007f)clЍ{İ5ڢ=!nϟq=\u001fSE\u0002˥\f\u001fœ\u007fnO]ړ\u0012|"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Bz0@Uz'7]!-IR;x\n", "\"", "", "1n\\=b:>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "1n]@g9NQ(\t\b&0\u0005\u00146", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCY\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011Y^5kVz=]od\u0016Y5\u001b\u0005f\u0017", "5dc\u0010b4I]'~\b\u001d(\u0006\u00129t{7\u007fJ\n%", "u(E", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DC|3IT75;\u001a\u001ej+#\u0004h,L\u0006|\u000bA", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCY\u0012", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCY\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d", "CoS.g,", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9}Gu!DY\u000bu", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "CoS.g,\u0006W!\n\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DC|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u001a\u0001Pu", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class SkippableUpdater<T> {
    private final Composer composer;

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ SkippableUpdater m3662boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static <T> Composer m3663constructorimpl(Composer composer) {
        return composer;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m3664equalsimpl(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && Intrinsics.areEqual(composer, ((SkippableUpdater) obj).m3669unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m3665equalsimpl0(Composer composer, Composer composer2) {
        return Intrinsics.areEqual(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m3666hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m3667toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    public boolean equals(Object obj) {
        return m3664equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m3666hashCodeimpl(this.composer);
    }

    public String toString() {
        return m3667toStringimpl(this.composer);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ Composer m3669unboximpl() {
        return this.composer;
    }

    private /* synthetic */ SkippableUpdater(Composer composer) {
        this.composer = composer;
    }

    /* JADX INFO: renamed from: update-impl */
    public static final void m3668updateimpl(Composer composer, Function1<? super Updater<T>, Unit> function1) {
        composer.startReplaceableGroup(509942095);
        function1.invoke(Updater.m3670boximpl(Updater.m3671constructorimpl(composer)));
        composer.endReplaceableGroup();
    }
}
