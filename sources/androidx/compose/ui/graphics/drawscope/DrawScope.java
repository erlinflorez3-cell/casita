package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@DrawScopeMarker
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŅ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H\u007f*,(w\u000ffp:8D{H6RY+\u0017k\u00124,[*qK;c\u001a\u0006̝\u0011OdgoñRZ\u0019H\u0017\u0006\u001cxr,W^\u0001]\u0018\u0010:B\u0006?;ݹw=O`|Ȃ\r H\"@y\u000b\u0002\"*^\u0010~zIS\u0014\u0012F@x:X\u000eU\u00050\u0012\u000ē(\u00014\\oN<Kt]P/+\u0003oGV'u0\u0005ձ\u0015Fj'\u0015vg'3@M5\u001d%Y\u0007\u000fRi]\u000bӊy=\u001bh/'1P{WLX\b\u0014\u001b2W\rsr.ؘ\rQv\f/+ecSP\u0014*}`\u0012ȞZw>\u0006UGf,\u000e/v\u001cB\rr\u0002P\u0001\u0006lS\u0018z\u0010HG)\u000eFC9Iz\u0002eI.f7*\u0019=\"1\u0017\u0007!\nk>f\u001b\u001bb\u0010i1\u007fAmNT\ngI\u0006\u0004\u001fo20\n1U\u0019G{?BG+=[G=9k0cto|\u0005n\u0005kkhGn?\u001f\u001c=*\u0017*rD\u0013$2tղW\u008cҭQ\u001eZ'\f)[\u000fj\u0007T!S ~Sv\f\u0003M\f-U3tJqn\u001a\"\b=lHMQ\u0012$\u0012V\u0005*W<\u0011\u001c\tlHS\u001art(P3xp\u0016w\nPf\fA?ow\"5:J1\\C\\3$HA\u000b#wZ\u0017+/\\9$\u0011\u0006<v\u001f\u007f~y!umxWJ\u0015`PL\buۺ\u0018ğƁ&j:!1,GJ\u000em\u007fLu\\\u001d\u001a\u0004f\u0014 D,iW5=!6\u0017)`\u0016]KRrsQe\u0012U{-\u007f\u0015<vG\u007f\b\u0019\u0005\\fpJ]n/\"%y#+\u000ed\u000e\u0016yH\u0011F\u0012q;aDI\u0001!q<|WC)ʍ\u001dݒ˽s$\u0003];los$\u001e,/Cq\u000em}P\u0012b=I%k\n,q=\bb\u007fqbA>Ig~V\"Rm3HNk\u0006!Z\tb!cNGd~pPM9J.n\r,\u001b\rn]P\u0012\u001e\u001bd4e*\u0002a\u0016\u0014\rbk5µR܊ƽqMb5X:RW\n]\u0007\u0012JMPZe\u0010!04\"H<G;p\u001dT\tR5\\B\u000e\fQm\u0002\u0006>\u000f0Le\u000f%LZsiq>\\~\\dd\u001db[_OG1\u0005\u00153,\u0017M13\r\rx҈bѢݏW\u001f\u000fJx\u007fGQ3W\\Tg+X\\\u000f8]]qw2<\nG7\u001f\u0004o:jH\u0003#B&NQQ?\u0014'6d\u000bc\u001afd%D\u0017XT\"75\u0013|<p:\u0015\u0011\u001a]\f\bb[`~}=C(\u001b/DW\"<\u0005iF)I\u001e7C<w\bD-\u0002WaY\u0016\bN?m)ʅ Ƹ߉\u0012h\u0010\u0015)r^f$\u000f\u001a\tA`P\b<w\rr8\\8<U\u0002A3+^\b\u001e('F'9 \u001eBy\u001d)\u0010ilq$m\u000b1\u0019a\\\u007fn;\u00075\tU\u0002^\u0019^[H*k \u0007%0\u001a\u001b&-P bW+\u007fknpyks\u000fA.\u001aG\u001276R,\u001c7y$#ZZ.\u0015I\u0010e>\u0013C#\u0001ݹVВ߿n*j0\u001ae\\e\r\u0006v\u0011ADvv,uG7G1\f\u0011U\u001f\u001f\u0004sJV%?\u0012W\u001be3;u.v\u001fCRb#\u0014ZH\u000fr\u000e)D-t\u0017m\"-Y21|\u0005<Js|r\u000e2\u0012\u001c*GZf4nd \u001cImKC/\u0010/2h\fu\u0007'S\u0003Q\u0002Dp%Ю\u007f\u008dק}3q\u007f\u0002};\f=L\b\u001b\u0006vk)C\bd':%\u0016N\r\f{V=b\\MC\u00056y\u0004A0\u0010%$2F\u000e#.YaN0_j\u0002ns\u0006FV2<nRf_n\u000fr8p\u001a\u001eyeizLA)(ILD*;\t\u001fGcg((t\u0013K\u0014E-\u001e)a6C4ߺp˟\u0557MtSvj&\u0005i\u0002MR2\u0010F*KNjB\u0006[$\u0005ipj{iw\u0010f\u0013=\u0013\nw?^x\u007f\u000f*H-QwTOtx{U\u0013\u0011F\u000f2xFB:&6\u001e4H%\u001e\u0016Lv\u0014APwyGG t\u0014!K0\"Iή$٠\u0095KA[<f\t\u0002\n\u00197bXcu\r\tcCcdY80p1.UnV\u001aXY6\u0014KdV\u001c\\xr5\u001e661^\u0018rC\f\u0015L%CU#\u007f\u00172\u0011R\fl\u0017+Es\u0007Tk\"[\u00162\t\u0016A'1#\u001e\u0002XxGӊ\fГĨ\u007f\nb\u0016cJ6\u0014\u001eQyJO?6C=\u0011cl\u00056o\u001deP\u0017\fN9T\f\u0019%p\u0001+i<6\u0010\tR6dC`K\b,\u0017Jp\u000f\t\u0011$0\"7\u0004#m\f\u0017b*SS_nKt\u0015ƝFڢȍ\u007f,kAtG\"\u0018Sy\u000e\u0019lA\"\u0015q\u001fw\u0014\u001d\"\r\\L9o&n62 #'o\u0015`)^+\u0006isj\u0002nx\u0011\bO\u001c8jy\u0001\u0003|@y=je\u001d\u001flO\f9iD\u0011('\u0015ج@Ŗكp.-\nV?ao\u000f!y\u0017BGt\u00011>K@2c2S\f&u\"6\u0012x:\u0010\u0015*7c:\u001b\u0001D|C\u0017nlx\u0004zEe02\u007f_8LZN]EZU0\u0019\u00100\u000e\u001a@\u001d.\u0005R\u0001\u0016&%xe\r<6\u001aokiO'\u0013\u00115T\nHL\u0007\u0018\u001f^b%<\u001a\u001e\u001f@aBYЏ@оڥ7Yw*B9f\u0018\f?\u0010 ;{B\u000eq!;Uyd!]\\N&^\n@g\u001a\u001a\nP\u0003T\f#I\u001aHbmb()\u0001\u001dv0J\u0015\u0003)+\u000fe\u001ap\ru<t\u001eFyfk+LCST\fCu35r\u0016dam-?w\u0016O\u0016Hkdo\fZkqF8\ro\u0012O(s\u000fz\t;ތ\u0007ңԸo<\u0002$\u0011q3\"<xrf\u001d|'To!U\u0016;&5Dy)1X=_\u000fh0A\u000fp+CiE\u0013\u0018t\u0017.a@W*\u000fvl\u0017\u0014!\u0002\u0013e|\u001aDTu\u0001FK#w\u001ciyPP\u0005xq./\u0018\u0016.6K\u001f{]ЋrϥӖ9idhcnV}|. q^BwahBG[61zlRP\u001bY\u001fl\\w'x\u001d?#\u000eBEP*sk\u001fh\u0013O\u0005;\f|\u0004j\u0001\u001e|us'^\u00196)\u0019A-2&&\u001e~#xdU{\u0001Nf+\fHbt,Ś\u0004ߥօ\t7\u0010\"?\r\u001cQ'\r\u0010_\rR5\u001132@\u000bF:\u0012r\u0019o#@:CAwKs\u000f\u0010*U=\t[^'\u0001 2\u001e\u0003m\u0010mmChdx\u000e:a0^\b9SRm\fH\u0003o\u0019\u0013\u000f\u0018UqJy\u0017yLDV-VXA\u0014pz\\'\nG\u000b;ԗ\u001dѲ\u06dd(4\u0012S>\u0001%I\fQ\u000fR\u0011\"\u00118|Wp@cNS\u0007,\u0001\u000f!;]Y\u0015n_[Fr\u001b~v~PBdz>w_ 1Kg6Qk2*SayO\u0007dF(+p-<e:!|X3\u001aD{T$O;I\u0011`\u0005\u001d\u0011N\t\r\u0004]eW\u0017ҾoީڃMab\u0006:Fq\rybGP\u0001Nun]'G*FKO#yfh\u001cʍfҹҪ)\u0017\u0013\nxw=:+\"\n\\\r:g\u00024\u0012DH\u00056~O\u0003>$Pd)\u0003\u0011zzD0Rb}έ&\u0014uNUg Tދe4\u0004+\u0014.ԛ]̮ܧ\u0011()\u001f\u0019\u000ez\u001bZDi3\u001bd}*Mͩ\u000fڊ0ްνF/Ҽy~\u0016\u001e8sNzCqy:]\u007fF.\u001bȁ3Ƙ\u0006\u0010hNu\u0003>Pb\\\u0019J*\u0013`ItǼ\u001d\u07b5jMLJ{fDw.\\7\n&fdzt`$ĶXģ\u0005ҌȂ^iͰwznh\u0019M%\u0015ɨ{~ímt\rh,̒Ft~[3g\u001b_Up.v\u0016\u07bch)́\u0018 "}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u0010X5MS&F[*\nLe!0", "u(9", "2qPD66Gb\u0019\u0012\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00rrjH\u0007v;$", "5dc\u0011e(P1#\b\n^?\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#|-3\u007f$,WN;5\u0013+\u0011z?C\u0010r,a\u0006|", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc \\A>\u001b\u0002aBc)i\u0007", "2qPD49<", "", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "AsP?g\bGU ~", "", "AvT2c\bGU ~", "CrT\u0010X5MS&", "", "Bn_\u0019X-M", "/k_5T", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "1n[<e\rBZ(~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "2qPD49<\u001b\u001d\u0006\u0002>\u007fHl", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u000f.8 P\u0015\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[\\\u001bJ6\u0010\tWOmmQ31\u0016*S\r;2_\u0019\u0012 #y\u0005IVe.u\u001etN3lEl)wQIPl8dUo!&<G \u001ft\u001d\u0019v\u001a\f\u0014\u0003]\u001eSV\u0001vgTn^{\u0015", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2qPD49<\u001b-]H@\u001cb\u0013", "uI5\u0013M\u0011#4\u007fz\u0004]9\u0007\r.xI&\u0006H\f!%G9\u001e@@'BU\t#;k$wLP7}B\u001c\u001fsa\u0003ep(`d6[SN\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuK\u000f7s\u0004\u0010\u0014\u001c~HzI`\u001d(}\u001c\u0005A6>*\u001dP", "2qPD60KQ ~", "@`S6h:", "2qPD60KQ ~BO\u007fY\u0013\u001as\u0012", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u000f2$\"g=\u001d\"re8\u001a-*X~2QZNulV<?!\u000ee\u0011R)\u001bNXN \u0001R5)\u0013,\u0013`Hd\u0013y%\"<jF)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUa*XE=(\u0012\u007fbxrW8\u0017\\W\u0018\u0002R\u0007=K\u000b\n", "2qPD60KQ ~BO(ff\u0003B\u0002", "uI5\u00179\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001l#*_Q9u?\u001e^Gn5\u0019Q;b}'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001!\u0015(T\u0005?f\u000fUs\u0018<t}#Z\u0017Vy\"K%lY", "2qPD<4:U\u0019", "7lP4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "2qPD<4:U\u0019F|[\u001day\u00128", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003uO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^WP8\t\u0010\\E\"|\u000e6,\u0004>W\u007fEs\u0001Ut\u001b1|^Qj\u0017GO{qJ(uP]^\r\u0011?Oj5n\u001a_fl>\u0004&!m$\u001elN<SY]\u0018|_ZknV\u0019\b\u000e\b\u0002^", "AqR\u001cY-LS(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "AqR \\A>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "2rc\u001cY-LS(", "2rc \\A>", "2qPD<4:U\u0019FNc\u000e\b\u000f\u001fE", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003yMF\u001am_5M\u00041KKauZ\\zH\u001e ZW^/V\u0007f=/qH5-Q+V}Mv~\u0016!\u000e~I}>h}V\u000e\u001cu\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;\u001b(d[1\u000eyaZP\\\u0001qt(\u001d\u0002G$KC?\n6", "4h[AX9*c\u0015\u0006~m@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016]\u0005/7z\u0002>IJ?zHs", "2qPD<4:U\u0019FVSx}h\u0017s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003yMF\u001am_5M\u00041KKauZ\\zH\u001e ZW^/V\u0007f=/qH5-Q+V}Mv~\u0016!\u000e~I}>h}V\u000e\u001cu\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;\u001b(d[1\u000eyaZP\\\u0001qt(\u001d\u0002G$KC?*\t`", "2qPD?0GS", "AsP?g", "3mS", "Asa<^,0W\u0018\u000e}", "1`_", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", ">`c58-?S\u0017\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0017n\u0017.KR\u0011", "2qPD?0GS`JgM4\fq-", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u00132$\u001fR0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007\u0016\u001fV\u0019Q/\u000b\u0013#, }G\u0017 \t,G\u0011\u0011Ig\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCINAm-h\nmf:DA.!R\u001d\"wP;__\u0017\u0002", "2qPD?0GS`g\\F|`\u0006y", "uI9\u00179\u0010%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsW>\u0004!@\\\u0002\u001eE7\u0001*\\F\u001bl5\u001e\u0013w7\u001am_5M\u00041KKauZ\\zH\u001e ZW^/V\u0007f=/qH5-Q\nS\tEua\u0010\u001d\u001d5wF&\u001a\u0001", "2qPDB=:Z", "2qPDB=:Z`Z\tN4KUA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u00132$\"g=\u001d\"re8\u001a-*X~2QZNulV<?!\u000ee\u0011R)\u001bNXN \u0001R5)\u0013,\u0013`Hd\u0013y%\"<jF)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUa*XE=(\u0012\u007fbxrW8\u0017\\W\u0018\u0002R\u0007=K\u000b\n", "2qPDB=:Z`\bBC\u007ffjy", "uI9\u00179\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001l#*_Q9u?\u001e^Gn5\u0019Q;b}'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001!\u0015(T\u0005?f\u000fUs\u0018<t}#Z\u0017Vy\"K%lY", "2qPDC(MV", ">`c5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "2qPDC(MV``WF>\u0002s\u001f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:C|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018.iN}@\u0018\u0010hW+8\u001d\u0013\\\u0017\u0005U@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011{\"qL,lDg)xT=Wp(n\u0017_f;G66\u0002\u0001-\"h&\u0015\u0006\u0005R\u001e|Vxz1E#\u0003C.Lm%VI9WIp2\"Oy\u0006[\u0010b{5\u0002\u000e\b;96qZ/+\t", "2qPDC(MV`e\\.xPf\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:Cz\u000f4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\t\f\u0012US2lNB\u001fQ\u000bV}MV\u0010 \u001d\u000e\u000bQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bUfsf\u0019[(_>82]O#\"r]\u000f\u000e\u0003b\u0011\u007f(]+X", "2qPDC6B\\(\r", ">nX;g:", "", ">nX;g\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n c\u0002)FU -M\u0019", "2qPDC6B\\(\rB@:}\u0018yW\u000e", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;c\u000fwI\u007f$!Kn!\u0006t/=d\b.77&2\u0017EHg?!\u0019fo\u0003cp<\\y|(05(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;h\n9E\r>l~\u001a_x1ys\"W\u0011Gw$K\"\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;\u001b(d[1\u000eyaZP\\\u0001qt(\u001d\u0002G$KC?\n6", "2qPDC6B\\(\rB?~q\u001b\u0017PR", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;c\r\\$g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005qu9r6J,O-\\P\u0002\u0013txV\u0017M8\u0017\tXTmlN?*\u0012:IKKlJ\u000e#\n@mt@dY%\u0004\u001c\u007fN\nlMh_\u0007\u001d%\tS", "2qPDE,<b", "2qPDE,<b`Z\tN4KUA", "2qPDE,<b`\bBC\u007ffjy", "2qPDE6N\\\u0018kz\\;", "1na;X9+O\u0018\u0003\u000bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u0013c\u000b)7z\u0003*LGKy\n", "2qPDE6N\\\u0018kz\\;D}?i\f\u0019\u000b,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epk\u00132(\u001cR0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007\u0016\u001fV\u0019Q/\u000b\u0013#@1jVE\u001d\u00127IK\u001au|\u001e\u0004\u001dIqp\u0018=\fPx\"\u007fE({\u0010Wi\u0002RKSbst\u0010)\u001fi6E'\u0018o'dFZ5\u0014\t4\u0015yayt=+\\k", "2qPDE6N\\\u0018kz\\;D\u0019vA\u0012w_\u001c", "uI9\u0017=\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001l#*_Q9u?\u001e^Gn5\u0019Q;b}'\u001d-5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;h\n9E\r>l~\u001a_k?qzO7\u0014N\t\u0015\u0003\u0017\r,7", "=eU@X;,W.~", "=eU@X;", "=eU@X;,W.~BI\fe{<5g", "uI9u=", "@dR<e+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "@dR<e+\u00068\n\u000e`*\u001aK", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~`y47z_\u0010Z?Fn8\u001c#O]M\u0007p\u00023]-Q[U0e\u001cwN\u001c[[\u001eW)\u001c\tcJ28%G(\u0006;M\fD4VO\u0007", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface DrawScope extends Density {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: renamed from: drawArc-illE91I */
    void mo4631drawArcillE91I(Brush brush, float f2, float f3, boolean z2, long j2, long j3, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawArc-yD3GUKo */
    void mo4632drawArcyD3GUKo(long j2, float f2, float f3, boolean z2, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawCircle-V9BoPsw */
    void mo4633drawCircleV9BoPsw(Brush brush, float f2, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawCircle-VaOC9Bg */
    void mo4634drawCircleVaOC9Bg(long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013X\u0001;v\u0007TlkH/\u007f\u0010$2\u000e`^\n>mu\rY{\u0006\u0003rO\tciwZwWZa{xG,rI\"jU\t0YTzKG@&\u0011Y\u0005Y\u001c\u0003=\u0016\fK\u007f8.L\u000b\u0001q'\u001a", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo4635drawImage9jGpkUE(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawImage-gbVJVH8 */
    void mo4637drawImagegbVJVH8(ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawLine-1RTmtNc */
    void mo4638drawLine1RTmtNc(Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3);

    /* JADX INFO: renamed from: drawLine-NGM6Ib0 */
    void mo4639drawLineNGM6Ib0(long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3);

    /* JADX INFO: renamed from: drawOval-AsUm42w */
    void mo4640drawOvalAsUm42w(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawOval-n-J9OG0 */
    void mo4641drawOvalnJ9OG0(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawPath-GBMwjPU */
    void mo4642drawPathGBMwjPU(Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawPath-LG529CI */
    void mo4643drawPathLG529CI(Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawPoints-F8ZwMP8 */
    void mo4644drawPointsF8ZwMP8(List<Offset> list, int i2, long j2, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4);

    /* JADX INFO: renamed from: drawPoints-Gsft0Ws */
    void mo4645drawPointsGsft0Ws(List<Offset> list, int i2, Brush brush, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4);

    /* JADX INFO: renamed from: drawRect-AsUm42w */
    void mo4646drawRectAsUm42w(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawRect-n-J9OG0 */
    void mo4647drawRectnJ9OG0(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ */
    void mo4648drawRoundRectZuiqVtQ(Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA */
    void mo4649drawRoundRectuAw5IA(long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2);

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* JADX INFO: compiled from: DrawScope.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public static int m4762roundToPxR2X_6o(DrawScope drawScope, long j2) {
            return DrawScope.super.mo703roundToPxR2X_6o(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public static int m4763roundToPx0680j_4(DrawScope drawScope, float f2) {
            return DrawScope.super.mo704roundToPx0680j_4(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public static float m4764toDpGaN1DYA(DrawScope drawScope, long j2) {
            return DrawScope.super.mo705toDpGaN1DYA(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public static float m4765toDpu2uoSUM(DrawScope drawScope, float f2) {
            return DrawScope.super.mo706toDpu2uoSUM(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public static float m4766toDpu2uoSUM(DrawScope drawScope, int i2) {
            return DrawScope.super.mo707toDpu2uoSUM(i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public static long m4767toDpSizekrfVVM(DrawScope drawScope, long j2) {
            return DrawScope.super.mo708toDpSizekrfVVM(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public static float m4768toPxR2X_6o(DrawScope drawScope, long j2) {
            return DrawScope.super.mo709toPxR2X_6o(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public static float m4769toPx0680j_4(DrawScope drawScope, float f2) {
            return DrawScope.super.mo710toPx0680j_4(f2);
        }

        @Deprecated
        public static Rect toRect(DrawScope drawScope, DpRect dpRect) {
            return DrawScope.super.toRect(dpRect);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public static long m4770toSizeXkaWNTQ(DrawScope drawScope, long j2) {
            return DrawScope.super.mo711toSizeXkaWNTQ(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public static long m4771toSp0xMU5do(DrawScope drawScope, float f2) {
            return DrawScope.super.mo712toSp0xMU5do(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public static long m4772toSpkPz2Gy4(DrawScope drawScope, float f2) {
            return DrawScope.super.mo713toSpkPz2Gy4(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public static long m4773toSpkPz2Gy4(DrawScope drawScope, int i2) {
            return DrawScope.super.mo714toSpkPz2Gy4(i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0 */
        public static long m4758getCenterF1C5BW0(DrawScope drawScope) {
            return DrawScope.super.mo4733getCenterF1C5BW0();
        }

        @Deprecated
        /* JADX INFO: renamed from: getSize-NH-jbRc */
        public static long m4759getSizeNHjbRc(DrawScope drawScope) {
            return DrawScope.super.mo4734getSizeNHjbRc();
        }

        @Deprecated
        /* JADX INFO: renamed from: drawImage-AZ2fEMs */
        public static void m4743drawImageAZ2fEMs(DrawScope drawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
            DrawScope.super.mo4636drawImageAZ2fEMs(imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2, i3);
        }

        @Deprecated
        /* JADX INFO: renamed from: record-JVtK1S4 */
        public static void m4760recordJVtK1S4(DrawScope drawScope, GraphicsLayer graphicsLayer, long j2, Function1<? super DrawScope, Unit> function1) {
            DrawScope.super.mo4735recordJVtK1S4(graphicsLayer, j2, function1);
        }
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    default long mo4733getCenterF1C5BW0() {
        return SizeKt.m4016getCenteruvyYCjk(getDrawContext().mo4655getSizeNHjbRc());
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc */
    default long mo4734getSizeNHjbRc() {
        return getDrawContext().mo4655getSizeNHjbRc();
    }

    /* JADX INFO: renamed from: drawLine-1RTmtNc$default */
    static /* synthetic */ void m4719drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, Object obj) {
        PathEffect pathEffect2 = pathEffect;
        int iM4736getDefaultBlendMode0nO6VwU = i3;
        float f4 = f3;
        int iM4805getDefaultCapKaPHkGw = i2;
        float f5 = f2;
        if (obj == null) {
            if ((i4 & 8) != 0) {
                f5 = 0.0f;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
                iM4805getDefaultCapKaPHkGw = Stroke.Companion.m4805getDefaultCapKaPHkGw();
            }
            if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
                pathEffect2 = null;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                f4 = 1.0f;
            }
            ColorFilter colorFilter2 = (-1) - (((-1) - i4) | ((-1) - 128)) == 0 ? colorFilter : null;
            if ((-1) - (((-1) - i4) | ((-1) - 256)) != 0) {
                iM4736getDefaultBlendMode0nO6VwU = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4638drawLine1RTmtNc(brush, j2, j3, f5, iM4805getDefaultCapKaPHkGw, pathEffect2, f4, colorFilter2, iM4736getDefaultBlendMode0nO6VwU);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
    }

    /* JADX INFO: renamed from: drawLine-NGM6Ib0$default */
    static /* synthetic */ void m4720drawLineNGM6Ib0$default(DrawScope drawScope, long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, Object obj) {
        float f4 = f3;
        int iM4736getDefaultBlendMode0nO6VwU = i3;
        PathEffect pathEffect2 = pathEffect;
        int iM4805getDefaultCapKaPHkGw = i2;
        float f5 = f2;
        if (obj == null) {
            if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
                f5 = 0.0f;
            }
            if ((i4 + 16) - (i4 | 16) != 0) {
                iM4805getDefaultCapKaPHkGw = Stroke.Companion.m4805getDefaultCapKaPHkGw();
            }
            if ((i4 & 32) != 0) {
                pathEffect2 = null;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                f4 = 1.0f;
            }
            ColorFilter colorFilter2 = (i4 + 128) - (i4 | 128) == 0 ? colorFilter : null;
            if ((i4 + 256) - (i4 | 256) != 0) {
                iM4736getDefaultBlendMode0nO6VwU = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4639drawLineNGM6Ib0(j2, j3, j4, f5, iM4805getDefaultCapKaPHkGw, pathEffect2, f4, colorFilter2, iM4736getDefaultBlendMode0nO6VwU);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
    }

    /* JADX INFO: renamed from: drawRect-AsUm42w$default */
    static /* synthetic */ void m4727drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 + 2) - (2 | i3) != 0) {
                j2 = Offset.Companion.m3953getZeroF1C5BW0();
            }
            if ((4 & i3) != 0) {
                j3 = drawScope.m4731offsetSizePENXr5M(drawScope.mo4734getSizeNHjbRc(), j2);
            }
            if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                f2 = 1.0f;
            }
            if ((16 & i3) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((32 & i3) != 0) {
                colorFilter = null;
            }
            if ((i3 + 64) - (i3 | 64) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4646drawRectAsUm42w(brush, j2, j3, f2, drawStyle, colorFilter, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
    }

    /* JADX INFO: renamed from: drawRect-n-J9OG0$default */
    static /* synthetic */ void m4728drawRectnJ9OG0$default(DrawScope drawScope, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((2 & i3) != 0) {
                j3 = Offset.Companion.m3953getZeroF1C5BW0();
            }
            if ((4 & i3) != 0) {
                j4 = drawScope.m4731offsetSizePENXr5M(drawScope.mo4734getSizeNHjbRc(), j3);
            }
            if ((i3 + 8) - (8 | i3) != 0) {
                f2 = 1.0f;
            }
            if ((i3 + 16) - (16 | i3) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((32 & i3) != 0) {
                colorFilter = null;
            }
            if ((i3 & 64) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4647drawRectnJ9OG0(j2, j3, j4, f2, drawStyle, colorFilter, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
    }

    /* JADX INFO: renamed from: drawImage-gbVJVH8$default */
    static /* synthetic */ void m4718drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 + 2) - (2 | i3) != 0) {
                j2 = Offset.Companion.m3953getZeroF1C5BW0();
            }
            if ((i3 + 4) - (4 | i3) != 0) {
                f2 = 1.0f;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                colorFilter = null;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4637drawImagegbVJVH8(imageBitmap, j2, f2, drawStyle, colorFilter, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
    }

    /* JADX INFO: renamed from: drawImage-9jGpkUE$default */
    static /* synthetic */ void m4716drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                j2 = IntOffset.Companion.m6776getZeronOccac();
            }
            if ((i3 & 4) != 0) {
                j3 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            }
            if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                j4 = IntOffset.Companion.m6776getZeronOccac();
            }
            if ((i3 & 16) != 0) {
                j5 = j3;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                f2 = 1.0f;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 + 128) - (i3 | 128) != 0) {
                colorFilter = null;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4635drawImage9jGpkUE(imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
    }

    /* JADX INFO: renamed from: drawImage-AZ2fEMs$default */
    static /* synthetic */ void m4717drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 + 2) - (i4 | 2) != 0) {
                j2 = IntOffset.Companion.m6776getZeronOccac();
            }
            if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                j3 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            }
            if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
                j4 = IntOffset.Companion.m6776getZeronOccac();
            }
            if ((i4 + 16) - (i4 | 16) != 0) {
                j5 = j3;
            }
            if ((i4 + 32) - (i4 | 32) != 0) {
                f2 = 1.0f;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i4 + 128) - (i4 | 128) != 0) {
                colorFilter = null;
            }
            if ((i4 + 256) - (i4 | 256) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            if ((-1) - (((-1) - i4) | ((-1) - 512)) != 0) {
                i3 = Companion.m4737getDefaultFilterQualityfv9h1I();
            }
            drawScope.mo4636drawImageAZ2fEMs(imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
    }

    /* JADX INFO: renamed from: drawImage-AZ2fEMs */
    default void mo4636drawImageAZ2fEMs(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
        m4717drawImageAZ2fEMs$default(this, imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2, 0, 512, null);
    }

    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ$default */
    static /* synthetic */ void m4729drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                j2 = Offset.Companion.m3953getZeroF1C5BW0();
            }
            if ((i3 + 4) - (4 | i3) != 0) {
                j3 = drawScope.m4731offsetSizePENXr5M(drawScope.mo4734getSizeNHjbRc(), j2);
            }
            if ((8 & i3) != 0) {
                j4 = CornerRadius.Companion.m3922getZerokKHJgLs();
            }
            if ((16 & i3) != 0) {
                f2 = 1.0f;
            }
            if ((32 & i3) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
                colorFilter = null;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4648drawRoundRectZuiqVtQ(brush, j2, j3, j4, f2, drawStyle, colorFilter, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
    }

    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA$default */
    static /* synthetic */ void m4730drawRoundRectuAw5IA$default(DrawScope drawScope, long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                j3 = Offset.Companion.m3953getZeroF1C5BW0();
            }
            if ((i3 + 4) - (4 | i3) != 0) {
                j4 = drawScope.m4731offsetSizePENXr5M(drawScope.mo4734getSizeNHjbRc(), j3);
            }
            if ((8 & i3) != 0) {
                j5 = CornerRadius.Companion.m3922getZerokKHJgLs();
            }
            if ((i3 + 16) - (16 | i3) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                f2 = 1.0f;
            }
            if ((64 & i3) != 0) {
                colorFilter = null;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4649drawRoundRectuAw5IA(j2, j3, j4, j5, drawStyle, f2, colorFilter, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
    }

    /* JADX INFO: renamed from: drawCircle-V9BoPsw$default */
    static /* synthetic */ void m4714drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f2, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                f2 = Size.m4005getMinDimensionimpl(drawScope.mo4734getSizeNHjbRc()) / 2.0f;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                j2 = drawScope.mo4733getCenterF1C5BW0();
            }
            if ((8 & i3) != 0) {
                f3 = 1.0f;
            }
            if ((16 & i3) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 + 32) - (32 | i3) != 0) {
                colorFilter = null;
            }
            if ((i3 & 64) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4633drawCircleV9BoPsw(brush, f2, j2, f3, drawStyle, colorFilter, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
    }

    /* JADX INFO: renamed from: drawCircle-VaOC9Bg$default */
    static /* synthetic */ void m4715drawCircleVaOC9Bg$default(DrawScope drawScope, long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                f2 = Size.m4005getMinDimensionimpl(drawScope.mo4734getSizeNHjbRc()) / 2.0f;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                j3 = drawScope.mo4733getCenterF1C5BW0();
            }
            if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                f3 = 1.0f;
            }
            if ((i3 + 16) - (16 | i3) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((32 & i3) != 0) {
                colorFilter = null;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4634drawCircleVaOC9Bg(j2, f2, j3, f3, drawStyle, colorFilter, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
    }

    /* JADX INFO: renamed from: drawOval-AsUm42w$default */
    static /* synthetic */ void m4721drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 + 2) - (2 | i3) != 0) {
                j2 = Offset.Companion.m3953getZeroF1C5BW0();
            }
            if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                j3 = drawScope.m4731offsetSizePENXr5M(drawScope.mo4734getSizeNHjbRc(), j2);
            }
            if ((i3 + 8) - (8 | i3) != 0) {
                f2 = 1.0f;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 + 32) - (32 | i3) != 0) {
                colorFilter = null;
            }
            if ((i3 & 64) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4640drawOvalAsUm42w(brush, j2, j3, f2, drawStyle, colorFilter, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
    }

    /* JADX INFO: renamed from: drawOval-n-J9OG0$default */
    static /* synthetic */ void m4722drawOvalnJ9OG0$default(DrawScope drawScope, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((2 & i3) != 0) {
                j3 = Offset.Companion.m3953getZeroF1C5BW0();
            }
            if ((i3 + 4) - (4 | i3) != 0) {
                j4 = drawScope.m4731offsetSizePENXr5M(drawScope.mo4734getSizeNHjbRc(), j3);
            }
            if ((i3 + 8) - (8 | i3) != 0) {
                f2 = 1.0f;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((i3 + 32) - (32 | i3) != 0) {
                colorFilter = null;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4641drawOvalnJ9OG0(j2, j3, j4, f2, drawStyle, colorFilter, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
    }

    /* JADX INFO: renamed from: drawArc-illE91I$default */
    static /* synthetic */ void m4712drawArcillE91I$default(DrawScope drawScope, Brush brush, float f2, float f3, boolean z2, long j2, long j3, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 + 16) - (16 | i3) != 0) {
                j2 = Offset.Companion.m3953getZeroF1C5BW0();
            }
            if ((i3 + 32) - (32 | i3) != 0) {
                j3 = drawScope.m4731offsetSizePENXr5M(drawScope.mo4734getSizeNHjbRc(), j2);
            }
            if ((i3 + 64) - (64 | i3) != 0) {
                f4 = 1.0f;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
                colorFilter = null;
            }
            if ((i3 & 512) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4631drawArcillE91I(brush, f2, f3, z2, j2, j3, f4, drawStyle, colorFilter, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
    }

    /* JADX INFO: renamed from: drawArc-yD3GUKo$default */
    static /* synthetic */ void m4713drawArcyD3GUKo$default(DrawScope drawScope, long j2, float f2, float f3, boolean z2, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                j3 = Offset.Companion.m3953getZeroF1C5BW0();
            }
            if ((i3 + 32) - (i3 | 32) != 0) {
                j4 = drawScope.m4731offsetSizePENXr5M(drawScope.mo4734getSizeNHjbRc(), j3);
            }
            if ((i3 + 64) - (i3 | 64) != 0) {
                f4 = 1.0f;
            }
            if ((i3 & 128) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
                colorFilter = null;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 512)) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4632drawArcyD3GUKo(j2, f2, f3, z2, j3, j4, f4, drawStyle, colorFilter, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
    }

    /* JADX INFO: renamed from: drawPath-LG529CI$default */
    static /* synthetic */ void m4724drawPathLG529CI$default(DrawScope drawScope, Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((4 & i3) != 0) {
                f2 = 1.0f;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                colorFilter = null;
            }
            if ((i3 + 32) - (i3 | 32) != 0) {
                i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4643drawPathLG529CI(path, j2, f2, drawStyle, colorFilter, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
    }

    /* JADX INFO: renamed from: drawPath-GBMwjPU$default */
    static /* synthetic */ void m4723drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            f2 = 1.0f;
        }
        if ((8 & i3) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        if ((i3 + 16) - (16 | i3) != 0) {
            colorFilter = null;
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            i2 = Companion.m4736getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo4642drawPathGBMwjPU(path, brush, f2, drawStyle, colorFilter, i2);
    }

    /* JADX INFO: renamed from: drawPoints-F8ZwMP8$default */
    static /* synthetic */ void m4725drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i2, long j2, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4, int i5, Object obj) {
        int iM4736getDefaultBlendMode0nO6VwU = i4;
        float f4 = f3;
        PathEffect pathEffect2 = pathEffect;
        int iM4531getButtKaPHkGw = i3;
        float f5 = f2;
        if (obj == null) {
            if ((i5 & 8) != 0) {
                f5 = 0.0f;
            }
            if ((i5 + 16) - (i5 | 16) != 0) {
                iM4531getButtKaPHkGw = StrokeCap.Companion.m4531getButtKaPHkGw();
            }
            if ((i5 + 32) - (i5 | 32) != 0) {
                pathEffect2 = null;
            }
            if ((i5 + 64) - (i5 | 64) != 0) {
                f4 = 1.0f;
            }
            ColorFilter colorFilter2 = (-1) - (((-1) - i5) | ((-1) - 128)) == 0 ? colorFilter : null;
            if ((-1) - (((-1) - i5) | ((-1) - 256)) != 0) {
                iM4736getDefaultBlendMode0nO6VwU = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4644drawPointsF8ZwMP8(list, i2, j2, f5, iM4531getButtKaPHkGw, pathEffect2, f4, colorFilter2, iM4736getDefaultBlendMode0nO6VwU);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
    }

    /* JADX INFO: renamed from: drawPoints-Gsft0Ws$default */
    static /* synthetic */ void m4726drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i2, Brush brush, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4, int i5, Object obj) {
        int iM4736getDefaultBlendMode0nO6VwU = i4;
        float f4 = f3;
        PathEffect pathEffect2 = pathEffect;
        int iM4531getButtKaPHkGw = i3;
        float f5 = f2;
        if (obj == null) {
            if ((-1) - (((-1) - i5) | ((-1) - 8)) != 0) {
                f5 = 0.0f;
            }
            if ((i5 + 16) - (i5 | 16) != 0) {
                iM4531getButtKaPHkGw = StrokeCap.Companion.m4531getButtKaPHkGw();
            }
            if ((i5 + 32) - (i5 | 32) != 0) {
                pathEffect2 = null;
            }
            if ((i5 & 64) != 0) {
                f4 = 1.0f;
            }
            ColorFilter colorFilter2 = (i5 + 128) - (i5 | 128) == 0 ? colorFilter : null;
            if ((i5 & 256) != 0) {
                iM4736getDefaultBlendMode0nO6VwU = Companion.m4736getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo4645drawPointsGsft0Ws(list, i2, brush, f5, iM4531getButtKaPHkGw, pathEffect2, f4, colorFilter2, iM4736getDefaultBlendMode0nO6VwU);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
    }

    /* JADX INFO: renamed from: record-JVtK1S4$default */
    static /* synthetic */ void m4732recordJVtK1S4$default(DrawScope drawScope, GraphicsLayer graphicsLayer, long j2, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
        }
        if ((i2 & 1) != 0) {
            j2 = IntSizeKt.m6819toIntSizeuvyYCjk(drawScope.mo4734getSizeNHjbRc());
        }
        drawScope.mo4735recordJVtK1S4(graphicsLayer, j2, function1);
    }

    /* JADX INFO: renamed from: record-JVtK1S4 */
    default void mo4735recordJVtK1S4(GraphicsLayer graphicsLayer, long j2, final Function1<? super DrawScope, Unit> function1) {
        graphicsLayer.m4828recordmLhObY(this, getLayoutDirection(), j2, new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.drawscope.DrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                DrawScope drawScope2 = this.this$0;
                Density density = drawScope.getDrawContext().getDensity();
                LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                long jMo4655getSizeNHjbRc = drawScope.getDrawContext().mo4655getSizeNHjbRc();
                GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                Function1<DrawScope, Unit> function12 = function1;
                Density density2 = drawScope2.getDrawContext().getDensity();
                LayoutDirection layoutDirection2 = drawScope2.getDrawContext().getLayoutDirection();
                Canvas canvas2 = drawScope2.getDrawContext().getCanvas();
                long jMo4655getSizeNHjbRc2 = drawScope2.getDrawContext().mo4655getSizeNHjbRc();
                GraphicsLayer graphicsLayer3 = drawScope2.getDrawContext().getGraphicsLayer();
                DrawContext drawContext = drawScope2.getDrawContext();
                drawContext.setDensity(density);
                drawContext.setLayoutDirection(layoutDirection);
                drawContext.setCanvas(canvas);
                drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                drawContext.setGraphicsLayer(graphicsLayer2);
                canvas.save();
                try {
                    function12.invoke(drawScope2);
                } finally {
                    canvas.restore();
                    DrawContext drawContext2 = drawScope2.getDrawContext();
                    drawContext2.setDensity(density2);
                    drawContext2.setLayoutDirection(layoutDirection2);
                    drawContext2.setCanvas(canvas2);
                    drawContext2.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc2);
                    drawContext2.setGraphicsLayer(graphicsLayer3);
                }
            }
        });
    }

    /* JADX INFO: renamed from: offsetSize-PENXr5M */
    private default long m4731offsetSizePENXr5M(long j2, long j3) {
        return SizeKt.Size(Size.m4006getWidthimpl(j2) - Offset.m3937getXimpl(j3), Size.m4003getHeightimpl(j2) - Offset.m3938getYimpl(j3));
    }

    /* JADX INFO: compiled from: DrawScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nj?0JͣIDɟ\u0004*=j<9*[ҸuCIUj\u00150\ngN\u0016iŪIҙǈB\u000eو\u001a\u0001r,WZ\u0011_\u0018\u0012@F@VAS\b=ggԓ5ӌ܌1!أ}\r\t\u001a8M(x\u0001KY\u0010۸0Ix=XҪi3\u0019\u001a\u0006D?Ӟ\"e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u0007\"\nX~2CUR6e(", "", "u(E", "\u0012dU.h3M0 ~\u0004]\u0014\u0007\b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "5dc\u0011X-:c \u000eWe,\u0006\b\u0017o~(C\u000b\n\u0001g8\u0002}", "u(8", "\u0017", "\u0012dU.h3M4\u001d\u0006\n^9h\u0019+l\u00047\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016]\u0005/7z\u0002>IJ?zHs", "5dc\u0011X-:c \u000e[b3\f\t<Q\u0010$\u0003D\u0010+^H7\u001f\u0010yp\u0019", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m4120getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m4278getLowfv9h1I();

        private Companion() {
        }

        /* JADX INFO: renamed from: getDefaultBlendMode-0nO6VwU */
        public final int m4736getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* JADX INFO: renamed from: getDefaultFilterQuality-f-v9h1I */
        public final int m4737getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }
}
