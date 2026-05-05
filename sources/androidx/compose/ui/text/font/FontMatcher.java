package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.List;
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
/* JADX INFO: compiled from: FontMatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006>)6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a$yCQU\"}(\fWNupvJ`\rIƤ\u001cǝ)jZH\u0016{ٕ\u0016\u000f@B8kAN\bCIb\u000563#`$h}\u0013\u00052*v\u0015'~QQ$\u0012^G!>`\u0015e\u0005H\u001bŘ=ĨӘ\"^mXDS5\nH0;\tyD^'\u000e3+O=Jb+%v\u0010*[DE;-%\u0002\n7ViG\u001b? Fߔgѧݳ/KyaDeHF#,g\u0013mt6\\3T\u000f\u000eW5]qcV\u001e*\bz*\u0010j\u0006>\n5NF-Hm8\u0012A|\u000bSnYڕ]ۍȸ~c<!3\u000f{oG+~Wq=)Ne~3\u000fF)\u0011p1[\u0003\u0011\u000f\u0017KX\u0006WIQnDxR\u0018jUm2\u0003\u0013\n0\u0004>Z\u00181\u0012\u0010\\\u001eU?a915\u0004\u0004^C\u0016}K\u009cnרmRNȖn\u001b?-\u000fɓvrcʶof"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FU\u0012=KF;x\n", "", "u(E", ";`c0[\rH\\(", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FC", "4n]A9(FW \u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "4n]AJ,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "4n]AF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", ";`c0[\rH\\(Fg^;f\r\u0013g", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|v*UGB\u007f\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V\u0006cJ38%A(\u0017\u001eI\u0006=k\u0010ayQ\u001colSRYW\t\u0019|\u000b\u0010lTh5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FT\u001a<\\$EtC~\u0011pe@\u001b9", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@||2[R\u001cu=-udi=\u000ew\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFh\t6R\u0011\u0005I\u000b\u0015%\u007f5nrEee+={z=:d\u0010in}N\u000b,f8sa", "4n]A?0Lb", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f$\u0005?\u000e!\u001bF\u0003W:\u0001-@c\f \u0001}\u001aw\\CNz}\u001f\u001fqp\u0003gm5]h'KNQ;266$\u0019\u000ek\n\u0018;\u001c\t`\u000b\u000brRFt", "4h[AX9\u001bgv\u0006\u0005l,\u000b\u0018!e\u0004*~O", ">qT3X9\u001bS \t\r", "", ";h] X(KQ\u001ckvg.|", ";`g X(KQ\u001ckvg.|", "4h[AX9\u001bgv\u0006\u0005l,\u000b\u0018!e\u0004*~O?'\u001bA~\u000eO\u0006\u001fBY\u0005 3{\u0016", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FontMatcher {
    public static final int $stable = 0;

    public static /* synthetic */ List filterByClosestWeight$ui_text_release$default(FontMatcher fontMatcher, List list, FontWeight fontWeight, boolean z2, FontWeight fontWeight2, FontWeight fontWeight3, int i2, Object obj) {
        FontWeight fontWeight4 = null;
        if ((4 & i2) != 0) {
            fontWeight2 = null;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            fontWeight3 = null;
        }
        int size = list.size();
        int i3 = 0;
        FontWeight fontWeight5 = null;
        while (true) {
            if (i3 >= size) {
                break;
            }
            FontWeight weight = ((Font) list.get(i3)).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                        fontWeight4 = weight;
                    }
                } else {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                }
            }
            i3++;
        }
        if (!z2 ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj2 = list.get(i4);
            if (Intrinsics.areEqual(((Font) obj2).getWeight(), fontWeight4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final List<Font> filterByClosestWeight$ui_text_release(List<? extends Font> list, FontWeight fontWeight, boolean z2, FontWeight fontWeight2, FontWeight fontWeight3) {
        int size = list.size();
        FontWeight fontWeight4 = null;
        FontWeight fontWeight5 = null;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            FontWeight weight = list.get(i2).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                        fontWeight4 = weight;
                    }
                } else {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                }
            }
            i2++;
        }
        if (!z2 ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Font font = list.get(i3);
            if (Intrinsics.areEqual(font.getWeight(), fontWeight4)) {
                arrayList.add(font);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m6227matchFontRetOiIg(FontFamily fontFamily, FontWeight fontWeight, int i2) {
        if (!(fontFamily instanceof FontListFontFamily)) {
            throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
        }
        return m6228matchFontRetOiIg((FontListFontFamily) fontFamily, fontWeight, i2);
    }

    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m6228matchFontRetOiIg(FontListFontFamily fontListFontFamily, FontWeight fontWeight, int i2) {
        return m6229matchFontRetOiIg(fontListFontFamily.getFonts(), fontWeight, i2);
    }

    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m6229matchFontRetOiIg(List<? extends Font> list, FontWeight fontWeight, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Font font = list.get(i4);
            Font font2 = font;
            if (Intrinsics.areEqual(font2.getWeight(), fontWeight) && FontStyle.m6233equalsimpl0(font2.mo6188getStyle_LCdwA(), i2)) {
                arrayList.add(font);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Font font3 = list.get(i5);
            if (FontStyle.m6233equalsimpl0(font3.mo6188getStyle_LCdwA(), i2)) {
                arrayList3.add(font3);
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            list = arrayList4;
        }
        List<? extends Font> list2 = list;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(FontWeight.Companion.getW400()) >= 0) {
            if (fontWeight.compareTo(FontWeight.Companion.getW500()) <= 0) {
                FontWeight w500 = FontWeight.Companion.getW500();
                int size3 = list2.size();
                FontWeight fontWeight3 = null;
                FontWeight fontWeight4 = null;
                int i6 = 0;
                while (true) {
                    if (i6 >= size3) {
                        break;
                    }
                    FontWeight weight = list2.get(i6).getWeight();
                    if (w500 == null || weight.compareTo(w500) <= 0) {
                        if (weight.compareTo(fontWeight) < 0) {
                            if (fontWeight3 == null || weight.compareTo(fontWeight3) > 0) {
                                fontWeight3 = weight;
                            }
                        } else {
                            if (weight.compareTo(fontWeight) <= 0) {
                                fontWeight3 = weight;
                                fontWeight4 = fontWeight3;
                                break;
                            }
                            if (fontWeight4 == null || weight.compareTo(fontWeight4) < 0) {
                                fontWeight4 = weight;
                            }
                        }
                    }
                    i6++;
                }
                if (fontWeight4 != null) {
                    fontWeight3 = fontWeight4;
                }
                ArrayList arrayList5 = new ArrayList(list2.size());
                int size4 = list2.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    Font font4 = list2.get(i7);
                    if (Intrinsics.areEqual(font4.getWeight(), fontWeight3)) {
                        arrayList5.add(font4);
                    }
                }
                ArrayList arrayList6 = arrayList5;
                if (arrayList6.isEmpty()) {
                    FontWeight w5002 = FontWeight.Companion.getW500();
                    int size5 = list2.size();
                    FontWeight fontWeight5 = null;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size5) {
                            break;
                        }
                        FontWeight weight2 = list2.get(i8).getWeight();
                        if (w5002 == null || weight2.compareTo(w5002) >= 0) {
                            if (weight2.compareTo(fontWeight) < 0) {
                                if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                                    fontWeight2 = weight2;
                                }
                            } else {
                                if (weight2.compareTo(fontWeight) <= 0) {
                                    fontWeight2 = weight2;
                                    fontWeight5 = fontWeight2;
                                    break;
                                }
                                if (fontWeight5 == null || weight2.compareTo(fontWeight5) < 0) {
                                    fontWeight5 = weight2;
                                }
                            }
                        }
                        i8++;
                    }
                    if (fontWeight5 != null) {
                        fontWeight2 = fontWeight5;
                    }
                    ArrayList arrayList7 = new ArrayList(list2.size());
                    int size6 = list2.size();
                    while (i3 < size6) {
                        Font font5 = list2.get(i3);
                        if (Intrinsics.areEqual(font5.getWeight(), fontWeight2)) {
                            arrayList7.add(font5);
                        }
                        i3++;
                    }
                    arrayList6 = arrayList7;
                }
                return arrayList6;
            }
            int size7 = list2.size();
            FontWeight fontWeight6 = null;
            int i9 = 0;
            while (true) {
                if (i9 >= size7) {
                    break;
                }
                FontWeight weight3 = list2.get(i9).getWeight();
                if (weight3.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight3.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight3;
                    }
                } else {
                    if (weight3.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight3;
                        fontWeight6 = fontWeight2;
                        break;
                    }
                    if (fontWeight6 == null || weight3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = weight3;
                    }
                }
                i9++;
            }
            if (fontWeight6 != null) {
                fontWeight2 = fontWeight6;
            }
            ArrayList arrayList8 = new ArrayList(list2.size());
            int size8 = list2.size();
            while (i3 < size8) {
                Font font6 = list2.get(i3);
                if (Intrinsics.areEqual(font6.getWeight(), fontWeight2)) {
                    arrayList8.add(font6);
                }
                i3++;
            }
            return arrayList8;
        }
        int size9 = list2.size();
        FontWeight fontWeight7 = null;
        int i10 = 0;
        while (true) {
            if (i10 >= size9) {
                break;
            }
            FontWeight weight4 = list2.get(i10).getWeight();
            if (weight4.compareTo(fontWeight) < 0) {
                if (fontWeight2 == null || weight4.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight4;
                }
            } else if (weight4.compareTo(fontWeight) > 0) {
                if (fontWeight7 == null || weight4.compareTo(fontWeight7) < 0) {
                    fontWeight7 = weight4;
                }
            } else {
                fontWeight2 = weight4;
                fontWeight7 = fontWeight2;
                break;
            }
            i10++;
        }
        if (fontWeight2 == null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList9 = new ArrayList(list2.size());
        int size10 = list2.size();
        while (i3 < size10) {
            Font font7 = list2.get(i3);
            if (Intrinsics.areEqual(font7.getWeight(), fontWeight2)) {
                arrayList9.add(font7);
            }
            i3++;
        }
        return arrayList9;
    }
}
