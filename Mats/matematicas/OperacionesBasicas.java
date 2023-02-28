package matematicas;

public class OperacionesBasicas{
   /** suma
   * Devuelve la suma de dos números.
   * <p>
   * @param a Sumando primero
   * @param b Sumando segundo
   * @return La suma de a y b
   */
   public static int suma(int a, int b){
      return (int)suma((long)a,(long)b);
   }
   public static long suma(long a, long b){
      return a+b;
   }
   /** inc
   * Incrementa en uno el valor recibido y lo devuelve
   * <p>
   * @param a Valor a incrementar
   * @return El valor recibido incrementado en uno
   */
   public static int inc(int a){
      return (int)inc((long)a);
   }
   public static long inc(long a){
      return suma(a,1);
   }
   /** resta
   * Devuelve la resta de dos números
   * <p>
   * @param a Minuendo
   * @param b Sustraendo
   * @return La resta de los dos números
   */
   public static int resta(int a,int b){
      return (int)resta((long)a,(long)b);
   }
   public static long resta(long a,long b){
      return suma(a,-b);
   }
   /** dec
   * Decrementa en uno el valor recibido y lo devuelve
   * <p>
   * @param a Valor a decrementar
   * @return El valor recibido decrementado en uno
   */
   public static int dec(int a){
      return (int)dec((long)a);
   }
   public static long dec(long a){
      return resta(a,1);
   }
   /** esMayor
   * Comprueba si un número es mayor que otro
   * <p>
   * @param a Valor a comparar si es mayor
   * @param b Valor a comparar si es menor
   * @return true si a es mayor que b y
   * false si es igual o menor
   */
   public static boolean esMayor(int a, int b){
      return esMayor((long)a,(long)b);
   }
   public static boolean esMayor(long a, long b){
      return a-b>0;
   }
   /** esMenor
   * Comprueba si un número es menor que otro
   * <p>
   * @param a Valor a comparar si es menor
   * @param b Valor a comparar si es mayor
   * @return true si a es menor que b y
   * false si es igual o mayor
   */
  public static boolean esMenor(int a, int b){
   return esMenor((long)a,(long)b);
  }
  public static boolean esMenor(long a, long b){
   return esMayor(b, a);
  }
   /** esIgual
   * Comprueba si un número es igual que otro
   * <p>
   * @param a Primer valor a comparar
   * @param b Segundo valor a comparar
   * @return true si son iguales y false si son distintos
   */
  public static boolean esIgual(int a, int b){
   return esIgual((long)a,(long)b);
  }
  public static boolean esIgual(long a, long b){
   return a==b;
  }
   /** multiplica
   * Devuelve la multiplicación de dos números usando sumas
   * <p>
   * @param a Multiplicando
   * @param b Multiplicador
   * @return El resultado de sumar b veces a
   */
  public static int multiplica(int a, int b){
      return (int)multiplica((long)a, (long)b);
  }
  public static long multiplica(long a, long b){
      return a*b;
  }
   /** divide
   * Devuelve el cociente de la división entera de dos números usando restas
   * <p>
   * @param a Dividendo
   * @param b Divisor
   * @return Devuelve el cociente de la división entera de a entre b
   * realizando restas
   */
  public static int divide(int a, int b){
   return (int)divide((long)a,(long)b);
  }
  public static long divide(long a, long b){
   return a/b;
  }
   /** resto
   * Devuelve el resto de la división entera
   * <p>
   * @param a Dividendo
   * @param b Divisor
   * @return Devuelve el resto de la división entera de a entre b
   */
  public static int resto(int a, int b){
      return (int)resto((long)a,(long)b);
  }
  public static long resto(long a, long b){
      return a%b;
  }
   /** potencia
   * Devuelve la potencia de un número elevado a otro
   * <p>
   * @param base base
   * @param exponente exponente
   * @return Devuelve la potencia de un número elevado a otro usando
   multiplicaciones
   */
  public static int potencia(int base, int exponente){
   return (int)potencia((long)base,(long)exponente);
  }
  public static long potencia(long base, long exponente){
      return (long)Math.pow(base,exponente);
  }
   /** cuadrado
   * Devuelve la potencia de un número elevado a 2
   * <p>
   * @param a número a calcular su cuadrado
   * @return Devuelve la potencia de un número elevado a 2
   */
  public static int cuadrado(int a){
      return (int)cuadrado((long)a);
  }
  public static long cuadrado(long a){
      return potencia(a,2);
  }

   /** cubo
   * Devuelve la potencia de un número elevado a 3
   * <p>
   * @param a número a calcular su cubo
   * @return Devuelve la potencia de un número elevado a 3
   */
  public static int cubo(int a){
      return (int)cubo((long)a);
  }
  public static long cubo(long a){
      return potencia(a,3);
  }
   /** esMultiplo
   * Indica si un número es múltiplo de otro dado
   * <p>
   * @param a valor a comprobar si es múltiplo
   * @param b valor con el que comprobar si a es múltiplo de él
   * @return true si a es múltiplo y false en caso contrario
   */
  public static boolean esMultiplo(int a, int b){
      return esMultiplo((long)a,(long)b);
  }
  public static boolean esMultiplo(long a, long b){
      return a%b==0;
  }
   /** esDivisor
   * Indica si un número es divisor de otro dado
   * <p>
   * @param a valor a comprobar si es divisor
   * @param b valor con el que comprobar si a es divisor de él
   * @return true si a es divisor y false en caso contrario
   */
  public static boolean esDivisor(int a, int b){
      return esDivisor((long)a, (long)b);
  }
  public static boolean esDivisor(long a, long b){
      return b%a==0;
  }

}
