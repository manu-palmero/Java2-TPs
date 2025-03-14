package com.manuel_palmero.tp1.Cajero;

public class Cajero_automatico {
    public final double EFECTIVO;
    protected static boolean acepta;
    private String devuelve;

    public Cajero_automatico(double efectivo, boolean acepta, String devuelve) {
        Cajero_automatico.acepta = acepta;
        this.devuelve = devuelve;
        this.EFECTIVO = efectivo;

    }

    public void procesar_pedido() {
        System.out.println("Procesando pedido...");
    }

    public boolean pago(double n) {
        System.out.println("Pagando $" + n + "...");
        if (!Cajero_automatico.acepta) { // No sé cómo hacer que funcione esto
            System.out.println("No se aceptan pagos");
            return false;
        } else if (n <= EFECTIVO) {
            System.out.println("Pago realizado con éxito!");
            return true;
        } else {
            System.out.println("No hay suficiente efectivo, el máximo es $" + EFECTIVO);
            // System.out.println("Devolviendo: " + devuelve); // Funciona esto pero no tiene mucho sentido porque devuelve es un atributo String de instancia y es raro
            return false;
        }
    }
}
