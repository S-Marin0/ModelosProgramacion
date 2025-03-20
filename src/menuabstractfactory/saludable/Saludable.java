package menuabstractfactory.saludable;

import menuabstractfactory.interfaces.*;

class EntradaSaludable implements Entrada {
    public String descripcion() { return "Sopa de lentejas."; }
}

class PlatoPrincipalSaludable implements PlatoPrincipal {
    public String descripcion() { return "Pechuga de pollo a la plancha con ensalada."; }
}

class BebidaSaludable implements Bebida {
    public String descripcion() { return "Batido de proteínas."; }
}

class PostreSaludable implements Postre {
    public String descripcion() { return "Yogur con frutas."; }
}