package com.example;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WordCountReducer2 extends Reducer<Text, Text, Text, Text> {

	@Override
	protected void reduce(Text key, Iterable<Text> trends, Context context)
			throws IOException, InterruptedException {

		/*Iterator<Text> iterator = trends.iterator();
		while(iterator.hasNext()){
			Text next = iterator.next();
			if(!iterator. hasNext()){
				context.write(next, key);
			}
		}*/
		
		 for (Text val : trends) {
			 context.write(new Text(val.toString()),new Text(key));
	        }
	       
		
	}
}