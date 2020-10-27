package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        /*
        char opc='s';
        int tabla;
        while(opc=='s'){
            System.out.println("Que tabla desea visializar");
            int c=r.nextInt();
            if(c<=12) {
                for (int x = 0; x <= 10; x++) {
                    tabla = c * x;
                    System.out.printf("%d X %d =%d \n", c, x, tabla);
                }
            }
            else {
                System.out.println("Solo puede visualizar las tablas  del 1 al 12");
            }
            System.out.println("Para salir presione n, para continuar  s");
            opc=r.next().charAt(0);
        }
        */
        /*
        String nombre[]=new String[6];
        int edad[]=new int[6];
           int y=0;
        while(y<6){
            System.out.println("Nombre: ");
            nombre[y]=r.nextLine();
            System.out.println("Edad: ");
            edad[y]=r.nextInt();
            r.nextLine();
            y++;
        }

        for(int x=0;x<6;x++){
            System.out.printf("Nombre: %s Edad: %d \n",nombre[x],edad[x]);
    }

         */
        /*
        char a='e';
        while(a!='r') {
            System.out.println("Ingrese un caracter");
            a=r.next().charAt(0);
            switch(a){
                case 'a':
                    System.out.println("Vocal a");
                    break;
                case 'e':
                    System.out.println("Vocal e");
                    break;
                case 'i':
                    System.out.println("Vocal i");
                    break;
                case 'o':
                    System.out.println("Vocal o");
                    break;
                case 'u':
                    System.out.println("Vocal u");
                    break;
                default:
                    a='r';
            }
        }
         */

        int c=1;
        int tabla;
        while(c>0 && c<=12){
            System.out.println("Que tabla desea visializar");
             c=r.nextInt();
            if(c>0 && c<=12) {
                for (int x = 0; x <= 10; x++) {
                    tabla = c * x;
                    System.out.printf("%d X %d =%d \n", c, x, tabla);
                }
            }
            else {
                System.out.println("Solo puede visualizar las tablas  del 1 al 12");
            }
        }

}
}