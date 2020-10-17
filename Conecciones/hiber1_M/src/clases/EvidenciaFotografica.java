package clases;

import java.io.Serializable;
import java.sql.Date;


public class EvidenciaFotografica implements Serializable {

    private Integer idFotografia;
    private Date fecha;
    private String descripcion;
    private Producto producto;

    public EvidenciaFotografica() {
    }

    public Integer getIdFotografia() {
        return idFotografia;
    }

    public void setIdFotografia(Integer idFotografia) {
        this.idFotografia = idFotografia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
