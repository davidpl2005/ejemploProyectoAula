
package co.edu.unicolombo.poo.Domain.Business.Interfaces.Commands;

import co.edu.unicolombo.poo.Domain.Model.Role;

public interface ISaveRoleCommand {
  public int createRole(Role rol)throws Exception;  
}
