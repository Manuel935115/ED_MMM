package recuperacion_entornos;
// jhfhf
public class Persona_MMM {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getMasa() {
		return masa;
	}
	public void setMasa(double masa) {
		this.masa = masa;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	private int id;
	@Override
	public String toString() {
		return "Persona_MMM [id=" + id + ", nombre=" + nombre + ", masa=" + masa + ", altura=" + altura + ", edad="
				+ edad + ", getId()=" + getId() + ", getNombre()=" + getNombre() + ", getMasa()=" + getMasa()
				+ ", getAltura()=" + getAltura() + ", getEdad()=" + getEdad() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	private String nombre;
	private double masa;
	private double altura;
	private int edad;
	
	
}
