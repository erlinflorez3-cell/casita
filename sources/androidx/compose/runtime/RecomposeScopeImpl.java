package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.RecomposeScopeObserver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: RecomposeScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JhP.hS2\u000f\u0002{<$i*yCIU\"Ԃ*\t]WogtYb\u000bY\u000f\u000e\u0016~t4Ikxe\u0012%2JoM\u074cUڎE9vt>\u0005&9*8\u0010\u0005\t\u001a@H\u0018v\u0001DS\f(0Hp@S\u0015M\u001b\u001a\u001a\u0006D+\u0007Ȧrɡl\txl\f9_#1izMy =\rS\u001bGl)#u\u0010 ҋD7C\u0018m_\u0011@j[m\u0011ouK\u0006\u0001'U-\u0012\u007fepp\u007fB#[S\u001b\u0019\u000b&\u000b\u0011\u001az\u001acC]sM`\u000eV6\u000b}\u001d<2\u001c\u001c&vk]\u001etG&3#\u007f\u001cF^BvB.\t(J_3\u000etC9I)\u0002gI-f9\u0012\u0004;Ok\u000f|dsT<pE!b<i3g?ky\u0017\u001dg\u0003\u0006\u0004\u001f)2.\u0012Q_\u007f]\u001eW-ϲ)7a\u0001k;yJ`D\u0016\u00055hv\u001d\u0002VX@(oDgZ\u000f\u001an\\f\u001bj~\u0006!8\u001f\u00184T5\u000e8\u0017.&\u0010<OVXR]4\u0002j{kR)=3OY\u001dyV[G,K5\u007fqXm`E,?jp5\\t\u0002k\f\tipB@\u0018\u0003\u0010&\ntd\u001a\u001dJQ\u0002\u001eD,_%l\u0017X\u0003LOQ~\u0019_\tv>\n\u001bGl+wt\r\t/`\u0005t\u007fg~JZ-\u00118;\u0013iG),e&x4\u0003$5/\u0004\u0004WibFz\u001eD%\u001c{p0(=i1S\u0012=\u0004\u007fɌ\u000eβIXzόiO\u0018-\t\u0004\u001a\u0011Ap<pX\u000b~6x~ZQd\u0017P\u0003nt3\b\u0013\r\ncVzuqj\n\nI \u0382\u000fʾ@N@وU.,4\u0019oP\rkqϡ+!.y\u001a@#s.u}A\u0012b=3KЄ\u0010Нg\u0016w̥\"\u007f@PPI\b\u000fn&2\u0001\u001bBvz.L\u0001M\u000bن?ȈEn\tX>c\u0019A\u001eh\rC\u001b\t'}H,\b}b>\u0010.\u0002W\u0016\u0014\rS[U\f\u0018>ơyљ`\u0015b\u0011\u0010%\nC\u000f\u0014\"X.n(n\u0017L\u001esFC\u0018ݨnƀ@\t,҉|^\u0016([T\u0018\u0016@~\u000eZw\u000fEBx8y\u001bd֑\u0005חZR\u001dbK~/<!\u0001\u0015R,\u0011\u0006@\u0013\u000e^T]shEӘ!\r3lU\u001ft7{\\bZ3*n\u007f9g\u0014C\b\u0002\rߨSԆqqwȯH\u001a\u0003@P<kG_\u0012wxF]9W;̲pʝ\u0016fZƉrK\r \u0015\u000ej\u001a?\u000f'c\u000bo\u0011=\u0003\u00136{\u001aו\rӢH3\u001f\u000e\u0003\nT-M\b;TKa;65$oSi\u000e8$.;\u001ctOl\u000eN%J4ͬFϦu z\u0004\u000f<^2$0P\u001f\u0001\"~*Dz\u001a30#\u000f]y\f9@U;#D\u0001\f?ǎ\u0016ʋpm\u0007W\u0011/tCv{tZ^5YG[\\+lj@!W0X\u0017\u0001BE6#F\nx(>\u0001yg\u001f\u001b&܃\u0019Į3k2ԝ\u0002D`P\u0016'\nw\u0014*\u0003Y+:\u0005\u0001\u0015ļ\u0015ЁpB_В/\r6\u0019\r\fW$-\u0003Vr)\u0013bV)b#s\u000eئ+˝\u0011Qx\t\nzW8A3Xu)O\u0003\u001a}_\u000f\u00111J\u00199ʷ.F!t\u0006 :?ĞX\u0011"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u001fs?%j", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{:\u000105I\t\u001f3|\u0016\u001cKMFk\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u0011", "=v]2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC%}=\u001e\">", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW)v#?a\t*Em\u0004,WN;UF'\u0015u7|w", "/mR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "5dc\u000ea*A]&", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006R.3\\\b-\r", "Adc\u000ea*A]&", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u0018\u007f#8c\u000buz^", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "", "", "1`]\u001fX*H[$\t\t^", "", "5dc\u0010T5+S\u0017\t\u0003i6\u000b\t", "u(I", "1ta?X5MB#\u0005zg", "D`[BX", "2dU.h3Ma|\bh\\6\b\t", "5dc\u0011X-:c \u000e\tB5j\u00079p\u007f", "Adc\u0011X-:c \u000e\tB5j\u00079p\u007f", "uY\u0018#", "2dU.h3Ma|\b\fZ3\u0001\b", "5dc\u0011X-:c \u000e\tB5\u000e\u00056i~", "Adc\u0011X-:c \u000e\tB5\u000e\u00056i~", "4kP4f", "4na0X++S\u0017\t\u0003i6\u000b\t", "5dc\u0013b9<S\u0018kz\\6\u0005\u00149s\u007f", "Adc\u0013b9<S\u0018kz\\6\u0005\u00149s\u007f", "7r2<a+Bb\u001d\t\u0004Z3", "=ab2e=>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001dF\u0001,9b\u007fi$m\u00148UNEy4\f\u0013rl9p`:N\u00048GY$", "5dc\u001cU:>`*~\b\u001d(\u0006\u00129t{7\u007fJ\n%", "u(E", "@d`B\\9>a\u0006~xh4\b\u0013=e", "5dc\u001fX8NW&~\tK,z\u00137p\n6{", "Adc\u001fX8NW&~\tK,z\u00137p\n6{", "@da2T+B\\\u001b", "5dc\u001fX9>O\u0018\u0003\u0004`", "Adc\u001fX9>O\u0018\u0003\u0004`", "AjX=c,=", "5dc ^0I^\u0019}9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "Adc ^0I^\u0019}", "BqP0^,=2\u0019\nzg+|\u0012-i\u007f6", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129#", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000eFi%.#", "", "BqP0^,=7\"\r\nZ5z\t=", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001bv%\u0016IN\u0011", "CrT1", "5dc\"f,=", "Adc\"f,=", "D`[6W", "5dc#T3BR", "/c^=g,=0-", "1n\\=b:>", "1n\\=b:>`", "3mS", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0004", "BnZ2a", "7me._0=O(~", "7me._0=O(~[h9i\t=u\u00077", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9qE\b!<]|\u001cFq 7:CI{;-j", "7r8;i(EW\u0018_\u0005k", "7mbAT5<S'", "=ab2e=>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001dF\u0001,9b\u007fi\u0015w\u001e9WQ?z8(\u001eR^G\u0007p=N\u0004\nCUM3\\(", "=ab2e=>\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "@dR<e+\u001dS&\u0003\f^+j\u0018+t\u007f\u0019wG\u0011\u0017", "7mbAT5<S", "@dR<e++S\u0015}", "@d[2T:>", "@da2T+-`\u0015|\u0001^+`\u0012=t{1y@\u000f", "Ab^=X\u001aDW$\nz]", "AsP?g", "CoS.g,,Q#\nz", "1gT0^\u000b>`\u001d\u0010z]\u001a\f\u0005>e]+wI\u0003\u0017\u0016", "2d_2a+>\\\u0017\u0003zl", "\u0011n\\=T5B]\"", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {
    private Anchor anchor;
    private Function2<? super Composer, ? super Integer, Unit> block;
    private int currentToken;
    private int flags;
    private RecomposeScopeObserver observer;
    private RecomposeScopeOwner owner;
    private MutableScatterMap<DerivedState<?>, Object> trackedDependencies;
    private MutableObjectIntMap<Object> trackedInstances;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private static /* synthetic */ void getObserver$annotations() {
    }

    public RecomposeScopeImpl(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public final boolean getValid() {
        if (this.owner == null) {
            return false;
        }
        Anchor anchor = this.anchor;
        return anchor != null ? anchor.getValid() : false;
    }

    public final boolean getCanRecompose() {
        return this.block != null;
    }

    public final boolean getUsed() {
        return (-1) - (((-1) - this.flags) | ((-1) - 1)) != 0;
    }

    public final void setUsed(boolean z2) {
        if (z2) {
            this.flags = (-1) - (((-1) - this.flags) & ((-1) - 1));
        } else {
            int i2 = this.flags;
            this.flags = (i2 - 2) - (i2 | (-2));
        }
    }

    public final boolean getDefaultsInScope() {
        int i2 = this.flags;
        return (i2 + 2) - (i2 | 2) != 0;
    }

    public final void setDefaultsInScope(boolean z2) {
        if (z2) {
            this.flags = (-1) - (((-1) - this.flags) & ((-1) - 2));
        } else {
            this.flags &= -3;
        }
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final void setDefaultsInvalid(boolean z2) {
        if (z2) {
            this.flags |= 4;
        } else {
            this.flags = (-1) - (((-1) - this.flags) | ((-1) - (-5)));
        }
    }

    public final boolean getRequiresRecompose() {
        return (-1) - (((-1) - this.flags) | ((-1) - 8)) != 0;
    }

    public final void setRequiresRecompose(boolean z2) {
        if (z2) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void compose(Composer composer) {
        Unit unit;
        Function2<? super Composer, ? super Integer, Unit> function2 = this.block;
        RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null && function2 != null) {
            RecomposeScopeImpl recomposeScopeImpl = this;
            recomposeScopeObserver.onBeginScopeComposition(recomposeScopeImpl);
            try {
                function2.invoke(composer, 1);
                return;
            } finally {
                recomposeScopeObserver.onEndScopeComposition(recomposeScopeImpl);
            }
        }
        if (function2 != null) {
            function2.invoke(composer, 1);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    public final CompositionObserverHandle observe$runtime_release(final RecomposeScopeObserver recomposeScopeObserver) {
        synchronized (RecomposeScopeImplKt.callbackLock) {
            this.observer = recomposeScopeObserver;
            Unit unit = Unit.INSTANCE;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.RecomposeScopeImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj = RecomposeScopeImplKt.callbackLock;
                RecomposeScopeImpl recomposeScopeImpl = this.this$0;
                RecomposeScopeObserver recomposeScopeObserver2 = recomposeScopeObserver;
                synchronized (obj) {
                    if (Intrinsics.areEqual(recomposeScopeImpl.observer, recomposeScopeObserver2)) {
                        recomposeScopeImpl.observer = null;
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        };
    }

    public final InvalidationResult invalidateForResult(Object obj) {
        InvalidationResult invalidationResultInvalidate;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        return (recomposeScopeOwner == null || (invalidationResultInvalidate = recomposeScopeOwner.invalidate(this, obj)) == null) ? InvalidationResult.IGNORED : invalidationResultInvalidate;
    }

    public final void release() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.recomposeScopeReleased(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null) {
            recomposeScopeObserver.onScopeDisposed(this);
        }
    }

    public final void adoptedBy(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.invalidate(this, null);
        }
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.block = function2;
    }

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setRereading(boolean z2) {
        if (z2) {
            this.flags = (-1) - (((-1) - this.flags) & ((-1) - 32));
        } else {
            int i2 = this.flags;
            this.flags = (i2 - 33) - (i2 | (-33));
        }
    }

    public final boolean getForcedRecompose() {
        return (-1) - (((-1) - this.flags) | ((-1) - 64)) != 0;
    }

    public final void setForcedRecompose(boolean z2) {
        if (z2) {
            int i2 = this.flags;
            this.flags = (i2 + 64) - (i2 & 64);
        } else {
            int i3 = this.flags;
            this.flags = (i3 - 65) - (i3 | (-65));
        }
    }

    public final boolean getSkipped$runtime_release() {
        return (this.flags & 16) != 0;
    }

    private final void setSkipped(boolean z2) {
        if (z2) {
            this.flags = (-1) - (((-1) - this.flags) & ((-1) - 16));
        } else {
            int i2 = this.flags;
            this.flags = (i2 - 17) - (i2 | (-17));
        }
    }

    public final void start(int i2) {
        this.currentToken = i2;
        setSkipped(false);
    }

    public final void scopeSkipped() {
        setSkipped(true);
    }

    public final boolean recordRead(Object obj) {
        int i2 = 0;
        if (getRereading()) {
            return false;
        }
        MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        int i3 = 1;
        if (mutableObjectIntMap == null) {
            mutableObjectIntMap = new MutableObjectIntMap<>(i2, i3, null);
            this.trackedInstances = mutableObjectIntMap;
        }
        return mutableObjectIntMap.put(obj, this.currentToken, -1) == this.currentToken;
    }

    public final void recordDerivedStateValue(DerivedState<?> derivedState, Object obj) {
        MutableScatterMap<DerivedState<?>, Object> mutableScatterMap = this.trackedDependencies;
        if (mutableScatterMap == null) {
            mutableScatterMap = new MutableScatterMap<>(0, 1, null);
            this.trackedDependencies = mutableScatterMap;
        }
        mutableScatterMap.set(derivedState, obj);
    }

    public final boolean isConditional() {
        return this.trackedDependencies != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isInvalidFor(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r20
            r10 = r19
            r18 = 1
            if (r1 != 0) goto L9
            return r18
        L9:
            androidx.collection.MutableScatterMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> r9 = r10.trackedDependencies
            if (r9 != 0) goto Le
            return r18
        Le:
            boolean r0 = r1 instanceof androidx.compose.runtime.DerivedState
            if (r0 == 0) goto L19
            androidx.compose.runtime.DerivedState r1 = (androidx.compose.runtime.DerivedState) r1
            boolean r18 = r10.checkDerivedStateChanged(r1, r9)
        L18:
            return r18
        L19:
            boolean r0 = r1 instanceof androidx.collection.ScatterSet
            if (r0 == 0) goto L18
            androidx.collection.ScatterSet r1 = (androidx.collection.ScatterSet) r1
            boolean r0 = r1.isNotEmpty()
            r17 = 0
            if (r0 == 0) goto L83
            java.lang.Object[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L83
            r5 = r17
        L32:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            r13 = -1
            long r11 = r13 - r0
            long r0 = r13 - r2
            long r11 = r11 | r0
            long r13 = r13 - r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r11
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 == 0) goto L7e
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r17
        L54:
            if (r4 >= r11) goto L7c
            r0 = 255(0xff, double:1.26E-321)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r2
            long r13 = r13 | r0
            long r15 = r15 - r13
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L78
            int r0 = r5 << 3
            int r0 = r0 + r4
            r1 = r8[r0]
            boolean r0 = r1 instanceof androidx.compose.runtime.DerivedState
            if (r0 == 0) goto L18
            androidx.compose.runtime.DerivedState r1 = (androidx.compose.runtime.DerivedState) r1
            boolean r0 = r10.checkDerivedStateChanged(r1, r9)
            if (r0 == 0) goto L78
            goto L18
        L78:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L54
        L7c:
            if (r11 != r12) goto L83
        L7e:
            if (r5 == r6) goto L83
            int r5 = r5 + 1
            goto L32
        L83:
            r18 = r17
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.isInvalidFor(java.lang.Object):boolean");
    }

    private final boolean checkDerivedStateChanged(DerivedState<?> derivedState, MutableScatterMap<DerivedState<?>, Object> mutableScatterMap) {
        Intrinsics.checkNotNull(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
        if (policy == null) {
            policy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return !policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), mutableScatterMap.get(derivedState));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void rereadTrackedInstances() {
        /*
            r19 = this;
            r11 = r19
            androidx.compose.runtime.RecomposeScopeOwner r12 = r11.owner
            if (r12 == 0) goto L6d
            androidx.collection.MutableObjectIntMap<java.lang.Object> r1 = r11.trackedInstances
            if (r1 == 0) goto L6d
            r0 = 1
            r11.setRereading(r0)
            r10 = 0
            androidx.collection.ObjectIntMap r1 = (androidx.collection.ObjectIntMap) r1     // Catch: java.lang.Throwable -> L65
            java.lang.Object[] r9 = r1.keys     // Catch: java.lang.Throwable -> L65
            int[] r8 = r1.values     // Catch: java.lang.Throwable -> L65
            long[] r7 = r1.metadata     // Catch: java.lang.Throwable -> L65
            int r0 = r7.length     // Catch: java.lang.Throwable -> L65
            int r6 = r0 + (-2)
            if (r6 < 0) goto L6a
            r5 = r10
        L1d:
            r3 = r7[r5]     // Catch: java.lang.Throwable -> L65
            long r0 = ~r3     // Catch: java.lang.Throwable -> L65
            r2 = 7
            long r0 = r0 << r2
            long r15 = r0 + r3
            long r0 = r0 | r3
            long r15 = r15 - r0
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r15 + r13
            long r15 = r15 | r13
            long r1 = r1 - r15
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L60
            int r0 = r5 - r6
            int r0 = ~r0     // Catch: java.lang.Throwable -> L65
            int r0 = r0 >>> 31
            r14 = 8
            int r13 = 8 - r0
            r2 = r10
        L3d:
            if (r2 >= r13) goto L5e
            r0 = 255(0xff, double:1.26E-321)
            r17 = -1
            long r15 = r17 - r0
            long r0 = r17 - r3
            long r15 = r15 | r0
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L5a
            int r0 = r5 << 3
            int r0 = r0 + r2
            r1 = r9[r0]     // Catch: java.lang.Throwable -> L65
            r0 = r8[r0]     // Catch: java.lang.Throwable -> L65
            r12.recordReadOf(r1)     // Catch: java.lang.Throwable -> L65
        L5a:
            long r3 = r3 >> r14
            int r2 = r2 + 1
            goto L3d
        L5e:
            if (r13 != r14) goto L6a
        L60:
            if (r5 == r6) goto L6a
            int r5 = r5 + 1
            goto L1d
        L65:
            r0 = move-exception
            r11.setRereading(r10)
            throw r0
        L6a:
            r11.setRereading(r10)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.rereadTrackedInstances():void");
    }

    public final Function1<Composition, Unit> end(final int i2) {
        final MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        if (mutableObjectIntMap == null || getSkipped$runtime_release()) {
            return null;
        }
        MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableObjectIntMap;
        Object[] objArr = mutableObjectIntMap2.keys;
        int[] iArr = mutableObjectIntMap2.values;
        long[] jArr = mutableObjectIntMap2.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            long j3 = (~j2) << 7;
            long j4 = (j3 + j2) - (j3 | j2);
            if ((j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j2) < 128) {
                        int i6 = (i3 << 3) + i5;
                        Object obj = objArr[i6];
                        if (iArr[i6] != i2) {
                            return new Function1<Composition, Unit>() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Composition composition) {
                                    invoke2(composition);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Composition composition) {
                                    if (this.this$0.currentToken != i2 || !Intrinsics.areEqual(mutableObjectIntMap, this.this$0.trackedInstances) || !(composition instanceof CompositionImpl)) {
                                        return;
                                    }
                                    MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableObjectIntMap;
                                    int i7 = i2;
                                    RecomposeScopeImpl recomposeScopeImpl = this.this$0;
                                    long[] jArr2 = mutableObjectIntMap3.metadata;
                                    int length2 = jArr2.length - 2;
                                    if (length2 < 0) {
                                        return;
                                    }
                                    int i8 = 0;
                                    while (true) {
                                        long j5 = jArr2[i8];
                                        long j6 = (~j5) << 7;
                                        if ((-1) - (((-1) - ((j6 + j5) - (j6 | j5))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                                            int i9 = 8;
                                            int i10 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                if ((-1) - (((-1) - 255) | ((-1) - j5)) < 128) {
                                                    int i12 = (i8 << 3) + i11;
                                                    Object obj2 = mutableObjectIntMap3.keys[i12];
                                                    boolean z2 = mutableObjectIntMap3.values[i12] != i7;
                                                    if (z2) {
                                                        CompositionImpl compositionImpl = (CompositionImpl) composition;
                                                        compositionImpl.removeObservation$runtime_release(obj2, recomposeScopeImpl);
                                                        if (obj2 instanceof DerivedState) {
                                                            compositionImpl.removeDerivedStateObservation$runtime_release((DerivedState) obj2);
                                                            MutableScatterMap mutableScatterMap = recomposeScopeImpl.trackedDependencies;
                                                            if (mutableScatterMap != null) {
                                                                mutableScatterMap.remove(obj2);
                                                            }
                                                        }
                                                    }
                                                    if (z2) {
                                                        mutableObjectIntMap3.removeValueAt(i12);
                                                    }
                                                    i9 = 8;
                                                }
                                                j5 >>= i9;
                                            }
                                            if (i10 != i9) {
                                                return;
                                            }
                                        }
                                        if (i8 == length2) {
                                            return;
                                        } else {
                                            i8++;
                                        }
                                    }
                                }
                            };
                        }
                    }
                    j2 >>= 8;
                }
                if (i4 != 8) {
                    return null;
                }
            }
            if (i3 == length) {
                return null;
            }
            i3++;
        }
    }

    /* JADX INFO: compiled from: RecomposeScopeImpl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjGNLe^.Zݷ2\u000f\u0002{<$a$yCI^\"}8\tWNmgtЁ[!¼?\u0006Dw+1OUޯa\u0012\u001d2\u000b\u0019M4eok;\u0011xD\b82P<*\u000f\u000f\u001fBN x\u000bCy\u0013@6ptHZ%M3#Xß̧$\u0001$f0oDS\u0005]h;S\u0007wEf'\u000e=-W\u001bKl-\u001dxq\u001eYGe;[Ǭ٨\u0007\u0007Xiϓ\u0007N"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u001fs?%SFkA\u0012_5R\u00010\u001d", "", "u(E", "/c^=g\bGQ\u001c\t\b^+j\u00079p\u007f6", "", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "/mR5b9L", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "<df\u001cj5>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC%}=\u001e\">", "/c^=g\bGQ\u001c\t\b^+j\u00079p\u007f6:M\u0011 &Kw\u000e6\u0004%<Yy.7", "6`b\u000ea*A]&~yK,z\u00137p\n6{.~!\"G}", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "6`b\u000ea*A]&~yK,z\u00137p\n6{.~!\"G}LI\u0007.D]\u0006 1z\u00165M?Ik", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void adoptAnchoredScopes$runtime_release(SlotWriter slotWriter, List<Anchor> list, RecomposeScopeOwner recomposeScopeOwner) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object objSlot = slotWriter.slot(list.get(i2), 0);
                RecomposeScopeImpl recomposeScopeImpl = objSlot instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) objSlot : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.adoptedBy(recomposeScopeOwner);
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime_release(SlotTable slotTable, List<Anchor> list) {
            if (list.isEmpty()) {
                return false;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Anchor anchor = list.get(i2);
                if (slotTable.ownsAnchor(anchor) && (slotTable.slot$runtime_release(slotTable.anchorIndex(anchor), 0) instanceof RecomposeScopeImpl)) {
                    return true;
                }
            }
            return false;
        }
    }
}
