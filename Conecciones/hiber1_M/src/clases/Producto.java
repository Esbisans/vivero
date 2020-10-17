package clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Producto implements Serializable {

   private Integer idProducto;
   private String nombre;
   private LocalDate fechaIngreso;
   private TipoProducto tipoProducto;
   private List<CalendarioRiego> CalendarioRiego;
   private List<HistorialProducto> HistorialProducto;
   private List<EvidenciaFotografica> EvidenciaFotografica;


   public Producto()
   {

   }

    public Producto(String nombre, LocalDate fechaIngreso, TipoProducto tipo) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.tipoProducto = tipo;
    }


    public List<CalendarioRiego> getCalendarioRiego() {
        return CalendarioRiego;
    }

    public void setCalendarioRiego(List<CalendarioRiego> calendarioRiego) {
        CalendarioRiego = calendarioRiego;
    }

    public List<HistorialProducto> getHistorialProducto() {
        return HistorialProducto;
    }

    public void setHistorialProducto(List<HistorialProducto> historialProducto) {
        HistorialProducto = historialProducto;
    }

    public List<EvidenciaFotografica> getEvidenciaFotografica() {
        return EvidenciaFotografica;
    }

    public void setEvidenciaFotografica(List<EvidenciaFotografica> evidenciaFotografica) {
        EvidenciaFotografica = evidenciaFotografica;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

}
