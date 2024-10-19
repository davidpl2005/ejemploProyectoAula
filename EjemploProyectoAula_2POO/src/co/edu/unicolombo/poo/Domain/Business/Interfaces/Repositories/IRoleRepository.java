
package co.edu.unicolombo.poo.Domain.Business.Interfaces.Repositories;

import co.edu.unicolombo.poo.Domain.Model.Role;
import java.util.List;




public interface IRoleRepository {
   public Role findRoleById (int roleID) throws Exception;
   public Role findRoleByName (String nombre) throws Exception;
   public int saveRole (Role role) throws Exception;
   public void editRole (Role role) throws Exception;
   public int deleteRole (int roleID) throws Exception;
   public List<Role> getRoleAll();
}
