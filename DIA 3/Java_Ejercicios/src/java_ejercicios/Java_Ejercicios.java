package java_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Java_Ejercicios {
    public static double calcular(double base, double exponente){
        return Math.pow(base, exponente);
    }
    public static int calcular (int a, int b){
        while (b != 0){
            int rem = b;
            b = a % b;
            a = rem;
        }
        return a;
    }
    public static int facto(int N4){
        int resul = 1;
        for (int i = 1; i <= N4; i ++){
            resul *= i;
        }
        return resul;
    }
    public static boolean perfecto(int N6){
        int sd = 0;
        for (int i = 1; i < N6 / 2; i ++){
            if (N6 % i == 0){
                sd += i;
            }
        }
        return sd == N6;
    }
    public static void imprimir(int N9){
        while (N9 % 2 == 0){
            System.out.println(2 + " ");
            N9 /= 2;
        }
        for (int i = 3; i * i <= N9; i += 2){
            while (N9 % i == 0){
                System.out.println(i + " ");
                N9 /= i;
            }
        }
        if (N9 > 2){
            System.out.println(N9);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        while (salir == false){
            System.out.println("-- Menú --");
            System.out.println("1: Ejercicio 1.");
            System.out.println("2: Ejercicio 2.");
            System.out.println("3: Ejercicio 3.");
            System.out.println("4: Ejercicio 4.");
            System.out.println("5: Ejercicio 5.");
            System.out.println("6: Ejercicio 6.");
            System.out.println("7: Ejercicio 7.");
            System.out.println("8: Ejercicio 8.");
            System.out.println("9: Ejercicio 9.");
            System.out.println("10: Ejercicio 10.");
            System.out.println("11: Ejercicio 11.");
            System.out.println("12: Ejercicio 12.");
            System.out.println("13: Ejercicio 13.");
            System.out.println("14: Ejercicio 14.");
            System.out.println("15: Ejercicio 15.");
            System.out.println("16: Ejercicio 16.");
            System.out.println("17: Ejercicio 17.");
            System.out.println("18: Ejercicio 18.");
            System.out.println("19: Ejercicio 19.");
            System.out.println("20: Ejercicio 20.");
            System.out.println("21: Ejercicio 21.");
            System.out.println("22: Ejercicio 22.");
            System.out.println("23: Ejercicio 23.");
            System.out.println("24: Ejercicio 24.");
            System.out.println("25: Ejercicio 25.");
            System.out.println("26: Ejercicio 26.");
            System.out.println("27: Ejercicio 27.");
            System.out.println("28: Ejercicio 28.");
            System.out.println("29: Ejercicio 29.");
            System.out.println("30: Ejercicio 30.");
            System.out.println("31: Ejercicio 31.");
            System.out.println("32: Ejercicio 32.");
            System.out.println("33: Ejercicio 33.");
            System.out.println("34: Ejercicio 34.");
            System.out.println("35: Ejercicio 35.");
            System.out.println("36: Ejercicio 36.");
            System.out.println("37: Ejercicio 37.");
            System.out.println("38: Ejercicio 38.");
            System.out.println("39: Ejercicio 39.");
            System.out.println("40: Ejercicio 40.");
            System.out.println("41: Ejercicio 41.");
            System.out.println("42: Ejercicio 42.");
            System.out.println("43: Ejercicio 43.");
            System.out.println("44: Ejercicio 44.");
            
            int opcion = scan.nextInt();
            scan.nextLine();
            
            switch (opcion){
                case 1:
                    System.out.println("Por favor ingrese el valor de n: ");
                    int n = scan.nextInt();
                    for (int x = 1; x <= n; x ++)
                        System.out.println(x + "\t");
                    break;
                case 2:
                    System.out.println("Por favor ingrese el valor de n: ");
                    int N = scan.nextInt();
                    for (int i = N; i >= 1; i --)
                        System.out.println(i);
                    break;
                case 3:
                    for (int i = 1; i <= 10; i ++){
                        System.out.println("Tabla de multiplicar del: " + i);
                        for (int j = 1; j <= 10; j ++){
                            System.out.println(i + " X " + j + " = " + (i * j));
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Por favor ingresa el número hasta donde deseas que lleguen las tablas: ");
                    int nu = scan.nextInt();
                    System.out.println("Estas son las tablas en orden inverso.");
                    for (int i = nu; i >= 1; i --){
                        System.out.println("Tablas de multipicar del: " + i);
                        for (int j = 1; j <= 10; j ++){
                            System.out.println(i + " X " + j + " = " + (i * j));
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (char letras = 'a'; letras <= 'z'; letras ++){
                        System.out.println(letras + " ");
                    }
                    break;
                case 6:
                    for (char letra = 'Z'; letra >= 'A'; letra --){
                        System.out.println(letra + " ");
                    }
                    break;
                case 7:
                    for (int i = 2; i <= 100; i += 2){
                        System.out.println(i + " ");
                    }
                    break;
                case 8:
                    for (int i = 1; i <= 100; i+= 2){
                        System.out.println(i + " ");
                    }
                    break;
                case 9:
                    System.out.println("Por favor ingresa el valor de n: ");
                    int n1 = scan.nextInt();
                    int suma = 0;
                    for (int i = 1; i <= n1; i ++){
                        suma += i;
                    }
                    System.out.println("La suma de los números entre 1 y " + n1 + " es de: " + suma);
                    break;
                case 10:
                    System.out.println("Por favor ingresa el valor de n: ");
                    int n2 = scan.nextInt();
                    int suma1 = 0;
                    for (int i = 1; i <= n2; i ++){
                        if (i % 2 == 0){
                            suma1 += i;
                        }
                    }
                    System.out.println("La suma de los pares entre 1 y " + n2 + " es: " + suma1);
                    break;
                case 11:
                    System.out.println("Por favor ingresa el valor de n: ");
                    int n3 = scan.nextInt();
                    int suma2 = 0;
                    for (int i = 1; i <= n3; i += 2){
                        suma2 += i;
                    }
                    System.out.println("La suma de los impares entre 1 y " + n3 + " es de: " + suma2);
                    break;
                case 12:
                    char l = 'A';
                    int valor = (int) l;
                    System.out.println("El valor de " + l + " es: " + valor);
                    break;
                case 13:
                    System.out.println("Por favor ingrese un número: ");
                    int n4 = scan.nextInt();
                    long fac = 1;
                    for (int i = 1; i <= n4; i ++){
                        fac *= i;
                    }
                    System.out.println("El factorial de: " + n4 + " es: " + fac);
                    break;
                case 14:
                    System.out.println("Por favor ingrese el número base: ");
                    double base = scan.nextDouble();
                    System.out.println("Por favor introduce el exponente: ");
                    double exponente = scan.nextInt();
                    double res = calcular(base, exponente);
                    System.out.println(base + " elevado a la potencia de " + exponente + " es: " + res);
                    break;
                case 15: 
                    System.out.println("Por favor ingrese un número de dos cifras: ");
                    int n5 = scan.nextInt();
                    int n6 = 0;
                    while(n5 != 0){
                        n6 = n6 * 10 + n5 % 10;
                        n5 /= 10;
                    }
                    System.out.println(n6);
                    break;
                case 16:
                    System.out.println("Por favor ingresa un número de dos cifras: ");
                    int n7 = scan.nextInt();
                    int suma3 =0;
                    while (n7 != 0){
                        int digito = n7 % 10;
                        suma3 += digito;
                        n7 /= 10;
                    }
                    System.out.println("La suma de los digitos es de: " + suma3);
                    break;
                case 17:
                    System.out.println("Por favor ingresa un número: ");
                    int primo = scan.nextInt();
                    boolean pri = true;
                    for (int i = 2; i < primo; i ++){
                        if (primo % i == 0){
                            pri = false;
                            break;
                        }
                        else{
                            pri = false;
                        }
                    }
                    // return pri;
                    break;
                case 18:
                    System.out.println("Por favor ingresa el primer número: ");
                    int num1 = scan.nextInt();
                    System.out.println("Por favor ingresa el segundo número: ");
                    int num2 = scan.nextInt();
                    int mcd = calcular(num1, num2);
                    System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es de: " + mcd);
                    break;
                case 19:
                    int positivos = 0;
                    int negativos = 0;
                    int ceros = 0;
                    int con = 1;
                    while (con == 1){
                        System.out.println("Por favor ingresa los número separado por espacios: ");
                        String input = scan.nextLine();
                        String[] numeros = input.split(" ");
                        for (String nume : numeros){
                            int num3 = Integer.parseInt(nume);
                            if(num3 > 0){
                            positivos ++;
                            }
                            else if(num3 < 0){
                                negativos ++;
                            }
                            else {
                                ceros ++;
                            }
                        }
                        
                        System.out.println("Números positivos: " + positivos);
                        System.out.println("Números negativos: " + negativos);
                        System.out.println("Ceros: " + ceros);
                    }
                    break;
                case 20: 
                    int menor = Integer.MAX_VALUE;
                    int mayor = Integer.MIN_VALUE;                   
                    System.out.println("Introduce los números, ingresa '0' para finalizar. ");
                    while (true){
                        System.out.println("Introduce un número: ");
                        int n8 = scan.nextInt();
                        if (n8 == 0){
                            break;
                        }
                        if (n8 > mayor){
                            mayor = n8;
                        }
                        if (n8 < menor){
                            menor = n8;
                        }
                    }
                    System.out.println("El número mayor es: " + mayor);
                    System.out.println("El número menor es: " + menor);
                    break;
                case 21:
                    int sum = 0;
                    System.out.println("Números divisibles por 9 entre 100 y 200: ");
                    for (int i = 100; i <= 200; i ++){
                        if (i % 9 == 0){
                            System.out.println(i);
                            sum += i;
                        }
                    }
                    System.out.println("La suma de los núemros es de: " + sum);
                    break;
                case 22:
                    System.out.println("Por introduce un número binario: ");
                    String binario = scan.nextLine();
                    int decimal1 = 0;
                    int potencial = 1;
                    for (int i = binario.length() -1; i >= 0; i --){
                        char b = binario.charAt(i);
                        if (b == '1'){
                            decimal1 += potencial;
                        }
                        potencial *= 2;
                    }
                    System.out.println("El número decimal es: " + decimal1);
                    break;
                case 23:
                    System.out.println("Por favor ingresa un número: ");
                    int n9 = scan.nextInt();
                    int sf = 0, original = n9;
                    while (n9 > 0){
                        int di = n9 % 10;
                        int fact = 1;
                        for (int i = 1; i < di; i ++){
                            fact *= i;
                        }
                        sf += fact;
                        n9 /= 10;
                    }
                    System.out.println(sf == original ? original + " es un número fuerte": original + " no es un número fuerte.");
                    break;
                case 24:
                    System.out.println("Por favor ingresa un número hexadecimal: ");
                    String hex1 = scan.nextLine();
                    int decimal3 = Integer.parseInt(hex1, 16);
                    System.out.println("El número decimal es: " + decimal3);
                    break;
                case 25:
                    System.out.println("Por favor ingresa un número hexadecimal: ");
                    String hex = scan.nextLine();
                    int decimal2 = Integer.parseInt(hex, 16);
                    String octal = Integer.toOctalString(decimal2);
                    System.out.println("El número octal es: " + octal);
                    break;
                case 26:
                    System.out.println("Por favor ingresa un número hexadecimal: ");
                    String hex2 = scan.nextLine();
                    int decimal4 = Integer.parseInt(hex2, 16);
                    String binario4 = Integer.toBinaryString((decimal4));
                    System.out.println("El número binario es: " + binario4);
                    break;
                case 27:
                    System.out.println("Por favor ingresa un número decimal: ");
                    int decimal5 = scan.nextInt();
                    String hexa = Integer.toHexString(decimal5).toUpperCase();
                    System.out.println("El número es: " + hexa);
                    break;
                case 28:
                    System.out.println("Por favor ingresa un número decimal: ");
                    int decimal6 =scan.nextInt();
                    String octal1 = Integer.toOctalString(decimal6);
                    System.out.println("El número octal es: " + octal1);
                    break;
                case 29:
                    System.out.println("Por favor introduce un número decimal: ");
                    int decimal7 = scan.nextInt();
                    StringBuilder bina = new StringBuilder();
                    if (decimal7 == 0){
                        bina.append("0");
                    }
                    else{
                        while (decimal7 > 0){
                            bina.insert(0, decimal7 % 2);
                            decimal7 = decimal7 / 2;
                        }
                    }
                    System.out.println("El número binario es: " + bina.toString());
                    break;
                case 30:
                    System.out.println("Por favor ingresa un número binario: ");
                    String binar = scan.nextLine();
                    int decimal8 = Integer.parseInt(binar, 2);
                    String octal2 = Integer.toOctalString(decimal8);
                    System.out.println("El número octal es: " + octal2);
                    break;
                case 31: 
                    System.out.println("Por favor ingresa un número binario: ");
                    String bina1 = scan.nextLine();
                    int decimal9 = 0;
                    int base1 = 1;
                    for (int i = bina1.length() - 1; i >= 0; i --){
                        if (bina1.charAt(i) == '1'){
                            decimal9 += base1;
                        }
                        base1 *= 2;
                    }
                    System.out.println("El número decimal es: " + decimal9);
                    break;
                case 32:
                    System.out.println("Por favor ingresa un número binario: ");
                    String bin1 = scan.nextLine();
                    int decimal10 = Integer.parseInt(bin1, 2);
                    String hexas = Integer.toHexString(decimal10).toUpperCase();
                    System.out.println("El número hexadecimal es: " + hexas);
                    break;
                case 33: 
                    System.out.println("Por favor ingresa un número octal: ");
                    String oc = scan.nextLine();
                    StringBuilder bin2 = new StringBuilder();
                    for (int i = 0; i < oc.length(); i ++){
                        char c = oc.charAt(i);
                        switch (c){
                            case '0': bin2.append("000");break;
                            case '1': bin2.append("001"); break;
                            case '2': bin2.append("010"); break;
                            case '3': bin2.append("011"); break;
                            case '4': bin2.append("100"); break;
                            case '5': bin2.append("101"); break;
                            case '6': bin2.append("110"); break;
                            case '7': bin2.append("111"); break;
                        }
                    }
                    System.out.println("El numero binario es: " + bin2.toString());
                    break;
                case 34:
                    System.out.println("Por favor ingresa un número octal: ");
                    String oc1 = scan.nextLine();
                    int decimal11 = 0;
                    int longitud = oc1.length();
                    for (int i = 0; i < longitud; i ++){
                        char digi = oc1.charAt(i);
                        int v = Character.getNumericValue(digi);
                        decimal11 += v * Math.pow(8, longitud - 1 - i);
                    }
                    System.out.println("El número decimal es: " + decimal11);
                    break;
                case 35:
                    System.out.println("Por favor ingresa un número octal: ");
                    String oc3 = scan.nextLine();
                    int decimal12 = Integer.parseInt(oc3, 8);
                    String he1 = Integer.toHexString(decimal12).toUpperCase();
                    System.out.println("El número hexadecimal es: " + he1);
                    break;
                case 36:
                    System.out.println("Por favor ingresa un número: ");
                    int N1 = scan.nextInt();
                    int com = ~N1;
                    System.out.println("El complemento a 1 de " + N1 + " es: " +com);
                    break;
                case 37:
                    System.out.println("Por favor ingresa un número binario: ");
                    String bi1 = scan.nextLine();
                    int N2 = Integer.parseInt(bi1, 2);
                    int com1 = ~N2 + 1;
                    System.out.println("El complemento a 2 de " + bi1 + " (" + N2 + " en decimal) es: " + com1);
                    break;
                case 38:
                    System.out.println("Por favor ingresa el número de términos de la serie Fibonacci: ");
                    int N3 = scan.nextInt();
                    int A = 0, B = 1;
                    System.out.println("Serie de Fibonacci hasta " + N3);
                    for (int i = 1; i <= N3; i ++){
                        System.out.println(A + "");
                        int next = A + B;
                        A = B;
                        B = next;
                    }
                    break;
                case 39:
                    for (int N5 = 1; N5 <= 100000; N5 ++){
                        int su = 0, temp = N5;
                        while (temp > 0){
                            su += facto(temp % 10);
                            temp /= 10;
                        }
                        if (su == N5){
                            System.out.println(N5 + " es un número fuerte.");
                        }
                    }
                    break;
                case 40:
                    for (int N6 = 1; N6 <= 10000; N6 ++){
                        if (perfecto(N6)){
                            System.out.println(N6 + " es un número perfecto.");
                        }
                    }
                    break;
                case 41:
                    System.out.println("Por favor ingresa un número para ver si es perfecto: ");
                    int N6 = scan.nextInt();
                    if (perfecto(N6)){
                        System.out.println(N6 + " es un número perfecto.");
                    }
                    else{
                        System.out.println(N6 + " no es un número perfecto.");
                    }
                    break;
                case 42: 
                    for (int N7 = 1; N7 < 1000; N7 ++){
                        int cd = String .valueOf(N7).length();
                        int Suma = 0;
                        int temp1 = N7;
                        while (temp1 > 0){
                            int Digi = temp1 % 10;
                            Suma += Math.pow(Digi, cd);
                            temp1 /= 10;
                        }
                        if (Suma == N7){
                            System.out.println(N7 + " es un número de Armstrong.");
                        }
                    }
                    break;
                case 43: 
                    System.out.println("Por favor ingrese un número para ver si es de Armstrong: ");
                    int N8 = scan.nextInt();
                    int CD = String.valueOf(N8).length();
                    int SUma = 0;
                    int temp2 = N8;
                    while (temp2 > 0){
                        int DIgi = temp2 % 10;
                        SUma += Math.pow(DIgi, CD);
                        temp2 /= 10;
                    }
                    if (SUma == N8){
                        System.out.println(N8 + " es un número de Armstrong.");
                    }
                    else {
                        System.out.println(N8 + " no es un número de Armstrong.");
                    }
                    break;
                case 44:
                    System.out.println("Por favor ingresa un número para buscar los factores: ");
                    int N9 = scan.nextInt();
                    System.out.println("Los factores primos de " + N9 + " son: ");
                    imprimir(N9);
                    break;
            }
            
        }
        scan.close();
    }
    
}
