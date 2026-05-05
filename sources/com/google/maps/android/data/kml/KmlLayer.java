package com.google.maps.android.data.kml;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Layer;
import com.google.maps.android.data.Renderer;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public class KmlLayer extends Layer {
    public KmlLayer(GoogleMap googleMap, int i2, Context context) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Xd("\u0016$\u001b*(#\u001fi --4&07q\b55<.B?", (short) (FB.Xd() ^ 14906)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-18468));
        int[] iArr = new int["po{Zr\u0002z\u0002\u0004ut\u0004".length()];
        QB qb = new QB("po{Zr\u0002z\u0002\u0004ut\u0004");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            this(googleMap, ((Resources) method.invoke(context, objArr)).openRawResource(i2), context, new MarkerManager(googleMap), new PolygonManager(googleMap), new PolylineManager(googleMap), new GroundOverlayManager(googleMap), (Renderer.ImagesCache) null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KmlLayer(GoogleMap googleMap, int i2, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, Renderer.ImagesCache imagesCache) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("FRGTPIC\f@KIN>FK\u0004\u0018CAF6HC", (short) (C1580rY.Xd() ^ (-20241)), (short) (C1580rY.Xd() ^ (-24738)))).getMethod(hg.Vd("KHV3ERMRN>?L", (short) (C1633zX.Xd() ^ (-2228)), (short) (C1633zX.Xd() ^ (-21376))), new Class[0]);
        try {
            method.setAccessible(true);
            this(googleMap, ((Resources) method.invoke(context, objArr)).openRawResource(i2), context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public KmlLayer(GoogleMap googleMap, InputStream inputStream, Context context) throws XmlPullParserException, IOException {
        this(googleMap, inputStream, context, new MarkerManager(googleMap), new PolygonManager(googleMap), new PolylineManager(googleMap), new GroundOverlayManager(googleMap), (Renderer.ImagesCache) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[Catch: all -> 0x0261, TRY_ENTER, TryCatch #0 {all -> 0x0261, blocks: (B:5:0x002e, B:7:0x0034, B:11:0x004d, B:13:0x0065, B:14:0x006a, B:15:0x0071, B:44:0x01b1, B:46:0x01b7, B:47:0x01bb, B:49:0x01c2, B:50:0x01c6, B:17:0x0087, B:35:0x0150, B:41:0x019f, B:42:0x01a4, B:43:0x01ab, B:55:0x01ce, B:56:0x01d2, B:21:0x00a5, B:23:0x00c0, B:25:0x00d2, B:31:0x0122, B:32:0x0127, B:33:0x012e, B:52:0x01c8, B:53:0x01cc, B:58:0x01d5, B:59:0x01ef, B:65:0x022d, B:66:0x0230, B:67:0x0231), top: B:79:0x002e, inners: #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public KmlLayer(com.google.android.gms.maps.GoogleMap r21, java.io.InputStream r22, android.content.Context r23, com.google.maps.android.collections.MarkerManager r24, com.google.maps.android.collections.PolygonManager r25, com.google.maps.android.collections.PolylineManager r26, com.google.maps.android.collections.GroundOverlayManager r27, com.google.maps.android.data.Renderer.ImagesCache r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.data.kml.KmlLayer.<init>(com.google.android.gms.maps.GoogleMap, java.io.InputStream, android.content.Context, com.google.maps.android.collections.MarkerManager, com.google.maps.android.collections.PolygonManager, com.google.maps.android.collections.PolylineManager, com.google.maps.android.collections.GroundOverlayManager, com.google.maps.android.data.Renderer$ImagesCache):void");
    }

    private static XmlPullParser createXmlParser(InputStream inputStream) throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
        xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return xmlPullParserNewPullParser;
    }

    private static KmlParser parseKml(InputStream inputStream) throws XmlPullParserException, IOException {
        KmlParser kmlParser = new KmlParser(createXmlParser(inputStream));
        kmlParser.parseKml();
        return kmlParser;
    }

    @Override // com.google.maps.android.data.Layer
    public void addLayerToMap() {
        super.addKMLToMap();
    }

    @Override // com.google.maps.android.data.Layer
    public Iterable<KmlContainer> getContainers() {
        return super.getContainers();
    }

    @Override // com.google.maps.android.data.Layer
    public Iterable<KmlGroundOverlay> getGroundOverlays() {
        return super.getGroundOverlays();
    }

    public Iterable<KmlPlacemark> getPlacemarks() {
        return getFeatures();
    }

    @Override // com.google.maps.android.data.Layer
    public boolean hasContainers() {
        return super.hasContainers();
    }

    public boolean hasPlacemarks() {
        return hasFeatures();
    }
}
