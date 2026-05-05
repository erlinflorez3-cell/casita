package com.braze.ui.actions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.ui.activities.BrazeFeedActivity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u000bnjG0L͜P.hS2şq\u0010Jř\f$ B{j*\u00040\tgP}f\u001dKj\u000fQ\u0011\u001e\u0016'm߽MU\u0007aZ\u001d@K\b?aW AGk\r63,x6\t\f\u0013\u00032*v\u0013MٰEƚ\u0010\u00188ϋ\t<X\u0012[\u000bj#\u0014>8\u00034[\u0016OɇLreŽG%\tpPVϴc="}, d2 = {"\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJ\u007f\u0017Y}\u000f<v$\u0011W\r$Avk", "\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJzrE~\u0012F\u007fz", "3wc?T:", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "1gP;a,E", "\u001ab^:\")KO.~D^5\r\u0011=/]+wI\n\u0017\u001e\u001d", "uKP;W9HW\u0018H\u0005luY\u00198d\u0007(Q'~!\u001f\u0011l\u001b8\f%~Y\u00070?{_\fP?Dt4%j,R", "5dc\u0010[(G\\\u0019\u0006", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eqYC|  Gvc", "5dc\u0012k;KO'", "u(;.a+K]\u001d}Dh:Fe?n~/{\u0016", "3wT0h;>", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class NewsfeedAction implements IAction {
    private final Channel channel;
    private final Bundle extras;

    public NewsfeedAction(Bundle bundle, Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.extras = bundle;
        this.channel = channel;
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(Context context) throws Exception {
        Intrinsics.checkNotNullParameter(context, Jg.Wd("Zua`\u0001)\u0016", (short) (ZN.Xd() ^ 20322), (short) (ZN.Xd() ^ 5164)));
        try {
            Intent intent = new Intent(context, (Class<?>) BrazeFeedActivity.class);
            Bundle bundle = this.extras;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            CX.ud();
            Class<?> cls = Class.forName(ZO.xd("b!Lc=vp\u0015\u001f0tv\u000f:6<od]\u007f\u0007gn", (short) (ZN.Xd() ^ 31238), (short) (ZN.Xd() ^ 5461)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1626yg.Ud("\u0005;f\u000e\u001d_)TLG\u0002\u001f{sw|@\u001f%\u000e\u000e\u0004", (short) (C1633zX.Xd() ^ (-22015)), (short) (C1633zX.Xd() ^ (-19846))));
            Object[] objArr = {intent};
            short sXd = (short) (ZN.Xd() ^ 9426);
            int[] iArr = new int["J\u001eVN]L\u0011`yylW\r".length()];
            QB qb = new QB("J\u001eVN]L\u0011`yylW\r");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new Function0<String>() { // from class: com.braze.ui.actions.NewsfeedAction.execute.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "BrazeFeedActivity was not opened successfully.";
                }
            }, 4, (Object) null);
        }
    }

    @Override // com.braze.ui.actions.IAction
    public Channel getChannel() {
        return this.channel;
    }

    public final Bundle getExtras() {
        return this.extras;
    }
}
