package menuabstractfactory.fabricas;

import menuabstractfactory.interfaces.*;
import menuabstractfactory.vegetariano.*;
import menuabstractfactory.gourmet.*;
import menuabstractfactory.saludable.*;

public interface MenuFactory {
    Entrada crearEntrada();
    PlatoPrincipal crearPlatoPrincipal();
    Bebida crearBebida();
    Postre crearPostre();
}

