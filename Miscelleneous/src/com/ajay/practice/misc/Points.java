package com.ajay.practice.misc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.ajay.practice.misc.util.MyComparator;
import com.ajay.practice.misc.util.PointsOnAPlane;

public class Points implements PointsOnAPlane{

	private static List<Point> storedPoints = new ArrayList<Point>();

	@Override
	public void addPoint(Point point){
		storedPoints.add(point);
	}



	@Override
	public Collection<Point> findNearest(Point center, int p){
		Collections.sort(storedPoints, new MyComparator(center));
		return storedPoints.subList(0, p);
	}
	
	public static void main(String[] args) {
		Points points = new Points();
		points.addPoint(new Point(1,1));
		points.addPoint(new Point(0,3));
		points.addPoint(new Point(0,4));
		Point center = new Point(0,0);
		for(Point pt: points.findNearest(center, 2)){
			System.out.println(pt.x + "," + pt.y);
		}
	}
}