package com.ajay.practice.misc.util;

import java.util.Comparator;

import com.ajay.practice.misc.util.PointsOnAPlane.Point;

public class MyComparator implements Comparator<Point>{
	Point center;

	public MyComparator(Point center){
		this.center = center;
	}

	public double findEuclidianDistance(Point p1, Point p2){
		double x1 = p1.x;
		double y1 = p1.y;
		double x2 = p2.x;
		double y2 = p2.y;

		double  xDiff = x1-x2;
		double  xSqr  = Math.pow(xDiff, 2);

		double yDiff = y1-y2;
		double ySqr = Math.pow(yDiff, 2);

		double output   = Math.sqrt(xSqr + ySqr);
		return output;
	}

	@Override
	public int compare(Point o1, Point o2){
		if(findEuclidianDistance(center, o1)==findEuclidianDistance(center, o2))
			return 0;
		else
			return findEuclidianDistance(center, o1) > findEuclidianDistance(center, o2)?1:-1;

	}



}
