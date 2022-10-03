package hacknelio;

public class Aluno {

	private String name;
	private String email;
	private Double firstGrade;
	private Double secondGrade;
	
	public Aluno() {
	}
	
	public Aluno(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Aluno(String name, Double firstGrade, Double secondGrade) {
		super();
		this.name = name;
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getFirstGrade() {
		return firstGrade;
	}

	public void setFirstGrade(Double firstGrade) {
		this.firstGrade = firstGrade;
	}

	public Double getSecondGrade() {
		return secondGrade;
	}

	public void setSecondGrade(Double secondGrade) {
		this.secondGrade = secondGrade;
	}

	@Override
	public String toString() {
		return ": " + name + ", " + email;
	}
	
	
}
