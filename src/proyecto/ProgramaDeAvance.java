
package proyecto;
import java.util.Scanner;
public class ProgramaDeAvance {
    public static void main(String[] args) 
    {
        Scanner date=new Scanner (System.in);
        int diaA,mesA,añoA,diaN,mesN,añoN,mesesV,diasV,horasV;
        double semanasV;
        System.out.println("Ingrese su fecha de nacimiento: ");
        System.out.println("Dia: ");
        diaN=date.nextInt();
        System.out.print ("Mes: "); 
        mesN=date.nextInt();
        System.out.print ("Año: "); 
        añoN=date.nextInt();
        System.out.println("Ingrese fecha actual:");
        System.out.print ("Día: ");
        diaA=date.nextInt();
        System.out.print ("Mes: ");
        mesA=date.nextInt();
        System.out.print ("Año: ");
        añoA=date.nextInt();
        
        mesesV=(añoA-añoN)*12+(mesA-mesN);
        diasV=(añoA-añoN)*365+(mesA-mesN)*30+(diaA-diaN);
        semanasV=(int)diasV/7;
        horasV=diasV*24;
        
        System.out.println ("Usted ha vivido aprox. "+mesesV+" meses, "+semanasV+" semanas, "+diasV+" dias y "+horasV+" horas.");
            int numeroDeLaSuerte = (int) (Math.random() * 30) + 1;
       System.out.println("Su número de la suerte es: " + numeroDeLaSuerte);

    }
    
}
