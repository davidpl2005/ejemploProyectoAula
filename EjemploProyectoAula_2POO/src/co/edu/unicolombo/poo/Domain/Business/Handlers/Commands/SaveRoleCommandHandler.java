
package co.edu.unicolombo.poo.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Domain.Business.Interfaces.Commands.ISaveRoleCommand;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Repositories.IRoleRepository;
import co.edu.unicolombo.poo.Domain.Model.Role;

public class SaveRoleCommandHandler implements ISaveRoleCommand{
   private IRoleRepository rolRepository; 
   public SaveRoleCommandHandler(IRoleRepository repository){
       rolRepository=repository;
   }

    @Override
    public int createRole(Role rol) throws Exception {
    return rolRepository.saveRole(rol);
    }
}
