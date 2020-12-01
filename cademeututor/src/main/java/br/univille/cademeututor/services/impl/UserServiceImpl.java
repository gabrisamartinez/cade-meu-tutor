package br.univille.cademeututor.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.cademeututor.enums.Resources;
import br.univille.cademeututor.model.UserMember;
import br.univille.cademeututor.modelVO.UserVO;
import br.univille.cademeututor.repository.UserRepository;
import br.univille.cademeututor.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public void createUser(UserVO userVO) {
        UserMember userMember = new UserMember();
        userMember.setName(userVO.getName());
        userMember.setEmail(userVO.getEmail());
        userMember.setCellphone(userVO.getCellphone());
        userMember.setPassword(userVO.getPassword());
        userMember.setResources(userVO.getIsOng() ? Resources.ONGS : Resources.PERSON);
        
        repository.save(userMember);
    }
}