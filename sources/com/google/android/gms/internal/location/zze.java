package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.checkerframework.dataflow.qual.Pure;
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
/* JADX INFO: loaded from: classes8.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я~\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r.4\u0012}\bnjGNLe^.ZS0\u0012s{J$c$wICU0}*\teNog\u0005Jb\u000bI\u0013\u000e\u0016\u0007s4I[\u0007e\u0012%2JoE4UoS9ht<\u0005(20G\u0002\u0005\u0007\u001c2H\u001ev\u0003CQ\u0011\u001a0N\u0081BR\u0013T\r\u001a \rF \u0007\u001fdgd6Plc;5(\u0019݃`$W_^{\u0006\f\u001c\u0015v\u0013\fq$1?E5-%\u0002\u0004\u0017Xa>\u0011A\n=3k7/1J\u0002[NZ\u0016\u0013C._\u0015cs4a\u001dSv\u000bU._qQQ\u001c.\u0010\u0003\f\u000fL\u0004<\u000e=G\\4*n\u000e\u000fA}\u000bUVO0މ۰\u0004zo@W\u0005\u00063;=)fiai\u001a^;\n\u0010%\u001eQ\u0002~%iV&`C\u001ed}_5iBSG|\riC{\t\td\u0018)23W\u0006=\b)0-$e\\I//q\u001aPTi\u0007\u0005\u000fpih\u0001OP(|#O,\u001f\u000b\tRt\u000byYlZB\u0010{ȼΤ\u000b}\u0016\"hh\u0006p9%>\u0004\u007flw\u0006e]8=w\u000eE\u0010\u0007k<wibAPic>y\u0003\u0007\"vTj\u0015\\lAc\f\t_VZRH\u0019\u0013>\u0001ΌR\f!k\b\u0019*nD1G|EL\u00119ZA+!\u0010jvG\u0017\\C(\th4t7\u0004~\u0015\u0011o\u0016{\u00101ʬd\";z\u001ao'am\"\u0017ؔ-+\r~\u0002\u0004_ibFzoF}[{.\u001b2;g.k\u0016?\u000b/2\u00103]R\u0003gaM@/)\u0004*\u0017Ah<p l\u0007+\u000f \u0011T\u001d>03vrQE\u0015\u0004\b|^zu{\u0005\u001biuaz\u0013]BMH|3\"L]!oP\u007f{2ϡ+\u001d$6\\=#!ui\u001ek*f\u001dA\re2D*\u001b8p_\u001eJ;f\u0007\n\u0003L=<l1Z\u000fo@/PJL\ra\u0006qh~qPM9G.v\u0015c%xf_@\u0012\u007f}b1\u000eb\u0014C,\u0017%HѼ\u0015Ma&6{Y\u001f#J=G;\u007f?\n*\u001ck8\u001d\\+\u001a>I\f\u0018dakh\u0013\u0001!&J+jMQͦT2\f\u001eA\u0018F\u000eʕ]7\u000b{I\u001e&V\u000f[\u0005ޠKe\u000ef/r\u0019~=4d\r}U\u00137^T]Ѳb\u0005a8!\u001b\u0019g/l3u\\VO\u001aV߰1\u0013K]Q\u0015\u001a8\u001aFWp2tTF&I5BF;iU\u001f-\u000f0\r\u0013\u001ci\u0017z\u0005^~R|BY\u0003\t\u0017&<8\u0012;\u001d]A\bb[\u001c\u0015|\u007fI(Q/DW\nR\u0011,\\)~\u001e5[zyn\"y\u0014W\u0002\u000f.\f.t?\u0004#\"#k^v\u0018m3<,pDcXƄ\u001fц$\u00066J\u0003\u0004Z<\u0016Hg\u0004I\u0001Al0Ř\u0004̝D'3ˊVXYl\u0011\fyk\u0012q\fPYϧ3ٟ}t5Ǡ5\u000b-`<')tH\u0017k&h\u0013\u0010\u0014C.M=>(\u007f։Qʍlvsχs\u000f1Dy@2[>^6\u0019/\u000b\u0006\u0013XlӲ\u0019E\\fNj\u000fv|D]\u0014\u0005\u00068f\u0005\fW\u0015+\u0016~$ǚ\u00178^t$\u0001=TiIi\u001a_{\u0017\u0015UXT9ܳVI!PB\u0011uB\u0007\u0013\t@\t\u0010\u0010,R\t!\u000e\u0016Cc\fÊA\u001e?[*\fr v[SAZ\nB\u0010<ıeZ\u000fԐ@ѱ\u001e\u001cCǛ\u0004l'0\u00190H\u0017\u007f\u0016GM֚U]+C\u0011\u0003\u0007'O{7q`\u000fGt3/=\u0010In\u001dֶ%̂iP?\u000e\b\u0005X\u001c\u001erd0y,wU{c¼YD\u0018\f%E2(F2\u000ehIHX\u007f\u0013\u0006ҕw[\u001c(0Y|fsVz\u001d\f\nZ\nN9\u008c_eLC\u00018'f\u000f9;\u0012\u001fE{\t0Pް\u0011I,9\u0015+7Ug\f\u001eu\n@Yi)\u0013Ұ`aT\u0015y*HT2a\bnXt:\u0017=!\u0003{ènwWx >\u0018'\u001d\u0006}7x{\u0010b-\u0018Uk%]l̯x³Ef#B\u0015KlK\u0013\"\u0019\u000b.0^\u00160\u0001\u0001&kͽ5˝wGÖn}'E\u001fou\u001a3i\u0003GmX(\u001e\u0014ق5ٱqP`˂}^\u000b~/_5<#\u000b\u0003+\\H\r\u0004Ϲ.^\u000eچ]fN:R$\u00157{\\H0~ڄ\u0011\t\u05fc\u0005 7?[Bs-\u0003vE[|\u0011Y8\u000e4)м%٭|\b\u000bްY\u001b\u0019:,~\nA1$%1l->\"ƖY\u0001\u0006K\u00165o}ĭ3\\"}, d2 = {"\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Ns\u000bJ@)4Y\u0007/;|*w+J?k=-xgaB\u0016g;bL", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Ey\u0016D\u0001.~]\u0007/7z\u001f*T\rIg5\u001e dn7\u0007ju*s5VYJ*k@n>\u0014|V\u001bL+\u0014\u0001VH$D", "ChS", "", ">`R8T.><\u0015\u0007z", "", "/sc?\\)Nb\u001d\t\u0004M(~", ":hbAX5>`|}", "1kX2a;\u001fS\u0015\u000e\u000bk,\u000b", "", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Ey\u0016D\u0001.~:}\u001cF}#.#", "7l_2e:H\\\u0015\u000e\u0005k", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"51Xcn\u0007$!^\u0015\u0018\u0012\u0011\u0013h\u0017\u000blN?h\n6S\u0004BhJ\b\u001f\rBttA \u0012O\b^|E&v\u0010]^yPPIq>.if!\\CI\b\u0013q\"*l_B_?D", ">hS", "1kX2a;,R\u001fozk:\u0001\u00138", "1kX2a;-g$~", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Ns\u000bJ@)4Y\u0007/;|*w+J?k=-\u0004|l9\\", "uH8\u0019](OOb\u0006vg.Fv>r\u00041}\u0016g\u001c\u0013XkWCr.7#k/Dq\u001f0#*@gE\u001a^o]B\t-\u001a]\u0004+PN$\u0013aN\u00049]\u0019V\u0017Ptp\u000ehA&nQ\r\u0006\r(Z}\u0005x\u0010\u0010\u001dW\u001cn~Q,vE\u0004\u001d?C3rH`_CCJDo4h\u000b)\u001fdH\u0004+\u0018n'dlO.\u0013\u000bW \u0007\u001cWnkG\"\n'8Im1-Cy]\u0006v1)M\u0003w[.as8~1\u0003},>rNRk\u0015L(|\u0014,eP+5J\u0006pFOc~{\"\rh(p\f\u001dv\u000bt\n", "-b[6X5MA\u0018\u0005k^9\u000b\r9n", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "-b[6X5MB-\nz", "5dc\u000eg;KW\u0016\u000f\nb6\u0006w+g", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010_0>\\(_zZ;\r\u0016/s", "u(;7T=:\u001d)\u000e~euc\r=tU", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1n]AX?M", "5dc\u0010_0>\\(lyd\u001d|\u0016=i\n1", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "5dc\u0010_0>\\(m\u000fi,", "7r56e:M>\u0015\f\nr", "", "7r8:c,Ka#\bvm,{l.e\t7\u007fO\u0015", "u(I", "7r<FC9HQ\u0019\r\t", "7r<FH0=", "7r<FH:>`", "7rBFf;>[\u0007~\bo,\n", "7rI2e6)O&\u000e\u000f", "5dc\u0019\\:MS\"~\bB+", "5dc\u001dT*DO\u001b~cZ4|", "5dc\u001d\\+", "u(8", "@dP9<+>\\(\u0003\nr", "5dc\u001fX(E7\u0018~\u0004m0\f\u001d", "u(;0b4\bU#\t|e,F\u00058d\r2\u007f?J\u0019\u001fU9\u0015@s3~]| @|\u001a=a\r\u0019r8\u001e\u001ewE8\u0007l;R\u0006;\u001d", "5dc\"\\+", "CrT?;(GR ~", "\u001a`]1e6BRb\t\t(\u001c\u000b\t<H{1zG\u0001l", "5dc\"f,K6\u0015\bye,", "u(;.a+K]\u001d}Dh:Fx=e\r\u000bwI\u007f\u001e\u0017\u001d", "/r8:c,Ka#\bvm6\n", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Ns\u000bJ@)4Y\u0007/;|*w1KFkA,\u001fq]H\u0011p\u0002", "1gT0^\bGg\u0004~\bf0\u000b\u00173o\t6", ">da:\\:LW#\b\t", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VE\u0004#{!FUG'3v\u0018w;RHo= j,V", "1gT0^\u0017>`!\u0003\tl0\u0007\u0012=", "1n_F", "3mU<e*>/\"\u0013e^9\u0005\r=s\u00042\u0005N", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VE\u0004#{!FUG'3v\u0018w;RHo= j,R", "3mU<e*>4\u001d\f\tm\u0017x\u0016>y", "3mU<e*>>\u0015|\u0001Z.|q+m\u007f", "3mU<e*>>\u0019\f\u0003b:\u000b\r9n\u000e", "3mU<e*>H\u0019\f\u0005I(\n\u0018C", "3pd._:", "=sW2e", "", "4na\u000eZ.KS\u001bz\nb6\u0006", "5dc\u0016`7>`'\t\u0004Z;\u0007\u0016", "6`b566=S", "7l_2e:H\\\u0015\u000ez", "7l_2e:H\\\u0015\u000ez^", "7l_2e:H\\\u0015\u000ez^\u0013\u0001\u0017>e\t(\t$\u007f", "At_=b9May~vm<\n\t", "4dPAh9>", "Dda@\\6G", "", "BnBAe0GU", "EqXAX\u001bH>\u0015\fx^3", "2dbA", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007}", "4kP4f", "\u0011n\\=T5B]\"", "8`e.!*H[a\u0001\u0005h.\u0004\twa\t'\tJ\u0005\u0016_Iw\u001c\u0005})2gF$6m\u001f=QROe8\u001d\u0015qp=\u0016w"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@SafeParcelable.Class(creator = "n+Rpak_\u0014o\"\u001bty05/^I\u000ext")
@SafeParcelable.Reserved({2, 5})
public final class zze extends AbstractSafeParcelable {

    @InterfaceC1492Gx
    @SafeParcelable.Field(defaultValue = "eRVTm]M]MNTHHQIbPVLK]PPMCG?", defaultValueUnchecked = "M:><UE5E56<0091J8>43E885+/'", getter = "85G'>8", id = 1, type = "\u0017\u0006\f\f'\u0019\u000b\u001d\u000f\u0012\u001a\u0010\u0012\u001d\u00172\"*\"#7,.-%+%")
    private final int zzb;

    @InterfaceC1492Gx
    @SafeParcelable.Field(defaultValue = "eRVTm]M]MNTHHQIbPVLK]PPMCG?", defaultValueUnchecked = "M:><UE5E56<0091J8>43E885+/'", getter = "85G\"67B70-\u0019+:1", id = 3, type = "\u0017\u0006\f\f'\u0019\u000b\u001d\u000f\u0012\u001a\u0010\u0012\u001d\u00172\"*\"#7,.-%+%")
    private final String zzc;

    @InterfaceC1492Gx
    @SafeParcelable.Field(defaultValue = "eRVTm]M]MNTHHQIbPVLK]PPMCG?", defaultValueUnchecked = "M:><UE5E56<0091J8>43E885+/'", getter = "85G\u0013IHI?+=?3<:#/H", id = 4, type = "\u0017\u0006\f\f'\u0019\u000b\u001d\u000f\u0012\u001a\u0010\u0012\u001d\u00172\"*\"#7,.-%+%")
    private final String zzd;

    @InterfaceC1492Gx
    @SafeParcelable.Field(defaultValue = "eRVTm]M]MNTHHQIbPVLK]PPMCG?", defaultValueUnchecked = "M:><UE5E56<0091J8>43E885+/'", getter = "85G\u001e>GK;7-=\u00131", id = 6, type = "\u0017\u0006\f\f'\u0019\u000b\u001d\u000f\u0012\u001a\u0010\u0012\u001d\u00172\"*\"#7,.-%+%")
    private final String zze;

    @InterfaceC1492Gx
    @SafeParcelable.Field(defaultValue = "eRVTm]M]MNTHHQIbPVLK]PPMCG?", defaultValueUnchecked = "M:><UE5E56<0091J8>43E885+/'", getter = "85G\u0015A=<D=\u000e0+AAA3T", id = 8, type = "\u0017\u0006\f\f'\u0019\u000b\u001d\u000f\u0012\u001a\u0010\u0012\u001d\u00172\"*\"#7,.-%+%")
    private final List zzf;

    @InterfaceC1492Gx
    @SafeParcelable.Field(defaultValue = "eRVTm]M]MNTHHQIbPVLK]PPMCG?", defaultValueUnchecked = "M:><UE5E56<0091J8>43E885+/'", getter = "85G\u001bBD<H<79+A;A", id = 7, type = "\u0017\u0006\f\f'\u0019\u000b\u001d\u000f\u0012\u001a\u0010\u0012\u001d\u00172\"*\"#7,.-%+%")
    private final zze zzg;
    public static final zzd zza = new zzd(null);
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    static {
        Process.myUid();
        Process.myPid();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "2T\bN1z$i\u00187)\rS\u001a8O^X\u000etgz\u0011S\u000bU\u0001")
    @InterfaceC1492Gx
    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 3) String packageName, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 8) List list, @SafeParcelable.Param(id = 7) zze zzeVar) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (zzeVar != null && zzeVar.zza()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.zzb = i2;
        this.zzc = packageName;
        this.zzd = str;
        this.zze = str2 == null ? zzeVar != null ? zzeVar.zze : null : str2;
        if (list == null) {
            list = zzeVar != null ? zzeVar.zzf : null;
            if (list == null) {
                list = zzex.zzi();
                Intrinsics.checkNotNullExpressionValue(list, "of(...)");
            }
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        zzex zzexVarZzj = zzex.zzj(list);
        Intrinsics.checkNotNullExpressionValue(zzexVarZzj, "copyOf(...)");
        this.zzf = zzexVarZzj;
        this.zzg = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (this.zzb == zzeVar.zzb && Intrinsics.areEqual(this.zzc, zzeVar.zzc) && Intrinsics.areEqual(this.zzd, zzeVar.zzd) && Intrinsics.areEqual(this.zze, zzeVar.zze) && Intrinsics.areEqual(this.zzg, zzeVar.zzg) && Intrinsics.areEqual(this.zzf, zzeVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzg});
    }

    public final String toString() {
        int length = this.zzc.length() + 18;
        String str = this.zzd;
        StringBuilder sb = new StringBuilder(length + (str != null ? str.length() : 0));
        sb.append(this.zzb);
        sb.append(RemoteSettings.FORWARD_SLASH_STRING);
        sb.append(this.zzc);
        String str2 = this.zzd;
        if (str2 != null) {
            sb.append("[");
            if (StringsKt.startsWith$default(str2, this.zzc, false, 2, (Object) null)) {
                sb.append((CharSequence) str2, this.zzc.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        if (this.zze != null) {
            sb.append(RemoteSettings.FORWARD_SLASH_STRING);
            String str3 = this.zze;
            sb.append(Integer.toHexString(str3 != null ? str3.hashCode() : 0));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int i3 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(dest);
        SafeParcelWriter.writeInt(dest, 1, i3);
        SafeParcelWriter.writeString(dest, 3, this.zzc, false);
        SafeParcelWriter.writeString(dest, 4, this.zzd, false);
        SafeParcelWriter.writeString(dest, 6, this.zze, false);
        SafeParcelWriter.writeParcelable(dest, 7, this.zzg, i2, false);
        SafeParcelWriter.writeTypedList(dest, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(dest, iBeginObjectHeader);
    }

    @Pure
    public final boolean zza() {
        return this.zzg != null;
    }
}
