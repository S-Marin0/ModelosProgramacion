package menuabstractfactory.gourmet;

import menuabstractfactory.interfaces.*;

class EntradaGourmet implements Entrada {
    public String descripcion() { return "Carpaccio de res."; }
}

class PlatoPrincipalGourmet implements PlatoPrincipal {
    public String descripcion() { return "Filete de salmón con puré de trufa."; }
}

class BebidaGourmet implements Bebida {
    public String descripcion() { return "Vino tinto reserva."; }
}

class PostreGourmet implements Postre {
    public String descripcion() { return "Soufflé de chocolate."; }
}