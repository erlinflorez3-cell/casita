package com.braze.ui.contentcards.recycler;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.ui.R;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.drew.metadata.iptc.IptcDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\":\u0018\u007f\u0007ljA0ReP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvJ`\fI#\u001cǝ)jZH\u0016\u0004m\u0016\u001d2Zom4ޜs=Gb=\\\u0013'J\"f\u00025\u0005(3`\u0010%\u0005sO\u001a\u001dH@\u001fF\u0003\u0011[\u00122\u00124LP\u0005,k\u007fNdX3q\u0003=1\u0014\u0002B|,\u00104\u000b_%F\u0003,Sv2*9CO5C&*\u038b\tқ_?\u000bӊBI\u0013l?'YNJɑ8ݼ\u0004\u0014\u001dۀ \u0019kx>\\3V7ϲ)˦ScSִ˔,\u000b"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WIv#IW\u0005 D7s8VR;tC{\u0011u`Geg=Ru'T0],d1r;\u001e\u001fV\u001dR5\u0016Z", "\u001a`]1e6BR,H\b^*\u0011\u00076e\r9\u007f@\u0013`)Kn\u0010<\u0006n\"Y{45t\u0016;>G;}r\u0002$hi\u0018\u0007a6[r6KVW\u0002", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "/o_\u0010b5MS,\u000e", "1n]AX5M1\u0015\fyl\u0010\f\t7M{;mD\u007f&\u001a", "", "7sT:70OW\u0018~\bA,\u0001\u000b2t", "5dc\u0016g,F=\u001a\u007f\t^;\u000b", "", "7sT:I0>e\u0003\u000f\ni<\fu/c\u000f", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", ">`a2a;", "\u001a`]1e6BR,H\b^*\u0011\u00076e\r9\u007f@\u0013`)Kn\u0010<\u0006n\"Y{45t\u0016;>G;}\n", "AsPAX", "\u001a`]1e6BR,H\b^*\u0011\u00076e\r9\u007f@\u0013`)Kn\u0010<\u0006n\"Y{45t\u0016;>G;}r\f$dp9\\", "5dc \\+>>\u0015}yb5~y+l\u0010(", ">`a2a;0W\u0018\u000e}", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ContentCardsDividerItemDecoration extends RecyclerView.ItemDecoration {
    private final Context appContext;
    private final int contentCardsItemMaxWidth;
    private final int itemDividerHeight;

    public ContentCardsDividerItemDecoration(Context context) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 10776);
        int[] iArr = new int["P]]dVjg".length()];
        QB qb = new QB("P]]dVjg");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        short sXd2 = (short) (C1633zX.Xd() ^ (-933));
        short sXd3 = (short) (C1633zX.Xd() ^ (-11443));
        int[] iArr2 = new int["\u0001yWqW=\u007f5sgR }n\u0001\"_w^qJI\u000f".length()];
        QB qb2 = new QB("\u0001yWqW=\u007f5sgR }n\u0001\"_w^qJI\u000f");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Xd("\u0003\u0002\u0012_\u0010\u0011\u000e\f\u0007\u0006\u001a\u0010\u0017\u0017l\u001a\u001a!\u0013'$", (short) (OY.Xd() ^ 3686)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(context2, Wg.vd("CPPWAUR\r9IJG=87KY``6[[bT`]", (short) (C1499aX.Xd() ^ (-20769))));
            this.appContext = context2;
            Class<?> cls = Class.forName(Qg.kd(">J?LHA;\u00048CAF6>C{\u0010;9>.@;", (short) (C1607wl.Xd() ^ 11185), (short) (C1607wl.Xd() ^ 27033)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd4 = (short) (FB.Xd() ^ 30865);
            short sXd5 = (short) (FB.Xd() ^ 23700);
            int[] iArr3 = new int["\u0007\u0004\u0012n\u0001\u000e\t\u000e\nyz\b".length()];
            QB qb3 = new QB("\u0007\u0004\u0012n\u0001\u000e\t\u000e\nyz\b");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                i4++;
            }
            Method method2 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
            try {
                method2.setAccessible(true);
                this.itemDividerHeight = ((Resources) method2.invoke(context2, objArr2)).getDimensionPixelSize(R.dimen.com_braze_content_cards_divider_height);
                Class<?> cls2 = Class.forName(C1561oA.ud("-9.;70*r'205%-2j~*(-\u001d/*", (short) (C1607wl.Xd() ^ IptcDirectory.TAG_OBJECT_CYCLE)));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd6 = (short) (ZN.Xd() ^ 18399);
                int[] iArr4 = new int["\u000b\b\u0016r\u0005\u0012\r\u0012\u000e}~\f".length()];
                QB qb4 = new QB("\u000b\b\u0016r\u0005\u0012\r\u0012\u000e}~\f");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd6 ^ i5));
                    i5++;
                }
                Method method3 = cls2.getMethod(new String(iArr4, 0, i5), clsArr2);
                try {
                    method3.setAccessible(true);
                    this.contentCardsItemMaxWidth = ((Resources) method3.invoke(context2, objArr3)).getDimensionPixelSize(R.dimen.com_braze_content_cards_max_width);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private final int getSidePaddingValue(int i2) {
        return RangesKt.coerceAtLeast((i2 - this.contentCardsItemMaxWidth) / 2, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect itemViewOutputRect, View view, RecyclerView parent, RecyclerView.State state) {
        boolean zIsControlCardAtPosition;
        Intrinsics.checkNotNullParameter(itemViewOutputRect, "itemViewOutputRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(itemViewOutputRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (parent.getAdapter() instanceof ContentCardAdapter) {
            RecyclerView.Adapter adapter = parent.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.braze.ui.contentcards.adapters.ContentCardAdapter");
            zIsControlCardAtPosition = ((ContentCardAdapter) adapter).isControlCardAtPosition(childAdapterPosition);
        } else {
            zIsControlCardAtPosition = false;
        }
        itemViewOutputRect.top = childAdapterPosition == 0 ? this.itemDividerHeight : 0;
        itemViewOutputRect.bottom = zIsControlCardAtPosition ? 0 : this.itemDividerHeight;
        int sidePaddingValue = getSidePaddingValue(parent.getWidth());
        itemViewOutputRect.left = sidePaddingValue;
        itemViewOutputRect.right = sidePaddingValue;
    }
}
