package com.sebasmoure.moureLogic;

public class StrStrings {
/* Muestra ejemplos de todas las operaciones que puedes realizar con cadenas de caracteres
 * en tu lenguaje. Algunas de esas operaciones podrían ser (busca todas las que puedas):
 * - Acceso a caracteres específicos, subcadenas, longitud, concatenación, repetición,
 *   recorrido, conversión a mayúsculas y minúsculas, reemplazo, división, unión,
 *   interpolación, verificación...
 */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "Hola, mi nombre es brais. Mi nombre completo es Brais Moure (MoureDev).";
        sb.append(str.indexOf("Hola")).append("   ");
        sb.append(str.substring(1, 3)).append("   ");
        sb.append(str.codePointAt(0)).append("   ");
        sb.append(str.compareTo("Hola")).append("   ");
        sb.append(str.indent(5)).append("   ");
        sb.append(str.strip()).append("   ");
        sb.append(str.replace('a', 'c')).append("   ");
        
        System.out.println(sb);
    }

}
