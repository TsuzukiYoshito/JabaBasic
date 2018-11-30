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


		 String position=getposition();
		 String name=getname();
		 String country=getcountry();
		 String team=getteam();

		 return position + "," + name + ","+country +","+ team;


	}
}