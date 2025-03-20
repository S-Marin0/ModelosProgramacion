package menuabstractfactory.fabricas;

import menuabstractfactory.interfaces.*;
import menuabstractfactory.vegetariano.*;

public class MenuVegetarianoFactory implements MenuFactory {
    public Entrada crearEntrada() { return new EntradaVegetariana(); }
    public PlatoPrincipal crearPlatoPrincipal() { return new PlatoPrincipalVegetariano(); }
    public Bebida crearBebida() { return new BebidaVegetariana(); }
    public Postre crearPostre() { return new PostreVegetariano(); }
}
