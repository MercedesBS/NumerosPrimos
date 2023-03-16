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
/**
 *
 * Clase que genera los números primos de 1 hasta un
 *
 * número máximo especificado por  el usuario usando  *
 * el algoritmo de la criba de Eratóstenes.
 *
 *
 *
 * @author arkano
 *
 * @verion 2.0
 *
 * @param max es el valor máximo
 *
 * @return Vector de números primos
 *
 */
package numerosprimosrefactorizado;

public class GeneraPrimos {

    private static boolean esPrimo[];

    public static int[] generarPrimos(int max) {

        if (max < 2) {
            return new int[0]; // Vector vacío
        } else {

            esPrimo = new boolean[max + 1];

            inicializarCriba();

            cribar();

            int[] primos = rellenarPrimos();

            return primos;

        }

    }

    private static void inicializarCriba() {

        for (int i = 0; i < esPrimo.length; i++) {
            esPrimo[i] = true;
        }

        esPrimo[0] = esPrimo[1] = false;

    }

    private static void eliminaMultiplos(int i) {

        for (int j = 2 * i; j < esPrimo.length; j += i) {
            esPrimo[j] = false;
        }

    }

    private static void cribar() {

        for (int i = 2; i < Math.sqrt(esPrimo.length) + 1; i++) {

            if (esPrimo[i]) {

                eliminaMultiplos(i);

            }

        }

    }

    private static int cuentaPrimos() {

        int cuenta = 0;

        for (int i = 0; i < esPrimo.length; i++) {

            if (esPrimo[i]) {
                cuenta++;
            }

        }

        return cuenta;

    }

    private static int[] rellenarPrimos() {

        int[] primos = new int[cuentaPrimos()];

        for (int i = 0, j = 0; i < esPrimo.length; i++) {

            if (esPrimo[i]) {
                primos[j++] = i;
            }

        }

        return primos;

    }

}
