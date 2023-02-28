import  matematicas.*;

public class Pruebas {
    public static void main(String[] args) {
        System.out.println("  Pruebas unitarias");
        System.out.println("**********************");
        System.out.printf("Función suma: %s\n", OperacionesBasicas.suma(5,3)==8 && OperacionesBasicas.suma(-5,-3)==-8?"correcto":"fallo");
        System.out.printf("Función inc: %s\n", OperacionesBasicas.inc(5)==6 && OperacionesBasicas.inc(-5)==-4?"correcto":"fallo");
        System.out.printf("Función resta: %s\n", OperacionesBasicas.resta(5,3)==2 && OperacionesBasicas.resta(-5, -3)==-2?"correcto":"fallo");
        System.out.printf("Función dec: %s\n", OperacionesBasicas.dec(5)==4 && OperacionesBasicas.dec(-5)==-6?"correcto":"fallo");
        System.out.printf("Función esMayor: %s\n", OperacionesBasicas.esMayor(5,4) && !OperacionesBasicas.esMayor(4, 5) && !OperacionesBasicas.esMayor(5,5)?"correcto":"falso");
        System.out.printf("Función esMenor: %s\n", OperacionesBasicas.esMenor(4,5) && !OperacionesBasicas.esMenor(5, 4) && !OperacionesBasicas.esMenor(5,5)?"correcto":"falso");
        System.out.printf("Función esIgual: %s\n", OperacionesBasicas.esIgual(5,5)?"correcto":"falso");
        System.out.printf("Función multiplica: %s\n", OperacionesBasicas.multiplica(5,2)==10?"correcto":"falso");
        System.out.printf("Función divide: %s\n", OperacionesBasicas.divide(10,2)==5?"correcto":"falso");
        System.out.printf("Función resto: %s\n", OperacionesBasicas.resto(10,3)==1 && OperacionesBasicas.resto(10, 2)==0?"correcto":"falso");
        System.out.printf("Función potencia: %s\n", OperacionesBasicas.potencia(2,3)==8?"correcto":"falso");
        System.out.printf("Función cuadrado: %s\n", OperacionesBasicas.cuadrado(3)==9?"correcto":"falso");
        System.out.printf("Función cubo: %s\n", OperacionesBasicas.cubo(3)==27?"correcto":"falso");
        System.out.printf("Función esMultiplo: %s\n", OperacionesBasicas.esMultiplo(25, 5) && !OperacionesBasicas.esMultiplo(25, 3)?"correcto":"falso");
        System.out.printf("Función esDivisor: %s\n", OperacionesBasicas.esDivisor(5, 25) && !OperacionesBasicas.esDivisor(3, 25)?"correcto":"falso");
    }
}