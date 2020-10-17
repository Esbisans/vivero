package clases;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;










public class DaoProductos {

    /**
     * @param args the command line arguments
     */
    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;
    public static void main(String[] args) {

            int basedatos = 2;
            System.err.println("Iniciando");
            try {
                Configuration configuration = new Configuration();
                System.err.println("Leyendo configuracion.");
                switch (basedatos){
                    case 1:
                        configuration.configure("server.cfg.xml");
                        break;
                    case 2:
                        configuration.configure("mariadb.cfg.xml");
                        break;
                    case 3:
                        configuration.configure("posgrest.cfg.xml");
                        break;
                }
                serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
                factory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Throwable ex) {
                System.err.println("No se puede crear la Sesion" + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }






        public void crear(){
            Session session = factory.openSession();
            session.beginTransaction();

            TipoProducto id = new TipoProducto(1,"Arbol");
            LocalDate fecha = LocalDate.parse("2020-10-16");

            Producto uno = new Producto("Rosa", fecha, id );
            session.save(uno);
            Producto dos = new Producto("Manzano", fecha, id);
            session.save(dos);
            Producto tres = new Producto("Fresa", fecha, id);
            session.save(tres);
            Producto cuatro = new Producto("Girasol", fecha, id);
            session.save(cuatro);
            session.close();

        }

        public void getProducto (Integer idProducto)
        {
            Session session = factory.openSession();
            Producto dao = (Producto)session.get(Producto.class ,idProducto);
            System.out.println(dao.getNombre() + dao.getFechaIngreso()+dao.getEvidenciaFotografica()+dao.getHistorialProducto()+dao.getTipoProducto());
        }

        public List getProducto()
        {
            Session session = factory.openSession();
            Criteria xd = session.createCriteria(Producto.class);
            List aux = xd.list();
            return aux;
        }

}
