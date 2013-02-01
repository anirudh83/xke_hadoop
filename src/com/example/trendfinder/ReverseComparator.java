package com.example.trendfinder;

/**
 * @author anirudh
 */
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class ReverseComparator extends WritableComparator{

	protected ReverseComparator() {
		super((Class<? extends WritableComparable>) ReverseComparator.class);
		// TODO Auto-generated constructor stub
	}

   
}
