package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Nombre y apellidos: ");
                String nombre = scanner.nextLine();

                System.out.println("Tipo de cliente (Regular/VIP): ");
                String tipoCliente = scanner.nextLine();

                System.out.println("Cantidad de artículos: ");
                int cantidadArticulos = scanner.nextInt();

                System.out.println("Precio total de la compra (sin descuento): ");
                double precioTotalSinDescuento = scanner.nextDouble();


                double descuento = calcularDescuento(tipoCliente, cantidadArticulos);


                double precioTotalConDescuento = precioTotalSinDescuento - (precioTotalSinDescuento * descuento);


                System.out.println("-------------------------------------");
                System.out.println("Resumen de la compra:");
                System.out.println("Nombre: " + nombre);
                System.out.println("Tipo de cliente: " + tipoCliente);
                System.out.println("Cantidad de artículos: " + cantidadArticulos);
                System.out.println("Precio total sin descuento: $" + precioTotalSinDescuento);


                System.out.println("Descuento aplicado: " + (descuento * 100) + "%");


                System.out.println("Precio total con descuento: $" + precioTotalConDescuento);
                System.out.println("-------------------------------------");
            }

            private static double calcularDescuento(String tipoCliente, int cantidadArticulos) {
                double descuento = 0;

                if (tipoCliente.equalsIgnoreCase("Regular")) {
                    if (cantidadArticulos <= 3) {
                        descuento = 0.05;
                    } else if (cantidadArticulos <= 6) {
                        descuento = 0.1;
                    } else {
                        descuento = 0.15;
                    }
                } else if (tipoCliente.equalsIgnoreCase("VIP")) {
                    if (cantidadArticulos <= 3) {
                        descuento = 0.1;
                    } else if (cantidadArticulos <= 6) {
                        descuento = 0.15;
                    } else {
                        descuento = 0.2;
                    }
                }

                return descuento;
            }
        }




