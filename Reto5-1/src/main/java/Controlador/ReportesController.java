
package Controlador;

import Modelo.Dao.ComprasProyectoProveedorDao;
import Modelo.Dao.InformacionLiderDao;
import Modelo.Dao.ProyectoCasaCiudadDao;
import Modelo.Vo.ComprasProyectoProveedorVo;
import Modelo.Vo.InformacionLiderVo;
import Modelo.Vo.ProyectoCasaCiudadVo;
import java.sql.SQLException;
import java.util.List;

public class ReportesController {
    InformacionLiderDao informacionLiderDao;
    ProyectoCasaCiudadDao proyectoCasaCiudadDao;
    ComprasProyectoProveedorDao comprasProyectoProveedorDao;
    
    public ReportesController(){
        this.informacionLiderDao = new InformacionLiderDao();
        this.proyectoCasaCiudadDao = new ProyectoCasaCiudadDao();
        this.comprasProyectoProveedorDao = new ComprasProyectoProveedorDao();
    }
    
    //metodo para consultar informacion del lider
    public List<InformacionLiderVo> listarInformacionLider() throws SQLException{
        
        return this.informacionLiderDao.consultarInformacionLider();
    }
    
    //Metodo para consultar Proyectos casa Ciudad
    public List<ProyectoCasaCiudadVo> listarProyectosCiudad() throws  SQLException{
        
        return this.proyectoCasaCiudadDao.consultarProyectoCasaCiudad();
    }
    
    //Metodo para consultar Compras Proyectos de Provedor
    public  List<ComprasProyectoProveedorVo> listarProyectosProveedor() throws SQLException{
        
        return this.comprasProyectoProveedorDao.consultarProyectosProveedor();
    }
    
}
