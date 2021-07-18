

class Series implements Film{
	private String name;
	private int seasons;
	private long durtation;
	Series(String name,long duration,int seasons){
		this.name = name;
		this.durtation=duration;
		this.seasons = seasons;
	}
	
	public void addNewSeason() {
		this.seasons++;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public long getDuration() {
		// TODO Auto-generated method stub
		return this.durtation;
	}
	@Override
	public String toString() {
		return "The Series name  is "+this.name+" and duration of Movie is "+this.durtation+" seconds and current seasonds are "+this.seasons;
		
	}
	
}
