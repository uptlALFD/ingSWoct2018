import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//-- Creacion de clase calculadora
public class Calculadora {

    //-- Funcion para mostrar las opciones del menu
    public void menu() {

        System.out.println("MENU DE CALCULADORA");
        System.out.println("1 SUMA");
        System.out.println("2 MULTIPLICACION");
        System.out.println("3 AREA DE UN RECTANGULO");
        System.out.println("4 AREA DE UN TRIANGULO");
        System.out.println("5 CALCULO DE LA EDAD");
        System.out.println("6 COMPROBAR SI UN NUMERO ES PAR");
        System.out.println("7 COMPROBAR SI UN NUMERO ES IMPAR");

        System.out.println("SELECCIONE UNA OPCION:");

    }

    //-- funcion para guardar el resultado dentro de un archivo
    public void guardarArchivo(String archivoN,
            String msg,
            String r) {
        FileWriter flwriter = null;
        try {

            //crea el flujo para escribir en el archivo
            flwriter = new FileWriter(archivoN);
            //crea un buffer o flujo intermedio antes de escribir directamente en el archivo
            BufferedWriter bfwriter = new BufferedWriter(flwriter);

            //-- Escribiendo el resultado de la operacion  en un archivo
            bfwriter.write("Operacion Realizada: " + msg);
            bfwriter.newLine();
            bfwriter.write("El resultado de la operacion:" + r);

            //cierra el buffer intermedio
            bfwriter.close();
            System.out.println("Archivo creado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {//cierra el flujo principal
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //-- metodo principal
    public static void main(String[] args) {

        int op; //-- declaracion de la variable que alamacena la opcion del switch
        float num1 = 0, num2 = 0, r = 0; //-- declarando las variables para las operaciones
        int anioNac, edad = 0; //-- declarando variables para el calculo de la edad
        int num; //-- numero para la comprobacion de numeros pares e impares
        String msg = null; //-- declaracion de variable para el mensaje del usuario para la operacion
        String res = ""; //-- variable para guardar el resultado de la operacion y guardar en el archivo
        String rutaP = System.getProperty("user.dir"); // variable para la ruta del proyecto
        String archivoN = rutaP + "\\resultados.txt";//-- declaracion de variable para el nombre de la ruta del archivo
        int op2; //--variable para saber si el usuario quiere realizar otra operacion

        //-- Instanciando la clase Calculadora con el objeto cal para usars sus metodos y atributos
        Calculadora cal = new Calculadora();

        //-- Haciendo llamado del metodo menu()
        cal.menu();

        //-- Creando un objeto de la clase Scanner para la lectura de datos por teclado
        Scanner scanner = new Scanner(System.in);
        op = scanner.nextInt();

        //-- Segun la opcion escogida por el usuario se activa el Switch con la variable op
        switch (op) {
            //-- Caso para la suma
            case 1:
                msg = " Hacer la Suma";
                System.out.println(msg);

                System.out.println(" Ingrese el Operador 1:");
                //-- Ingreso del operador 1
                num1 = scanner.nextFloat();

                System.out.println(" Ingrese el Operador 2:");
                //-- Ingreso del operador 2
                num2 = scanner.nextFloat();

                //-- Operacion de SUma
                r = num1 + num2;

                System.out.println("El resultado es: " + r);

                //-- aqui se guarda los valores y el resultado de la operacion
                res = num1 + "+" + num2 + "=" + String.valueOf(r);

                //-- llamando al metodo guardarArchivo() para imprimir el resultado en el archivo
                cal.guardarArchivo(archivoN,
                        msg,
                        res);

                break;
            //-- Caso para la multiplicacion
            case 2:
                msg = " Hacer la Multipicacion";
                System.out.println(msg);

                System.out.println(" Ingrese el Operador 1:");
                //-- Ingreso del operador 1
                num1 = scanner.nextFloat();

                System.out.println(" Ingrese el Operador 2:");
                //-- Ingreso del operador 2
                num2 = scanner.nextFloat();

                //--Operacion de multiplicaion
                r = num1 * num2;

                System.out.println("El resultado es: " + r);

                //-- aqui se guarda los valores y el resultado de la operacion
                res = num1 + "*" + num2 + "=" + String.valueOf(r);

                //-- llamando al metodo guardarArchivo() para imprimir el resultado en el archivo
                cal.guardarArchivo(archivoN,
                        msg,
                        res);
                break;
            //-- Caso para el calculo del area de un rectangulo
            case 3:
                msg = " Hacer Area de un rectangulo";
                System.out.println(msg);

                System.out.println();

                System.out.println(" Ingrese la base del rectangulo:");
                //-- Ingreso de la base
                num1 = scanner.nextFloat();

                System.out.println(" Ingrese la altura del rectangulo:");
                //-- Ingreso de la altura
                num2 = scanner.nextFloat();

                //--Operacion del area de un rectangulo
                r = num1 * num2;

                System.out.println("El resultado es: " + r);

                //-- aqui se guarda los valores y el resultado de la operacion
                res += "base=" + num1 + ", altura=" + num2 + "\n";
                res += num1 + "*" + num2 + "=" + String.valueOf(r);

                //-- llamando al metodo guardarArchivo() para imprimir el resultado en el archivo
                cal.guardarArchivo(archivoN,
                        msg,
                        res);
                break;
            //-- Caso para el calculo del area de un triangulo
            case 4:
                msg = " Hacer Area de un triangulo";
                System.out.println(msg);

                //-- Ingreso de la base
                System.out.println(" Ingrese la base del rectangulo:");
                num1 = scanner.nextFloat();

                System.out.println(" Ingrese la altura del rectangulo:");
                //-- Ingreso de la altura
                num2 = scanner.nextFloat();

                //--Operacion del area de un triangulo
                r = (num1 * num2) / 2;

                System.out.println("El resultado es: " + r);

                //-- aqui se guarda los valores y el resultado de la operacion
                res += "base=" + num1 + ", altura=" + num2 + "\n";
                res += num1 + "*" + num2 + "=" + String.valueOf(r);

                //-- llamando al metodo guardarArchivo() para imprimir el resultado en el archivo
                cal.guardarArchivo(archivoN,
                        msg,
                        res);
                break;
            //-- Caso para el calculo de la edad
            case 5:
                msg = " Calculo de la edad";
                System.out.println(msg);

                //-- Ingreso de la base
                System.out.println(" Ingrese su año de nacimiento:");
                anioNac = scanner.nextInt();

                edad = 2019 - anioNac;

                System.out.println("La edad es: " + edad);

                //-- aqui se guarda los valores y el resultado de la operacion
                res = "La edad es:" + String.valueOf(edad);

                //-- llamando al metodo guardarArchivo() para imprimir el resultado en el archivo
                cal.guardarArchivo(archivoN,
                        msg,
                        res);

                break;

            //-- Caso para comprobar si un numero es par
            case 6:
                msg = " Comprobar si un numero es par";
                System.out.println(msg);

                //-- Ingreso del numero
                System.out.println(" Ingrese el numero:");
                num = scanner.nextInt();

                /*-- CUanddo el resto de una division de un numero entre 2 es igual a 0 
                se dice que un numero es par*/
                if (num % 2 == 0) {
                    System.out.println("El numero " + num + " es PAR");
                    //-- aqui se guarda los valores y el resultado de la operacion
                    res = "El numero " + String.valueOf(num) + " es PAR";
                } else {
                    System.out.println("El numero " + num + " no es PAR");
                    //-- aqui se guarda los valores y el resultado de la operacion
                    res = "El numero " + String.valueOf(num) + " no es PAR";
                }

                //-- llamando al metodo guardarArchivo() para imprimir el resultado en el archivo
                cal.guardarArchivo(archivoN,
                        msg,
                        res);

                break;

            //-- Caso para comprobar si un numero es impar
            case 7:
                msg = " Comprobar si un numero es impar";
                System.out.println(msg);

                //-- Ingreso del numero
                System.out.println(" Ingrese el numero:");
                num = scanner.nextInt();

                /*-- CUanddo el resto de una division de un numero entre 2 es diferente a 0 
                se dice que un numero es impar*/
                if (num % 2 != 0) {
                    System.out.println("El numero " + num + " es IMPAR");
                    //-- aqui se guarda los valores y el resultado de la operacion
                    res = "El numero " + String.valueOf(num) + " es IMPAR";
                } else {
                    System.out.println("El numero " + num + " no es IMPAR");
                    //-- aqui se guarda los valores y el resultado de la operacion
                    res = "El numero " + String.valueOf(num) + " no es IMPAR";
                }

                //-- llamando al metodo guardarArchivo() para imprimir el resultado en el archivo
                cal.guardarArchivo(archivoN,
                        msg,
                        res);

                break;
            //-- Para el caso de que el usuario seleccione una opcion no valida
            default:
                System.out.println("Opcion no valida");
        }

        //-- Dandole la oportunidad de que el usuario pueda hacer otra operacion
        System.out.println("Desea realizar otra operacion?: \n");
        System.out.println("Ingrese 1 para SI, 2 para NO");
        op2 = scanner.nextInt();//-- lectura de la desicion del usuario
        //--En caso de ser 1 se llama la funcion main() nuevamente creandose una recursividad
        if (op2 == 1) {
            main(args);
            //--Caso contrario se muestra un mensaje de despedida y mi programa finaliza
        } else {
            System.out.println("HASTA LUEGO!!!");
        }

    }

}
