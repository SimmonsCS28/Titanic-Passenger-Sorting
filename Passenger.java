package Project1;

public class Passenger {

	private String index, shipClass, age, sex, survived;

	public Passenger(String index, String shipClass, String age, String sex,
			String survived) {
		super();
		this.index = index;
		this.shipClass = shipClass;
		this.age = age;
		this.sex = sex;
		this.survived = survived;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getShipClass() {
		return shipClass;
	}

	public void setShipClass(String shipClass) {
		this.shipClass = shipClass;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSurvived() {
		return survived;
	}

	public void setSurvived(String survived) {
		this.survived = survived;
	}

	public boolean getSex(boolean equals) {
		// TODO Auto-generated method stub
		return false;
	}


	

}
