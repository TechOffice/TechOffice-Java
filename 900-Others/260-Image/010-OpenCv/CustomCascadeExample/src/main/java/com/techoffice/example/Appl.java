package com.techoffice.example;

import java.io.File;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.objdetect.Objdetect;

public class Appl {
	
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}
	
	public static Mat getGrayMat(File imageFile){
	    Mat mat = Imgcodecs.imread(imageFile.getAbsolutePath(), Imgcodecs.IMREAD_COLOR);
	    if (mat.empty()){
	    	throw new RuntimeException("Cannot read image file: " + imageFile.getAbsolutePath());
	    }
		Mat grayMat = new Mat();
	    Imgproc.cvtColor(mat, grayMat, Imgproc.COLOR_BGR2GRAY);
	    return grayMat;
	}
	
	public static void main(String[] args){
		// Image 1
		Mat mat = getGrayMat(new File("sunglasses_0.png"));
		File cascadeXml = new File("cascade.xml");
		
		CascadeClassifier faceCascade = new CascadeClassifier(cascadeXml.getAbsolutePath());
		
		// Detect face
		MatOfRect detector = new MatOfRect();
		faceCascade.detectMultiScale(mat, detector);	
		
		Objdetect.groupRectangles(detector, new MatOfInt(), 1, 0.8);

		for (Rect rect : detector.toArray()) {
			Imgproc.rectangle(mat, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
					new Scalar(0, 255, 0), 3);
		}

		// Write Image with detected face and eye
		Imgcodecs.imwrite("face.png", mat);

	}
}
