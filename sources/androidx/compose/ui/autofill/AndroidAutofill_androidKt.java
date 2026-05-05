package androidx.compose.ui.autofill;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.geometry.Rect;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Wg;
import yg.Xu;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d̉=!,i\bDZc|İI\u0006F\u000b6B\u0015\"4\u0012}\u0007njO0L͜`F`ݷB\u000f\u001az\\$\n$\"MIV2\u00042\u000b_N\u0016j\u001dL!\n[!\u0014\u001a\u0011jZH}x\f\u0012?6PtW3{u\u00048Ƅx="}, d2 = {">da3b9F/)\u000e\u0005_0\u0004\u0010", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011b|-Aq\u0015\n]REl8%\u001c>", "D`[BX:", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "\u001a`]1e6BRb\u0010~^>F\u0005?t\n)\u007fG\b`rW~\u0018=z,<Jy'Gmk", ">n_B_(MS\n\u0003zp\u001a\f\u0016?c\u000f8\t@", "@n^A", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0016\u000bM\u0011\u0015&W|\u000e\u0012", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidAutofill_androidKt {
    public static final void populateViewStructure(AndroidAutofill androidAutofill, ViewStructure viewStructure) {
        int iAddChildCount = AutofillApi23Helper.INSTANCE.addChildCount(viewStructure, androidAutofill.getAutofillTree().getChildren().size());
        for (Map.Entry<Integer, AutofillNode> entry : androidAutofill.getAutofillTree().getChildren().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            AutofillNode value = entry.getValue();
            ViewStructure viewStructureNewChild = AutofillApi23Helper.INSTANCE.newChild(viewStructure, iAddChildCount);
            if (viewStructureNewChild != null) {
                AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
                AutofillId autofillId = AutofillApi26Helper.INSTANCE.getAutofillId(viewStructure);
                Intrinsics.checkNotNull(autofillId);
                autofillApi26Helper.setAutofillId(viewStructureNewChild, autofillId, iIntValue);
                AutofillApi23Helper autofillApi23Helper = AutofillApi23Helper.INSTANCE;
                Context context = androidAutofill.getView().getContext();
                Class<?> cls = Class.forName(C1593ug.zd("drixvqm8n{{\u0003t~\u0006@V\u0004\u0004\u000b|\u0011\u000e", (short) (C1580rY.Xd() ^ (-24939)), (short) (C1580rY.Xd() ^ (-9439))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (C1633zX.Xd() ^ (-31020));
                int[] iArr = new int["41?\u001a*+2',)\u0011#.%".length()];
                QB qb = new QB("41?\u001a*+2',)\u0011#.%");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    autofillApi23Helper.setId(viewStructureNewChild, iIntValue, (String) method.invoke(context, objArr), null, null);
                    AutofillApi26Helper.INSTANCE.setAutofillType(viewStructureNewChild, ContentDataType.Companion.m3806getTextA48pgw8());
                    AutofillApi26Helper autofillApi26Helper2 = AutofillApi26Helper.INSTANCE;
                    List<AutofillType> autofillTypes = value.getAutofillTypes();
                    ArrayList arrayList = new ArrayList(autofillTypes.size());
                    int size = autofillTypes.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        arrayList.add(AndroidAutofillType_androidKt.getAndroidType(autofillTypes.get(i3)));
                    }
                    autofillApi26Helper2.setAutofillHints(viewStructureNewChild, (String[]) arrayList.toArray(new String[0]));
                    Rect boundingBox = value.getBoundingBox();
                    if (boundingBox == null) {
                        C1561oA.Kd("\u0010EEA9=ABv/:LIEKE", (short) (FB.Xd() ^ 17761));
                        Wg.Zd("1ewTV_PNu<UBvH.:R*'\u001b_@FJ6:F\".6\"&\u0013\u0016#\u0006\u0016\u001a\u0006\u000bur}bru\u0007/\u0017V<\u001a+Z\u0002\u0004z~Bww\thueg'KdfMI;CN\u001bE<(i\u0019\u0018%\u0012!\u0018?\u001bz{Bj\u0002\u0005vr]WmV\u000fmDZqGQ:8G(2\u001d\u0018#eR", (short) (C1633zX.Xd() ^ (-1529)), (short) (C1633zX.Xd() ^ (-2579)));
                    } else {
                        int iRound = Math.round(boundingBox.getLeft());
                        int iRound2 = Math.round(boundingBox.getTop());
                        int iRound3 = Math.round(boundingBox.getRight());
                        AutofillApi23Helper.INSTANCE.setDimens(viewStructureNewChild, iRound, iRound2, 0, 0, iRound3 - iRound, Math.round(boundingBox.getBottom()) - iRound2);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            iAddChildCount++;
        }
    }

    public static final void performAutofill(AndroidAutofill androidAutofill, SparseArray<AutofillValue> sparseArray) {
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            AutofillValue autofillValue = sparseArray.get(iKeyAt);
            if (AutofillApi26Helper.INSTANCE.isText(autofillValue)) {
                androidAutofill.getAutofillTree().performAutofill(iKeyAt, AutofillApi26Helper.INSTANCE.textValue(autofillValue).toString());
            } else {
                if (AutofillApi26Helper.INSTANCE.isDate(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (AutofillApi26Helper.INSTANCE.isList(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (AutofillApi26Helper.INSTANCE.isToggle(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }
}
