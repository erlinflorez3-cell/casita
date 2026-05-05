package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
class RNSVGMarkerPosition {
    private static boolean auto_start_reverse_ = false;
    private static int element_index_ = 0;
    private static Point in_slope_ = null;
    private static Point origin_ = null;
    private static Point out_slope_ = null;
    private static ArrayList<RNSVGMarkerPosition> positions_ = null;
    private static Point subpath_start_ = null;
    double angle;
    Point origin;
    RNSVGMarkerType type;

    /* JADX INFO: renamed from: com.horcrux.svg.RNSVGMarkerPosition$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$ElementType;
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$RNSVGMarkerType;

        static {
            int[] iArr = new int[ElementType.values().length];
            $SwitchMap$com$horcrux$svg$ElementType = iArr;
            try {
                iArr[ElementType.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$ElementType[ElementType.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$ElementType[ElementType.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$ElementType[ElementType.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$ElementType[ElementType.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[RNSVGMarkerType.values().length];
            $SwitchMap$com$horcrux$svg$RNSVGMarkerType = iArr2;
            try {
                iArr2[RNSVGMarkerType.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RNSVGMarkerType[RNSVGMarkerType.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RNSVGMarkerType[RNSVGMarkerType.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private RNSVGMarkerPosition(RNSVGMarkerType rNSVGMarkerType, Point point, double d2) {
        this.type = rNSVGMarkerType;
        this.origin = point;
        this.angle = d2;
    }

    private static double BisectingAngle(double d2, double d3) {
        if (Math.abs(d2 - d3) > 180.0d) {
            d2 += 360.0d;
        }
        return (d2 + d3) / 2.0d;
    }

    private static void ComputeQuadTangents(SegmentData segmentData, Point point, Point point2, Point point3) {
        segmentData.start_tangent = subtract(point2, point);
        segmentData.end_tangent = subtract(point3, point2);
        if (isZero(segmentData.start_tangent)) {
            segmentData.start_tangent = segmentData.end_tangent;
        } else if (isZero(segmentData.end_tangent)) {
            segmentData.end_tangent = segmentData.start_tangent;
        }
    }

    private static double CurrentAngle(RNSVGMarkerType rNSVGMarkerType) {
        double dRad2deg = rad2deg(SlopeAngleRadians(in_slope_));
        double dRad2deg2 = rad2deg(SlopeAngleRadians(out_slope_));
        int i2 = AnonymousClass1.$SwitchMap$com$horcrux$svg$RNSVGMarkerType[rNSVGMarkerType.ordinal()];
        if (i2 == 1) {
            return auto_start_reverse_ ? dRad2deg2 + 180.0d : dRad2deg2;
        }
        if (i2 == 2) {
            return BisectingAngle(dRad2deg, dRad2deg2);
        }
        if (i2 != 3) {
            return 0.0d;
        }
        return dRad2deg;
    }

    private static SegmentData ExtractPathElementFeatures(PathElement pathElement) {
        SegmentData segmentData = new SegmentData();
        Point[] pointArr = pathElement.points;
        int i2 = AnonymousClass1.$SwitchMap$com$horcrux$svg$ElementType[pathElement.type.ordinal()];
        if (i2 == 1) {
            segmentData.position = pointArr[2];
            segmentData.start_tangent = subtract(pointArr[0], origin_);
            segmentData.end_tangent = subtract(pointArr[2], pointArr[1]);
            if (isZero(segmentData.start_tangent)) {
                ComputeQuadTangents(segmentData, pointArr[0], pointArr[1], pointArr[2]);
            } else if (isZero(segmentData.end_tangent)) {
                ComputeQuadTangents(segmentData, origin_, pointArr[0], pointArr[1]);
            }
        } else if (i2 == 2) {
            segmentData.position = pointArr[1];
            ComputeQuadTangents(segmentData, origin_, pointArr[0], pointArr[1]);
        } else if (i2 == 3 || i2 == 4) {
            segmentData.position = pointArr[0];
            segmentData.start_tangent = subtract(segmentData.position, origin_);
            segmentData.end_tangent = subtract(segmentData.position, origin_);
        } else if (i2 == 5) {
            segmentData.position = subpath_start_;
            segmentData.start_tangent = subtract(segmentData.position, origin_);
            segmentData.end_tangent = subtract(segmentData.position, origin_);
        }
        return segmentData;
    }

    private static void PathIsDone() {
        positions_.add(new RNSVGMarkerPosition(RNSVGMarkerType.kEndMarker, origin_, CurrentAngle(RNSVGMarkerType.kEndMarker)));
    }

    private static double SlopeAngleRadians(Point point) {
        return Math.atan2(point.f3548y, point.f3547x);
    }

    private static void UpdateFromPathElement(PathElement pathElement) {
        SegmentData segmentDataExtractPathElementFeatures = ExtractPathElementFeatures(pathElement);
        out_slope_ = segmentDataExtractPathElementFeatures.start_tangent;
        int i2 = element_index_;
        if (i2 > 0) {
            RNSVGMarkerType rNSVGMarkerType = i2 == 1 ? RNSVGMarkerType.kStartMarker : RNSVGMarkerType.kMidMarker;
            positions_.add(new RNSVGMarkerPosition(rNSVGMarkerType, origin_, CurrentAngle(rNSVGMarkerType)));
        }
        in_slope_ = segmentDataExtractPathElementFeatures.end_tangent;
        origin_ = segmentDataExtractPathElementFeatures.position;
        if (pathElement.type == ElementType.kCGPathElementMoveToPoint) {
            subpath_start_ = pathElement.points[0];
        } else if (pathElement.type == ElementType.kCGPathElementCloseSubpath) {
            subpath_start_ = new Point(0.0d, 0.0d);
        }
        element_index_++;
    }

    static ArrayList<RNSVGMarkerPosition> fromPath(ArrayList<PathElement> arrayList) {
        positions_ = new ArrayList<>();
        element_index_ = 0;
        origin_ = new Point(0.0d, 0.0d);
        subpath_start_ = new Point(0.0d, 0.0d);
        Iterator<PathElement> it = arrayList.iterator();
        while (it.hasNext()) {
            UpdateFromPathElement(it.next());
        }
        PathIsDone();
        return positions_;
    }

    private static boolean isZero(Point point) {
        return point.f3547x == 0.0d && point.f3548y == 0.0d;
    }

    private static double rad2deg(double d2) {
        return d2 * 57.29577951308232d;
    }

    private static Point subtract(Point point, Point point2) {
        return new Point(point2.f3547x - point.f3547x, point2.f3548y - point.f3548y);
    }
}
