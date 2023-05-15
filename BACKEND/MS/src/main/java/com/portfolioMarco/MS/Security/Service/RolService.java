
package com.portfolioMarco.MS.Security.Service;

import com.portfolioMarco.MS.Security.Entity.Rol;
import com.portfolioMarco.MS.Security.Enums.RolNombre;
import com.portfolioMarco.MS.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional //persistencia//
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
            return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol) {
        irolRepository.save(rol);
    }
}
