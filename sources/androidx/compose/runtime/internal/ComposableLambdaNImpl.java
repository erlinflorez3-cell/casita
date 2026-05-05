package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: ComposableLambdaN.jvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r+4\u0012}\bnjGӄLeN0ZS@\u000fsڔ<$iCyCAU\"}0\u0018WNmivJh\u000bKƤ\u000e\u0016\u000fj4I[zc\u0011%˰rom2\u000e\u000bM=ntN\u0005N32<\b\u0007\u0019\u001aXK z\tGc\f@1Ϯt:`\u0012\u0016+(!\u001e@6\u007fLc\u0018bDX\u0005gJ5)\u0002yDd&\u000e7+^-Hj&;}(ӳ+Ë;5#7\u001c\u0011\u0015es?1@\"A\u0013|?'YJ:W~f\u000e)-+}#\u000ev4s\u001dQ\u000f$m+\u0018iYi&(&\u0011B\r\u0005\u0010\u001c ?H\\CJj\u0016)Kt!Z\u0011^\u0010dZ\u0002\u0011`d\u001e{ı?ڢ=\u001bnϟ2M'RO{3\u000etŗ\u0003ͼ%a\\וx\u0017!\\\u0006Z\u0002`N=`N8Zǀq\nxç\u001a,\n:U\t\u007f\n\u001f9/'MZg/wȀ\u000eҩHg~ݓ1|avjPP$~\u0016e6\u001f\u000b\tR;ʐwÏXX4Ҋ\u001e(b\t\u0016\bA#3ɿ>Ƽ)\u0010Vиſm\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u0012E\u0006%Bby'\u0001K 6XMIg1%\u0015O]A\u0004b(7Z/RS$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u0012E\u0006%Bby'\u0001K 6XMIg1%\u0015O]A\u0004b(7L", "9dh", "", "BqP0^,=", "", "/qXAl", "uHI\u0016\u001c\u001d", "-a[<V2", "", "5dc\u000ee0Mg", "u(8", "5dc\u0018X@", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u0011", "Ab^=X:", "", "7me<^,", "/qV@", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "@dP9C(KO!\\\u0005n5\f", ">`a.`:", "BqP0^\u0019>O\u0018", "", "1n\\=b:>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "BqP0^\u001eKW(~", "CoS.g,", "0k^0^", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    public static final int $stable = 0;
    private Object _block;
    private final int arity;
    private final int key;
    private RecomposeScope scope;
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    private final int realParamCount(int i2) {
        int i3 = i2 - 2;
        for (int i4 = 1; i4 * 10 < i3; i4++) {
            i3--;
        }
        return i3;
    }

    public ComposableLambdaNImpl(int i2, boolean z2, int i3) {
        this.key = i2;
        this.tracked = z2;
        this.arity = i3;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // kotlin.jvm.functions.FunctionN, kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).invalidate();
                }
                list.clear();
            }
        }
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (this.tracked && (recomposeScope = composer.getRecomposeScope()) != null) {
            composer.recordUsed(recomposeScope);
            if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
                this.scope = recomposeScope;
                return;
            }
            List<RecomposeScope> list = this.scopes;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.scopes = arrayList;
                arrayList.add(recomposeScope);
                return;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (ComposableLambdaKt.replacableWith(list.get(i2), recomposeScope)) {
                    list.set(i2, recomposeScope);
                    return;
                }
            }
            list.add(recomposeScope);
        }
    }

    public final void update(Object obj) {
        if (Intrinsics.areEqual(obj, this._block)) {
            return;
        }
        boolean z2 = this._block == null;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        this._block = (FunctionN) obj;
        if (z2) {
            return;
        }
        trackWrite();
    }

    @Override // kotlin.jvm.functions.FunctionN
    public Object invoke(final Object... objArr) {
        int iSameBits;
        final int iRealParamCount = realParamCount(objArr.length);
        Object obj = objArr[iRealParamCount];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = ArraysKt.slice(objArr, RangesKt.until(0, objArr.length - 1)).toArray(new Object[0]);
        Object obj2 = objArr[objArr.length - 1];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Composer composerStartRestartGroup = ((Composer) obj).startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        if (composerStartRestartGroup.changed(this)) {
            iSameBits = ComposableLambdaKt.differentBits(iRealParamCount);
        } else {
            iSameBits = ComposableLambdaKt.sameBits(iRealParamCount);
        }
        Object obj3 = this._block;
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(array);
        spreadBuilder.add(Integer.valueOf(iIntValue | iSameBits));
        Object objInvoke = ((FunctionN) obj3).invoke(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i2) {
                    Object[] array2 = ArraysKt.slice(objArr, RangesKt.until(0, iRealParamCount)).toArray(new Object[0]);
                    Object obj4 = objArr[iRealParamCount + 1];
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(((Integer) obj4).intValue());
                    int length = (objArr.length - iRealParamCount) - 2;
                    Object[] objArr2 = new Object[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        Object obj5 = objArr[iRealParamCount + 2 + i3];
                        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                        objArr2[i3] = Integer.valueOf(RecomposeScopeImplKt.updateChangedFlags(((Integer) obj5).intValue()));
                    }
                    ComposableLambdaNImpl composableLambdaNImpl = this;
                    SpreadBuilder spreadBuilder2 = new SpreadBuilder(4);
                    spreadBuilder2.addSpread(array2);
                    spreadBuilder2.add(composer);
                    spreadBuilder2.add(Integer.valueOf(iUpdateChangedFlags | 1));
                    spreadBuilder2.addSpread(objArr2);
                    composableLambdaNImpl.invoke(spreadBuilder2.toArray(new Object[spreadBuilder2.size()]));
                }
            });
        }
        return objInvoke;
    }
}
