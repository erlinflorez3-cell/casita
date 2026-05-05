package com.drew.tools;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ProcessUrlUtility {
    public static void main(String[] strArr) throws IOException, JpegProcessingException {
        if (strArr.length == 0) {
            System.err.println("Expects one or more URLs as arguments.");
            System.exit(1);
        }
        for (String str : strArr) {
            processUrl(new URL(str));
        }
        System.out.println("Completed.");
    }

    private static void processUrl(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        try {
            Metadata metadata = ImageMetadataReader.readMetadata(Callback.getInputStream(uRLConnectionOpenConnection));
            if (metadata.hasErrors()) {
                System.err.println(url);
                for (Directory directory : metadata.getDirectories()) {
                    if (directory.hasErrors()) {
                        Iterator<String> it = directory.getErrors().iterator();
                        while (it.hasNext()) {
                            System.err.printf("\t[%s] %s%n", directory.getName(), it.next());
                        }
                    }
                }
            }
            for (Directory directory2 : metadata.getDirectories()) {
                for (Tag tag : directory2.getTags()) {
                    String tagName = tag.getTagName();
                    String name = directory2.getName();
                    String description = tag.getDescription();
                    if (description != null && description.length() > 1024) {
                        description = description.substring(0, 1024) + "...";
                    }
                    System.out.printf("[%s] %s = %s%n", name, tagName, description);
                }
            }
        } catch (ImageProcessingException e2) {
            System.err.printf("%s: %s [Error Extracting Metadata]%n\t%s%n", e2.getClass().getName(), url, e2.getMessage());
        } catch (Throwable th) {
            System.err.printf("%s: %s [Error Extracting Metadata]%n", th.getClass().getName(), url);
            th.printStackTrace(System.err);
        }
    }
}
