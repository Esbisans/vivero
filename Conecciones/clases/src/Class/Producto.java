package clases;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Producto implements Serializable {

   private Integer idProducto;
   private String nombre;
   private Date fechaIngreso;
   private TipoProducto tipoProducto;
   private List<CalendarioRiego> calendarioRiegos;
   private List<HistorialProducto> historialProductos;
   private List<EvidenciaFotografica> evidenciaFotograficas;
   public Producto()
   {

   }

    public Producto(String nombre, Date fechaIngreso) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
    }


    public List<CalendarioRiego> getCalendarioRiegos() {
        return calendarioRiegos;
    }

    public void setCalendarioRiegos(List<CalendarioRiego> calendarioRiegos) {
        this.calendarioRiegos = calendarioRiegos;
    }

    public List<HistorialProducto> getHistorialProductos() {
        return historialProductos;
    }

    public void setHistorialProductos(List<HistorialProducto> historialProductos) {
        this.historialProductos = historialProductos;
    }

    public List<EvidenciaFotografica> getEvidenciaFotograficas() {
        return evidenciaFotograficas;
    }

    public void setEvidenciaFotograficas(List<EvidenciaFotografica> evidenciaFotograficas) {
        this.evidenciaFotograficas = evidenciaFotograficas;
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

}
