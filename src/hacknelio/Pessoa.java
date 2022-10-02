package hacknelio;

public class Pessoa {

	private String name;
	private Integer idade;
	private Double altura;
	private String genero;
	
	public Pessoa() {
	}
	
	public Pessoa(String name, Integer idade) {
		super();
		this.name = name;
		this.idade = idade;
	}
	
	public Pessoa(Double altura, String genero) {
		this.altura = altura;
		this.setGenero(genero);
	}

	public Pessoa(String name, Integer idade, Double altura) {
		super();
		this.name = name;
		this.idade = idade;
		this.altura = altura;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero2) {
		this.genero = genero2;
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", idade=" + idade + ", altura=" + altura + "]";
	}
}
