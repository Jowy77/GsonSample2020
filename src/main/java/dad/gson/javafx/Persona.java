package dad.gson.javafx;

public class Persona {

	private String nombre, apellidos;
	private Integer edad;

	public Persona() {

	}

	public Persona(String nombre, String apellidos, Integer edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

}
