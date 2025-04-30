package recuperacion_entornos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona_MMM nom1 = new Persona_MMM(1, "Papa", 42, 1.75, 22);
		Persona_MMM nom2 = new Persona_MMM(2, "Pepe", 42, 1.80, 25);
		
		MMM_GravedadPlaneta plan1 = new MMM_GravedadPlaneta(1, "Tierra", 9.81);
		MMM_GravedadPlaneta plan2 = new MMM_GravedadPlaneta(2, "Marte", 3.72);
		MMM_GravedadPlaneta plan3 = new MMM_GravedadPlaneta(3, "Jupiter", 24.79);
		
		double masaPersona = nom1.getMasa();
		double gravedadMarte = nom1.getGravedadPlaneta();
		double pesoTierra = masaPersona*gravedadMarte;
		
		
		double masaPersona2 =nom1.getMasa();
		double gravedadMarte1 = nom1.getGravedadPlaneta();
		double pesoMarte=masaPersona*gravedadMarte;
		
		double masapersona3 = nom1.getMasa();
		double gravedadJupiter = nom1.getGravedadPlaneta();
		double pesoJupiter = masaPersona*gravedadJupiter;
		
		extracted(nom1, nom2, plan1, plan3, pesoTierra, pesoMarte, pesoJupiter);
	}

	public static void extracted(Persona_MMM nom1, Persona_MMM nom2, MMM_GravedadPlaneta plan1,
			MMM_GravedadPlaneta plan3, double pesoTierra, double pesoMarte, double pesoJupiter) {
		System.out.println(nom1);
		System.out.println("El IMC de la persona"+nom1.getNombre()+"es...");
		System.out.println(nom2);
		System.out.println("El IMC de la persona"+nom2.getNombre()+"es...");
		System.out.println(plan1);
		System.out.println(plan3);
		System.out.println(plan3);
		System.out.println("Peso "+ nom1.getNombre()+"en Tierra"+pesoTierra);
		System.out.println("Peso "+ nom1.getNombre()+"en Marte"+pesoMarte);
		System.out.println("Peso "+ nom1.getNombre()+"en Jupiter"+pesoJupiter);
	}

}
