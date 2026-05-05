package com.lewin.qrcode;

import android.net.Uri;
import com.dynatrace.android.agent.Global;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class QRScanReader extends ReactContextBaseJavaModule {
    public QRScanReader(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "QRScanReader";
    }

    @ReactMethod
    public void readerQR(String str, final Promise promise) throws Throwable {
        try {
            InputImage inputImageFromFilePath = InputImage.fromFilePath(getReactApplicationContext(), Uri.parse(str));
            final BarcodeScanner client = BarcodeScanning.getClient(new BarcodeScannerOptions.Builder().setBarcodeFormats(4096, 256).build());
            client.process(inputImageFromFilePath).addOnSuccessListener(new OnSuccessListener<List<Barcode>>() { // from class: com.lewin.qrcode.QRScanReader.2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(List<Barcode> list) {
                    String str2 = Global.BLANK + list.toString();
                    LinkedList linkedList = new LinkedList();
                    Iterator<Barcode> it = list.iterator();
                    while (it.hasNext()) {
                        linkedList.add(it.next().getRawValue());
                    }
                    client.close();
                    if (linkedList.isEmpty()) {
                        promise.reject("NOT_OK", "Invalid or No related QR code");
                    } else {
                        promise.resolve(linkedList.get(0));
                    }
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.lewin.qrcode.QRScanReader.1
                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    String str2 = "" + exc.getMessage();
                    client.close();
                    promise.reject("NOT_OK", exc.getMessage());
                }
            });
        } catch (IOException e2) {
            String str2 = "" + e2.getMessage();
            e2.printStackTrace();
        }
    }
}
