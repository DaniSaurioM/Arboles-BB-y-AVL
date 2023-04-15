import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("HOLA BIENVENIDO");
        int opcion;
        boolean salir=true;

        do {

            System.out.println("--MENU--");
            System.out.println("Selecciona una opcion");
            System.out.println("   1. ABB (Arbol Binario de Busqueda");
            System.out.println("   2. AVL ");
            System.out.println("Selecciona una opcion");
            opcion= input.nextInt();
            int nodo;
            boolean salirArbol=true;
            ArbolAVL arbolAVL = new ArbolAVL();
            Arbol arbol = new Arbol();
            switch (opcion){
                case 1:
                    do {

                        System.out.println("----ABB---");
                        System.out.println("Selecciona una opcion :D");
                        System.out.println("    1. Insetar");
                        System.out.println("    2. Buscar");
                        System.out.println("    3. Eliminar");
                        System.out.println("    4. Imprimir recorridos");
                        opcion = input.nextInt();

                        switch (opcion) {
                            case 1:

                                System.out.println("Cual es el valor a ingresar");
                                nodo = input.nextInt();
                                arbol.insertarNodo(nodo);
                                break;
                            case 2:
                                System.out.println("Cual es el nodo a buscar");
                                nodo = input.nextInt();
                                arbol.buscarNodo(nodo);
                                break;
                            case 3:
                                System.out.println("Cual es el nodo a eliminar");
                                nodo = input.nextInt();
                                arbol.eliminarNodo(nodo);
                                break;
                            case 4:
                                System.out.println("Se imprimen recorridos");
                                System.out.println("INORDEN");
                                arbol.imprimirArbolInOrder();
                                System.out.println("PREORDEN");
                                arbol.imprimirArbolPreOrder();
                                System.out.println("POSTORDEN");
                                arbol.imprimirArbolPostOrder();
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida");
                                salirArbol=true;
                                break;
                        }
                        System.out.println("DESEA SELECCIONAR OTRA OPCION?");
                        System.out.println("presione 1 para salir, presione otro numero para seguir");
                        opcion=input.nextInt();
                        if (opcion == 1) {
                            salirArbol=false;
                        }
                    }while (salirArbol);

                    break;
                case 2:
                    do {

                        System.out.println("----AVL---");
                        System.out.println("Selecciona una opcion :D");
                        System.out.println("    1. Insetar");
                        System.out.println("    2. Buscar");
                        System.out.println("    3. Eliminar");
                        System.out.println("    4. Mostrar arbol AVL");
                        System.out.println("    5. Limpiar arbol");
                        opcion = input.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("Cual es el nodo a ingresar");
                                nodo = input.nextInt();
                                arbolAVL.insertar(nodo);
                                break;
                            case 2:
                                System.out.println("Cual es el nodo a buscar");
                                nodo = input.nextInt();
                                arbolAVL.buscar(nodo);
                                break;
                            case 3:
                                System.out.println("Cual es el nodo a eliminar");
                                nodo = input.nextInt();
                                arbolAVL.eliminar(nodo);
                                break;
                            case 4:
                                System.out.println("Mostrando arbol");
                                arbolAVL.mostrarArbolAVL();
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida");
                                salirArbol = true;
                                break;
                        }
                        System.out.println("DESEA SELECCIONAR OTRA OPCION?");
                        System.out.println("presione 1 para salir, presione otro numero para seguir");
                        opcion=input.nextInt();
                        if (opcion == 1) {
                            salirArbol=false;
                        }
                    }while (salirArbol);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    salir = true;
                    break;
            }
            System.out.println("DESEA SALIR DEL PROGRAMA?");
            System.out.println("presione 1 para salir");
            opcion=input.nextInt();
            if (opcion == 1) {
                salir=false;
            }


        }while(salir);



    }
}