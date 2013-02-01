package com.example;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper2 extends Mapper<LongWritable, Text, Text, Text>{
	

    @Override
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
    	
        String line = value.toString(); // agilencr 4
        StringTokenizer tokenizer = new StringTokenizer(line);
        while (tokenizer.hasMoreTokens()) {
        	
        	String token = tokenizer.nextToken();	
        
        // Context here is like a multi set which allocates value "one" for key "word".
        	
        	context.write(new Text(tokenizer.nextToken()), new Text(token));      	
        	
        }
    }

}
