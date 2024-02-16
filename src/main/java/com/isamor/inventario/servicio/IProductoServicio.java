package com.isamor.inventario.servicio;

import com.isamor.inventario.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> listarProductos();
    public Producto buscarProductoPorId(Integer idProducto);
    public void guardarProducto(Producto producto);
    public void eliminarProductoPorId(Integer idProducto);
}
