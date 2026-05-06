package org.estudos;

public class Main {
    public static void main(String[] args) {

        ListaCircular <String> Lista =  new ListaCircular<>();

        Lista.add("PCC1");
        Lista.add("PCC2");
        Lista.add("PCC3");
        Lista.add("PCC4");
        Lista.add("PCC5");
        Lista.add("PCC6");

        System.out.print(Lista);

         Lista.remove(0);
         Lista.remove(1);
         Lista.remove(2);

        System.out.print(Lista);
    }
}