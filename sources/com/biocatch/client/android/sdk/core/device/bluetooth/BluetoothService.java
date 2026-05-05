package com.biocatch.client.android.sdk.core.device.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.client.android.sdk.core.exceptions.OperationFailedException;
import com.biocatch.client.android.sdk.core.exceptions.PermissionException;
import com.biocatch.client.android.sdk.core.permissions.PermissionService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Xu;

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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2şs{B-c$wGCU(}*ޛWNu\bvJp\u000bKƤ\fǝ\u000f̓\\I\u0004w\u001e-\u001f6PoW3{pM=nvN\u0005N52<\b\t\u0019\u001aXMǘzzQQT\u0016>P\t:\u0001\u001e\u0016\u000f($\u001eD0\u0003.\\\u0016bd[=kH6;\u0005\u007fA|/6ܡ\t֔\u0011F\\܋]\u0003o C@e8kǯUΫ\u000bRcΪSN\u007fF\u001dhU1a\u000eָ[:p\u0002\u001a 9[]u\u00013t\u0005\u007fjbʳ7յgWXʫ@y\u0001\t\u001bH$\u0010\f5V=}&t\b&3#s*öRؿbB\bЭ2B%)\u00183Y>qƛSň?\u0019Vљߏ\t\""}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^ehI\u0007r6X\u0006*\u0011)U<\\a|G#\u0015H\u000e[<\u0011\u0003Y\u0017", "", ">da:\\:LW#\bh^9\u000e\r-e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wXCHs8,#lkB\u0015-\u0017N\u0004/KZ\\0f[`=!#^\fN\u0001", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017N;x<\"#veC\u0010qu9v4OP\\:`\\{+\u0014\u001fk\u0012L+bkUJ#{N;\u001eQ*S\u000bJh\n\u001b_k?s\u007fBi\u001f\u001d`\u0013\u007fIreJc]uV?H,&m\u000bl'`9\u0004\"\u001ey!%q^-\u0010EQ\u001b\u007fRCWvK \t\u000eg/", "0kd2g6Hb\u001cZyZ7\f\t<W\r$\u0007K\u0001$", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^ehI\u0007r6X\u0006*\u0011)U<\\a|G#\u00156\rJ6\u001c\u0005f31jOB\u001f\u0015\u0002", "6`b\u001dX9FW'\r~h5", "", "5dc\u0015T:)S&\u0007~l:\u0001\u00138", "u(I", "7r19h,M]#\u000e}:=x\r6a|/{", "Adc\u000f_<>b#\t\na\b\u000e\u00053l{%\u0003@", "uY\u0018#", "1qT.g,\u001bZ)~\nh6\f\f\u000bd{3\u000b@\u000e\t$Cz\u0019<\u0004", "", "5dc\u000fb<GR\u0019}Y^=\u0001\u0007/s", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^ehI\u0007r6X\u0006*\u0011)U<\\a|G#\u00159\u000e_/\u000b\u0005KN yO7,]", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class BluetoothService {
    private BluetoothAdapterWrapper bluetoothAdapterWrapper;
    private final Context context;
    private boolean isBluetoothAvailable;
    private final PermissionService permissionService;
    private final Utils utils;

    public BluetoothService(PermissionService permissionService, Context context, Utils utils) throws Throwable {
        Intrinsics.checkNotNullParameter(permissionService, "permissionService");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.permissionService = permissionService;
        this.context = context;
        this.utils = utils;
        createBluetoothAdapterWrapper();
    }

    public final void createBluetoothAdapterWrapper() throws Throwable {
        BluetoothAdapter adapter;
        Context context = this.context;
        String strZd = C1593ug.zd("7BL=MIJPE", (short) (FB.Xd() ^ 2520), (short) (FB.Xd() ^ 9655));
        Class<?> cls = Class.forName(C1561oA.od("MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ", (short) (C1633zX.Xd() ^ (-11587))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Kd("SKaM\u001bZP^X Fhg_e_", (short) (C1633zX.Xd() ^ (-20076))))};
        Object[] objArr = {strZd};
        short sXd = (short) (C1633zX.Xd() ^ (-4615));
        short sXd2 = (short) (C1633zX.Xd() ^ (-4498));
        int[] iArr = new int["GG?D\fk\u000e$\u000e\u00195Gead\r".length()];
        QB qb = new QB("GG?D\fk\u000e$\u000e\u00195Gead\r");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            if (getHasPermission() && (objInvoke instanceof BluetoothManager) && (adapter = ((BluetoothManager) objInvoke).getAdapter()) != null) {
                this.bluetoothAdapterWrapper = new BluetoothAdapterWrapper(adapter);
                this.isBluetoothAvailable = true;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final Set<BluetoothDeviceWrapper> getBoundedDevices() throws OperationFailedException {
        if (!getHasPermission()) {
            throw new PermissionException("No permission to use bluetooth services");
        }
        BluetoothAdapterWrapper bluetoothAdapterWrapper = this.bluetoothAdapterWrapper;
        if (bluetoothAdapterWrapper == null) {
            throw new OperationFailedException("Bluetooth adapter is unavailable");
        }
        Intrinsics.checkNotNull(bluetoothAdapterWrapper);
        return bluetoothAdapterWrapper.getBondedDevices();
    }

    public final boolean getHasPermission() {
        PermissionService permissionService;
        String str;
        if (this.utils.isVersionGreaterOrEqualTo(31)) {
            permissionService = this.permissionService;
            str = "android.permission.BLUETOOTH_CONNECT";
        } else {
            permissionService = this.permissionService;
            str = "android.permission.BLUETOOTH";
        }
        return permissionService.hasPermission(str);
    }

    public final boolean isBluetoothAvailable() {
        return this.isBluetoothAvailable;
    }

    public final void setBluetoothAvailable(boolean z2) {
        this.isBluetoothAvailable = z2;
    }
}
