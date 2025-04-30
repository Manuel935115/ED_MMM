package recuperacion_entornos;

public class MMM_GravedadPlaneta {
	private String nombre;
	@Override
	public String toString() {
		return "MMM_GravedadPlaneta [nombre=" + nombre + ", GravedadPlaneta=" + GravedadPlaneta + ", tipo=" + tipo
				+ ", getTipo()=" + getTipo() + ", getNombre()=" + getNombre() + ", getGravedadPlaneta()="
				+ getGravedadPlaneta() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	private double GravedadPlaneta;
	private int tipo;

	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getGravedadPlaneta() {
		return GravedadPlaneta;
	}
	public void setGravedadPlaneta(double gravedadPlaneta) {
		GravedadPlaneta = gravedadPlaneta;
	}
	
	
}
