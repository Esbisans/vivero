package clases;

import java.util.List;

public class TipoProducto {

    private Integer idTipoProducto;
    private String descripcion;
    private List<Producto> producto;

    public TipoProducto() {
    }

    public TipoProducto(Integer idTipoProducto, String descripcion) {
        this.idTipoProducto = idTipoProducto;
        this.descripcion = descripcion;
    }


    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public Integer getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
