package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d̉=!4i\bDZc|\u0004G\u00078\u000b<Ȑ\u0007Ӭ4\u0012\u000e\u0007njO0LeN1ZS@\u000fsڔ<$q$yّCU0}*\tUNog\u0005Jb\u000bI\u0012\u000e\u0016\u0007j4Ikxe܈\u00172PuG\u074cUoKXhҚN\u001d.>:8(\u00121\"8V(z\u000bCQ\r@?ptHb%M3+*(L,\u0019\u001e\u000bt~>Vzu>?#\tjp]Wc>\re\rteW\u0011\u0005f6+n={\u001a=m\u0011\u0019j[m\noyK\u0013\u0001+7+Ot\u0006E\t\u0004\"%CO;n9+t'_r$'YV\u0014S^\u001c@{\u000b{\u0013=2\u001d6+V>E\u001a\u0015\u0019>7\u0003wk@~\b%G\u0018\u0013oI/%.G[A)tieK\u0019T8*\u0014=\"1\u0011\u0007!\ne&\u0006#0lyg0\u0018V]JTˣgS\u0016\u0004\u001fo24\u0012G_\u0006?}!.];eZ\u007f\u05fa\u074co\u0002V\\\u007f\u0011\u0013y\u0001S\u0018lp@P\nF;8%$Zr\u00025o^rp,?jbT\u001f$\u0016,8\\&VA'\u0016ʚ]~\u0012p]_\u001a%u|ex\u001fo\u001csQ^aR\u0002g\u001e\u007fjvB\\\u0003b%pt̻k\u0012j^8\"`H\u0019\u000fNӼF«\u0010\u0019:ŭ\n\u001e:-?\u001b|!V\u00066Bo\u0001_ݣ\\ӳ\u0014~\\՜D\u001fw)\r\t/V\u0005p\u001en/\u000f\u0003ʑbĘ1Ka7\u001f.c+\u00016\u0003-\u0015\n·\u0004g"}, d2 = {"\u0011n\\=b:Bb\u001d\t\u0004B4\b\u0010\u001de\r9\u007f>\u0001|\u0017[", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u001cMPLo2\u001ezhu\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0012UNBA", "5dc\u0010b4I]'\u0003\nb6\u0006l7p\u0007\u0016{M\u0012\u001b\u0015GU\u000eP", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.;|\u001a8V1;xE\"\u0013hG9\u001b9", "\u001ed]1\\5@/$\n\u0002r\u0015\u0007p9d\u0004)\u007f>|&\u001bQx\u001c", "", "@dR<`7Ha\u0019\\\u0005k6\r\u00183n\u007f\u0006\u0006I\u0010\u0017*V", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF\u007f4Bc\u0005'7ls8UNEy8-\u0019rj\u000f", "5dc\u001fX*H[$\t\t^\n\u0007\u00169u\u000f,\u0005@^! Vo!K5!>b\b/3|\u001a8VQ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001.Df\b'>m\u0015\fWKFuB\"$lkB\\'\u001d", "5dc\u001fX*H[$\t\t^\n\u0007\u00169u\u000f,\u0005@^! Vo!K", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001.Df\b'>m\u0015\fWKFuB\"$lkB\\'\u0013T\u00016NPWuZ\\\u007fG$!^\u0017N9VbcN.~S;(\b\nS\u000bJh\u0014\u001bk", "\u0011n\\=b:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0004", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", ">`a2a;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "\u0011n]Ae6EZ\u0019}Xh4\b\u0013=i\u000f,\u0006I", " dd@T)ESv\t\u0003i6\u000b\r>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<\u000731V\u0005 \u0015w\u001e9WQ?z8(\u001e>", "5dc\u0010b4I]'\u0003\nb6\u0006v/r\u0011,y@", "\"", "9dh", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 7#*7t3+\u001fl`LPa6V\u00021UL\u00189l[\u0002A\u001c\u0012$kX3\u0018\u000fgE3rN@\r\b9Z\u00069hf\f*cxQu>g\f\u0011\u0001\u0011~CrRC^_wV\u0017", "AvP=", "", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.D@\u0002.FC", RemoteSettings.FORWARD_SLASH_STRING, "", AdkSettings.PLATFORM_TYPE_MOBILE, "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CompositionKt {
    private static final Object PendingApplyNoModifications = new Object();
    private static final CompositionServiceKey<CompositionImpl> CompositionImplServiceKey = new CompositionServiceKey<CompositionImpl>() { // from class: androidx.compose.runtime.CompositionKt$CompositionImplServiceKey$1
    };

    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(ControlledComposition controlledComposition) {
    }

    public static final <T> T getCompositionService(Composition composition, CompositionServiceKey<T> compositionServiceKey) {
        CompositionServices compositionServices = composition instanceof CompositionServices ? (CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    public static final CoroutineContext getRecomposeCoroutineContext(ControlledComposition controlledComposition) {
        CoroutineContext recomposeContext;
        CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
        return (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) ? EmptyCoroutineContext.INSTANCE : recomposeContext;
    }

    public static final Composition Composition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final ReusableComposition ReusableComposition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final ControlledComposition ControlledComposition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final Composition Composition(Applier<?> applier, CompositionContext compositionContext, CoroutineContext coroutineContext) {
        return new CompositionImpl(compositionContext, applier, coroutineContext);
    }

    public static final ControlledComposition ControlledComposition(Applier<?> applier, CompositionContext compositionContext, CoroutineContext coroutineContext) {
        return new CompositionImpl(compositionContext, applier, coroutineContext);
    }

    public static final CompositionServiceKey<CompositionImpl> getCompositionImplServiceKey() {
        return CompositionImplServiceKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void swap(List<T> list, int i2, int i3) {
        T t2 = list.get(i2);
        list.set(i2, list.get(i3));
        list.set(i3, t2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(MutableIntList mutableIntList, int i2, int i3) {
        int i4 = mutableIntList.get(i2);
        mutableIntList.set(i2, mutableIntList.get(i3));
        mutableIntList.set(i3, i4);
    }
}
