package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: CompositionContext.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яz\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005'4\u0012\u0006\rnj?1Le^.ZS0\u0010s{J$c$wFCU(}*ޛWN}gvϺb\u000bY\u000f\u000e\u0016\u000fj4I[ze\u0012%2JoE5UoS9ht<\n(288\u0002\u0005\u0007\u001b2H&v\u0003CQ\u000f\u001a0N\u0012BR#M\r\u001a\u0018\u0007F \u0017\u001edgT@N\u0012sŽ_#1h\u0003S-ڿ݁\u0001M\u001bF\u001dO\u001b\u000ey\u001eYXg9#>k\u00035l\fN\u0011Z\nH\u0015j7'Ya\"s͏\\\u007f\u001a2qmոat,z\u0013p)\u001f5Kgcyh>,\u0006\u001c\u0014\rj&T$όL.3=/\u0013\u001cW\rr\u0002X\u0017\u0010ެF\u007f\u0001\u0007~\"3&K+gB-_ň?\u0019T_D\u0018\u001bG;\u0001\u001d9\fX\u001c\u0002-\u001b\u0003\u001a\u0018OҨD=NxRlK\u0019\u001cp\u0011\u001aZ\b>`\u0018/*+t5É;[?Oi~\u0010u\\g%\u001d\u0011la\u0018jHnQ54֖.\t\u0012\u000b\r\u007f\u0013\u001dhT\u0007DAQ*u\u001f}65P`\u0006n9%>\u0002\u0016\u0007ȬnMc>mDtlqp\u0002\r\u0006l\u000f7Cr{\u0010\u0010t=\"͖@b\u000b\u000f/[aCr\\V:bRxH\u0010\u0002TP\u001c\u0013`y Uz:֞\u001d\\\u001b\u0004K1P}\u0015\t\u000er\u0019\u0014\r\u0012K$1(j\u0003֊\u0005Pb08z\u0007\nD|\u000f:]E_N1&\u0004</Rč'\u0007\u00055HZu\u000f_L\u001b.&Y\n9.\u001agku[т\u0013~/uJ8S\u0011\u000be\u007feX5ϸ\u0001y\u0015\u00011AuN\u0003pZx\u001bN]\u0012/\"%\u001d91ϋh\u007f\u007f)\u000f\u000eU,l\u000b\nVyv\u0011rTNf\u0017K=Ǫ)\u0001ukME;D?\u001dDyjڍ\u0017˸am\b0\u007fe\u001d*Eu\u00121{\u0016\u001ed(Ђ4֑<Mq\u0001D(2pSRVq\u0010\bp\u000b\u000b٠5ȈEh\tX>U\u00193Nv\u00155%p\u0005e\u0011݅qϻ82w,yN\f /S3\u001eeS\u0016{Dѝ^\u05c8N\u0013\"\r\u0002@|\"lQ.god\u001f/4\u0006N\u0005\u0018ݶdƀ@\r<62O\u0016\u001f\u0014dw\u001b(z.T6ʶ\u0019ЋFwSX\u0014j\u0007lưLO"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "", "u(E", "1n[9X*MW\"\u0001XZ3\u0004eCI\t)\u0006M\t\u0013&Ky\u0017", "", "5dc\u0010b3ES\u0017\u000e~g.Z\u00056l\\<_I\u0002!$Ok\u001d@\u0001.sf\u000e)Fq\u001e.GP;r4\u001a#h", "u(I", "1n[9X*MW\"\u0001eZ9x\u0011/t\u007f5_I\u0002!$Ok\u001d@\u0001.", "5dc\u0010b3ES\u0017\u000e~g.g\u0005<a\b(\u000b@\u000ez Hy\u001bDr49c\u0007^D}\u001f=QK;eA\u001e\u001ch]G\u0007", "1n[9X*MW\"\u0001hh<\n\u0007/I\t)\u0006M\t\u0013&Ky\u0017", "5dc\u0010b3ES\u0017\u000e~g.j\u0013?r}(_I\u0002!$Ok\u001d@\u0001.sf\u000e)Fq\u001e.GP;r4\u001a#h", "1n\\=b<GR{z\ta\u0012|\u001d", "", "5dc\u0010b4I])\byA(\u000b\f\u0015e\u0014f\tP\n&\u001bOo\bIv,5U\f ", "u(8", "3eU2V;\u001c]&\t\u000bm0\u0006\t\ro\t7{S\u0010", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u0012Y->Q(\\\u0005k6\r\u00183n\u007f\u0006\u0006I\u0010\u0017*V", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "=ab2e=>`{\t\u0002],\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0018JQ;xE\u001e\"Kk@\u0006c9$", "5dc\u001cU:>`*~\bA6\u0004\b/r>5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.;|\u001a8V-8y4+&hn\u001c\u0011j+N\u0004|", "@dR<`7Ha\u0019\\\u0005k6\r\u00183n\u007f\u0006\u0006I\u0010\u0017*V", "5dc\u001fX*H[$\t\t^\n\u0007\u00169u\u000f,\u0005@^! Vo!K52Eb\r$?m\u0010;MJ;gB\u001e", "1n\\=b:>7\"\u0003\nb(\u0004", "", "1n\\=b:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF\u007f4Bc\u0005'7ls8UNEy8-\u0019rj\u000f", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "1n\\=b:>7\"\u0003\nb(\u0004G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001.Df\b'>m\u0015\fWKFuB\"$lkB\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0016W~Y", "2d[2g,=;#\u0010v[3|f9n\u000f(\u0005O", "@dU2e,GQ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015Ua:\u0007p,Wt'\u001d", "2d[2g,=;#\u0010v[3|f9n\u000f(\u0005O?$'P~\u0012Dv\u001fBY\u0005 3{\u0016", "2n]266F^#\r~g.", "2n]266F^#\r~g.;\u0016?n\u000f,\u0004@z$\u0017No\nJv", "5dc\u0010b4I]'\u0003\nb6\u0006o9c{/i>\u000b\"\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9x<\u000439g\r @|s8UNEy8-\u0019rj \u0011a(U^#R\"", "5dc\u0010b4I]'\u0003\nb6\u0006o9c{/i>\u000b\"\u0017\u0006|\u001eE\u0006)=Yw-7t\u0016*[C", "7mb2e;&]*zwe,Z\u00138t\u007f1\u000b", "7mb2e;&]*zwe,Z\u00138t\u007f1\u000b~\u000e' Vs\u0016<p25`}\u001cEm", "7me._0=O(~", "7me._0=O(~9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "7me._0=O(~h\\6\b\t", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u001fs?%j", "7me._0=O(~h\\6\b\tmr\u00101\u000bD\t\u0017\u0011To\u0015<r35", ";ne.U3>1#\b\n^5\fv>a\u000f(h@\b\u0017\u0013Uo\r", "2`c.", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015>", ";ne.U3>1#\b\n^5\fv>a\u000f(h@\b\u0017\u0013Uo\rz\u00045>h\u0002(7g#.TC7y4", ";ne.U3>1#\b\n^5\fv>a\u000f(h@\u000f!\u001eXo", ";ne.U3>1#\b\n^5\fv>a\u000f(h@\u000f!\u001eXoLI\u0007.D]\u0006 1z\u00165M?Ik", "@dR<e+\"\\'\nz\\;\u0001\u00138T{%\u0003@", "B`Q9X", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001dF\u0001,9b\u007fi\u0015w\u001e9WQ?z8(\u001eG]H\u00039", "@dR<e+\"\\'\nz\\;\u0001\u00138T{%\u0003@?$'P~\u0012Dv\u001fBY\u0005 3{\u0016", "@dV6f;>`v\t\u0003i6\u000b\t<", "1n\\=b:>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "@dV6f;>`v\t\u0003i6\u000b\t<$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "@dV6f;>`v\t\u0003i6\u000b\r>i\n1", "@dV6f;>`v\t\u0003i6\u000b\r>i\n1:M\u0011 &Kw\u000e6\u0004%<Yy.7", "@d_<e;+S!\t\f^+Z\u00137p\n6\u007fO\u0005! ", "@d_<e;+S!\t\f^+Z\u00137p\n6\u007fO\u0005! \u0006|\u001eE\u0006)=Yw-7t\u0016*[C", "AsP?g\nH[$\t\tb5~", "AsP?g\nH[$\t\tb5~G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "Cma2Z0Lb\u0019\fXh4\b\u0013=e\r", "Cma2Z0Lb\u0019\fXh4\b\u0013=e\rf\tP\n&\u001bOo\bIv,5U\f ", "Cma2Z0Lb\u0019\fXh4\b\u0013=i\u000f,\u0006I", "Cma2Z0Lb\u0019\fXh4\b\u0013=i\u000f,\u0006I?$'P~\u0012Dv\u001fBY\u0005 3{\u0016", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime_release(ControlledComposition controlledComposition, Function2<? super Composer, ? super Integer, Unit> function2);

    public abstract void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference);

    public void doneComposing$runtime_release() {
    }

    public abstract boolean getCollectingCallByInformation$runtime_release();

    public abstract boolean getCollectingParameterInformation$runtime_release();

    public abstract boolean getCollectingSourceInformation$runtime_release();

    public abstract int getCompoundHashKey$runtime_release();

    public abstract CoroutineContext getEffectCoroutineContext();

    public CompositionObserverHolder getObserverHolder$runtime_release() {
        return null;
    }

    public abstract CoroutineContext getRecomposeCoroutineContext$runtime_release();

    public abstract void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference);

    public abstract void invalidate$runtime_release(ControlledComposition controlledComposition);

    public abstract void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl);

    public abstract void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState);

    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
        return null;
    }

    public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
    }

    public void registerComposer$runtime_release(Composer composer) {
    }

    public abstract void registerComposition$runtime_release(ControlledComposition controlledComposition);

    public abstract void reportRemovedComposition$runtime_release(ControlledComposition controlledComposition);

    public void startComposing$runtime_release() {
    }

    public void unregisterComposer$runtime_release(Composer composer) {
    }

    public abstract void unregisterComposition$runtime_release(ControlledComposition controlledComposition);

    public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
        return CompositionContextKt.EmptyPersistentCompositionLocalMap;
    }
}
