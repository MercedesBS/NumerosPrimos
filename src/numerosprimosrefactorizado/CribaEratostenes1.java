/**
 * Clase para generar todos los números primos de 1 hasta
 * un número máximo especificado por el usuario. Como
 * algoritmo se utiliza la criba de Eratóstenes.
 *
 * Eratóstenes de Cirene (276 a.C., Cirene, Libia – 194
 * a.C., Alejandría, Egipto) fue el primer hombre que
 * calculó la circunferencia de la Tierra. También
 * se le conoce por su trabajo con calendarios que ya
 * incluían años bisiestos y por dirigir la mítica
 * biblioteca de Alejandría.
 *
 * El algoritmo es bastante simple: Dado un vector de
 * enteros empezando en 2, se tachan todos los múltiplos
 * de 2. A continuación, se encuentra el siguiente
 * entero no tachado y se tachan todos sus múltiplos. El
 * proceso se repite hasta que se pasa de la raíz cuadrada
 * del valor máximo. Todos los números que queden sin
 * tachar son números primos.
 */
package numerosprimosrefactorizado;

/**
 *
 * @author Mercedes María Beltrán Suárez
 */
public class CribaEratostenes1 {

    /**
     * Genera números primos del 1 al máximo especificado.
     *
     * @param max el valor máximo
     * @return un vector con los números primos
     */
    public static int[] generarPrimos(int max) {
        if (max < 2) {
            return new int[0]; // Vector vacío
        }

        boolean[] esPrimo = new boolean[max + 1];
        int cuenta = 0;

        // Inicializar el array de primos
        for (int i = 2; i <= max; i++) {
            esPrimo[i] = true;
        }

        // Criba de Eratostenes
        for (int i = 2; i * i <= max; i++) {
            if (esPrimo[i]) {
                for (int j = i * i; j <= max; j += i) {
                    esPrimo[j] = false;
                }
            }
        }

        // Contar los números primos
        for (int i = 2; i <= max; i++) {
            if (esPrimo[i]) {
                cuenta++;
            }
        }

        // Rellenar el vector de números primos
        int[] primos = new int[cuenta];
        int indice = 0;
        for (int i = 2; i <= max; i++) {
            if (esPrimo[i]) {
                primos[indice++] = i;
            }
        }

        return primos;
    }
}

/*
if (max < 2) return new int[0]; //Vector vacío.

        esPrimo = new boolean[max+1];
        boolean[] esPrimo = new boolean[max + 1];
        iniciarCriba();
        cribar();
        int[] primos = rellenarPrimos();
        return primos;
        }

        
    public static void iniciarCriba() {
    int i;    
    for (i=0; i<max; i++) {
    esPrimo[i] = true; 
    }
    }
*/