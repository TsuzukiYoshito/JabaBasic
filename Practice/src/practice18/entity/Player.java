package practice18.entity;

public class Player {

	private String position;
	private String name;
	private String country;
	private String team;

	public String getposition() {
		return position;
	}

	public String getname() {
		return name;
	}

	public String getcountry() {
		return country;
	}

	public String getteam() {
		return team;
	}

	public void setposition(String position) {
		this.position = position;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setcountry(String country) {
		this.country = country;

	}

	public void setteam(String team) {
		this.team = team;

	}


	 public String toString() {


		 String Getposition=getposition();
		 String Getname=getname();
		 String Getcountry=getcountry();
		 String Getteam=getteam();


		 String[] GEtposition=Getposition.split(",", 0);
		 String[] GEtname=Getname.split(",", 0);
		 String[] GEcountry=Getcountry.split(",", 0);
		 String[] GEtteam=Getteam.split(",", 0);

		 return position + "," + name + ","+country +","+ team;


	}
}