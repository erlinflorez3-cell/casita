package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: OnBackPressedCallback.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\"B\u0012\u007f\u0007|jAӄLe^.ZS8\u000fs{:0c$\bCCU \u007f(-eȞ\u0018g\u001dI\u001b\u0016S\u0013\u0014\u0016\u0011jZJǤ|] \u0011zP}PKM\u001eEid\u0003H\u001d `'~xM\u0007(=`\u0010%\u0003\n`T\u0018>T\t:\u0001\u0015\u0014*b \u0014S8\u0001Ld\u0018RD^\u0005]hFi\u00182P\\?w0+U=Jb=%v\u00105qU\u007f;#>k\u00035Z\"DKM\u007fW\u001dhU/[M\u0002iNX.\u0019[* \u001fku>b\u0015Sp\fU0}g\"ַ\u0010߭{z\u0004Ȟ\r$\u001c\f?P>/*f6\u0016Is!Z\u0017Б\u000eެF\f\u0003ʨN\u0019+\tA5Y\u001dl\\oGirE\n\u001d\rL$1r/hl\u000e\u000f\u0016Q\u001a6\u0017\bҌLףLZ\u0012ԯUo\n~p\u0011J\u00066W\u000e1ɮ\u0015I"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qeI]\u0013\u0015MZ\u001b<\u000535X[\u001c>t\u0013*KI\u0011", "", "3mP/_,=", "", "uY\u0018#", "1`]0X3EO\u0016\u0006zl", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!R\u0004wEh29h}{Dz\u0012B4GIz\n", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qY<\n\u0015\u0017Nv\n9}%\u000b", "3mP/_,=1\u001cz\u0004`,{f+l\u0007%w>\u0007", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "5dc\u0012a(;Z\u0019}Xa(\u0006\u000b/d]$\u0003G}\u0013\u0015M.\n:\u0006)F]\r41z\u00165M?Ik", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u0012a(;Z\u0019}Xa(\u0006\u000b/d]$\u0003G}\u0013\u0015M.\n:\u0006)F]\r41z\u00165M?Ik", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "D`[BX", "7r4;T)ES\u0018", "u(I", "Adc\u0012a(;Z\u0019}", "/cS\u0010T5<S \u0006v[3|", "1`]0X3EO\u0016\u0006z", "6`]1_,(\\uzxd\nx\u0012-e\u0007/{?", "6`]1_,(\\uzxd\u0017\n\t=s\u007f'", "6`]1_,(\\uzxd\u0017\n\u00131r\u007f6\n@\u007f", "0`R88=>\\(", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qX<~\u001dvXo\u0017KT/=dy/\r", "6`]1_,(\\uzxd\u001a\f\u0005<t\u007f'", "@d\\<i,", "@d\\<i,\u001cO\"|ze3x\u00066e", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class OnBackPressedCallback {
    private final CopyOnWriteArrayList<Cancellable> cancellables = new CopyOnWriteArrayList<>();
    private Function0<Unit> enabledChangedCallback;
    private boolean isEnabled;

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void handleOnBackStarted(BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public OnBackPressedCallback(boolean z2) {
        this.isEnabled = z2;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean z2) {
        this.isEnabled = z2;
        Function0<Unit> function0 = this.enabledChangedCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final Function0<Unit> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public final void setEnabledChangedCallback$activity_release(Function0<Unit> function0) {
        this.enabledChangedCallback = function0;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    public final void addCancellable(Cancellable cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final void removeCancellable(Cancellable cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }
}
