package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.google.accompanist.permissions.PermissionStatus;
import kotlin.Metadata;
import kotlin.Unit;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq\u0001<$q$yCA\\\"}0\tWNmhtIpŏs\u000f4\u00159\u0006<Mcxu\u0012=3RsM5eok<pxD\t82P=ѩ\t\u0001(0\u0011\u0016\u0005\u0013[K:\"v@9@`&e\u0005H,LRh\f,w\u007fNdb3җƠ3#\t\u0006\u0013Z5cH|{\u0012\u001dÙ)˼za&Ѩ\u0011CC\u0017=S1\n)¼AƄCqEݛ9G52a{g8h\u007fB\u0016AN;eI̧hԇUl\u0014ʬCQiT^\u0018Hy\u0001\u0007\u001bHT \u0014'`.[\u001b=ڳ\u0010\u07baxx[óh\u0004dO\u000e\t2_%6\u00183YIKj_pS\u0019|G2YKryоͨ!ƟX\u001eh\u0017!j\u0006hISFOVa*[C\u0002\u0012\u0006Đ\u0006G"}, d2 = {"\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7}>\\?8r4\t\u0015ui=\u0015q0X\u007f\u0015VH],2", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7\u0001.ZK?yB\"\u001fqOH\u0003r,$", ">da:\\:LW#\b", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\r\u0006t/>h})F7s8VR;~Cs{dj8\u0014m0M@#RW\u0018\bZavN\u0018!nc\u0012\u001c", ":`d;V/>`", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9i:\u0006)F]\r4$m$>TR\"gD'\u0013kaF\\", "5dc\u0019T<GQ\u001c~\b\u001d7|\u00167i\u000e6\u007fJ\n%\u0011To\u0015<r35", "u(;.a+K]\u001d}\u000e((z\u00183v\u00047\u0010\n\u000e\u0017%Wv\u001d\u0006R#D]\u000f$F\u0002\u0003.[SBz\u001b\u001a%q_<\u0007p\u0002", "Adc\u0019T<GQ\u001c~\b\u001d7|\u00167i\u000e6\u007fJ\n%\u0011To\u0015<r35", "uKP;W9HW\u0018\u0012DZ*\f\r@i\u000f<EM\u0001%'N~W\u0018t49j\u0002/KZ\u0016<]JJR0.\u001efd9\u00149o?", "5dc\u001dX9FW'\r~h5", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\nrTA \u0006\u0017", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7\u0001.ZK?yB\"\u001fqOH\u0003r<\\L", "AsPAh:", "5dc g(Mc'", "u(;0b4\bU#\t|e,F\u0005-c\n0\u0007<\n\u001b%V9\u0019<\u0004-9g\f$Av$w8CHs8,#lkBtr(]\u00075\u001d", "Adc g(Mc'", "uKR<`u@]#\u0001\u0002^ux\u0007-o\b3wI\u0005%&\u0011z\u000eI~)Cg\u0002*@{_\u0019MPCoB,\u0019rj'\u0016_;^\u0005|\u000b=", "AsPAh:|R\u0019\u0006z`(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "5dc\u001dX9FW'\r~h5j\u0018+t\u00106", ":`d;V/)S&\u0007~l:\u0001\u00138R\u007f4\f@\u000f&", "", "@dU?X:A>\u0019\f\u0003b:\u000b\r9nm7wO\u0011%", "@dU?X:A>\u0019\f\u0003b:\u000b\r9nm7wO\u0011%URo\u001bDz3C]\b)Eg#.TC7y4", ">da:\\:LW#\b\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MutablePermissionState implements PermissionState {
    public static final int $stable = 0;
    private final Activity activity;
    private final Context context;
    private ActivityResultLauncher<String> launcher;
    private final String permission;
    private final MutableState status$delegate;

    public MutablePermissionState(String permission, Context context, Activity activity) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.permission = permission;
        this.context = context;
        this.activity = activity;
        this.status$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getPermissionStatus(), null, 2, null);
    }

    private final PermissionStatus getPermissionStatus() {
        return PermissionsUtilKt.checkPermission(this.context, getPermission()) ? PermissionStatus.Granted.INSTANCE : new PermissionStatus.Denied(PermissionsUtilKt.shouldShowRationale(this.activity, getPermission()));
    }

    public final ActivityResultLauncher<String> getLauncher$permissions_release() {
        return this.launcher;
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public String getPermission() {
        return this.permission;
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public PermissionStatus getStatus() {
        return (PermissionStatus) this.status$delegate.getValue();
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public void launchPermissionRequest() {
        Unit unit;
        ActivityResultLauncher<String> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(getPermission());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    public final void refreshPermissionStatus$permissions_release() {
        setStatus(getPermissionStatus());
    }

    public final void setLauncher$permissions_release(ActivityResultLauncher<String> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public void setStatus(PermissionStatus permissionStatus) {
        Intrinsics.checkNotNullParameter(permissionStatus, "<set-?>");
        this.status$delegate.setValue(permissionStatus);
    }
}
