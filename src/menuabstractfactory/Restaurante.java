package menuabstractfactory;

import menuabstractfactory.interfaces.*;
import menuabstractfactory.fabricas.*;

public class Restaurante {
    private Entrada entrada;
    private PlatoPrincipal platoPrincipal;
    private Bebida bebida;
    private Postre postre;
    
    public Restaurante(MenuFactory factory) {
        this.entrada = factory.crearEntrada();
        this.platoPrincipal = factory.crearPlatoPrincipal();
        this.bebida = factory.crearBebida();
        this.postre = factory.crearPostre();
    }
    
    public void mostrarMenu() {
        System.out.println("--- Menú del Día ---");
        System.out.println("Entrada: " + entrada.descripcion());
        System.out.println("Plato Principal: " + platoPrincipal.descripcion());
        System.out.println("Bebida: " + bebida.descripcion());
        System.out.println("Postre: " + postre.descripcion());
    }
}