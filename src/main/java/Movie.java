

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Movie implements Film{
	private final String name;
	private final long duration;

	Movie(String name,long length){
		this.name = name;
		this.duration = length;
	}
	public String getName() {
		return this.name;
	}
	public long getDuration() {
		return this.duration;
	}
	@Override
	public String toString() {
		return "The Movie is "+this.name+" and duration of Movie is "+this.duration+" seconds";
		
	}
}
