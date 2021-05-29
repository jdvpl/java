package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Producto;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-11-06T18:36:51")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile SingularAttribute<Categoria, String> nombrecorto;
    public static volatile SingularAttribute<Categoria, Integer> id;
    public static volatile CollectionAttribute<Categoria, Producto> productoCollection;
    public static volatile SingularAttribute<Categoria, String> nombre;

}