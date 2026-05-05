package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import kotlin.Deprecated;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007njO0Le^.ZS0\u000fs{J$c$wDCU0}*\tUNog|SbŏK\u000f\u001c\u0016\u0001j2M]xk\u0012\u0017˰JoU3UoC=htD\u0014(20D\u0002\u0005\u0007\u001d0]&͌+Cy\u000bB0npjR;N=\u00199FAŋ\u0005\u001eji\u0017DV{u:]33mP_?_^\u000f\u0014!\u000fb5 \u000faL;p;C&=S1\u0019\u0019o\b(M\u0006U\u0007~&m@iy]̬f\u0015<\u0015YU=g\u0001<t\u000bab\u001c'qd\u0012P\u0017#߭{z\n$\u0005\u0014\u001c\u001e?H\\FJl\u0016(Kv\tRnkHp\u000b\u000e\t}N\u0017S\u0019c/G8~Q\u0010V_a\u007f\n\u0013+6#/\bQ_b-x\u0015IZ>fylN]`N8imy\u0012\u0012z\n:\u0006@G.R\u0012\u0010\\9k9٦=#/\u0010JcR\r\u000f\u0005\u000fx\u0004u`iX*~\u0018G*7/pC\u0013'2PԜ\\,\u001fqdb\u0015$ \u0013Nl(@/6(N}z0\u007f\u001e\u0004\u0018(GzGc~s\u001e[?]C5\u007fi>fbx$?jh3\\=̾U۱^b0ίBJp\u0017\u0006}\u0015`\u001a\u001bJ? %j\u0001\bǠ^ČL\u00076DG\u0007\u0017j+z\u001e\u000bl3R\u0010@ˈv֊\u0005Vdʙ\u007fi~W:~ˉ&U"}, d2 = {"\u001a`]1e6BR,Hxh9|R+p\u000bqYJ\t\"!Po\u0017KR#D]\u000f$F\u0002k", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "\u001a`]1e6BR,Hxh9|R@i\u007f:E&\u0001+vXo\u0017KU)Cdy/5p\u0016;\f!Es?(\u001ehjH\\", "u(E", "3wc?T\u000b:b\u0015fvi", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u001b\u001fRv\u000e\u0018\u000421me\u001cBC", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001a`]1e6BR,Hxh9|R+p\u000bqYJ\t\"!Po\u0017KR#D]\u000f$F\u0002T\u000e`RHg\u0013\u001a$d7", "5dc\u0012k;KOwz\nZ\u0014x\u0014ma\t1\u0006O|&\u001bQx\u001c", ":hU2V@<Z\u0019", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", "5dc\u0019\\->Q-|\u0002^", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bHo\fPt,5/", ":hU2V@<Z\u0019kz`0\u000b\u0018<y", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u00125[\u0002.Fz*\u0004", "5dc\u0019\\->Q-|\u0002^\u0019|\u000b3s\u000f5\u0010~|  Q~\nKz/>g", "2hb=T;<V~~\u000f>=|\u0012>", "", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "2hb=T;<V~~\u000fL/\u0007\u0016>c\u00107[Q\u0001 &", "5dc\u0012k;KOwz\nZ", "\"", "3wc?T\u000b:b\u0015\\\u0002Z:\u000b", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkb<\n\u0016$Qs\rO@#?f}i3x!w+MCv>'\u0015qp\u0015\u0005r0_z6[\u000b.?k_n\u001c\u0010!Vc", "=m2?X(MS", "", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=mB.i,\"\\'\u000evg*|v>a\u000f(", "=tc g(MS", ">tc\u0012k;KOwz\nZ", "3wc?T\u000b:b\u0015", "Ag^B_+\u001dc!\n^g;|\u00168a\u0007\u0016\u000b<\u0010\u0017", "/qV@", "", "", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004u", "Ag^B_+,Y\u001d\nYn4\b", "At_2e\u000bBa$z\n\\/b\tCE\u0011(\u0005O", "\u0013wc?T\u000b:b\u0015", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ComponentActivity extends Activity implements LifecycleOwner, KeyEventDispatcher.Component {
    private final SimpleArrayMap<Class<? extends ExtraData>, ExtraData> extraDataMap = new SimpleArrayMap<>(0, 1, null);
    private final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0004G\u001bFé^B-!l\u0015է\u000bfx9ӭHf"}, d2 = {"\u001a`]1e6BR,Hxh9|R+p\u000bqYJ\t\"!Po\u0017KR#D]\u000f$F\u0002T\u000e`RHg\u0013\u001a$d7", "", "u(E", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Deprecated(message = "\u0016Z\u000bGv4)_]\u00077|Z\u001a/b\u001ce\u0018<D\u007f\r`\u000b\u0006\u0003y\u000e\b%|m\fhK_akMR7r<+\u0016a\r+fOd%}sQK\u0007/$'\u007fB\r2\u0002x<3\u000e\u0011\u0001q\u0016\t\u0003\u0010\u0019M\u000f\rm\u00173]t>gd\f;7~6LO:\u0007 T\"B`\u0016/6\u0005J%~\u001c)PM\u0016sT63\u001d")
    public static class ExtraData {
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }

    @Deprecated(message = "\u0018Y\u0001t\rT!`fRgpY\u001aC\u0011oQ\u001d\u001b\u0006oS[\u0005Z:*=v.kk`-_\rsqMN]GB\u0017\u0016c\u00030\\WR,Qs\u0016\u0011J#VZ\r=\u0007\nY")
    @InterfaceC1492Gx
    public void putExtraData(ExtraData extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.extraDataMap.put((Class<? extends ExtraData>) extraData.getClass(), extraData);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.Companion.injectIfNeededIn(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        super.onSaveInstanceState(outState);
    }

    @Deprecated(message = "\u0018Y\u0001t\rT!`fRgpY\u001aC\u0011cQ\u001d\u001b\u0006oS[\u0005Z7\b\u000e\f-zp\fxJR\u001c\u007fBT\"BQXi\f}'[WM%T=\u0017#\u0015")
    @InterfaceC1492Gx
    public <T extends ExtraData> T getExtraData(Class<T> extraDataClass) {
        Intrinsics.checkNotNullParameter(extraDataClass, "extraDataClass");
        return (T) this.extraDataMap.get(extraDataClass);
    }

    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    public boolean superDispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (KeyEventDispatcher.dispatchBeforeHierarchy(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (KeyEventDispatcher.dispatchBeforeHierarchy(decorView, event)) {
            return true;
        }
        return KeyEventDispatcher.dispatchKeyEvent(this, decorView, this, event);
    }

    protected final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final boolean shouldSkipDump(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill");
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }
}
