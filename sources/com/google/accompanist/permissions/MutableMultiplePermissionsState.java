package com.google.accompanist.permissions;

import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.google.accompanist.permissions.PermissionStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLш|\u0004O$8\u000bDB\u0007\"2\u0012\u007f\u0007tsA0JhP.hS2\u000fy\u000b<$i0yCAX\"}8\tWNmnvJh\u000bK\u000f\f\u0016\u0001j:k]xc\u0012\u00151Xģo3{n}Jp~D\u0005882:\n\u0005/\u001cXIǘzzQNT\u0018>\\\t:\u0001*\u0014\u0019b1\u0014\\8\u0001Ly\u0018^Dg\u0005iJ13\u0003\u0018O^)o0+R;f\u001b܋˼za$L\u0011PC\u0019=S1\f\t0\u0016Ÿӏqݘ\tr/)1Q\u0002`NZ\u0006\u001a#2 3k|>j\u0015Yp\u00127-_cy]<4\u000ey*\u0018\u0013Ǌ\u001aΝ+T6Ʀ2h\u000e\u001cA\u0004\u0013UF`\u0010o\u0013\u0012\taN\u001d5\u0002C+g\u001d\u0015R8ݥ\u001b\u05ee;{\rټn;\u000f\u00019ad\u0010p\u0015Ig&R\bҜBףLT\u0012ԯUo\n\u0005p\u0017z#>]\u00185\f\u0013>\u0017SJ\n:YuBɌҋDϼz\u000fhjY\u0002`QX$t-E?Y%h]|\u0005\u001aU\u000b-\u0003ҡ۸\u001cΤ\u000b\b\u0010\u0015&w\u0006E9'\u0016h]oȲno"}, d2 = {"\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7}>\\?8r4\u0006%op=\u0012j,9v4OP\\:`\\{K\u0002!V\u001dN\u0001", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7}>TR?v;\u001e\u007fhnA\u000bq:R\u00010U:](kRH", ";tc.U3>>\u0019\f\u0003b:\u000b\r9n\u000e", "", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7}>\\?8r4\t\u0015ui=\u0015q0X\u007f\u0015VH],2", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "/k[\u001dX9FW'\r~h5\u000bj<a\t7{?", "", "5dc\u000e_3)S&\u0007~l:\u0001\u00138sa5wI\u0010\u0017\u0016", "u(I", "/k[\u001dX9FW'\r~h5\u000bj<a\t7{??\u0016\u0017No\u00108\u0006%", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", ":`d;V/>`", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9i:\u0006)F]\r4$m$>TR\"gD'\u0013kaF\\", "", "", "5dc\u0019T<GQ\u001c~\b\u001d7|\u00167i\u000e6\u007fJ\n%\u0011To\u0015<r35", "u(;.a+K]\u001d}\u000e((z\u00183v\u00047\u0010\n\u000e\u0017%Wv\u001d\u0006R#D]\u000f$F\u0002\u0003.[SBz\u001b\u001a%q_<\u0007p\u0002", "Adc\u0019T<GQ\u001c~\b\u001d7|\u00167i\u000e6\u007fJ\n%\u0011To\u0015<r35", "uKP;W9HW\u0018\u0012DZ*\f\r@i\u000f<EM\u0001%'N~W\u0018t49j\u0002/KZ\u0016<]JJR0.\u001efd9\u00149o?", ">da:\\:LW#\b\t", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7\u0001.ZK?yB\"\u001fqOH\u0003r,$", "5dc\u001dX9FW'\r~h5\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "@de<^,=>\u0019\f\u0003b:\u000b\r9n\u000e", "5dc\u001fX=HY\u0019}e^9\u0005\r=s\u00042\u0005N", "@de<^,=>\u0019\f\u0003b:\u000b\r9n\u000efz@\b\u0017\u0019C~\u000e", "Ag^B_+,V#\u0011gZ;\u0001\u00138a\u0007(", "5dc [6NZ\u0018l}h>i\u0005>i\n1wG\u0001", "Ag^B_+,V#\u0011gZ;\u0001\u00138a\u0007(:?\u0001\u001e\u0017Ik\u001d<", ":`d;V/&c \u000e~i3|s/r\b,\nN\u0005! 4o\u001aLv3D", "", "CoS.g,)S&\u0007~l:\u0001\u00138sm7wO\u0011%", ">da:\\:LW#\b\tL;x\u0018?s", "", "CoS.g,)S&\u0007~l:\u0001\u00138sm7wO\u0011%URo\u001bDz3C]\b)Eg#.TC7y4", ">da:\\:LW#\b\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MutableMultiplePermissionsState implements MultiplePermissionsState {
    public static final int $stable = 0;
    private final State allPermissionsGranted$delegate;
    private ActivityResultLauncher<String[]> launcher;
    private final List<MutablePermissionState> mutablePermissions;
    private final List<PermissionState> permissions;
    private final State revokedPermissions$delegate;
    private final State shouldShowRationale$delegate;

    public MutableMultiplePermissionsState(List<MutablePermissionState> mutablePermissions) {
        Intrinsics.checkNotNullParameter(mutablePermissions, "mutablePermissions");
        this.mutablePermissions = mutablePermissions;
        this.permissions = mutablePermissions;
        this.revokedPermissions$delegate = SnapshotStateKt.derivedStateOf(new Function0<List<? extends PermissionState>>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsState$revokedPermissions$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends PermissionState> invoke() {
                List<PermissionState> permissions = this.this$0.getPermissions();
                ArrayList arrayList = new ArrayList();
                for (Object obj : permissions) {
                    if (!Intrinsics.areEqual(((PermissionState) obj).getStatus(), PermissionStatus.Granted.INSTANCE)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        });
        this.allPermissionsGranted$delegate = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsState$allPermissionsGranted$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z2;
                List<PermissionState> permissions = this.this$0.getPermissions();
                if ((permissions instanceof Collection) && permissions.isEmpty()) {
                    z2 = true;
                } else {
                    Iterator<T> it = permissions.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!PermissionsUtilKt.isGranted(((PermissionState) it.next()).getStatus())) {
                            if (this.this$0.getRevokedPermissions().isEmpty()) {
                                break;
                            }
                            z2 = false;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            }
        });
        this.shouldShowRationale$delegate = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsState$shouldShowRationale$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                List<PermissionState> permissions = this.this$0.getPermissions();
                boolean z2 = false;
                if (!(permissions instanceof Collection) || !permissions.isEmpty()) {
                    Iterator<T> it = permissions.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (PermissionsUtilKt.getShouldShowRationale(((PermissionState) it.next()).getStatus())) {
                            z2 = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            }
        });
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public boolean getAllPermissionsGranted() {
        return ((Boolean) this.allPermissionsGranted$delegate.getValue()).booleanValue();
    }

    public final ActivityResultLauncher<String[]> getLauncher$permissions_release() {
        return this.launcher;
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public List<PermissionState> getPermissions() {
        return this.permissions;
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public List<PermissionState> getRevokedPermissions() {
        return (List) this.revokedPermissions$delegate.getValue();
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public boolean getShouldShowRationale() {
        return ((Boolean) this.shouldShowRationale$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public void launchMultiplePermissionRequest() {
        Unit unit;
        ActivityResultLauncher<String[]> activityResultLauncher = this.launcher;
        if (activityResultLauncher != 0) {
            List<PermissionState> permissions = getPermissions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(permissions, 10));
            Iterator<T> it = permissions.iterator();
            while (it.hasNext()) {
                arrayList.add(((PermissionState) it.next()).getPermission());
            }
            activityResultLauncher.launch(arrayList.toArray(new String[0]));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    public final void setLauncher$permissions_release(ActivityResultLauncher<String[]> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void updatePermissionsStatus$permissions_release(Map<String, Boolean> permissionsStatus) {
        Object next;
        Boolean bool;
        Intrinsics.checkNotNullParameter(permissionsStatus, "permissionsStatus");
        for (String str : permissionsStatus.keySet()) {
            Iterator<T> it = this.mutablePermissions.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(((MutablePermissionState) next).getPermission(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            MutablePermissionState mutablePermissionState = (MutablePermissionState) next;
            if (mutablePermissionState != null && (bool = permissionsStatus.get(str)) != null) {
                bool.booleanValue();
                mutablePermissionState.refreshPermissionStatus$permissions_release();
            }
        }
    }
}
