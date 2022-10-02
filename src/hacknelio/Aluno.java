package hacknelio;

public class Aluno {

	private String name;
	private Double firstGrade;
	private Double secondGrade;
	
	public Aluno() {
		
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
	
}
