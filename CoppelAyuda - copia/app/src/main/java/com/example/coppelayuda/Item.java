package com.example.coppelayuda;

public class Item {
    private String name;
    private String proceso;
    private String ruta;
    private String explicacion;

    public Item(String name, String proceso, String ruta, String explicacion) {
        this.name = name;
        this.proceso = proceso;
        this.ruta = ruta;
        this.explicacion = explicacion;
    }

    public String getName() {
        return name;
    }

    public String getProceso() {
        return proceso;
    }

    public String getRuta() {
        return ruta;
    }

    public String getExplicacion() {
        return explicacion;
    }
}
