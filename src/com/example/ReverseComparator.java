package com.example;

import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.Text;

public class ReverseComparator implements RawComparator<Text>{

	public int compare(byte[] text1, int start1, int length1, byte[] text2, int start2, int length2) {
		// look at first character of each text byte array
		return new Character((char)text1[0]).compareTo((char)text2[0]);
	}

	public int compare(Text o1, Text o2) {
		return compare(o1.getBytes(), 0, o1.getLength(), o2.getBytes(), 0, o2.getLength());
	}

}
