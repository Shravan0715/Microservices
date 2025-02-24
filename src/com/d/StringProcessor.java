package com.d;

import java.io.StringReader;
import java.io.StringWriter;

public class StringProcessor {
	private final StringReader stringreader;
	private final StringWriter stringwriter;
	
	public StringProcessor(StringReader stringreader, StringWriter stringwriter) {
		super();
		this.stringreader = stringreader;
		this.stringwriter = stringwriter;
	}
	
	public void printString() {
		stringwriter.write(stringreader.toString());
	}	
}
