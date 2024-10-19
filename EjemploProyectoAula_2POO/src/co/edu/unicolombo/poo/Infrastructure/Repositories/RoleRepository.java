
package co.edu.unicolombo.poo.Infrastructure.Repositories;

import co.edu.unicolombo.poo.Domain.Model.Role;
import java.util.ArrayList;
import java.util.List;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Repositories.IRoleRepository;


public class RoleRepository implements IRoleRepository{
  private static List<Role> rolesDB;
  
public RoleRepository(){
  createRelesDB();  
}  

private void createRelesDB(){
    if(rolesDB==null){
        rolesDB=new ArrayList<>();    }
}

    @Override
    public Role findRoleById(int roleID) throws Exception {
        if(rolesDB.isEmpty()){
            throw new Exception("El rol "+roleID+"No existe");
        }
        Role roleFound=null;
        for(Role r:rolesDB){
           if(r.getId()==roleID){
               roleFound=r;
               break;
           } 
        }
        if(roleFound==null){
             throw new Exception("El rol "+roleID+"No existe");
        }
        return roleFound;
    }

    @Override
    public Role findRoleByName(String nombre) throws Exception {
        if(rolesDB.isEmpty()){
            throw new Exception("El rol "+nombre+"No existe");
        }
        Role roleFound=null;
        for(Role r:rolesDB){
           if(r.getName().equalsIgnoreCase(nombre)){
               roleFound=r;
               break;
            } 
        }
        if(roleFound==null){
             throw new Exception("El rol "+nombre+"No existe");
        }
        return roleFound;
    }

    @Override
    public int saveRole(Role role) throws Exception {
        if(role==null){
            throw new Exception("El rol es requerido");
        }
        try{
            Role roleFound=findRoleByName(role.getName());
            throw new Exception("El rol "+role.getName()+" ya existe");
        }catch(Exception error){
           rolesDB.add(role);
        }
        return rolesDB.size();

    }

    @Override
    public void editRole(Role role) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deleteRole(int roleID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Role> getRoleAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
